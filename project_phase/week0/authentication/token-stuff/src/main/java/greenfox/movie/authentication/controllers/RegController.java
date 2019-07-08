package greenfox.movie.authentication.controllers;

import greenfox.movie.authentication.JWTGenerate;
import greenfox.movie.authentication.modells.AccProfile;
import greenfox.movie.authentication.modells.UserProfile;
import greenfox.movie.authentication.repo.IAccProfileRepository;
import greenfox.movie.authentication.repo.IUserRepository;
import greenfox.movie.authentication.repo.JWTCsrfTokenRepository;
import greenfox.movie.authentication.services.UserAccountService;
import java.sql.Timestamp;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class RegController {

  private IUserRepository iUserRepository;
  private JWTCsrfTokenRepository jwtCsrfTokenRepository;
  private IAccProfileRepository iAccProfileRepository;
  private UserAccountService userAccountService;

  @Autowired
  public RegController(IUserRepository iUserRepository,
      IAccProfileRepository iAccProfileRepository, UserAccountService userAccountService) {
    this.iUserRepository = iUserRepository;
    this.iAccProfileRepository = iAccProfileRepository;
    this.userAccountService = userAccountService;
  }

  @GetMapping("/register")
  public String loadRegPage() {
    return "register";
  }

  @PostMapping("/register")
  public String doRegistration(String userName, String password) {
    if (!iUserRepository.existsByUserName(userName)) {
      iUserRepository.save(new UserProfile(userName, password));
    }
    return "login";
  }

  @PostMapping("login")
  public String doLogin(String userName, String password) {
    String myToken;
    if (iUserRepository.findByUserName(userName).getPassword().equals(password)) {
      myToken = JWTGenerate
          .createJWT(String.valueOf(iUserRepository.findByUserName(userName).getId()),
              "FBI", userName);
      iAccProfileRepository.save(userAccountService.uaBuilder(JWTGenerate.decodeJWT(myToken)));

      System.out.println(myToken);
      System.out.println(JWTGenerate.decodeJWT(myToken));
    }
    return "index";
  }

  @PostMapping("/secret")
  public String shareSecret(@RequestBody AccProfile userAccount) {
    Date date = new Date();
    Timestamp ts = new Timestamp(date.getTime());
    if (iAccProfileRepository.existsByJti(userAccount.getJti())) {
      if (date.getTime() < iAccProfileRepository.findByJti(userAccount.getJti()).getExp()
          .getTime()) {
        return "valid";
      }
    }
    return "invalid";
  }

}

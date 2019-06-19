package greenfox.movie.authentication.services;
import greenfox.movie.authentication.modells.AccProfile;
import io.jsonwebtoken.Claims;
import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService {
  public AccProfile uaBuilder (Claims myClaim) {
    String jti = myClaim.getId();
    Date iat = myClaim.getIssuedAt();
    String sub = myClaim.getSubject();
    String iss = myClaim.getIssuer();
    Date exp = myClaim.getExpiration();

    return new AccProfile(jti, iat, sub, iss, exp);
  }
}

package greenfox.movie.authentication.modells;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class UserProfile {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String userName;
  private String password;

  public UserProfile(){

  }

  public UserProfile(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }
}


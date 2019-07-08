package greenfox.movie.authentication.modells;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class AccProfile {

  @Id
  private String jti;
  private Date iat;
  private String sub;
  private String iss;
  private Date exp;

  public AccProfile() {
  }

  public AccProfile(String jti, Date iat, String sub, String iss, Date exp) {
    this.jti = jti;
    this.iat = iat;
    this.sub = sub;
    this.iss = iss;
    this.exp = exp;
  }
}

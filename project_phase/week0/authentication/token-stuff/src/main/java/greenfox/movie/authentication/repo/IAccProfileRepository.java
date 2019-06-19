package greenfox.movie.authentication.repo;
import greenfox.movie.authentication.modells.AccProfile;
import org.springframework.data.repository.CrudRepository;

public interface IAccProfileRepository extends CrudRepository<AccProfile, Long> {

  public boolean existsByJti(String jti);
  public AccProfile findByJti (String jti);

}

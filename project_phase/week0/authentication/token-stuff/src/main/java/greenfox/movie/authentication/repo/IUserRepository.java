package greenfox.movie.authentication.repo;

import greenfox.movie.authentication.modells.UserProfile;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<UserProfile, Long>  {
  public boolean existsByUserName (String userName);
  public UserProfile findByUserName (String userName);
}

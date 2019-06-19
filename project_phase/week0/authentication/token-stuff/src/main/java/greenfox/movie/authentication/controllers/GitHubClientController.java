package greenfox.movie.authentication.controllers;

import greenfox.movie.authentication.services.GitHubService;
import java.io.IOException;
import java.util.List;
import org.eclipse.egit.github.core.event.DeletePayload;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.eclipse.egit.github.core.Repository;

@RestController
public class GitHubClientController {

  private GitHubService gitHubService;

  public GitHubClientController(GitHubService gitHubService) {
    this.gitHubService = gitHubService;
  }

  @GetMapping("/repos")
  public List<Repository> getRepos() throws IOException {
    return gitHubService.getRepositories();
  }

  @PostMapping("/repos")
  public Repository createRepo(@RequestBody Repository newRepo) throws IOException {
    return gitHubService.createRepository(newRepo);
  }

  @DeleteMapping("/repos/{owner}/{repo}")
  public DeletePayload deleteRepo(
      @PathVariable("owner") String owner,
      @PathVariable("repo") String repoName) throws IOException {
    return gitHubService.deleteRepository(owner, repoName);
  }
}

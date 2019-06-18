package greenfox.backend.application;

import greenfox.backend.application.controllers.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    Controller controller = new Controller();
    controller.start();
  }


}

package webmvctestproblem;

import static org.springframework.boot.SpringApplication.run;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "webmvctestproblem.foo")
public class Application {
  public static void main(String[] args) {
    run(Application.class, args);
  }
}

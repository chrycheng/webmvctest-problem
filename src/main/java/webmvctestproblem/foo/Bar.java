package webmvctestproblem.foo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
class Bar {
  @Autowired
  private DataSource dataSource;
}

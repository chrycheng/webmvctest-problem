package webmvctestproblem;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class GreeterTest {
  @Autowired
  private MockMvc mockMvc;

  @Test
  public void shouldGreet() throws Exception {
    mockMvc
        .perform(get("/"))
        .andExpect(content().string("Hello, world!"));
  }
}

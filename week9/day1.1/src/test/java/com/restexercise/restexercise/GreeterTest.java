package com.restexercise.restexercise;
import com.restexercise.restexercise.controllers.Controller;
import com.restexercise.restexercise.services.AppendService;
import com.restexercise.restexercise.services.MessageService;
import com.restexercise.restexercise.services.NumberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.core.Is.is;


@RunWith(SpringRunner.class)
@WebMvcTest(Controller.class)
public class GreeterTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private NumberService numberService;
  @MockBean
  private MessageService messageService;
  @MockBean
  private AppendService appendService;


  @Test
  public void greeting_succesfull() throws Exception {
    mockMvc.perform(get("/greeter?name=Mark&title=student"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Mark, my dear student!")));
  }
}

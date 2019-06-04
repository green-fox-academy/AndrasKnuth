package com.restexercise.restexercise;
import com.restexercise.restexercise.controllers.Controller;
import com.restexercise.restexercise.models.Number;
import com.restexercise.restexercise.services.AppendService;
import com.restexercise.restexercise.services.MessageService;
import com.restexercise.restexercise.services.NumberService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import java.nio.charset.Charset;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@WebMvcTest(Controller.class)
public class DoUntilTest {


  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private NumberService numberService;
  @MockBean
  private MessageService messageService;
  @MockBean
  private AppendService appendService;

  @Before
  public void setup(){
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void doUntil_succesfull() throws Exception {
    when(numberService.doAction(anyString(), anyInt())).thenReturn(new Number(15));
    mockMvc.perform(post("/dountil/{action}", "sum").contentType(contentType)
        .content("{\"until\": \"5\"}"))
        .andExpect(jsonPath("$.result", is(15)));
  }
}
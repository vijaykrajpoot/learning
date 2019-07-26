package org.vkrajput.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SpringBootRestApplicationTests {

  @Autowired
  private MockMvc mvc;


  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void test_200Ok() throws Exception {
    // this.mvc.perform(MockMvcRequestBuilders.get("/spring-boot-rest/employees/"))
    // .andExpect(MockMvcResultMatchers.status().isOk());
    //
    ResponseEntity<String> response = restTemplate.getForEntity("/employees/", String.class);
    Assert.assertEquals(HttpStatus.OK, response.getStatusCode());

  }

}

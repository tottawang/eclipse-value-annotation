
import static org.testng.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.sample.conf.Application;
import com.sample.conf.ApplicationConfig;
import com.sample.service.SampleService;

@Configuration
@SpringApplicationConfiguration(classes = {Application.class, ApplicationConfig.class})
public class SampleServiceIntegrationTest extends AbstractTestNGSpringContextTests {

  @Autowired
  private SampleService sampleService;

  @Value("${SERVER_PORT}")
  private String serverPort;

  @Test
  public void verifyValueAnnotation() {
    assertEquals(sampleService.getServerPort(), serverPort);
  }
}

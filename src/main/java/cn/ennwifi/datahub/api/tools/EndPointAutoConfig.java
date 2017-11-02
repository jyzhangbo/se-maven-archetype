package cn.ennwifi.datahub.api.tools;

import org.springframework.context.annotation.Bean;

/**
 * @author zhangbo
 *
 */
public class EndPointAutoConfig {

  @Bean
  public MyEndpoint myEndpoint() {
    return new MyEndpoint();
  }

}

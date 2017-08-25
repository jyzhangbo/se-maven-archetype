package cn.ennwifi.datahub.api.tools;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 自定义的健康检查.
 * 
 * @author zhangbo
 *
 */
@Component
public class MyHealthIndicator implements HealthIndicator {

  @Override
  public Health health() {
    int errorCode = 1;
    if (errorCode != 0) {
      return Health.down().withDetail("Error Code", errorCode).build();
    }
    return Health.up().build();
  }

}

package cn.ennwifi.datahub.api.tools;

import org.springframework.boot.actuate.health.DiskSpaceHealthIndicator;
import org.springframework.boot.actuate.health.DiskSpaceHealthIndicatorProperties;
import org.springframework.stereotype.Component;

/**
 * 
 * @author zhangbo
 *
 */
@Component
public class MyDiskSpaceHealthIndicator extends DiskSpaceHealthIndicator {

  /**
   * @param properties
   */
  public MyDiskSpaceHealthIndicator(DiskSpaceHealthIndicatorProperties properties) {
    super(properties);
  }

}

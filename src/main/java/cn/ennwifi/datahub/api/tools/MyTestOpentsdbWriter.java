package cn.ennwifi.datahub.api.tools;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.autoconfigure.ExportMetricWriter;
import org.springframework.boot.actuate.endpoint.MetricsEndpoint;
import org.springframework.boot.actuate.endpoint.MetricsEndpointMetricReader;
import org.springframework.boot.actuate.metrics.opentsdb.DefaultOpenTsdbNamingStrategy;
import org.springframework.boot.actuate.metrics.opentsdb.OpenTsdbGaugeWriter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


/**
 * @author zhangbo
 *
 */
@Component
public class MyTestOpentsdbWriter {

  @Bean
  public MetricsEndpointMetricReader metricsEndpointMetricReader(final MetricsEndpoint metricsEndpoint) {
    return new MetricsEndpointMetricReader(metricsEndpoint);
  }

  @Bean
  @ExportMetricWriter
  @ConfigurationProperties("metrics.export")
  public OpenTsdbGaugeWriter openTsdbGaugeWriter() {
    OpenTsdbGaugeWriter open = new OpenTsdbGaugeWriter();
    DefaultOpenTsdbNamingStrategy namingStrategy = new DefaultOpenTsdbNamingStrategy();
    Map<String, String> map = new HashMap<>();
    map.put("serverId", "1");
    namingStrategy.setTags(map);
    open.setNamingStrategy(namingStrategy);
    return open;
  }

}

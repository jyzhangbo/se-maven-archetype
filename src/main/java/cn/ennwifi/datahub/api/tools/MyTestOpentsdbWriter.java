package cn.ennwifi.datahub.api.tools;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.autoconfigure.ExportMetricWriter;
import org.springframework.boot.actuate.endpoint.MetricsEndpoint;
import org.springframework.boot.actuate.endpoint.MetricsEndpointMetricReader;
import org.springframework.boot.actuate.metrics.opentsdb.DefaultOpenTsdbNamingStrategy;
import org.springframework.boot.actuate.metrics.opentsdb.OpenTsdbGaugeWriter;
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
  public OpenTsdbGaugeWriter openTsdbGaugeWriter() {
    OpenTsdbGaugeWriter open = new OpenTsdbGaugeWriter();
    open.setUrl("http://10.39.0.151:4242/api/put");
    DefaultOpenTsdbNamingStrategy namingStrategy = new DefaultOpenTsdbNamingStrategy();
    Map<String, String> map = new HashMap<>();
    map.put("serverId", "1");
    namingStrategy.setTags(map);
    open.setNamingStrategy(namingStrategy);
    return open;
  }



}

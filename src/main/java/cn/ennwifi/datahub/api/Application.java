package cn.ennwifi.datahub.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import cn.ennwifi.datahub.api.configure.ApplicationProperties;
import cn.ennwifi.datahub.api.configure.DataSourceProperties;
import cn.ennwifi.datahub.api.content.SystemPropertyDefaultsInitializer;

/**
 * 智能能源-API项目.
 * 
 * @author zhangbo
 *
 */
@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class, DataSourceProperties.class})
public class Application {
  /**
   * 主入口.
   * 
   * @param args 用用程序启动参数
   */
  public static void main(String[] args) {
    SystemPropertyDefaultsInitializer initializer = new SystemPropertyDefaultsInitializer();
    initializer.initialize();
    SpringApplication.run(Application.class, args);
  }


}

package cn.ennwifi.datahub.api.content;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

/**
 * 添加Interceptor.
 * 
 * @author zhangbo
 */
@Configuration
public class MvcContext extends DelegatingWebMvcConfiguration {


  @Override
  protected void addInterceptors(InterceptorRegistry registry) {

  }

  @Override
  public ApplicationContext getApplicationContext() {
    return super.getApplicationContext();
  }

}

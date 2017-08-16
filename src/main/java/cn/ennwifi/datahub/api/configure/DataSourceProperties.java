package cn.ennwifi.datahub.api.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 数据库配置信息.
 * 
 * @author zhangbo
 *
 */
@ConfigurationProperties(prefix = "data")
public class DataSourceProperties {


  private String driver;
  private String url;
  private String user;
  private String password;

  /**
   * @return the driver
   */
  public String getDriver() {
    return driver;
  }

  /**
   * @param driver the driver to set
   */
  public void setDriver(String driver) {
    this.driver = driver;
  }

  /**
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * @param url the url to set
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * @return the user
   */
  public String getUser() {
    return user;
  }

  /**
   * @param user the user to set
   */
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }



}


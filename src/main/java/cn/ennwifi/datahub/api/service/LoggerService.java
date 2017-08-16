package cn.ennwifi.datahub.api.service;

import org.springframework.stereotype.Service;

/**
 * 日志记录服务.
 *
 * @author zhangbo
 */
@Service
public class LoggerService {

  /**
   * 记录警告信息.
   *
   * @param clientip 客户端请求的IP
   * @param target 发生日志的目标对象 比如某个类
   * @param content 发生日志的内容
   */
  public void error(String target, String content) {
    log("ERROR", target, content);
  }

  /**
   * 记录日志信息.
   *
   * @param type the type
   * @param localip 服务端IP地址，用于多服务器情况
   * @param clientip 客户端请求的IP
   * @param target 发生日志的目标对象 比如某个类
   * @param content 发生日志的内容
   */
  private void log(String type, String target, String content) {}
}

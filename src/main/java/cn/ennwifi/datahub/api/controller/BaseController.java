package cn.ennwifi.datahub.api.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

/**
 * 基础控制器， 提供日志打印操作.
 * 
 * @author zhangbo
 *
 */
public class BaseController {


  /**
   * 记录日志.
   * 
   * @param request Http请求对象
   * @param extra 额外数据
   * @param logger 日志記錄器
   * @param data 數據
   */
  public final void log(Logger logger, HttpServletRequest request, Object extra, String data) {
    String message = "";
    if (extra == null) {
      message = request.getRequestURI() + "@" + data;
    } else {
      message = request.getRequestURI() + ":" + extra + "@" + data;
    }

    if (logger == null) {
      System.out.println(message);
    } else {
      logger.info(message);
    }
  }

  /**
   * 日志記錄器.
   * 
   * @param request Http请求对象
   * @param logger 日志記錄器
   * @param data 數據
   */
  public final void log(Logger logger, HttpServletRequest request, String data) {
    log(logger, request, null, data);
  }

}

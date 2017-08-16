package cn.ennwifi.datahub.api.service;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.nutz.http.Http;
import org.nutz.http.Response;
import org.nutz.lang.Lang;
import org.springframework.beans.factory.annotation.Autowired;

import cn.ennwifi.datahub.api.configure.ApplicationProperties;


/**
 * 短消息服务.
 *
 * @author zhangjianshe
 */
public class SmssService {

  /** The logger. */
  private static Logger logger = Logger.getLogger("TOOLS-SMS");

  @Autowired
  private ApplicationProperties applicationProperties;

  /**
   * 想手机发送短消息.
   *
   * @param phone the phone
   * @param message the message
   */
  public void sendSms(String phone, String message) {

    String url = applicationProperties.getSmsUrl();

    Map<String, String> mapper = new HashMap<String, String>();
    mapper.put("phone", phone);
    mapper.put("message", message);

    String uri = makeUrl(url, mapper);
    Response response = Http.get(uri);
    System.out.println(Lang.readAll(response.getReader()));
    if (response.isOK()) {
      logger.info("发送短信成功>" + uri);
    } else {
      logger.info(uri);
    }

  }

  /**
   * 构造一个Url.
   *
   * @param base the base
   * @param values the values
   * @return the string
   */
  private String makeUrl(String base, Map<String, String> values) {
    StringBuilder sb = new StringBuilder();
    sb.append(base).append("?");
    for (String key : values.keySet()) {
      String str = values.get(key);
      sb.append(key).append("=").append(str);
      sb.append("&");
    }
    return sb.toString();
  }

}

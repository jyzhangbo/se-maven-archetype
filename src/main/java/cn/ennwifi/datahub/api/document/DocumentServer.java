package cn.ennwifi.datahub.api.document;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.nutz.lang.Times;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.stereotype.Component;

import cn.mapway.document.servlet.MapwayDocServlet;

/**
 * Document server.
 * 
 * @author zhangbo
 *
 */
@Component
public class DocumentServer extends ServletRegistrationBean {

  /**
   * 构造函数.
   */
  public DocumentServer() {

    // servlet
    MapwayDocServlet mapwayServlet = new MapwayDocServlet();
    // servlet parameters
    Map<String, String> params = getParameters();

    setServlet(mapwayServlet);
    addUrlMappings("/doc/*");
    setInitParameters(params);
    setLoadOnStartup(1);
  }

  /**
   * 生成文档的配置信息.
   * 
   * @return 配置信息
   */
  private Map<String, String> getParameters() {
    Map<String, String> params = new HashMap<String, String>();
    params.put(MapwayDocServlet.PARAM_ANT_HOME, org.nutz.lang.Strings.sBlank(System.getenv("ANT_HOME")));
    params.put(MapwayDocServlet.PARAM_AUTHOR, "zhangjsf@enn.com");
    params.put(MapwayDocServlet.PARAM_BASE_PATH, "/");
    params.put(MapwayDocServlet.PARAM_CONNECTOR_CLASS_NAME, "ApiConnector");
    params.put(MapwayDocServlet.PARAM_CONNECTOR_PACKAGE_NAME, "cn.ennwifi.datahub.api");
    params.put(MapwayDocServlet.PARAM_DOMAIN, "www.ennwifi.cn");
    params.put(MapwayDocServlet.PARAM_SCAN_PACKAGES, "cn.ennwifi.datahub.api");
    params.put(MapwayDocServlet.PARAM_SUB_TITLE, "文档生成时间:" + Times.format("yyyy年MM月dd日 HH:mm:ss", new Date()));
    params.put(MapwayDocServlet.PARAM_TITLE, "Iot物联网");
    params.put(MapwayDocServlet.PARAM_COPY_RIGHT, "2017 新奥集团");
    return params;
  }
}

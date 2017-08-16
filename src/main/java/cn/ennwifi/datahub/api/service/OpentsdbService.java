package cn.ennwifi.datahub.api.service;

import java.util.logging.Logger;

import org.nutz.http.Http;
import org.nutz.http.Response;
import org.nutz.lang.Stopwatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import cn.ennwifi.datahub.api.configure.ApplicationProperties;

/**
 * @author zhangbo
 *
 */
public class OpentsdbService {

  private static final Logger LOG = Logger.getLogger("OPENTSDB-SERVICE");

  @Autowired
  private ApplicationProperties applicationProperties;

  /**
   * tagv的过滤规则: 精确匹配多项迭代值，多项迭代值以'|'分隔，大小写敏感.
   */
  public static final String FILTER_TYPE_LITERAL_OR = "literal_or";

  /**
   * 结果的聚合形式.
   */
  public static final String AGGREGATOR_TYPE_AVG = "avg";

  /**
   * 返回的结果是否按照tag分组，分组.
   */
  public static final boolean GROUPBY_TYPE_TRUE = true;

  /**
   * opentsdb保存数据
   */
  public boolean putData(String obj) {

    LOG.info("上传数据参数:" + obj);

    // 请求opentsdb存放数据
    Response resp = Http.post3(getUrl() + "/api/put", obj, null, 60000);

    int statusCode = resp.getStatus();

    if (HttpStatus.NO_CONTENT.value() != statusCode) {
      LOG.info("Method failed: " + resp.getContent());
      return false;
    }

    return true;
  }

  /**
   * 获取请求地址
   * 
   * @return
   */
  private String getUrl() {
    return applicationProperties.getOpentsdbUrl();
  }

  /**
   * 获取最新数据.
   */
  public String getData(String req) {

    LOG.info("请求数据的参数:" + req);

    // 请求opentsdb存放数据
    Response resp = Http.post3(getUrl() + "/api/query/last", req, null, 60000);

    if (HttpStatus.OK.value() != resp.getStatus()) {
      LOG.info("Method failed: " + resp.getContent());
      return null;
    }

    LOG.info("返回的数据:" + resp.getContent());
    return resp.getContent();

  }

  /**
   * 查询数据.
   * 
   * @throws Exception
   */
  public String queryData(String req) throws Exception {

    LOG.info("请求数据的参数:" + req);

    Stopwatch sw = Stopwatch.begin();

    // 请求opentsdb存放数据
    Response resp = Http.post3(getUrl() + "/api/query", req, null, 60000);

    if (HttpStatus.OK.value() != resp.getStatus()) {
      LOG.info("Method failed: " + resp.getContent());

    }
    sw.stop();
    LOG.info("查询数据耗时：" + sw.getDuration() + ";数据大小：" + resp.getContent().length());
    return resp.getContent();

  }

}

package cn.ennwifi.datahub.api.content.view;

import org.springframework.util.MimeTypeUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import cn.ennwifi.datahub.api.codes.ErrorCode;
import cn.ennwifi.datahub.api.content.handler.CodeException;
import cn.ennwifi.datahub.api.controller.model.RespData;

/**
 * 展示系统错误视图 // JSON视图.
 *
 * @author zhangjianshe
 */
public class ErrorView extends ModelAndView {

  /**
   * Gen view.
   *
   * @return the mapping jackson 2 json view
   */
  private MappingJackson2JsonView genView() {
    MappingJackson2JsonView view = new MappingJackson2JsonView();
    // 设置返回的文档类型
    view.setContentType(MimeTypeUtils.APPLICATION_JSON_VALUE);
    // 近提取一个属性
    view.setExtractValueFromSingleKeyModel(true);

    return view;
  }

  /**
   * Instantiates a new error view.
   *
   * @param msg the msg
   */
  public ErrorView(String msg) {
    RespData data = new RespData();
    data.fail(msg);
    data.retCode = 1;

    this.setView(genView());
    this.addObject("error", data);
  }

  /**
   * Instantiates a new error view.
   *
   * @param code the code
   * @param msg the msg
   */
  public ErrorView(Integer code, String msg) {
    RespData data = new RespData();
    data.codeAndMsg(code, msg);
    this.setView(genView());
    this.addObject("error", data);
  }

  /**
   * Instantiates a new error view.
   *
   * @param ex the ex
   */
  public ErrorView(Exception ex) {
    RespData data = new RespData();
    data.fail(ex.getMessage());
    this.setView(genView());
    this.addObject("error", data);
  }

  /**
   * Instantiates a new error view.
   *
   * @param ex the ex
   */
  public ErrorView(CodeException ex) {
    RespData data = new RespData();
    data.codeAndMsg(ex.getCode(), ex.getMessage());
    this.setView(genView());
    this.addObject("error", data);
  }

  /**
   * Instantiates a new error view.
   *
   * @param ex the ex
   */
  public ErrorView(ErrorCode ex) {
    RespData data = new RespData();
    data.codeAndMsg(ex.code, ex.message);
    this.setView(genView());
    this.addObject("error", data);
  }
}

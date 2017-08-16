package cn.ennwifi.datahub.api.controller.model;

import cn.mapway.document.annotation.ApiField;
import cn.mapway.document.annotation.Doc;

@Doc(value = "返回信息")
public class RespData {

  /** The msg. */
  @ApiField(value = "返回消息內容", example = "消息內容")
  public String msg = "";

  /** The ret code. */
  @ApiField(value = "0:成功,其他:失败", example = "0")
  public Integer retCode;

  public RespData ok() {
    return ok("ok");
  }

  /**
   * 返回成功.
   * 
   * @param msg 消息
   * @return RespData
   */
  public RespData ok(String msg) {
    this.retCode = 0;
    this.msg = msg;
    return this;
  }

  public RespData fail(String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * 返回错误码和消息.
   * 
   * @param code 错误码
   * @param msg 消息
   * @return RespData
   */
  public RespData codeAndMsg(int code, String msg) {
    this.retCode = code;
    this.msg = msg;
    return this;
  }

}

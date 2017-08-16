/*******************************************************************************
 数据库持久化层(For MySQL5.1 Java)
 创建日期  Wed Aug 16 16:24:06 CST 2017
 创建程序 Program 版本(3.0)
 程序设计 张建设 EMAIL:zhangjianshe@gmail.com PHONE:15910868680

<pre>

           =============================================================
           -   ____ _  _ ____ _  _ ____  _ _ ____ _  _ ____ _  _ ____  -
           -    __] |__| |__| |\ | | __  | | |__| |\ | [__  |__| |___  -
           -   [___ |  | |  | | \| |__| _| | |  | | \| ___] |  | |___  -
           -           http://hi.baidu.com/zhangjianshe                -
           =============================================================

</pre>
/******************************************************************************/

package cn.ennwifi.datahub.api.data.repository;

import java.util.Date;

import org.nutz.dao.entity.annotation.*;
import java.math.BigDecimal;

/**
 * 数据库表 <br/>
 * @author zhangjsf@enn.cn

 *         <b>字段列表</b><br/>

 *         APP_ID   微信APPID String<br/>
 *         APP_KEY    String<br/>
 *         TOKEN    String<br/>
 *         SECRET    String<br/>
 *         ACCESS_TOKEN    String<br/>
 *         LAST_TIME   上次更新时间 Long<br/>
 *         EXPIRE   到期时间 Long<br/>
 *         NAME    String<br/>
 *         SUMMARY    String<br/>
 *         ICON    String<br/>
 *         OPEN_ID    String<br/>
 */

@Table("WX_APP")
public class WX_APPObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_WX_APP="WX_APP";
  public WX_APPObj() {
  }
  /**
   * 根据字段名称获取字段的值. 
   */
  @Override
  public Object getFieldValue(String fieldName,Integer fieldIndex) {
    if (fieldName != null && fieldName.length() > 0) {
      if (FLD_APP_ID.equals(fieldName)) {
        return APP_ID;
      }
      if (FLD_APP_KEY.equals(fieldName)) {
        return APP_KEY;
      }
      if (FLD_TOKEN.equals(fieldName)) {
        return TOKEN;
      }
      if (FLD_SECRET.equals(fieldName)) {
        return SECRET;
      }
      if (FLD_ACCESS_TOKEN.equals(fieldName)) {
        return ACCESS_TOKEN;
      }
      if (FLD_LAST_TIME.equals(fieldName)) {
        return LAST_TIME;
      }
      if (FLD_EXPIRE.equals(fieldName)) {
        return EXPIRE;
      }
      if (FLD_NAME.equals(fieldName)) {
        return NAME;
      }
      if (FLD_SUMMARY.equals(fieldName)) {
        return SUMMARY;
      }
      if (FLD_ICON.equals(fieldName)) {
        return ICON;
      }
      if (FLD_OPEN_ID.equals(fieldName)) {
        return OPEN_ID;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 11) {
      if (fieldIndex == 0) {
        return APP_ID;
      }
      if (fieldIndex == 1) {
        return APP_KEY;
      }
      if (fieldIndex == 2) {
        return TOKEN;
      }
      if (fieldIndex == 3) {
        return SECRET;
      }
      if (fieldIndex == 4) {
        return ACCESS_TOKEN;
      }
      if (fieldIndex == 5) {
        return LAST_TIME;
      }
      if (fieldIndex == 6) {
        return EXPIRE;
      }
      if (fieldIndex == 7) {
        return NAME;
      }
      if (fieldIndex == 8) {
        return SUMMARY;
      }
      if (fieldIndex == 9) {
        return ICON;
      }
      if (fieldIndex == 10) {
        return OPEN_ID;
      }
    } else {
      return null;
    }
    return null;
  }

  /**
   * 字段APP_ID在数据中的名称.
   */
  public static final String FLD_APP_ID="APP_ID";

  /**
   * 获取字段APP_ID的索引值.
   */
  public static final Integer IDX_APP_ID=0;
	@Name

 /**
   * 字段APP_ID.
   */
  private String APP_ID;

  /**
   * 返回字段APP_ID的值.
   * @return APP_ID  微信APPID  varchar
  */
  public String getAPP_ID() {
    return APP_ID;
  }

  /**
   * 设置字段APP_ID的值.
   * @param app_id  微信APPID  varchar
   */
  public void setAPP_ID(String app_id) {
    this.APP_ID=app_id;
  }

  /**
   * 字段APP_KEY在数据中的名称.
   */
  public static final String FLD_APP_KEY="APP_KEY";

  /**
   * 获取字段APP_KEY的索引值.
   */
  public static final Integer IDX_APP_KEY=1;

 /**
   * 字段APP_KEY.
   */
  private String APP_KEY;

  /**
   * 返回字段APP_KEY的值.
   * @return APP_KEY    varchar
  */
  public String getAPP_KEY() {
    return APP_KEY;
  }

  /**
   * 设置字段APP_KEY的值.
   * @param app_key    varchar
   */
  public void setAPP_KEY(String app_key) {
    this.APP_KEY=app_key;
  }

  /**
   * 字段TOKEN在数据中的名称.
   */
  public static final String FLD_TOKEN="TOKEN";

  /**
   * 获取字段TOKEN的索引值.
   */
  public static final Integer IDX_TOKEN=2;

 /**
   * 字段TOKEN.
   */
  private String TOKEN;

  /**
   * 返回字段TOKEN的值.
   * @return TOKEN    varchar
  */
  public String getTOKEN() {
    return TOKEN;
  }

  /**
   * 设置字段TOKEN的值.
   * @param token    varchar
   */
  public void setTOKEN(String token) {
    this.TOKEN=token;
  }

  /**
   * 字段SECRET在数据中的名称.
   */
  public static final String FLD_SECRET="SECRET";

  /**
   * 获取字段SECRET的索引值.
   */
  public static final Integer IDX_SECRET=3;

 /**
   * 字段SECRET.
   */
  private String SECRET;

  /**
   * 返回字段SECRET的值.
   * @return SECRET    varchar
  */
  public String getSECRET() {
    return SECRET;
  }

  /**
   * 设置字段SECRET的值.
   * @param secret    varchar
   */
  public void setSECRET(String secret) {
    this.SECRET=secret;
  }

  /**
   * 字段ACCESS_TOKEN在数据中的名称.
   */
  public static final String FLD_ACCESS_TOKEN="ACCESS_TOKEN";

  /**
   * 获取字段ACCESS_TOKEN的索引值.
   */
  public static final Integer IDX_ACCESS_TOKEN=4;

 /**
   * 字段ACCESS_TOKEN.
   */
  private String ACCESS_TOKEN;

  /**
   * 返回字段ACCESS_TOKEN的值.
   * @return ACCESS_TOKEN    varchar
  */
  public String getACCESS_TOKEN() {
    return ACCESS_TOKEN;
  }

  /**
   * 设置字段ACCESS_TOKEN的值.
   * @param access_token    varchar
   */
  public void setACCESS_TOKEN(String access_token) {
    this.ACCESS_TOKEN=access_token;
  }

  /**
   * 字段LAST_TIME在数据中的名称.
   */
  public static final String FLD_LAST_TIME="LAST_TIME";

  /**
   * 获取字段LAST_TIME的索引值.
   */
  public static final Integer IDX_LAST_TIME=5;

 /**
   * 字段LAST_TIME.
   */
  private Long LAST_TIME;

  /**
   * 返回字段LAST_TIME的值.
   * @return LAST_TIME  上次更新时间  bigint
  */
  public Long getLAST_TIME() {
    return LAST_TIME;
  }

  /**
   * 设置字段LAST_TIME的值.
   * @param last_time  上次更新时间  bigint
   */
  public void setLAST_TIME(Long last_time) {
    this.LAST_TIME=last_time;
  }

  /**
   * 字段EXPIRE在数据中的名称.
   */
  public static final String FLD_EXPIRE="EXPIRE";

  /**
   * 获取字段EXPIRE的索引值.
   */
  public static final Integer IDX_EXPIRE=6;

 /**
   * 字段EXPIRE.
   */
  private Long EXPIRE;

  /**
   * 返回字段EXPIRE的值.
   * @return EXPIRE  到期时间  bigint
  */
  public Long getEXPIRE() {
    return EXPIRE;
  }

  /**
   * 设置字段EXPIRE的值.
   * @param expire  到期时间  bigint
   */
  public void setEXPIRE(Long expire) {
    this.EXPIRE=expire;
  }

  /**
   * 字段NAME在数据中的名称.
   */
  public static final String FLD_NAME="NAME";

  /**
   * 获取字段NAME的索引值.
   */
  public static final Integer IDX_NAME=7;

 /**
   * 字段NAME.
   */
  private String NAME;

  /**
   * 返回字段NAME的值.
   * @return NAME    varchar
  */
  public String getNAME() {
    return NAME;
  }

  /**
   * 设置字段NAME的值.
   * @param name    varchar
   */
  public void setNAME(String name) {
    this.NAME=name;
  }

  /**
   * 字段SUMMARY在数据中的名称.
   */
  public static final String FLD_SUMMARY="SUMMARY";

  /**
   * 获取字段SUMMARY的索引值.
   */
  public static final Integer IDX_SUMMARY=8;

 /**
   * 字段SUMMARY.
   */
  private String SUMMARY;

  /**
   * 返回字段SUMMARY的值.
   * @return SUMMARY    varchar
  */
  public String getSUMMARY() {
    return SUMMARY;
  }

  /**
   * 设置字段SUMMARY的值.
   * @param summary    varchar
   */
  public void setSUMMARY(String summary) {
    this.SUMMARY=summary;
  }

  /**
   * 字段ICON在数据中的名称.
   */
  public static final String FLD_ICON="ICON";

  /**
   * 获取字段ICON的索引值.
   */
  public static final Integer IDX_ICON=9;

 /**
   * 字段ICON.
   */
  private String ICON;

  /**
   * 返回字段ICON的值.
   * @return ICON    varchar
  */
  public String getICON() {
    return ICON;
  }

  /**
   * 设置字段ICON的值.
   * @param icon    varchar
   */
  public void setICON(String icon) {
    this.ICON=icon;
  }

  /**
   * 字段OPEN_ID在数据中的名称.
   */
  public static final String FLD_OPEN_ID="OPEN_ID";

  /**
   * 获取字段OPEN_ID的索引值.
   */
  public static final Integer IDX_OPEN_ID=10;

 /**
   * 字段OPEN_ID.
   */
  private String OPEN_ID;

  /**
   * 返回字段OPEN_ID的值.
   * @return OPEN_ID    varchar
  */
  public String getOPEN_ID() {
    return OPEN_ID;
  }

  /**
   * 设置字段OPEN_ID的值.
   * @param open_id    varchar
   */
  public void setOPEN_ID(String open_id) {
    this.OPEN_ID=open_id;
  }

}

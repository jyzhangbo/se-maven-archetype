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
 * 数据库表 VIEW<br/>
 * @author zhangjsf@enn.cn

 *         <b>字段列表</b><br/>

 *         USER_ID    Long<br/>
 *         TOKEN    String<br/>
 *         TOKEN_CREATE_TIME    java.sql.Timestamp<br/>
 *         IS_USE   token是否生效（0：失效，1：生效） Integer<br/>
 *         API_GROUP   api所属group String<br/>
 *         API_AUTHORIZE_TIME    java.sql.Timestamp<br/>
 *         TYPE   登录类型 Integer<br/>
 *         LOGIN_NAME   用户登录唯一名称标识 String<br/>
 *         REAL_NAME   真实姓名 String<br/>
 *         AVATOR   头像的相对地址 String<br/>
 *         EMAIL   邮箱 String<br/>
 *         MOBILE   手机 String<br/>
 */

@Table("VIEW_USER_TOKEN_APIS")
public class VIEW_USER_TOKEN_APISObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_VIEW_USER_TOKEN_APIS="VIEW_USER_TOKEN_APIS";
  public VIEW_USER_TOKEN_APISObj() {
  }
  /**
   * 根据字段名称获取字段的值. 
   */
  @Override
  public Object getFieldValue(String fieldName,Integer fieldIndex) {
    if (fieldName != null && fieldName.length() > 0) {
      if (FLD_USER_ID.equals(fieldName)) {
        return USER_ID;
      }
      if (FLD_TOKEN.equals(fieldName)) {
        return TOKEN;
      }
      if (FLD_TOKEN_CREATE_TIME.equals(fieldName)) {
        return TOKEN_CREATE_TIME;
      }
      if (FLD_IS_USE.equals(fieldName)) {
        return IS_USE;
      }
      if (FLD_API_GROUP.equals(fieldName)) {
        return API_GROUP;
      }
      if (FLD_API_AUTHORIZE_TIME.equals(fieldName)) {
        return API_AUTHORIZE_TIME;
      }
      if (FLD_TYPE.equals(fieldName)) {
        return TYPE;
      }
      if (FLD_LOGIN_NAME.equals(fieldName)) {
        return LOGIN_NAME;
      }
      if (FLD_REAL_NAME.equals(fieldName)) {
        return REAL_NAME;
      }
      if (FLD_AVATOR.equals(fieldName)) {
        return AVATOR;
      }
      if (FLD_EMAIL.equals(fieldName)) {
        return EMAIL;
      }
      if (FLD_MOBILE.equals(fieldName)) {
        return MOBILE;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 12) {
      if (fieldIndex == 0) {
        return USER_ID;
      }
      if (fieldIndex == 1) {
        return TOKEN;
      }
      if (fieldIndex == 2) {
        return TOKEN_CREATE_TIME;
      }
      if (fieldIndex == 3) {
        return IS_USE;
      }
      if (fieldIndex == 4) {
        return API_GROUP;
      }
      if (fieldIndex == 5) {
        return API_AUTHORIZE_TIME;
      }
      if (fieldIndex == 6) {
        return TYPE;
      }
      if (fieldIndex == 7) {
        return LOGIN_NAME;
      }
      if (fieldIndex == 8) {
        return REAL_NAME;
      }
      if (fieldIndex == 9) {
        return AVATOR;
      }
      if (fieldIndex == 10) {
        return EMAIL;
      }
      if (fieldIndex == 11) {
        return MOBILE;
      }
    } else {
      return null;
    }
    return null;
  }

  /**
   * 字段USER_ID在数据中的名称.
   */
  public static final String FLD_USER_ID="USER_ID";

  /**
   * 获取字段USER_ID的索引值.
   */
  public static final Integer IDX_USER_ID=0;

 /**
   * 字段USER_ID.
   */
  private Long USER_ID;

  /**
   * 返回字段USER_ID的值.
   * @return USER_ID    bigint
  */
  public Long getUSER_ID() {
    return USER_ID;
  }

  /**
   * 设置字段USER_ID的值.
   * @param user_id    bigint
   */
  public void setUSER_ID(Long user_id) {
    this.USER_ID=user_id;
  }

  /**
   * 字段TOKEN在数据中的名称.
   */
  public static final String FLD_TOKEN="TOKEN";

  /**
   * 获取字段TOKEN的索引值.
   */
  public static final Integer IDX_TOKEN=1;

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
   * 字段TOKEN_CREATE_TIME在数据中的名称.
   */
  public static final String FLD_TOKEN_CREATE_TIME="TOKEN_CREATE_TIME";

  /**
   * 获取字段TOKEN_CREATE_TIME的索引值.
   */
  public static final Integer IDX_TOKEN_CREATE_TIME=2;

 /**
   * 字段TOKEN_CREATE_TIME.
   */
  private java.sql.Timestamp TOKEN_CREATE_TIME;

  /**
   * 返回字段TOKEN_CREATE_TIME的值.
   * @return TOKEN_CREATE_TIME    timestamp
  */
  public java.sql.Timestamp getTOKEN_CREATE_TIME() {
    return TOKEN_CREATE_TIME;
  }

  /**
   * 设置字段TOKEN_CREATE_TIME的值.
   * @param token_create_time    timestamp
   */
  public void setTOKEN_CREATE_TIME(java.sql.Timestamp token_create_time) {
    this.TOKEN_CREATE_TIME=token_create_time;
  }

  /**
   * 字段IS_USE在数据中的名称.
   */
  public static final String FLD_IS_USE="IS_USE";

  /**
   * 获取字段IS_USE的索引值.
   */
  public static final Integer IDX_IS_USE=3;

 /**
   * 字段IS_USE.
   */
  private Integer IS_USE;

  /**
   * 返回字段IS_USE的值.
   * @return IS_USE  token是否生效（0：失效，1：生效）  int
  */
  public Integer getIS_USE() {
    return IS_USE;
  }

  /**
   * 设置字段IS_USE的值.
   * @param is_use  token是否生效（0：失效，1：生效）  int
   */
  public void setIS_USE(Integer is_use) {
    this.IS_USE=is_use;
  }

  /**
   * 字段API_GROUP在数据中的名称.
   */
  public static final String FLD_API_GROUP="API_GROUP";

  /**
   * 获取字段API_GROUP的索引值.
   */
  public static final Integer IDX_API_GROUP=4;

 /**
   * 字段API_GROUP.
   */
  private String API_GROUP;

  /**
   * 返回字段API_GROUP的值.
   * @return API_GROUP  api所属group  varchar
  */
  public String getAPI_GROUP() {
    return API_GROUP;
  }

  /**
   * 设置字段API_GROUP的值.
   * @param api_group  api所属group  varchar
   */
  public void setAPI_GROUP(String api_group) {
    this.API_GROUP=api_group;
  }

  /**
   * 字段API_AUTHORIZE_TIME在数据中的名称.
   */
  public static final String FLD_API_AUTHORIZE_TIME="API_AUTHORIZE_TIME";

  /**
   * 获取字段API_AUTHORIZE_TIME的索引值.
   */
  public static final Integer IDX_API_AUTHORIZE_TIME=5;

 /**
   * 字段API_AUTHORIZE_TIME.
   */
  private java.sql.Timestamp API_AUTHORIZE_TIME;

  /**
   * 返回字段API_AUTHORIZE_TIME的值.
   * @return API_AUTHORIZE_TIME    timestamp
  */
  public java.sql.Timestamp getAPI_AUTHORIZE_TIME() {
    return API_AUTHORIZE_TIME;
  }

  /**
   * 设置字段API_AUTHORIZE_TIME的值.
   * @param api_authorize_time    timestamp
   */
  public void setAPI_AUTHORIZE_TIME(java.sql.Timestamp api_authorize_time) {
    this.API_AUTHORIZE_TIME=api_authorize_time;
  }

  /**
   * 字段TYPE在数据中的名称.
   */
  public static final String FLD_TYPE="TYPE";

  /**
   * 获取字段TYPE的索引值.
   */
  public static final Integer IDX_TYPE=6;

 /**
   * 字段TYPE.
   */
  private Integer TYPE;

  /**
   * 返回字段TYPE的值.
   * @return TYPE  登录类型  int
  */
  public Integer getTYPE() {
    return TYPE;
  }

  /**
   * 设置字段TYPE的值.
   * @param type  登录类型  int
   */
  public void setTYPE(Integer type) {
    this.TYPE=type;
  }

  /**
   * 字段LOGIN_NAME在数据中的名称.
   */
  public static final String FLD_LOGIN_NAME="LOGIN_NAME";

  /**
   * 获取字段LOGIN_NAME的索引值.
   */
  public static final Integer IDX_LOGIN_NAME=7;

 /**
   * 字段LOGIN_NAME.
   */
  private String LOGIN_NAME;

  /**
   * 返回字段LOGIN_NAME的值.
   * @return LOGIN_NAME  用户登录唯一名称标识  varchar
  */
  public String getLOGIN_NAME() {
    return LOGIN_NAME;
  }

  /**
   * 设置字段LOGIN_NAME的值.
   * @param login_name  用户登录唯一名称标识  varchar
   */
  public void setLOGIN_NAME(String login_name) {
    this.LOGIN_NAME=login_name;
  }

  /**
   * 字段REAL_NAME在数据中的名称.
   */
  public static final String FLD_REAL_NAME="REAL_NAME";

  /**
   * 获取字段REAL_NAME的索引值.
   */
  public static final Integer IDX_REAL_NAME=8;

 /**
   * 字段REAL_NAME.
   */
  private String REAL_NAME;

  /**
   * 返回字段REAL_NAME的值.
   * @return REAL_NAME  真实姓名  varchar
  */
  public String getREAL_NAME() {
    return REAL_NAME;
  }

  /**
   * 设置字段REAL_NAME的值.
   * @param real_name  真实姓名  varchar
   */
  public void setREAL_NAME(String real_name) {
    this.REAL_NAME=real_name;
  }

  /**
   * 字段AVATOR在数据中的名称.
   */
  public static final String FLD_AVATOR="AVATOR";

  /**
   * 获取字段AVATOR的索引值.
   */
  public static final Integer IDX_AVATOR=9;

 /**
   * 字段AVATOR.
   */
  private String AVATOR;

  /**
   * 返回字段AVATOR的值.
   * @return AVATOR  头像的相对地址  varchar
  */
  public String getAVATOR() {
    return AVATOR;
  }

  /**
   * 设置字段AVATOR的值.
   * @param avator  头像的相对地址  varchar
   */
  public void setAVATOR(String avator) {
    this.AVATOR=avator;
  }

  /**
   * 字段EMAIL在数据中的名称.
   */
  public static final String FLD_EMAIL="EMAIL";

  /**
   * 获取字段EMAIL的索引值.
   */
  public static final Integer IDX_EMAIL=10;

 /**
   * 字段EMAIL.
   */
  private String EMAIL;

  /**
   * 返回字段EMAIL的值.
   * @return EMAIL  邮箱  varchar
  */
  public String getEMAIL() {
    return EMAIL;
  }

  /**
   * 设置字段EMAIL的值.
   * @param email  邮箱  varchar
   */
  public void setEMAIL(String email) {
    this.EMAIL=email;
  }

  /**
   * 字段MOBILE在数据中的名称.
   */
  public static final String FLD_MOBILE="MOBILE";

  /**
   * 获取字段MOBILE的索引值.
   */
  public static final Integer IDX_MOBILE=11;

 /**
   * 字段MOBILE.
   */
  private String MOBILE;

  /**
   * 返回字段MOBILE的值.
   * @return MOBILE  手机  varchar
  */
  public String getMOBILE() {
    return MOBILE;
  }

  /**
   * 设置字段MOBILE的值.
   * @param mobile  手机  varchar
   */
  public void setMOBILE(String mobile) {
    this.MOBILE=mobile;
  }

}

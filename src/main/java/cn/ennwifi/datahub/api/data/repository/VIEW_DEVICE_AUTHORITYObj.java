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

 *         USER_LOGIN_NAME   用户登录唯一名称标识 String<br/>
 *         REAL_NAME   真实姓名 String<br/>
 *         AVATOR   头像的相对地址 String<br/>
 *         GENDER   性别 String<br/>
 *         EMAIL   邮箱 String<br/>
 *         MOBILE   手机 String<br/>
 *         TITLE   用户说明 String<br/>
 *         TOKEN   登录的TOKEN String<br/>
 *         CREATE_TIME    java.sql.Timestamp<br/>
 *         USER_UPDATE_TIME    java.sql.Timestamp<br/>
 *         DEVICE_ID   ID Long<br/>
 *         DEVICE_NO   设备序列号 String<br/>
 *         CTIME   安装时间 java.sql.Timestamp<br/>
 *         REGISTER_START   寄存器起始地址 Integer<br/>
 *         PROTOCOL_TYPE_ID   设备协议类型ID Long<br/>
 *         PROTOCOL_LENGTH   协议的长度 Integer<br/>
 *         NAME   设备名称 String<br/>
 *         DEVICE_TYPE_ID   设备类型ID Long<br/>
 *         DEVICE_UPDATE_TIME   更新时间 java.sql.Timestamp<br/>
 *         ORDER_IN_GATEWAY   在网关下的顺序 Integer<br/>
 *         USER_ID    Long<br/>
 */

@Table("VIEW_DEVICE_AUTHORITY")
public class VIEW_DEVICE_AUTHORITYObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_VIEW_DEVICE_AUTHORITY="VIEW_DEVICE_AUTHORITY";
  public VIEW_DEVICE_AUTHORITYObj() {
  }
  /**
   * 根据字段名称获取字段的值. 
   */
  @Override
  public Object getFieldValue(String fieldName,Integer fieldIndex) {
    if (fieldName != null && fieldName.length() > 0) {
      if (FLD_USER_LOGIN_NAME.equals(fieldName)) {
        return USER_LOGIN_NAME;
      }
      if (FLD_REAL_NAME.equals(fieldName)) {
        return REAL_NAME;
      }
      if (FLD_AVATOR.equals(fieldName)) {
        return AVATOR;
      }
      if (FLD_GENDER.equals(fieldName)) {
        return GENDER;
      }
      if (FLD_EMAIL.equals(fieldName)) {
        return EMAIL;
      }
      if (FLD_MOBILE.equals(fieldName)) {
        return MOBILE;
      }
      if (FLD_TITLE.equals(fieldName)) {
        return TITLE;
      }
      if (FLD_TOKEN.equals(fieldName)) {
        return TOKEN;
      }
      if (FLD_CREATE_TIME.equals(fieldName)) {
        return CREATE_TIME;
      }
      if (FLD_USER_UPDATE_TIME.equals(fieldName)) {
        return USER_UPDATE_TIME;
      }
      if (FLD_DEVICE_ID.equals(fieldName)) {
        return DEVICE_ID;
      }
      if (FLD_DEVICE_NO.equals(fieldName)) {
        return DEVICE_NO;
      }
      if (FLD_CTIME.equals(fieldName)) {
        return CTIME;
      }
      if (FLD_REGISTER_START.equals(fieldName)) {
        return REGISTER_START;
      }
      if (FLD_PROTOCOL_TYPE_ID.equals(fieldName)) {
        return PROTOCOL_TYPE_ID;
      }
      if (FLD_PROTOCOL_LENGTH.equals(fieldName)) {
        return PROTOCOL_LENGTH;
      }
      if (FLD_NAME.equals(fieldName)) {
        return NAME;
      }
      if (FLD_DEVICE_TYPE_ID.equals(fieldName)) {
        return DEVICE_TYPE_ID;
      }
      if (FLD_DEVICE_UPDATE_TIME.equals(fieldName)) {
        return DEVICE_UPDATE_TIME;
      }
      if (FLD_ORDER_IN_GATEWAY.equals(fieldName)) {
        return ORDER_IN_GATEWAY;
      }
      if (FLD_USER_ID.equals(fieldName)) {
        return USER_ID;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 21) {
      if (fieldIndex == 0) {
        return USER_LOGIN_NAME;
      }
      if (fieldIndex == 1) {
        return REAL_NAME;
      }
      if (fieldIndex == 2) {
        return AVATOR;
      }
      if (fieldIndex == 3) {
        return GENDER;
      }
      if (fieldIndex == 4) {
        return EMAIL;
      }
      if (fieldIndex == 5) {
        return MOBILE;
      }
      if (fieldIndex == 6) {
        return TITLE;
      }
      if (fieldIndex == 7) {
        return TOKEN;
      }
      if (fieldIndex == 8) {
        return CREATE_TIME;
      }
      if (fieldIndex == 9) {
        return USER_UPDATE_TIME;
      }
      if (fieldIndex == 10) {
        return DEVICE_ID;
      }
      if (fieldIndex == 11) {
        return DEVICE_NO;
      }
      if (fieldIndex == 12) {
        return CTIME;
      }
      if (fieldIndex == 13) {
        return REGISTER_START;
      }
      if (fieldIndex == 14) {
        return PROTOCOL_TYPE_ID;
      }
      if (fieldIndex == 15) {
        return PROTOCOL_LENGTH;
      }
      if (fieldIndex == 16) {
        return NAME;
      }
      if (fieldIndex == 17) {
        return DEVICE_TYPE_ID;
      }
      if (fieldIndex == 18) {
        return DEVICE_UPDATE_TIME;
      }
      if (fieldIndex == 19) {
        return ORDER_IN_GATEWAY;
      }
      if (fieldIndex == 20) {
        return USER_ID;
      }
    } else {
      return null;
    }
    return null;
  }

  /**
   * 字段USER_LOGIN_NAME在数据中的名称.
   */
  public static final String FLD_USER_LOGIN_NAME="USER_LOGIN_NAME";

  /**
   * 获取字段USER_LOGIN_NAME的索引值.
   */
  public static final Integer IDX_USER_LOGIN_NAME=0;

 /**
   * 字段USER_LOGIN_NAME.
   */
  private String USER_LOGIN_NAME;

  /**
   * 返回字段USER_LOGIN_NAME的值.
   * @return USER_LOGIN_NAME  用户登录唯一名称标识  varchar
  */
  public String getUSER_LOGIN_NAME() {
    return USER_LOGIN_NAME;
  }

  /**
   * 设置字段USER_LOGIN_NAME的值.
   * @param user_login_name  用户登录唯一名称标识  varchar
   */
  public void setUSER_LOGIN_NAME(String user_login_name) {
    this.USER_LOGIN_NAME=user_login_name;
  }

  /**
   * 字段REAL_NAME在数据中的名称.
   */
  public static final String FLD_REAL_NAME="REAL_NAME";

  /**
   * 获取字段REAL_NAME的索引值.
   */
  public static final Integer IDX_REAL_NAME=1;

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
  public static final Integer IDX_AVATOR=2;

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
   * 字段GENDER在数据中的名称.
   */
  public static final String FLD_GENDER="GENDER";

  /**
   * 获取字段GENDER的索引值.
   */
  public static final Integer IDX_GENDER=3;

 /**
   * 字段GENDER.
   */
  private String GENDER;

  /**
   * 返回字段GENDER的值.
   * @return GENDER  性别  varchar
  */
  public String getGENDER() {
    return GENDER;
  }

  /**
   * 设置字段GENDER的值.
   * @param gender  性别  varchar
   */
  public void setGENDER(String gender) {
    this.GENDER=gender;
  }

  /**
   * 字段EMAIL在数据中的名称.
   */
  public static final String FLD_EMAIL="EMAIL";

  /**
   * 获取字段EMAIL的索引值.
   */
  public static final Integer IDX_EMAIL=4;

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
  public static final Integer IDX_MOBILE=5;

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

  /**
   * 字段TITLE在数据中的名称.
   */
  public static final String FLD_TITLE="TITLE";

  /**
   * 获取字段TITLE的索引值.
   */
  public static final Integer IDX_TITLE=6;

 /**
   * 字段TITLE.
   */
  private String TITLE;

  /**
   * 返回字段TITLE的值.
   * @return TITLE  用户说明  varchar
  */
  public String getTITLE() {
    return TITLE;
  }

  /**
   * 设置字段TITLE的值.
   * @param title  用户说明  varchar
   */
  public void setTITLE(String title) {
    this.TITLE=title;
  }

  /**
   * 字段TOKEN在数据中的名称.
   */
  public static final String FLD_TOKEN="TOKEN";

  /**
   * 获取字段TOKEN的索引值.
   */
  public static final Integer IDX_TOKEN=7;

 /**
   * 字段TOKEN.
   */
  private String TOKEN;

  /**
   * 返回字段TOKEN的值.
   * @return TOKEN  登录的TOKEN  varchar
  */
  public String getTOKEN() {
    return TOKEN;
  }

  /**
   * 设置字段TOKEN的值.
   * @param token  登录的TOKEN  varchar
   */
  public void setTOKEN(String token) {
    this.TOKEN=token;
  }

  /**
   * 字段CREATE_TIME在数据中的名称.
   */
  public static final String FLD_CREATE_TIME="CREATE_TIME";

  /**
   * 获取字段CREATE_TIME的索引值.
   */
  public static final Integer IDX_CREATE_TIME=8;

 /**
   * 字段CREATE_TIME.
   */
  private java.sql.Timestamp CREATE_TIME;

  /**
   * 返回字段CREATE_TIME的值.
   * @return CREATE_TIME    timestamp
  */
  public java.sql.Timestamp getCREATE_TIME() {
    return CREATE_TIME;
  }

  /**
   * 设置字段CREATE_TIME的值.
   * @param create_time    timestamp
   */
  public void setCREATE_TIME(java.sql.Timestamp create_time) {
    this.CREATE_TIME=create_time;
  }

  /**
   * 字段USER_UPDATE_TIME在数据中的名称.
   */
  public static final String FLD_USER_UPDATE_TIME="USER_UPDATE_TIME";

  /**
   * 获取字段USER_UPDATE_TIME的索引值.
   */
  public static final Integer IDX_USER_UPDATE_TIME=9;

 /**
   * 字段USER_UPDATE_TIME.
   */
  private java.sql.Timestamp USER_UPDATE_TIME;

  /**
   * 返回字段USER_UPDATE_TIME的值.
   * @return USER_UPDATE_TIME    timestamp
  */
  public java.sql.Timestamp getUSER_UPDATE_TIME() {
    return USER_UPDATE_TIME;
  }

  /**
   * 设置字段USER_UPDATE_TIME的值.
   * @param user_update_time    timestamp
   */
  public void setUSER_UPDATE_TIME(java.sql.Timestamp user_update_time) {
    this.USER_UPDATE_TIME=user_update_time;
  }

  /**
   * 字段DEVICE_ID在数据中的名称.
   */
  public static final String FLD_DEVICE_ID="DEVICE_ID";

  /**
   * 获取字段DEVICE_ID的索引值.
   */
  public static final Integer IDX_DEVICE_ID=10;

 /**
   * 字段DEVICE_ID.
   */
  private Long DEVICE_ID;

  /**
   * 返回字段DEVICE_ID的值.
   * @return DEVICE_ID  ID  bigint
  */
  public Long getDEVICE_ID() {
    return DEVICE_ID;
  }

  /**
   * 设置字段DEVICE_ID的值.
   * @param device_id  ID  bigint
   */
  public void setDEVICE_ID(Long device_id) {
    this.DEVICE_ID=device_id;
  }

  /**
   * 字段DEVICE_NO在数据中的名称.
   */
  public static final String FLD_DEVICE_NO="DEVICE_NO";

  /**
   * 获取字段DEVICE_NO的索引值.
   */
  public static final Integer IDX_DEVICE_NO=11;

 /**
   * 字段DEVICE_NO.
   */
  private String DEVICE_NO;

  /**
   * 返回字段DEVICE_NO的值.
   * @return DEVICE_NO  设备序列号  varchar
  */
  public String getDEVICE_NO() {
    return DEVICE_NO;
  }

  /**
   * 设置字段DEVICE_NO的值.
   * @param device_no  设备序列号  varchar
   */
  public void setDEVICE_NO(String device_no) {
    this.DEVICE_NO=device_no;
  }

  /**
   * 字段CTIME在数据中的名称.
   */
  public static final String FLD_CTIME="CTIME";

  /**
   * 获取字段CTIME的索引值.
   */
  public static final Integer IDX_CTIME=12;

 /**
   * 字段CTIME.
   */
  private java.sql.Timestamp CTIME;

  /**
   * 返回字段CTIME的值.
   * @return CTIME  安装时间  timestamp
  */
  public java.sql.Timestamp getCTIME() {
    return CTIME;
  }

  /**
   * 设置字段CTIME的值.
   * @param ctime  安装时间  timestamp
   */
  public void setCTIME(java.sql.Timestamp ctime) {
    this.CTIME=ctime;
  }

  /**
   * 字段REGISTER_START在数据中的名称.
   */
  public static final String FLD_REGISTER_START="REGISTER_START";

  /**
   * 获取字段REGISTER_START的索引值.
   */
  public static final Integer IDX_REGISTER_START=13;

 /**
   * 字段REGISTER_START.
   */
  private Integer REGISTER_START;

  /**
   * 返回字段REGISTER_START的值.
   * @return REGISTER_START  寄存器起始地址  int
  */
  public Integer getREGISTER_START() {
    return REGISTER_START;
  }

  /**
   * 设置字段REGISTER_START的值.
   * @param register_start  寄存器起始地址  int
   */
  public void setREGISTER_START(Integer register_start) {
    this.REGISTER_START=register_start;
  }

  /**
   * 字段PROTOCOL_TYPE_ID在数据中的名称.
   */
  public static final String FLD_PROTOCOL_TYPE_ID="PROTOCOL_TYPE_ID";

  /**
   * 获取字段PROTOCOL_TYPE_ID的索引值.
   */
  public static final Integer IDX_PROTOCOL_TYPE_ID=14;

 /**
   * 字段PROTOCOL_TYPE_ID.
   */
  private Long PROTOCOL_TYPE_ID;

  /**
   * 返回字段PROTOCOL_TYPE_ID的值.
   * @return PROTOCOL_TYPE_ID  设备协议类型ID  bigint
  */
  public Long getPROTOCOL_TYPE_ID() {
    return PROTOCOL_TYPE_ID;
  }

  /**
   * 设置字段PROTOCOL_TYPE_ID的值.
   * @param protocol_type_id  设备协议类型ID  bigint
   */
  public void setPROTOCOL_TYPE_ID(Long protocol_type_id) {
    this.PROTOCOL_TYPE_ID=protocol_type_id;
  }

  /**
   * 字段PROTOCOL_LENGTH在数据中的名称.
   */
  public static final String FLD_PROTOCOL_LENGTH="PROTOCOL_LENGTH";

  /**
   * 获取字段PROTOCOL_LENGTH的索引值.
   */
  public static final Integer IDX_PROTOCOL_LENGTH=15;

 /**
   * 字段PROTOCOL_LENGTH.
   */
  private Integer PROTOCOL_LENGTH;

  /**
   * 返回字段PROTOCOL_LENGTH的值.
   * @return PROTOCOL_LENGTH  协议的长度  int
  */
  public Integer getPROTOCOL_LENGTH() {
    return PROTOCOL_LENGTH;
  }

  /**
   * 设置字段PROTOCOL_LENGTH的值.
   * @param protocol_length  协议的长度  int
   */
  public void setPROTOCOL_LENGTH(Integer protocol_length) {
    this.PROTOCOL_LENGTH=protocol_length;
  }

  /**
   * 字段NAME在数据中的名称.
   */
  public static final String FLD_NAME="NAME";

  /**
   * 获取字段NAME的索引值.
   */
  public static final Integer IDX_NAME=16;

 /**
   * 字段NAME.
   */
  private String NAME;

  /**
   * 返回字段NAME的值.
   * @return NAME  设备名称  varchar
  */
  public String getNAME() {
    return NAME;
  }

  /**
   * 设置字段NAME的值.
   * @param name  设备名称  varchar
   */
  public void setNAME(String name) {
    this.NAME=name;
  }

  /**
   * 字段DEVICE_TYPE_ID在数据中的名称.
   */
  public static final String FLD_DEVICE_TYPE_ID="DEVICE_TYPE_ID";

  /**
   * 获取字段DEVICE_TYPE_ID的索引值.
   */
  public static final Integer IDX_DEVICE_TYPE_ID=17;

 /**
   * 字段DEVICE_TYPE_ID.
   */
  private Long DEVICE_TYPE_ID;

  /**
   * 返回字段DEVICE_TYPE_ID的值.
   * @return DEVICE_TYPE_ID  设备类型ID  bigint
  */
  public Long getDEVICE_TYPE_ID() {
    return DEVICE_TYPE_ID;
  }

  /**
   * 设置字段DEVICE_TYPE_ID的值.
   * @param device_type_id  设备类型ID  bigint
   */
  public void setDEVICE_TYPE_ID(Long device_type_id) {
    this.DEVICE_TYPE_ID=device_type_id;
  }

  /**
   * 字段DEVICE_UPDATE_TIME在数据中的名称.
   */
  public static final String FLD_DEVICE_UPDATE_TIME="DEVICE_UPDATE_TIME";

  /**
   * 获取字段DEVICE_UPDATE_TIME的索引值.
   */
  public static final Integer IDX_DEVICE_UPDATE_TIME=18;

 /**
   * 字段DEVICE_UPDATE_TIME.
   */
  private java.sql.Timestamp DEVICE_UPDATE_TIME;

  /**
   * 返回字段DEVICE_UPDATE_TIME的值.
   * @return DEVICE_UPDATE_TIME  更新时间  timestamp
  */
  public java.sql.Timestamp getDEVICE_UPDATE_TIME() {
    return DEVICE_UPDATE_TIME;
  }

  /**
   * 设置字段DEVICE_UPDATE_TIME的值.
   * @param device_update_time  更新时间  timestamp
   */
  public void setDEVICE_UPDATE_TIME(java.sql.Timestamp device_update_time) {
    this.DEVICE_UPDATE_TIME=device_update_time;
  }

  /**
   * 字段ORDER_IN_GATEWAY在数据中的名称.
   */
  public static final String FLD_ORDER_IN_GATEWAY="ORDER_IN_GATEWAY";

  /**
   * 获取字段ORDER_IN_GATEWAY的索引值.
   */
  public static final Integer IDX_ORDER_IN_GATEWAY=19;

 /**
   * 字段ORDER_IN_GATEWAY.
   */
  private Integer ORDER_IN_GATEWAY;

  /**
   * 返回字段ORDER_IN_GATEWAY的值.
   * @return ORDER_IN_GATEWAY  在网关下的顺序  int
  */
  public Integer getORDER_IN_GATEWAY() {
    return ORDER_IN_GATEWAY;
  }

  /**
   * 设置字段ORDER_IN_GATEWAY的值.
   * @param order_in_gateway  在网关下的顺序  int
   */
  public void setORDER_IN_GATEWAY(Integer order_in_gateway) {
    this.ORDER_IN_GATEWAY=order_in_gateway;
  }

  /**
   * 字段USER_ID在数据中的名称.
   */
  public static final String FLD_USER_ID="USER_ID";

  /**
   * 获取字段USER_ID的索引值.
   */
  public static final Integer IDX_USER_ID=20;

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

}

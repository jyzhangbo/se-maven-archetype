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

 *         TYPE   登录类型 Integer<br/>
 *         REAL_NAME   真实姓名 String<br/>
 *         AVATOR   头像的相对地址 String<br/>
 *         GENDER   性别 String<br/>
 *         USER_ID   用户id Long<br/>
 *         GATEWAY_ID   网关ID Long<br/>
 *         DEVICE_ID   设备ID Long<br/>
 *         BIND_TIME   绑定时间 java.sql.Timestamp<br/>
 *         DEVICE_NO   设备序列号 String<br/>
 *         ATTR_NAME   属性名字(指标) String<br/>
 *         RULE_TYPE   规则类型 0,数据范围检查规则 1 数据遗漏检查规则 Integer<br/>
 *         RULE_PARAM   规则参数,JSON格式，对应不同的规则类型 String<br/>
 *         TEL_CONFIGURE   电话配置 String<br/>
 *         MAIL_CONFIGURE   邮件配置 String<br/>
 *         WEIXIN_GONFIGURE   微信配置 String<br/>
 *         MQTT_CONFIGURE   MQTT配置信息 String<br/>
 *         ENABLED   是否启用,缺省启用规则 Integer<br/>
 *         CTIME   创建时间 java.sql.Timestamp<br/>
 *         UTIME   修改时间 java.sql.Timestamp<br/>
 *         ALERT_INTERVAL   报警频率(两次同样报警之间的时间间隔，以秒为单位) Integer<br/>
 *         USER_NAME   用户登录唯一名称标识 String<br/>
 */

@Table("VIEW_USER_DEVICE_RULE")
public class VIEW_USER_DEVICE_RULEObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_VIEW_USER_DEVICE_RULE="VIEW_USER_DEVICE_RULE";
  public VIEW_USER_DEVICE_RULEObj() {
  }
  /**
   * 根据字段名称获取字段的值. 
   */
  @Override
  public Object getFieldValue(String fieldName,Integer fieldIndex) {
    if (fieldName != null && fieldName.length() > 0) {
      if (FLD_TYPE.equals(fieldName)) {
        return TYPE;
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
      if (FLD_USER_ID.equals(fieldName)) {
        return USER_ID;
      }
      if (FLD_GATEWAY_ID.equals(fieldName)) {
        return GATEWAY_ID;
      }
      if (FLD_DEVICE_ID.equals(fieldName)) {
        return DEVICE_ID;
      }
      if (FLD_BIND_TIME.equals(fieldName)) {
        return BIND_TIME;
      }
      if (FLD_DEVICE_NO.equals(fieldName)) {
        return DEVICE_NO;
      }
      if (FLD_ATTR_NAME.equals(fieldName)) {
        return ATTR_NAME;
      }
      if (FLD_RULE_TYPE.equals(fieldName)) {
        return RULE_TYPE;
      }
      if (FLD_RULE_PARAM.equals(fieldName)) {
        return RULE_PARAM;
      }
      if (FLD_TEL_CONFIGURE.equals(fieldName)) {
        return TEL_CONFIGURE;
      }
      if (FLD_MAIL_CONFIGURE.equals(fieldName)) {
        return MAIL_CONFIGURE;
      }
      if (FLD_WEIXIN_GONFIGURE.equals(fieldName)) {
        return WEIXIN_GONFIGURE;
      }
      if (FLD_MQTT_CONFIGURE.equals(fieldName)) {
        return MQTT_CONFIGURE;
      }
      if (FLD_ENABLED.equals(fieldName)) {
        return ENABLED;
      }
      if (FLD_CTIME.equals(fieldName)) {
        return CTIME;
      }
      if (FLD_UTIME.equals(fieldName)) {
        return UTIME;
      }
      if (FLD_ALERT_INTERVAL.equals(fieldName)) {
        return ALERT_INTERVAL;
      }
      if (FLD_USER_NAME.equals(fieldName)) {
        return USER_NAME;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 21) {
      if (fieldIndex == 0) {
        return TYPE;
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
        return USER_ID;
      }
      if (fieldIndex == 5) {
        return GATEWAY_ID;
      }
      if (fieldIndex == 6) {
        return DEVICE_ID;
      }
      if (fieldIndex == 7) {
        return BIND_TIME;
      }
      if (fieldIndex == 8) {
        return DEVICE_NO;
      }
      if (fieldIndex == 9) {
        return ATTR_NAME;
      }
      if (fieldIndex == 10) {
        return RULE_TYPE;
      }
      if (fieldIndex == 11) {
        return RULE_PARAM;
      }
      if (fieldIndex == 12) {
        return TEL_CONFIGURE;
      }
      if (fieldIndex == 13) {
        return MAIL_CONFIGURE;
      }
      if (fieldIndex == 14) {
        return WEIXIN_GONFIGURE;
      }
      if (fieldIndex == 15) {
        return MQTT_CONFIGURE;
      }
      if (fieldIndex == 16) {
        return ENABLED;
      }
      if (fieldIndex == 17) {
        return CTIME;
      }
      if (fieldIndex == 18) {
        return UTIME;
      }
      if (fieldIndex == 19) {
        return ALERT_INTERVAL;
      }
      if (fieldIndex == 20) {
        return USER_NAME;
      }
    } else {
      return null;
    }
    return null;
  }

  /**
   * 字段TYPE在数据中的名称.
   */
  public static final String FLD_TYPE="TYPE";

  /**
   * 获取字段TYPE的索引值.
   */
  public static final Integer IDX_TYPE=0;

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
   * 字段USER_ID在数据中的名称.
   */
  public static final String FLD_USER_ID="USER_ID";

  /**
   * 获取字段USER_ID的索引值.
   */
  public static final Integer IDX_USER_ID=4;

 /**
   * 字段USER_ID.
   */
  private Long USER_ID;

  /**
   * 返回字段USER_ID的值.
   * @return USER_ID  用户id  bigint
  */
  public Long getUSER_ID() {
    return USER_ID;
  }

  /**
   * 设置字段USER_ID的值.
   * @param user_id  用户id  bigint
   */
  public void setUSER_ID(Long user_id) {
    this.USER_ID=user_id;
  }

  /**
   * 字段GATEWAY_ID在数据中的名称.
   */
  public static final String FLD_GATEWAY_ID="GATEWAY_ID";

  /**
   * 获取字段GATEWAY_ID的索引值.
   */
  public static final Integer IDX_GATEWAY_ID=5;

 /**
   * 字段GATEWAY_ID.
   */
  private Long GATEWAY_ID;

  /**
   * 返回字段GATEWAY_ID的值.
   * @return GATEWAY_ID  网关ID  bigint
  */
  public Long getGATEWAY_ID() {
    return GATEWAY_ID;
  }

  /**
   * 设置字段GATEWAY_ID的值.
   * @param gateway_id  网关ID  bigint
   */
  public void setGATEWAY_ID(Long gateway_id) {
    this.GATEWAY_ID=gateway_id;
  }

  /**
   * 字段DEVICE_ID在数据中的名称.
   */
  public static final String FLD_DEVICE_ID="DEVICE_ID";

  /**
   * 获取字段DEVICE_ID的索引值.
   */
  public static final Integer IDX_DEVICE_ID=6;

 /**
   * 字段DEVICE_ID.
   */
  private Long DEVICE_ID;

  /**
   * 返回字段DEVICE_ID的值.
   * @return DEVICE_ID  设备ID  bigint
  */
  public Long getDEVICE_ID() {
    return DEVICE_ID;
  }

  /**
   * 设置字段DEVICE_ID的值.
   * @param device_id  设备ID  bigint
   */
  public void setDEVICE_ID(Long device_id) {
    this.DEVICE_ID=device_id;
  }

  /**
   * 字段BIND_TIME在数据中的名称.
   */
  public static final String FLD_BIND_TIME="BIND_TIME";

  /**
   * 获取字段BIND_TIME的索引值.
   */
  public static final Integer IDX_BIND_TIME=7;

 /**
   * 字段BIND_TIME.
   */
  private java.sql.Timestamp BIND_TIME;

  /**
   * 返回字段BIND_TIME的值.
   * @return BIND_TIME  绑定时间  timestamp
  */
  public java.sql.Timestamp getBIND_TIME() {
    return BIND_TIME;
  }

  /**
   * 设置字段BIND_TIME的值.
   * @param bind_time  绑定时间  timestamp
   */
  public void setBIND_TIME(java.sql.Timestamp bind_time) {
    this.BIND_TIME=bind_time;
  }

  /**
   * 字段DEVICE_NO在数据中的名称.
   */
  public static final String FLD_DEVICE_NO="DEVICE_NO";

  /**
   * 获取字段DEVICE_NO的索引值.
   */
  public static final Integer IDX_DEVICE_NO=8;

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
   * 字段ATTR_NAME在数据中的名称.
   */
  public static final String FLD_ATTR_NAME="ATTR_NAME";

  /**
   * 获取字段ATTR_NAME的索引值.
   */
  public static final Integer IDX_ATTR_NAME=9;

 /**
   * 字段ATTR_NAME.
   */
  private String ATTR_NAME;

  /**
   * 返回字段ATTR_NAME的值.
   * @return ATTR_NAME  属性名字(指标)  varchar
  */
  public String getATTR_NAME() {
    return ATTR_NAME;
  }

  /**
   * 设置字段ATTR_NAME的值.
   * @param attr_name  属性名字(指标)  varchar
   */
  public void setATTR_NAME(String attr_name) {
    this.ATTR_NAME=attr_name;
  }

  /**
   * 字段RULE_TYPE在数据中的名称.
   */
  public static final String FLD_RULE_TYPE="RULE_TYPE";

  /**
   * 获取字段RULE_TYPE的索引值.
   */
  public static final Integer IDX_RULE_TYPE=10;

 /**
   * 字段RULE_TYPE.
   */
  private Integer RULE_TYPE;

  /**
   * 返回字段RULE_TYPE的值.
   * @return RULE_TYPE  规则类型 0,数据范围检查规则 1 数据遗漏检查规则  int
  */
  public Integer getRULE_TYPE() {
    return RULE_TYPE;
  }

  /**
   * 设置字段RULE_TYPE的值.
   * @param rule_type  规则类型 0,数据范围检查规则 1 数据遗漏检查规则  int
   */
  public void setRULE_TYPE(Integer rule_type) {
    this.RULE_TYPE=rule_type;
  }

  /**
   * 字段RULE_PARAM在数据中的名称.
   */
  public static final String FLD_RULE_PARAM="RULE_PARAM";

  /**
   * 获取字段RULE_PARAM的索引值.
   */
  public static final Integer IDX_RULE_PARAM=11;

 /**
   * 字段RULE_PARAM.
   */
  private String RULE_PARAM;

  /**
   * 返回字段RULE_PARAM的值.
   * @return RULE_PARAM  规则参数,JSON格式，对应不同的规则类型  varchar
  */
  public String getRULE_PARAM() {
    return RULE_PARAM;
  }

  /**
   * 设置字段RULE_PARAM的值.
   * @param rule_param  规则参数,JSON格式，对应不同的规则类型  varchar
   */
  public void setRULE_PARAM(String rule_param) {
    this.RULE_PARAM=rule_param;
  }

  /**
   * 字段TEL_CONFIGURE在数据中的名称.
   */
  public static final String FLD_TEL_CONFIGURE="TEL_CONFIGURE";

  /**
   * 获取字段TEL_CONFIGURE的索引值.
   */
  public static final Integer IDX_TEL_CONFIGURE=12;

 /**
   * 字段TEL_CONFIGURE.
   */
  private String TEL_CONFIGURE;

  /**
   * 返回字段TEL_CONFIGURE的值.
   * @return TEL_CONFIGURE  电话配置  varchar
  */
  public String getTEL_CONFIGURE() {
    return TEL_CONFIGURE;
  }

  /**
   * 设置字段TEL_CONFIGURE的值.
   * @param tel_configure  电话配置  varchar
   */
  public void setTEL_CONFIGURE(String tel_configure) {
    this.TEL_CONFIGURE=tel_configure;
  }

  /**
   * 字段MAIL_CONFIGURE在数据中的名称.
   */
  public static final String FLD_MAIL_CONFIGURE="MAIL_CONFIGURE";

  /**
   * 获取字段MAIL_CONFIGURE的索引值.
   */
  public static final Integer IDX_MAIL_CONFIGURE=13;

 /**
   * 字段MAIL_CONFIGURE.
   */
  private String MAIL_CONFIGURE;

  /**
   * 返回字段MAIL_CONFIGURE的值.
   * @return MAIL_CONFIGURE  邮件配置  varchar
  */
  public String getMAIL_CONFIGURE() {
    return MAIL_CONFIGURE;
  }

  /**
   * 设置字段MAIL_CONFIGURE的值.
   * @param mail_configure  邮件配置  varchar
   */
  public void setMAIL_CONFIGURE(String mail_configure) {
    this.MAIL_CONFIGURE=mail_configure;
  }

  /**
   * 字段WEIXIN_GONFIGURE在数据中的名称.
   */
  public static final String FLD_WEIXIN_GONFIGURE="WEIXIN_GONFIGURE";

  /**
   * 获取字段WEIXIN_GONFIGURE的索引值.
   */
  public static final Integer IDX_WEIXIN_GONFIGURE=14;

 /**
   * 字段WEIXIN_GONFIGURE.
   */
  private String WEIXIN_GONFIGURE;

  /**
   * 返回字段WEIXIN_GONFIGURE的值.
   * @return WEIXIN_GONFIGURE  微信配置  varchar
  */
  public String getWEIXIN_GONFIGURE() {
    return WEIXIN_GONFIGURE;
  }

  /**
   * 设置字段WEIXIN_GONFIGURE的值.
   * @param weixin_gonfigure  微信配置  varchar
   */
  public void setWEIXIN_GONFIGURE(String weixin_gonfigure) {
    this.WEIXIN_GONFIGURE=weixin_gonfigure;
  }

  /**
   * 字段MQTT_CONFIGURE在数据中的名称.
   */
  public static final String FLD_MQTT_CONFIGURE="MQTT_CONFIGURE";

  /**
   * 获取字段MQTT_CONFIGURE的索引值.
   */
  public static final Integer IDX_MQTT_CONFIGURE=15;

 /**
   * 字段MQTT_CONFIGURE.
   */
  private String MQTT_CONFIGURE;

  /**
   * 返回字段MQTT_CONFIGURE的值.
   * @return MQTT_CONFIGURE  MQTT配置信息  varchar
  */
  public String getMQTT_CONFIGURE() {
    return MQTT_CONFIGURE;
  }

  /**
   * 设置字段MQTT_CONFIGURE的值.
   * @param mqtt_configure  MQTT配置信息  varchar
   */
  public void setMQTT_CONFIGURE(String mqtt_configure) {
    this.MQTT_CONFIGURE=mqtt_configure;
  }

  /**
   * 字段ENABLED在数据中的名称.
   */
  public static final String FLD_ENABLED="ENABLED";

  /**
   * 获取字段ENABLED的索引值.
   */
  public static final Integer IDX_ENABLED=16;

 /**
   * 字段ENABLED.
   */
  private Integer ENABLED;

  /**
   * 返回字段ENABLED的值.
   * @return ENABLED  是否启用,缺省启用规则  int
  */
  public Integer getENABLED() {
    return ENABLED;
  }

  /**
   * 设置字段ENABLED的值.
   * @param enabled  是否启用,缺省启用规则  int
   */
  public void setENABLED(Integer enabled) {
    this.ENABLED=enabled;
  }

  /**
   * 字段CTIME在数据中的名称.
   */
  public static final String FLD_CTIME="CTIME";

  /**
   * 获取字段CTIME的索引值.
   */
  public static final Integer IDX_CTIME=17;

 /**
   * 字段CTIME.
   */
  private java.sql.Timestamp CTIME;

  /**
   * 返回字段CTIME的值.
   * @return CTIME  创建时间  timestamp
  */
  public java.sql.Timestamp getCTIME() {
    return CTIME;
  }

  /**
   * 设置字段CTIME的值.
   * @param ctime  创建时间  timestamp
   */
  public void setCTIME(java.sql.Timestamp ctime) {
    this.CTIME=ctime;
  }

  /**
   * 字段UTIME在数据中的名称.
   */
  public static final String FLD_UTIME="UTIME";

  /**
   * 获取字段UTIME的索引值.
   */
  public static final Integer IDX_UTIME=18;

 /**
   * 字段UTIME.
   */
  private java.sql.Timestamp UTIME;

  /**
   * 返回字段UTIME的值.
   * @return UTIME  修改时间  timestamp
  */
  public java.sql.Timestamp getUTIME() {
    return UTIME;
  }

  /**
   * 设置字段UTIME的值.
   * @param utime  修改时间  timestamp
   */
  public void setUTIME(java.sql.Timestamp utime) {
    this.UTIME=utime;
  }

  /**
   * 字段ALERT_INTERVAL在数据中的名称.
   */
  public static final String FLD_ALERT_INTERVAL="ALERT_INTERVAL";

  /**
   * 获取字段ALERT_INTERVAL的索引值.
   */
  public static final Integer IDX_ALERT_INTERVAL=19;

 /**
   * 字段ALERT_INTERVAL.
   */
  private Integer ALERT_INTERVAL;

  /**
   * 返回字段ALERT_INTERVAL的值.
   * @return ALERT_INTERVAL  报警频率(两次同样报警之间的时间间隔，以秒为单位)  int
  */
  public Integer getALERT_INTERVAL() {
    return ALERT_INTERVAL;
  }

  /**
   * 设置字段ALERT_INTERVAL的值.
   * @param alert_interval  报警频率(两次同样报警之间的时间间隔，以秒为单位)  int
   */
  public void setALERT_INTERVAL(Integer alert_interval) {
    this.ALERT_INTERVAL=alert_interval;
  }

  /**
   * 字段USER_NAME在数据中的名称.
   */
  public static final String FLD_USER_NAME="USER_NAME";

  /**
   * 获取字段USER_NAME的索引值.
   */
  public static final Integer IDX_USER_NAME=20;

 /**
   * 字段USER_NAME.
   */
  private String USER_NAME;

  /**
   * 返回字段USER_NAME的值.
   * @return USER_NAME  用户登录唯一名称标识  varchar
  */
  public String getUSER_NAME() {
    return USER_NAME;
  }

  /**
   * 设置字段USER_NAME的值.
   * @param user_name  用户登录唯一名称标识  varchar
   */
  public void setUSER_NAME(String user_name) {
    this.USER_NAME=user_name;
  }

}

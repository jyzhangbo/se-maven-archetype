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
 * 数据库表 设备规则列表<br/>
 * @author zhangjsf@enn.cn

 *         <b>字段列表</b><br/>

 *         ID   规则ID Integer<br/>
 *         GATEWAY_ID   网关ID Integer<br/>
 *         DEVICE_ID   设备ID Integer<br/>
 *         ATTR_NAME   属性名字(指标) String<br/>
 *         RULE_TYPE   规则类型 0,数据范围检查规则 1 数据遗漏检查规则 Integer<br/>
 *         RULE_PARAM   规则参数,JSON格式，对应不同的规则类型 String<br/>
 *         TEL_CONFIGURE   电话配置 String<br/>
 *         MAIL_CONFIGURE   邮件配置 String<br/>
 *         WEIXIN_CONFIGURE   微信配置 String<br/>
 *         MQTT_CONFIGURE   MQTT配置信息 String<br/>
 *         ENABLED   是否启用,缺省启用规则 Integer<br/>
 *         CTIME   创建时间 java.sql.Timestamp<br/>
 *         UTIME   修改时间 java.sql.Timestamp<br/>
 *         ALERT_INTERVAL   报警频率(两次同样报警之间的时间间隔，以秒为单位) Integer<br/>
 */

@Table("DEVICE_RULE")
public class DEVICE_RULEObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_DEVICE_RULE="DEVICE_RULE";
  public DEVICE_RULEObj() {
  }
  /**
   * 根据字段名称获取字段的值. 
   */
  @Override
  public Object getFieldValue(String fieldName,Integer fieldIndex) {
    if (fieldName != null && fieldName.length() > 0) {
      if (FLD_ID.equals(fieldName)) {
        return ID;
      }
      if (FLD_GATEWAY_ID.equals(fieldName)) {
        return GATEWAY_ID;
      }
      if (FLD_DEVICE_ID.equals(fieldName)) {
        return DEVICE_ID;
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
      if (FLD_WEIXIN_CONFIGURE.equals(fieldName)) {
        return WEIXIN_CONFIGURE;
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
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 14) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return GATEWAY_ID;
      }
      if (fieldIndex == 2) {
        return DEVICE_ID;
      }
      if (fieldIndex == 3) {
        return ATTR_NAME;
      }
      if (fieldIndex == 4) {
        return RULE_TYPE;
      }
      if (fieldIndex == 5) {
        return RULE_PARAM;
      }
      if (fieldIndex == 6) {
        return TEL_CONFIGURE;
      }
      if (fieldIndex == 7) {
        return MAIL_CONFIGURE;
      }
      if (fieldIndex == 8) {
        return WEIXIN_CONFIGURE;
      }
      if (fieldIndex == 9) {
        return MQTT_CONFIGURE;
      }
      if (fieldIndex == 10) {
        return ENABLED;
      }
      if (fieldIndex == 11) {
        return CTIME;
      }
      if (fieldIndex == 12) {
        return UTIME;
      }
      if (fieldIndex == 13) {
        return ALERT_INTERVAL;
      }
    } else {
      return null;
    }
    return null;
  }

  /**
   * 字段ID在数据中的名称.
   */
  public static final String FLD_ID="ID";

  /**
   * 获取字段ID的索引值.
   */
  public static final Integer IDX_ID=0;
	@Id

 /**
   * 字段ID.
   */
  private Integer ID;

  /**
   * 返回字段ID的值.
   * @return ID  规则ID  int
  */
  public Integer getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  规则ID  int
   */
  public void setID(Integer id) {
    this.ID=id;
  }

  /**
   * 字段GATEWAY_ID在数据中的名称.
   */
  public static final String FLD_GATEWAY_ID="GATEWAY_ID";

  /**
   * 获取字段GATEWAY_ID的索引值.
   */
  public static final Integer IDX_GATEWAY_ID=1;

 /**
   * 字段GATEWAY_ID.
   */
  private Integer GATEWAY_ID;

  /**
   * 返回字段GATEWAY_ID的值.
   * @return GATEWAY_ID  网关ID  int
  */
  public Integer getGATEWAY_ID() {
    return GATEWAY_ID;
  }

  /**
   * 设置字段GATEWAY_ID的值.
   * @param gateway_id  网关ID  int
   */
  public void setGATEWAY_ID(Integer gateway_id) {
    this.GATEWAY_ID=gateway_id;
  }

  /**
   * 字段DEVICE_ID在数据中的名称.
   */
  public static final String FLD_DEVICE_ID="DEVICE_ID";

  /**
   * 获取字段DEVICE_ID的索引值.
   */
  public static final Integer IDX_DEVICE_ID=2;

 /**
   * 字段DEVICE_ID.
   */
  private Integer DEVICE_ID;

  /**
   * 返回字段DEVICE_ID的值.
   * @return DEVICE_ID  设备ID  int
  */
  public Integer getDEVICE_ID() {
    return DEVICE_ID;
  }

  /**
   * 设置字段DEVICE_ID的值.
   * @param device_id  设备ID  int
   */
  public void setDEVICE_ID(Integer device_id) {
    this.DEVICE_ID=device_id;
  }

  /**
   * 字段ATTR_NAME在数据中的名称.
   */
  public static final String FLD_ATTR_NAME="ATTR_NAME";

  /**
   * 获取字段ATTR_NAME的索引值.
   */
  public static final Integer IDX_ATTR_NAME=3;

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
  public static final Integer IDX_RULE_TYPE=4;

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
  public static final Integer IDX_RULE_PARAM=5;

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
  public static final Integer IDX_TEL_CONFIGURE=6;

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
  public static final Integer IDX_MAIL_CONFIGURE=7;

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
   * 字段WEIXIN_CONFIGURE在数据中的名称.
   */
  public static final String FLD_WEIXIN_CONFIGURE="WEIXIN_CONFIGURE";

  /**
   * 获取字段WEIXIN_CONFIGURE的索引值.
   */
  public static final Integer IDX_WEIXIN_CONFIGURE=8;

 /**
   * 字段WEIXIN_CONFIGURE.
   */
  private String WEIXIN_CONFIGURE;

  /**
   * 返回字段WEIXIN_CONFIGURE的值.
   * @return WEIXIN_CONFIGURE  微信配置  varchar
  */
  public String getWEIXIN_CONFIGURE() {
    return WEIXIN_CONFIGURE;
  }

  /**
   * 设置字段WEIXIN_CONFIGURE的值.
   * @param weixin_configure  微信配置  varchar
   */
  public void setWEIXIN_CONFIGURE(String weixin_configure) {
    this.WEIXIN_CONFIGURE=weixin_configure;
  }

  /**
   * 字段MQTT_CONFIGURE在数据中的名称.
   */
  public static final String FLD_MQTT_CONFIGURE="MQTT_CONFIGURE";

  /**
   * 获取字段MQTT_CONFIGURE的索引值.
   */
  public static final Integer IDX_MQTT_CONFIGURE=9;

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
  public static final Integer IDX_ENABLED=10;

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
  public static final Integer IDX_CTIME=11;

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
  public static final Integer IDX_UTIME=12;

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
  public static final Integer IDX_ALERT_INTERVAL=13;

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

}

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

 *         GATEWAY_ID   网关ID Long<br/>
 *         DEVICE_ID   设备ID Long<br/>
 *         BIND_TIME   绑定时间 java.sql.Timestamp<br/>
 *         DEVICE_NO   设备序列号 String<br/>
 *         DEVICE_CTIME   安装时间 java.sql.Timestamp<br/>
 *         REGISTER_START   寄存器起始地址 Integer<br/>
 *         PROTOCOL_TYPE_ID   设备协议类型ID Long<br/>
 *         PROTOCOL_LENGTH   协议的长度 Integer<br/>
 *         DEVICE_NAME   设备名称 String<br/>
 *         DEVICE_TYPE_ID   设备类型ID Long<br/>
 *         DEVICE_UPDATE_TIME   更新时间 java.sql.Timestamp<br/>
 *         ORDER_IN_GATEWAY   在网关下的顺序 Integer<br/>
 *         DATA_FIRST_TIME   第一次上传数据的时间 java.sql.Timestamp<br/>
 *         DATA_LAST_TIME   最新一条数据上传时间 java.sql.Timestamp<br/>
 *         USER_ID   用户id Long<br/>
 *         TYPE   登录类型 Integer<br/>
 *         HASH   哈希值 String<br/>
 *         USER_NAME   用户登录唯一名称标识 String<br/>
 *         PWD   密码 String<br/>
 *         REAL_NAME   真实姓名 String<br/>
 *         AVATOR   头像的相对地址 String<br/>
 *         GENDER   性别 String<br/>
 *         EMAIL   邮箱 String<br/>
 *         MOBILE   手机 String<br/>
 *         TITLE   用户说明 String<br/>
 *         TOKEN   登录的TOKEN String<br/>
 *         USER_CREATE_TIME    java.sql.Timestamp<br/>
 *         USER_UPDATA_TIME    java.sql.Timestamp<br/>
 *         IS_SEND_MESSAGE   是否发短信 0:不发 1:发 Integer<br/>
 *         IS_NOTIFY_USER   是否已经通知用户 0未通知 1已经通知 Integer<br/>
 */

@Table("VIEW_USER_DEVICE")
public class VIEW_USER_DEVICEObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_VIEW_USER_DEVICE="VIEW_USER_DEVICE";
  public VIEW_USER_DEVICEObj() {
  }
  /**
   * 根据字段名称获取字段的值. 
   */
  @Override
  public Object getFieldValue(String fieldName,Integer fieldIndex) {
    if (fieldName != null && fieldName.length() > 0) {
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
      if (FLD_DEVICE_CTIME.equals(fieldName)) {
        return DEVICE_CTIME;
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
      if (FLD_DEVICE_NAME.equals(fieldName)) {
        return DEVICE_NAME;
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
      if (FLD_DATA_FIRST_TIME.equals(fieldName)) {
        return DATA_FIRST_TIME;
      }
      if (FLD_DATA_LAST_TIME.equals(fieldName)) {
        return DATA_LAST_TIME;
      }
      if (FLD_USER_ID.equals(fieldName)) {
        return USER_ID;
      }
      if (FLD_TYPE.equals(fieldName)) {
        return TYPE;
      }
      if (FLD_HASH.equals(fieldName)) {
        return HASH;
      }
      if (FLD_USER_NAME.equals(fieldName)) {
        return USER_NAME;
      }
      if (FLD_PWD.equals(fieldName)) {
        return PWD;
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
      if (FLD_USER_CREATE_TIME.equals(fieldName)) {
        return USER_CREATE_TIME;
      }
      if (FLD_USER_UPDATA_TIME.equals(fieldName)) {
        return USER_UPDATA_TIME;
      }
      if (FLD_IS_SEND_MESSAGE.equals(fieldName)) {
        return IS_SEND_MESSAGE;
      }
      if (FLD_IS_NOTIFY_USER.equals(fieldName)) {
        return IS_NOTIFY_USER;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 30) {
      if (fieldIndex == 0) {
        return GATEWAY_ID;
      }
      if (fieldIndex == 1) {
        return DEVICE_ID;
      }
      if (fieldIndex == 2) {
        return BIND_TIME;
      }
      if (fieldIndex == 3) {
        return DEVICE_NO;
      }
      if (fieldIndex == 4) {
        return DEVICE_CTIME;
      }
      if (fieldIndex == 5) {
        return REGISTER_START;
      }
      if (fieldIndex == 6) {
        return PROTOCOL_TYPE_ID;
      }
      if (fieldIndex == 7) {
        return PROTOCOL_LENGTH;
      }
      if (fieldIndex == 8) {
        return DEVICE_NAME;
      }
      if (fieldIndex == 9) {
        return DEVICE_TYPE_ID;
      }
      if (fieldIndex == 10) {
        return DEVICE_UPDATE_TIME;
      }
      if (fieldIndex == 11) {
        return ORDER_IN_GATEWAY;
      }
      if (fieldIndex == 12) {
        return DATA_FIRST_TIME;
      }
      if (fieldIndex == 13) {
        return DATA_LAST_TIME;
      }
      if (fieldIndex == 14) {
        return USER_ID;
      }
      if (fieldIndex == 15) {
        return TYPE;
      }
      if (fieldIndex == 16) {
        return HASH;
      }
      if (fieldIndex == 17) {
        return USER_NAME;
      }
      if (fieldIndex == 18) {
        return PWD;
      }
      if (fieldIndex == 19) {
        return REAL_NAME;
      }
      if (fieldIndex == 20) {
        return AVATOR;
      }
      if (fieldIndex == 21) {
        return GENDER;
      }
      if (fieldIndex == 22) {
        return EMAIL;
      }
      if (fieldIndex == 23) {
        return MOBILE;
      }
      if (fieldIndex == 24) {
        return TITLE;
      }
      if (fieldIndex == 25) {
        return TOKEN;
      }
      if (fieldIndex == 26) {
        return USER_CREATE_TIME;
      }
      if (fieldIndex == 27) {
        return USER_UPDATA_TIME;
      }
      if (fieldIndex == 28) {
        return IS_SEND_MESSAGE;
      }
      if (fieldIndex == 29) {
        return IS_NOTIFY_USER;
      }
    } else {
      return null;
    }
    return null;
  }

  /**
   * 字段GATEWAY_ID在数据中的名称.
   */
  public static final String FLD_GATEWAY_ID="GATEWAY_ID";

  /**
   * 获取字段GATEWAY_ID的索引值.
   */
  public static final Integer IDX_GATEWAY_ID=0;

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
  public static final Integer IDX_DEVICE_ID=1;

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
  public static final Integer IDX_BIND_TIME=2;

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
  public static final Integer IDX_DEVICE_NO=3;

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
   * 字段DEVICE_CTIME在数据中的名称.
   */
  public static final String FLD_DEVICE_CTIME="DEVICE_CTIME";

  /**
   * 获取字段DEVICE_CTIME的索引值.
   */
  public static final Integer IDX_DEVICE_CTIME=4;

 /**
   * 字段DEVICE_CTIME.
   */
  private java.sql.Timestamp DEVICE_CTIME;

  /**
   * 返回字段DEVICE_CTIME的值.
   * @return DEVICE_CTIME  安装时间  timestamp
  */
  public java.sql.Timestamp getDEVICE_CTIME() {
    return DEVICE_CTIME;
  }

  /**
   * 设置字段DEVICE_CTIME的值.
   * @param device_ctime  安装时间  timestamp
   */
  public void setDEVICE_CTIME(java.sql.Timestamp device_ctime) {
    this.DEVICE_CTIME=device_ctime;
  }

  /**
   * 字段REGISTER_START在数据中的名称.
   */
  public static final String FLD_REGISTER_START="REGISTER_START";

  /**
   * 获取字段REGISTER_START的索引值.
   */
  public static final Integer IDX_REGISTER_START=5;

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
  public static final Integer IDX_PROTOCOL_TYPE_ID=6;

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
  public static final Integer IDX_PROTOCOL_LENGTH=7;

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
   * 字段DEVICE_NAME在数据中的名称.
   */
  public static final String FLD_DEVICE_NAME="DEVICE_NAME";

  /**
   * 获取字段DEVICE_NAME的索引值.
   */
  public static final Integer IDX_DEVICE_NAME=8;

 /**
   * 字段DEVICE_NAME.
   */
  private String DEVICE_NAME;

  /**
   * 返回字段DEVICE_NAME的值.
   * @return DEVICE_NAME  设备名称  varchar
  */
  public String getDEVICE_NAME() {
    return DEVICE_NAME;
  }

  /**
   * 设置字段DEVICE_NAME的值.
   * @param device_name  设备名称  varchar
   */
  public void setDEVICE_NAME(String device_name) {
    this.DEVICE_NAME=device_name;
  }

  /**
   * 字段DEVICE_TYPE_ID在数据中的名称.
   */
  public static final String FLD_DEVICE_TYPE_ID="DEVICE_TYPE_ID";

  /**
   * 获取字段DEVICE_TYPE_ID的索引值.
   */
  public static final Integer IDX_DEVICE_TYPE_ID=9;

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
  public static final Integer IDX_DEVICE_UPDATE_TIME=10;

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
  public static final Integer IDX_ORDER_IN_GATEWAY=11;

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
   * 字段DATA_FIRST_TIME在数据中的名称.
   */
  public static final String FLD_DATA_FIRST_TIME="DATA_FIRST_TIME";

  /**
   * 获取字段DATA_FIRST_TIME的索引值.
   */
  public static final Integer IDX_DATA_FIRST_TIME=12;

 /**
   * 字段DATA_FIRST_TIME.
   */
  private java.sql.Timestamp DATA_FIRST_TIME;

  /**
   * 返回字段DATA_FIRST_TIME的值.
   * @return DATA_FIRST_TIME  第一次上传数据的时间  timestamp
  */
  public java.sql.Timestamp getDATA_FIRST_TIME() {
    return DATA_FIRST_TIME;
  }

  /**
   * 设置字段DATA_FIRST_TIME的值.
   * @param data_first_time  第一次上传数据的时间  timestamp
   */
  public void setDATA_FIRST_TIME(java.sql.Timestamp data_first_time) {
    this.DATA_FIRST_TIME=data_first_time;
  }

  /**
   * 字段DATA_LAST_TIME在数据中的名称.
   */
  public static final String FLD_DATA_LAST_TIME="DATA_LAST_TIME";

  /**
   * 获取字段DATA_LAST_TIME的索引值.
   */
  public static final Integer IDX_DATA_LAST_TIME=13;

 /**
   * 字段DATA_LAST_TIME.
   */
  private java.sql.Timestamp DATA_LAST_TIME;

  /**
   * 返回字段DATA_LAST_TIME的值.
   * @return DATA_LAST_TIME  最新一条数据上传时间  timestamp
  */
  public java.sql.Timestamp getDATA_LAST_TIME() {
    return DATA_LAST_TIME;
  }

  /**
   * 设置字段DATA_LAST_TIME的值.
   * @param data_last_time  最新一条数据上传时间  timestamp
   */
  public void setDATA_LAST_TIME(java.sql.Timestamp data_last_time) {
    this.DATA_LAST_TIME=data_last_time;
  }

  /**
   * 字段USER_ID在数据中的名称.
   */
  public static final String FLD_USER_ID="USER_ID";

  /**
   * 获取字段USER_ID的索引值.
   */
  public static final Integer IDX_USER_ID=14;

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
   * 字段TYPE在数据中的名称.
   */
  public static final String FLD_TYPE="TYPE";

  /**
   * 获取字段TYPE的索引值.
   */
  public static final Integer IDX_TYPE=15;

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
   * 字段HASH在数据中的名称.
   */
  public static final String FLD_HASH="HASH";

  /**
   * 获取字段HASH的索引值.
   */
  public static final Integer IDX_HASH=16;

 /**
   * 字段HASH.
   */
  private String HASH;

  /**
   * 返回字段HASH的值.
   * @return HASH  哈希值  varchar
  */
  public String getHASH() {
    return HASH;
  }

  /**
   * 设置字段HASH的值.
   * @param hash  哈希值  varchar
   */
  public void setHASH(String hash) {
    this.HASH=hash;
  }

  /**
   * 字段USER_NAME在数据中的名称.
   */
  public static final String FLD_USER_NAME="USER_NAME";

  /**
   * 获取字段USER_NAME的索引值.
   */
  public static final Integer IDX_USER_NAME=17;

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

  /**
   * 字段PWD在数据中的名称.
   */
  public static final String FLD_PWD="PWD";

  /**
   * 获取字段PWD的索引值.
   */
  public static final Integer IDX_PWD=18;

 /**
   * 字段PWD.
   */
  private String PWD;

  /**
   * 返回字段PWD的值.
   * @return PWD  密码  varchar
  */
  public String getPWD() {
    return PWD;
  }

  /**
   * 设置字段PWD的值.
   * @param pwd  密码  varchar
   */
  public void setPWD(String pwd) {
    this.PWD=pwd;
  }

  /**
   * 字段REAL_NAME在数据中的名称.
   */
  public static final String FLD_REAL_NAME="REAL_NAME";

  /**
   * 获取字段REAL_NAME的索引值.
   */
  public static final Integer IDX_REAL_NAME=19;

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
  public static final Integer IDX_AVATOR=20;

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
  public static final Integer IDX_GENDER=21;

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
  public static final Integer IDX_EMAIL=22;

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
  public static final Integer IDX_MOBILE=23;

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
  public static final Integer IDX_TITLE=24;

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
  public static final Integer IDX_TOKEN=25;

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
   * 字段USER_CREATE_TIME在数据中的名称.
   */
  public static final String FLD_USER_CREATE_TIME="USER_CREATE_TIME";

  /**
   * 获取字段USER_CREATE_TIME的索引值.
   */
  public static final Integer IDX_USER_CREATE_TIME=26;

 /**
   * 字段USER_CREATE_TIME.
   */
  private java.sql.Timestamp USER_CREATE_TIME;

  /**
   * 返回字段USER_CREATE_TIME的值.
   * @return USER_CREATE_TIME    timestamp
  */
  public java.sql.Timestamp getUSER_CREATE_TIME() {
    return USER_CREATE_TIME;
  }

  /**
   * 设置字段USER_CREATE_TIME的值.
   * @param user_create_time    timestamp
   */
  public void setUSER_CREATE_TIME(java.sql.Timestamp user_create_time) {
    this.USER_CREATE_TIME=user_create_time;
  }

  /**
   * 字段USER_UPDATA_TIME在数据中的名称.
   */
  public static final String FLD_USER_UPDATA_TIME="USER_UPDATA_TIME";

  /**
   * 获取字段USER_UPDATA_TIME的索引值.
   */
  public static final Integer IDX_USER_UPDATA_TIME=27;

 /**
   * 字段USER_UPDATA_TIME.
   */
  private java.sql.Timestamp USER_UPDATA_TIME;

  /**
   * 返回字段USER_UPDATA_TIME的值.
   * @return USER_UPDATA_TIME    timestamp
  */
  public java.sql.Timestamp getUSER_UPDATA_TIME() {
    return USER_UPDATA_TIME;
  }

  /**
   * 设置字段USER_UPDATA_TIME的值.
   * @param user_updata_time    timestamp
   */
  public void setUSER_UPDATA_TIME(java.sql.Timestamp user_updata_time) {
    this.USER_UPDATA_TIME=user_updata_time;
  }

  /**
   * 字段IS_SEND_MESSAGE在数据中的名称.
   */
  public static final String FLD_IS_SEND_MESSAGE="IS_SEND_MESSAGE";

  /**
   * 获取字段IS_SEND_MESSAGE的索引值.
   */
  public static final Integer IDX_IS_SEND_MESSAGE=28;

 /**
   * 字段IS_SEND_MESSAGE.
   */
  private Integer IS_SEND_MESSAGE;

  /**
   * 返回字段IS_SEND_MESSAGE的值.
   * @return IS_SEND_MESSAGE  是否发短信 0:不发 1:发  int
  */
  public Integer getIS_SEND_MESSAGE() {
    return IS_SEND_MESSAGE;
  }

  /**
   * 设置字段IS_SEND_MESSAGE的值.
   * @param is_send_message  是否发短信 0:不发 1:发  int
   */
  public void setIS_SEND_MESSAGE(Integer is_send_message) {
    this.IS_SEND_MESSAGE=is_send_message;
  }

  /**
   * 字段IS_NOTIFY_USER在数据中的名称.
   */
  public static final String FLD_IS_NOTIFY_USER="IS_NOTIFY_USER";

  /**
   * 获取字段IS_NOTIFY_USER的索引值.
   */
  public static final Integer IDX_IS_NOTIFY_USER=29;

 /**
   * 字段IS_NOTIFY_USER.
   */
  private Integer IS_NOTIFY_USER;

  /**
   * 返回字段IS_NOTIFY_USER的值.
   * @return IS_NOTIFY_USER  是否已经通知用户 0未通知 1已经通知  int
  */
  public Integer getIS_NOTIFY_USER() {
    return IS_NOTIFY_USER;
  }

  /**
   * 设置字段IS_NOTIFY_USER的值.
   * @param is_notify_user  是否已经通知用户 0未通知 1已经通知  int
   */
  public void setIS_NOTIFY_USER(Integer is_notify_user) {
    this.IS_NOTIFY_USER=is_notify_user;
  }

}

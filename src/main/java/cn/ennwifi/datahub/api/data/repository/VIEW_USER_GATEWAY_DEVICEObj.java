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
 *         GATEWAY_DEVICE_BINDTIME   绑定时间 java.sql.Timestamp<br/>
 *         GATEWAY_NAME   设备名称 String<br/>
 *         GATEWAY_CTIME   安装时间 java.sql.Timestamp<br/>
 *         GATEWAY_UPDATE_TIME   更新时间 java.sql.Timestamp<br/>
 *         GATEWAY_STATE   网关状态 0:离线 1:在线 2:升级中 Integer<br/>
 *         GATEWAY_TOKEN   网关token Long<br/>
 *         GATEWAY_ADDRESS   网关地址 String<br/>
 *         GATEWAY_TYPE   网关类型 String<br/>
 *         GATEWAY_VER   网关版本 String<br/>
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
 *         IS_NOTIFY_USER   是否已经通知用户 0未通知 1已经通知 Integer<br/>
 *         USER_GATEWAY_BINDTIME   添加时间 java.sql.Timestamp<br/>
 *         USER_TYPE   登录类型 Integer<br/>
 *         USER_HASH   哈希值 String<br/>
 *         USER_LOGIN_NAME   用户登录唯一名称标识 String<br/>
 *         USER_REAL_NAME   真实姓名 String<br/>
 *         USER_AVATOR   头像的相对地址 String<br/>
 *         USER_GENDER   性别 String<br/>
 *         USER_EMAIL   邮箱 String<br/>
 *         USER_MOBILE   手机 String<br/>
 *         USER_TITLE   用户说明 String<br/>
 *         USER_TOKEN   登录的TOKEN String<br/>
 *         USER_CREATE_TIME    java.sql.Timestamp<br/>
 *         USER_UPDATE_TIME    java.sql.Timestamp<br/>
 *         IS_SEND_MESSAGE   是否发短信 0:不发 1:发 Integer<br/>
 *         USER_ID    Long<br/>
 *         DEVICE_TYPE_NAME   设备类型名称 String<br/>
 */

@Table("VIEW_USER_GATEWAY_DEVICE")
public class VIEW_USER_GATEWAY_DEVICEObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_VIEW_USER_GATEWAY_DEVICE="VIEW_USER_GATEWAY_DEVICE";
  public VIEW_USER_GATEWAY_DEVICEObj() {
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
      if (FLD_GATEWAY_DEVICE_BINDTIME.equals(fieldName)) {
        return GATEWAY_DEVICE_BINDTIME;
      }
      if (FLD_GATEWAY_NAME.equals(fieldName)) {
        return GATEWAY_NAME;
      }
      if (FLD_GATEWAY_CTIME.equals(fieldName)) {
        return GATEWAY_CTIME;
      }
      if (FLD_GATEWAY_UPDATE_TIME.equals(fieldName)) {
        return GATEWAY_UPDATE_TIME;
      }
      if (FLD_GATEWAY_STATE.equals(fieldName)) {
        return GATEWAY_STATE;
      }
      if (FLD_GATEWAY_TOKEN.equals(fieldName)) {
        return GATEWAY_TOKEN;
      }
      if (FLD_GATEWAY_ADDRESS.equals(fieldName)) {
        return GATEWAY_ADDRESS;
      }
      if (FLD_GATEWAY_TYPE.equals(fieldName)) {
        return GATEWAY_TYPE;
      }
      if (FLD_GATEWAY_VER.equals(fieldName)) {
        return GATEWAY_VER;
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
      if (FLD_IS_NOTIFY_USER.equals(fieldName)) {
        return IS_NOTIFY_USER;
      }
      if (FLD_USER_GATEWAY_BINDTIME.equals(fieldName)) {
        return USER_GATEWAY_BINDTIME;
      }
      if (FLD_USER_TYPE.equals(fieldName)) {
        return USER_TYPE;
      }
      if (FLD_USER_HASH.equals(fieldName)) {
        return USER_HASH;
      }
      if (FLD_USER_LOGIN_NAME.equals(fieldName)) {
        return USER_LOGIN_NAME;
      }
      if (FLD_USER_REAL_NAME.equals(fieldName)) {
        return USER_REAL_NAME;
      }
      if (FLD_USER_AVATOR.equals(fieldName)) {
        return USER_AVATOR;
      }
      if (FLD_USER_GENDER.equals(fieldName)) {
        return USER_GENDER;
      }
      if (FLD_USER_EMAIL.equals(fieldName)) {
        return USER_EMAIL;
      }
      if (FLD_USER_MOBILE.equals(fieldName)) {
        return USER_MOBILE;
      }
      if (FLD_USER_TITLE.equals(fieldName)) {
        return USER_TITLE;
      }
      if (FLD_USER_TOKEN.equals(fieldName)) {
        return USER_TOKEN;
      }
      if (FLD_USER_CREATE_TIME.equals(fieldName)) {
        return USER_CREATE_TIME;
      }
      if (FLD_USER_UPDATE_TIME.equals(fieldName)) {
        return USER_UPDATE_TIME;
      }
      if (FLD_IS_SEND_MESSAGE.equals(fieldName)) {
        return IS_SEND_MESSAGE;
      }
      if (FLD_USER_ID.equals(fieldName)) {
        return USER_ID;
      }
      if (FLD_DEVICE_TYPE_NAME.equals(fieldName)) {
        return DEVICE_TYPE_NAME;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 39) {
      if (fieldIndex == 0) {
        return GATEWAY_ID;
      }
      if (fieldIndex == 1) {
        return DEVICE_ID;
      }
      if (fieldIndex == 2) {
        return GATEWAY_DEVICE_BINDTIME;
      }
      if (fieldIndex == 3) {
        return GATEWAY_NAME;
      }
      if (fieldIndex == 4) {
        return GATEWAY_CTIME;
      }
      if (fieldIndex == 5) {
        return GATEWAY_UPDATE_TIME;
      }
      if (fieldIndex == 6) {
        return GATEWAY_STATE;
      }
      if (fieldIndex == 7) {
        return GATEWAY_TOKEN;
      }
      if (fieldIndex == 8) {
        return GATEWAY_ADDRESS;
      }
      if (fieldIndex == 9) {
        return GATEWAY_TYPE;
      }
      if (fieldIndex == 10) {
        return GATEWAY_VER;
      }
      if (fieldIndex == 11) {
        return DEVICE_NO;
      }
      if (fieldIndex == 12) {
        return DEVICE_CTIME;
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
        return DEVICE_NAME;
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
        return DATA_FIRST_TIME;
      }
      if (fieldIndex == 21) {
        return DATA_LAST_TIME;
      }
      if (fieldIndex == 22) {
        return IS_NOTIFY_USER;
      }
      if (fieldIndex == 23) {
        return USER_GATEWAY_BINDTIME;
      }
      if (fieldIndex == 24) {
        return USER_TYPE;
      }
      if (fieldIndex == 25) {
        return USER_HASH;
      }
      if (fieldIndex == 26) {
        return USER_LOGIN_NAME;
      }
      if (fieldIndex == 27) {
        return USER_REAL_NAME;
      }
      if (fieldIndex == 28) {
        return USER_AVATOR;
      }
      if (fieldIndex == 29) {
        return USER_GENDER;
      }
      if (fieldIndex == 30) {
        return USER_EMAIL;
      }
      if (fieldIndex == 31) {
        return USER_MOBILE;
      }
      if (fieldIndex == 32) {
        return USER_TITLE;
      }
      if (fieldIndex == 33) {
        return USER_TOKEN;
      }
      if (fieldIndex == 34) {
        return USER_CREATE_TIME;
      }
      if (fieldIndex == 35) {
        return USER_UPDATE_TIME;
      }
      if (fieldIndex == 36) {
        return IS_SEND_MESSAGE;
      }
      if (fieldIndex == 37) {
        return USER_ID;
      }
      if (fieldIndex == 38) {
        return DEVICE_TYPE_NAME;
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
   * 字段GATEWAY_DEVICE_BINDTIME在数据中的名称.
   */
  public static final String FLD_GATEWAY_DEVICE_BINDTIME="GATEWAY_DEVICE_BINDTIME";

  /**
   * 获取字段GATEWAY_DEVICE_BINDTIME的索引值.
   */
  public static final Integer IDX_GATEWAY_DEVICE_BINDTIME=2;

 /**
   * 字段GATEWAY_DEVICE_BINDTIME.
   */
  private java.sql.Timestamp GATEWAY_DEVICE_BINDTIME;

  /**
   * 返回字段GATEWAY_DEVICE_BINDTIME的值.
   * @return GATEWAY_DEVICE_BINDTIME  绑定时间  timestamp
  */
  public java.sql.Timestamp getGATEWAY_DEVICE_BINDTIME() {
    return GATEWAY_DEVICE_BINDTIME;
  }

  /**
   * 设置字段GATEWAY_DEVICE_BINDTIME的值.
   * @param gateway_device_bindtime  绑定时间  timestamp
   */
  public void setGATEWAY_DEVICE_BINDTIME(java.sql.Timestamp gateway_device_bindtime) {
    this.GATEWAY_DEVICE_BINDTIME=gateway_device_bindtime;
  }

  /**
   * 字段GATEWAY_NAME在数据中的名称.
   */
  public static final String FLD_GATEWAY_NAME="GATEWAY_NAME";

  /**
   * 获取字段GATEWAY_NAME的索引值.
   */
  public static final Integer IDX_GATEWAY_NAME=3;

 /**
   * 字段GATEWAY_NAME.
   */
  private String GATEWAY_NAME;

  /**
   * 返回字段GATEWAY_NAME的值.
   * @return GATEWAY_NAME  设备名称  varchar
  */
  public String getGATEWAY_NAME() {
    return GATEWAY_NAME;
  }

  /**
   * 设置字段GATEWAY_NAME的值.
   * @param gateway_name  设备名称  varchar
   */
  public void setGATEWAY_NAME(String gateway_name) {
    this.GATEWAY_NAME=gateway_name;
  }

  /**
   * 字段GATEWAY_CTIME在数据中的名称.
   */
  public static final String FLD_GATEWAY_CTIME="GATEWAY_CTIME";

  /**
   * 获取字段GATEWAY_CTIME的索引值.
   */
  public static final Integer IDX_GATEWAY_CTIME=4;

 /**
   * 字段GATEWAY_CTIME.
   */
  private java.sql.Timestamp GATEWAY_CTIME;

  /**
   * 返回字段GATEWAY_CTIME的值.
   * @return GATEWAY_CTIME  安装时间  timestamp
  */
  public java.sql.Timestamp getGATEWAY_CTIME() {
    return GATEWAY_CTIME;
  }

  /**
   * 设置字段GATEWAY_CTIME的值.
   * @param gateway_ctime  安装时间  timestamp
   */
  public void setGATEWAY_CTIME(java.sql.Timestamp gateway_ctime) {
    this.GATEWAY_CTIME=gateway_ctime;
  }

  /**
   * 字段GATEWAY_UPDATE_TIME在数据中的名称.
   */
  public static final String FLD_GATEWAY_UPDATE_TIME="GATEWAY_UPDATE_TIME";

  /**
   * 获取字段GATEWAY_UPDATE_TIME的索引值.
   */
  public static final Integer IDX_GATEWAY_UPDATE_TIME=5;

 /**
   * 字段GATEWAY_UPDATE_TIME.
   */
  private java.sql.Timestamp GATEWAY_UPDATE_TIME;

  /**
   * 返回字段GATEWAY_UPDATE_TIME的值.
   * @return GATEWAY_UPDATE_TIME  更新时间  timestamp
  */
  public java.sql.Timestamp getGATEWAY_UPDATE_TIME() {
    return GATEWAY_UPDATE_TIME;
  }

  /**
   * 设置字段GATEWAY_UPDATE_TIME的值.
   * @param gateway_update_time  更新时间  timestamp
   */
  public void setGATEWAY_UPDATE_TIME(java.sql.Timestamp gateway_update_time) {
    this.GATEWAY_UPDATE_TIME=gateway_update_time;
  }

  /**
   * 字段GATEWAY_STATE在数据中的名称.
   */
  public static final String FLD_GATEWAY_STATE="GATEWAY_STATE";

  /**
   * 获取字段GATEWAY_STATE的索引值.
   */
  public static final Integer IDX_GATEWAY_STATE=6;

 /**
   * 字段GATEWAY_STATE.
   */
  private Integer GATEWAY_STATE;

  /**
   * 返回字段GATEWAY_STATE的值.
   * @return GATEWAY_STATE  网关状态 0:离线 1:在线 2:升级中  int
  */
  public Integer getGATEWAY_STATE() {
    return GATEWAY_STATE;
  }

  /**
   * 设置字段GATEWAY_STATE的值.
   * @param gateway_state  网关状态 0:离线 1:在线 2:升级中  int
   */
  public void setGATEWAY_STATE(Integer gateway_state) {
    this.GATEWAY_STATE=gateway_state;
  }

  /**
   * 字段GATEWAY_TOKEN在数据中的名称.
   */
  public static final String FLD_GATEWAY_TOKEN="GATEWAY_TOKEN";

  /**
   * 获取字段GATEWAY_TOKEN的索引值.
   */
  public static final Integer IDX_GATEWAY_TOKEN=7;

 /**
   * 字段GATEWAY_TOKEN.
   */
  private Long GATEWAY_TOKEN;

  /**
   * 返回字段GATEWAY_TOKEN的值.
   * @return GATEWAY_TOKEN  网关token  bigint
  */
  public Long getGATEWAY_TOKEN() {
    return GATEWAY_TOKEN;
  }

  /**
   * 设置字段GATEWAY_TOKEN的值.
   * @param gateway_token  网关token  bigint
   */
  public void setGATEWAY_TOKEN(Long gateway_token) {
    this.GATEWAY_TOKEN=gateway_token;
  }

  /**
   * 字段GATEWAY_ADDRESS在数据中的名称.
   */
  public static final String FLD_GATEWAY_ADDRESS="GATEWAY_ADDRESS";

  /**
   * 获取字段GATEWAY_ADDRESS的索引值.
   */
  public static final Integer IDX_GATEWAY_ADDRESS=8;

 /**
   * 字段GATEWAY_ADDRESS.
   */
  private String GATEWAY_ADDRESS;

  /**
   * 返回字段GATEWAY_ADDRESS的值.
   * @return GATEWAY_ADDRESS  网关地址  varchar
  */
  public String getGATEWAY_ADDRESS() {
    return GATEWAY_ADDRESS;
  }

  /**
   * 设置字段GATEWAY_ADDRESS的值.
   * @param gateway_address  网关地址  varchar
   */
  public void setGATEWAY_ADDRESS(String gateway_address) {
    this.GATEWAY_ADDRESS=gateway_address;
  }

  /**
   * 字段GATEWAY_TYPE在数据中的名称.
   */
  public static final String FLD_GATEWAY_TYPE="GATEWAY_TYPE";

  /**
   * 获取字段GATEWAY_TYPE的索引值.
   */
  public static final Integer IDX_GATEWAY_TYPE=9;

 /**
   * 字段GATEWAY_TYPE.
   */
  private String GATEWAY_TYPE;

  /**
   * 返回字段GATEWAY_TYPE的值.
   * @return GATEWAY_TYPE  网关类型  varchar
  */
  public String getGATEWAY_TYPE() {
    return GATEWAY_TYPE;
  }

  /**
   * 设置字段GATEWAY_TYPE的值.
   * @param gateway_type  网关类型  varchar
   */
  public void setGATEWAY_TYPE(String gateway_type) {
    this.GATEWAY_TYPE=gateway_type;
  }

  /**
   * 字段GATEWAY_VER在数据中的名称.
   */
  public static final String FLD_GATEWAY_VER="GATEWAY_VER";

  /**
   * 获取字段GATEWAY_VER的索引值.
   */
  public static final Integer IDX_GATEWAY_VER=10;

 /**
   * 字段GATEWAY_VER.
   */
  private String GATEWAY_VER;

  /**
   * 返回字段GATEWAY_VER的值.
   * @return GATEWAY_VER  网关版本  varchar
  */
  public String getGATEWAY_VER() {
    return GATEWAY_VER;
  }

  /**
   * 设置字段GATEWAY_VER的值.
   * @param gateway_ver  网关版本  varchar
   */
  public void setGATEWAY_VER(String gateway_ver) {
    this.GATEWAY_VER=gateway_ver;
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
   * 字段DEVICE_CTIME在数据中的名称.
   */
  public static final String FLD_DEVICE_CTIME="DEVICE_CTIME";

  /**
   * 获取字段DEVICE_CTIME的索引值.
   */
  public static final Integer IDX_DEVICE_CTIME=12;

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
   * 字段DEVICE_NAME在数据中的名称.
   */
  public static final String FLD_DEVICE_NAME="DEVICE_NAME";

  /**
   * 获取字段DEVICE_NAME的索引值.
   */
  public static final Integer IDX_DEVICE_NAME=16;

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
   * 字段DATA_FIRST_TIME在数据中的名称.
   */
  public static final String FLD_DATA_FIRST_TIME="DATA_FIRST_TIME";

  /**
   * 获取字段DATA_FIRST_TIME的索引值.
   */
  public static final Integer IDX_DATA_FIRST_TIME=20;

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
  public static final Integer IDX_DATA_LAST_TIME=21;

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
   * 字段IS_NOTIFY_USER在数据中的名称.
   */
  public static final String FLD_IS_NOTIFY_USER="IS_NOTIFY_USER";

  /**
   * 获取字段IS_NOTIFY_USER的索引值.
   */
  public static final Integer IDX_IS_NOTIFY_USER=22;

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

  /**
   * 字段USER_GATEWAY_BINDTIME在数据中的名称.
   */
  public static final String FLD_USER_GATEWAY_BINDTIME="USER_GATEWAY_BINDTIME";

  /**
   * 获取字段USER_GATEWAY_BINDTIME的索引值.
   */
  public static final Integer IDX_USER_GATEWAY_BINDTIME=23;

 /**
   * 字段USER_GATEWAY_BINDTIME.
   */
  private java.sql.Timestamp USER_GATEWAY_BINDTIME;

  /**
   * 返回字段USER_GATEWAY_BINDTIME的值.
   * @return USER_GATEWAY_BINDTIME  添加时间  timestamp
  */
  public java.sql.Timestamp getUSER_GATEWAY_BINDTIME() {
    return USER_GATEWAY_BINDTIME;
  }

  /**
   * 设置字段USER_GATEWAY_BINDTIME的值.
   * @param user_gateway_bindtime  添加时间  timestamp
   */
  public void setUSER_GATEWAY_BINDTIME(java.sql.Timestamp user_gateway_bindtime) {
    this.USER_GATEWAY_BINDTIME=user_gateway_bindtime;
  }

  /**
   * 字段USER_TYPE在数据中的名称.
   */
  public static final String FLD_USER_TYPE="USER_TYPE";

  /**
   * 获取字段USER_TYPE的索引值.
   */
  public static final Integer IDX_USER_TYPE=24;

 /**
   * 字段USER_TYPE.
   */
  private Integer USER_TYPE;

  /**
   * 返回字段USER_TYPE的值.
   * @return USER_TYPE  登录类型  int
  */
  public Integer getUSER_TYPE() {
    return USER_TYPE;
  }

  /**
   * 设置字段USER_TYPE的值.
   * @param user_type  登录类型  int
   */
  public void setUSER_TYPE(Integer user_type) {
    this.USER_TYPE=user_type;
  }

  /**
   * 字段USER_HASH在数据中的名称.
   */
  public static final String FLD_USER_HASH="USER_HASH";

  /**
   * 获取字段USER_HASH的索引值.
   */
  public static final Integer IDX_USER_HASH=25;

 /**
   * 字段USER_HASH.
   */
  private String USER_HASH;

  /**
   * 返回字段USER_HASH的值.
   * @return USER_HASH  哈希值  varchar
  */
  public String getUSER_HASH() {
    return USER_HASH;
  }

  /**
   * 设置字段USER_HASH的值.
   * @param user_hash  哈希值  varchar
   */
  public void setUSER_HASH(String user_hash) {
    this.USER_HASH=user_hash;
  }

  /**
   * 字段USER_LOGIN_NAME在数据中的名称.
   */
  public static final String FLD_USER_LOGIN_NAME="USER_LOGIN_NAME";

  /**
   * 获取字段USER_LOGIN_NAME的索引值.
   */
  public static final Integer IDX_USER_LOGIN_NAME=26;

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
   * 字段USER_REAL_NAME在数据中的名称.
   */
  public static final String FLD_USER_REAL_NAME="USER_REAL_NAME";

  /**
   * 获取字段USER_REAL_NAME的索引值.
   */
  public static final Integer IDX_USER_REAL_NAME=27;

 /**
   * 字段USER_REAL_NAME.
   */
  private String USER_REAL_NAME;

  /**
   * 返回字段USER_REAL_NAME的值.
   * @return USER_REAL_NAME  真实姓名  varchar
  */
  public String getUSER_REAL_NAME() {
    return USER_REAL_NAME;
  }

  /**
   * 设置字段USER_REAL_NAME的值.
   * @param user_real_name  真实姓名  varchar
   */
  public void setUSER_REAL_NAME(String user_real_name) {
    this.USER_REAL_NAME=user_real_name;
  }

  /**
   * 字段USER_AVATOR在数据中的名称.
   */
  public static final String FLD_USER_AVATOR="USER_AVATOR";

  /**
   * 获取字段USER_AVATOR的索引值.
   */
  public static final Integer IDX_USER_AVATOR=28;

 /**
   * 字段USER_AVATOR.
   */
  private String USER_AVATOR;

  /**
   * 返回字段USER_AVATOR的值.
   * @return USER_AVATOR  头像的相对地址  varchar
  */
  public String getUSER_AVATOR() {
    return USER_AVATOR;
  }

  /**
   * 设置字段USER_AVATOR的值.
   * @param user_avator  头像的相对地址  varchar
   */
  public void setUSER_AVATOR(String user_avator) {
    this.USER_AVATOR=user_avator;
  }

  /**
   * 字段USER_GENDER在数据中的名称.
   */
  public static final String FLD_USER_GENDER="USER_GENDER";

  /**
   * 获取字段USER_GENDER的索引值.
   */
  public static final Integer IDX_USER_GENDER=29;

 /**
   * 字段USER_GENDER.
   */
  private String USER_GENDER;

  /**
   * 返回字段USER_GENDER的值.
   * @return USER_GENDER  性别  varchar
  */
  public String getUSER_GENDER() {
    return USER_GENDER;
  }

  /**
   * 设置字段USER_GENDER的值.
   * @param user_gender  性别  varchar
   */
  public void setUSER_GENDER(String user_gender) {
    this.USER_GENDER=user_gender;
  }

  /**
   * 字段USER_EMAIL在数据中的名称.
   */
  public static final String FLD_USER_EMAIL="USER_EMAIL";

  /**
   * 获取字段USER_EMAIL的索引值.
   */
  public static final Integer IDX_USER_EMAIL=30;

 /**
   * 字段USER_EMAIL.
   */
  private String USER_EMAIL;

  /**
   * 返回字段USER_EMAIL的值.
   * @return USER_EMAIL  邮箱  varchar
  */
  public String getUSER_EMAIL() {
    return USER_EMAIL;
  }

  /**
   * 设置字段USER_EMAIL的值.
   * @param user_email  邮箱  varchar
   */
  public void setUSER_EMAIL(String user_email) {
    this.USER_EMAIL=user_email;
  }

  /**
   * 字段USER_MOBILE在数据中的名称.
   */
  public static final String FLD_USER_MOBILE="USER_MOBILE";

  /**
   * 获取字段USER_MOBILE的索引值.
   */
  public static final Integer IDX_USER_MOBILE=31;

 /**
   * 字段USER_MOBILE.
   */
  private String USER_MOBILE;

  /**
   * 返回字段USER_MOBILE的值.
   * @return USER_MOBILE  手机  varchar
  */
  public String getUSER_MOBILE() {
    return USER_MOBILE;
  }

  /**
   * 设置字段USER_MOBILE的值.
   * @param user_mobile  手机  varchar
   */
  public void setUSER_MOBILE(String user_mobile) {
    this.USER_MOBILE=user_mobile;
  }

  /**
   * 字段USER_TITLE在数据中的名称.
   */
  public static final String FLD_USER_TITLE="USER_TITLE";

  /**
   * 获取字段USER_TITLE的索引值.
   */
  public static final Integer IDX_USER_TITLE=32;

 /**
   * 字段USER_TITLE.
   */
  private String USER_TITLE;

  /**
   * 返回字段USER_TITLE的值.
   * @return USER_TITLE  用户说明  varchar
  */
  public String getUSER_TITLE() {
    return USER_TITLE;
  }

  /**
   * 设置字段USER_TITLE的值.
   * @param user_title  用户说明  varchar
   */
  public void setUSER_TITLE(String user_title) {
    this.USER_TITLE=user_title;
  }

  /**
   * 字段USER_TOKEN在数据中的名称.
   */
  public static final String FLD_USER_TOKEN="USER_TOKEN";

  /**
   * 获取字段USER_TOKEN的索引值.
   */
  public static final Integer IDX_USER_TOKEN=33;

 /**
   * 字段USER_TOKEN.
   */
  private String USER_TOKEN;

  /**
   * 返回字段USER_TOKEN的值.
   * @return USER_TOKEN  登录的TOKEN  varchar
  */
  public String getUSER_TOKEN() {
    return USER_TOKEN;
  }

  /**
   * 设置字段USER_TOKEN的值.
   * @param user_token  登录的TOKEN  varchar
   */
  public void setUSER_TOKEN(String user_token) {
    this.USER_TOKEN=user_token;
  }

  /**
   * 字段USER_CREATE_TIME在数据中的名称.
   */
  public static final String FLD_USER_CREATE_TIME="USER_CREATE_TIME";

  /**
   * 获取字段USER_CREATE_TIME的索引值.
   */
  public static final Integer IDX_USER_CREATE_TIME=34;

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
   * 字段USER_UPDATE_TIME在数据中的名称.
   */
  public static final String FLD_USER_UPDATE_TIME="USER_UPDATE_TIME";

  /**
   * 获取字段USER_UPDATE_TIME的索引值.
   */
  public static final Integer IDX_USER_UPDATE_TIME=35;

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
   * 字段IS_SEND_MESSAGE在数据中的名称.
   */
  public static final String FLD_IS_SEND_MESSAGE="IS_SEND_MESSAGE";

  /**
   * 获取字段IS_SEND_MESSAGE的索引值.
   */
  public static final Integer IDX_IS_SEND_MESSAGE=36;

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
   * 字段USER_ID在数据中的名称.
   */
  public static final String FLD_USER_ID="USER_ID";

  /**
   * 获取字段USER_ID的索引值.
   */
  public static final Integer IDX_USER_ID=37;

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
   * 字段DEVICE_TYPE_NAME在数据中的名称.
   */
  public static final String FLD_DEVICE_TYPE_NAME="DEVICE_TYPE_NAME";

  /**
   * 获取字段DEVICE_TYPE_NAME的索引值.
   */
  public static final Integer IDX_DEVICE_TYPE_NAME=38;

 /**
   * 字段DEVICE_TYPE_NAME.
   */
  private String DEVICE_TYPE_NAME;

  /**
   * 返回字段DEVICE_TYPE_NAME的值.
   * @return DEVICE_TYPE_NAME  设备类型名称  varchar
  */
  public String getDEVICE_TYPE_NAME() {
    return DEVICE_TYPE_NAME;
  }

  /**
   * 设置字段DEVICE_TYPE_NAME的值.
   * @param device_type_name  设备类型名称  varchar
   */
  public void setDEVICE_TYPE_NAME(String device_type_name) {
    this.DEVICE_TYPE_NAME=device_type_name;
  }

}

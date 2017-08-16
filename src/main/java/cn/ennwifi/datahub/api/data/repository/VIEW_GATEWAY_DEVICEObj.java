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
 *         DEVICE_TYPE_NAME   设备类型名称 String<br/>
 */

@Table("VIEW_GATEWAY_DEVICE")
public class VIEW_GATEWAY_DEVICEObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_VIEW_GATEWAY_DEVICE="VIEW_GATEWAY_DEVICE";
  public VIEW_GATEWAY_DEVICEObj() {
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
      if (FLD_DEVICE_TYPE_NAME.equals(fieldName)) {
        return DEVICE_TYPE_NAME;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 24) {
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
   * 字段DEVICE_TYPE_NAME在数据中的名称.
   */
  public static final String FLD_DEVICE_TYPE_NAME="DEVICE_TYPE_NAME";

  /**
   * 获取字段DEVICE_TYPE_NAME的索引值.
   */
  public static final Integer IDX_DEVICE_TYPE_NAME=23;

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

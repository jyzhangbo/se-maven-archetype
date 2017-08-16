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

 *         ID   ID Long<br/>
 *         PID   设备的网关ID Long<br/>
 *         DEVICE_NO   设备序列号 String<br/>
 *         CTIME   安装时间 java.sql.Timestamp<br/>
 *         REGISTER_START   寄存器起始地址 Integer<br/>
 *         PROTOCOL_TYPE_ID   设备协议类型ID Long<br/>
 *         PROTOCOL_LENGTH   协议的长度 Integer<br/>
 *         NAME   设备名称 String<br/>
 *         DEVICE_TYPE_ID   设备类型ID Long<br/>
 *         UPDATE_TIME   更新时间 java.sql.Timestamp<br/>
 *         ORDER_IN_GATEWAY   在网关下的顺序 Integer<br/>
 *         DATA_FIRST_TIME   第一次上传数据的时间 java.sql.Timestamp<br/>
 *         DATA_LAST_TIME   最新一条数据上传时间 java.sql.Timestamp<br/>
 *         IS_NOTIFY_USER   是否已经通知用户 0未通知 1已经通知 Integer<br/>
 *         STATE   网关状态 0:离线 1:在线 2:升级中 Integer<br/>
 *         TOKEN   网关token Long<br/>
 *         ADDRESS   网关地址 String<br/>
 *         TYPE   网关类型 String<br/>
 *         VER   网关版本 String<br/>
 *         VER_HARD   硬件版本 String<br/>
 *         UPLOAD_INTERVAL   上传频率，以秒为单位 Integer<br/>
 *         MEMORY_USED    内存使用率 String<br/>
 *         CPU_USED   CPU使用率 String<br/>
 */

@Table("DEVICE")
public class DEVICEObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_DEVICE="DEVICE";
  public DEVICEObj() {
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
      if (FLD_PID.equals(fieldName)) {
        return PID;
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
      if (FLD_UPDATE_TIME.equals(fieldName)) {
        return UPDATE_TIME;
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
      if (FLD_STATE.equals(fieldName)) {
        return STATE;
      }
      if (FLD_TOKEN.equals(fieldName)) {
        return TOKEN;
      }
      if (FLD_ADDRESS.equals(fieldName)) {
        return ADDRESS;
      }
      if (FLD_TYPE.equals(fieldName)) {
        return TYPE;
      }
      if (FLD_VER.equals(fieldName)) {
        return VER;
      }
      if (FLD_VER_HARD.equals(fieldName)) {
        return VER_HARD;
      }
      if (FLD_UPLOAD_INTERVAL.equals(fieldName)) {
        return UPLOAD_INTERVAL;
      }
      if (FLD_MEMORY_USED.equals(fieldName)) {
        return MEMORY_USED;
      }
      if (FLD_CPU_USED.equals(fieldName)) {
        return CPU_USED;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 23) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return PID;
      }
      if (fieldIndex == 2) {
        return DEVICE_NO;
      }
      if (fieldIndex == 3) {
        return CTIME;
      }
      if (fieldIndex == 4) {
        return REGISTER_START;
      }
      if (fieldIndex == 5) {
        return PROTOCOL_TYPE_ID;
      }
      if (fieldIndex == 6) {
        return PROTOCOL_LENGTH;
      }
      if (fieldIndex == 7) {
        return NAME;
      }
      if (fieldIndex == 8) {
        return DEVICE_TYPE_ID;
      }
      if (fieldIndex == 9) {
        return UPDATE_TIME;
      }
      if (fieldIndex == 10) {
        return ORDER_IN_GATEWAY;
      }
      if (fieldIndex == 11) {
        return DATA_FIRST_TIME;
      }
      if (fieldIndex == 12) {
        return DATA_LAST_TIME;
      }
      if (fieldIndex == 13) {
        return IS_NOTIFY_USER;
      }
      if (fieldIndex == 14) {
        return STATE;
      }
      if (fieldIndex == 15) {
        return TOKEN;
      }
      if (fieldIndex == 16) {
        return ADDRESS;
      }
      if (fieldIndex == 17) {
        return TYPE;
      }
      if (fieldIndex == 18) {
        return VER;
      }
      if (fieldIndex == 19) {
        return VER_HARD;
      }
      if (fieldIndex == 20) {
        return UPLOAD_INTERVAL;
      }
      if (fieldIndex == 21) {
        return MEMORY_USED;
      }
      if (fieldIndex == 22) {
        return CPU_USED;
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
  private Long ID;

  /**
   * 返回字段ID的值.
   * @return ID  ID  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  ID  bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段PID在数据中的名称.
   */
  public static final String FLD_PID="PID";

  /**
   * 获取字段PID的索引值.
   */
  public static final Integer IDX_PID=1;

 /**
   * 字段PID.
   */
  private Long PID;

  /**
   * 返回字段PID的值.
   * @return PID  设备的网关ID  bigint
  */
  public Long getPID() {
    return PID;
  }

  /**
   * 设置字段PID的值.
   * @param pid  设备的网关ID  bigint
   */
  public void setPID(Long pid) {
    this.PID=pid;
  }

  /**
   * 字段DEVICE_NO在数据中的名称.
   */
  public static final String FLD_DEVICE_NO="DEVICE_NO";

  /**
   * 获取字段DEVICE_NO的索引值.
   */
  public static final Integer IDX_DEVICE_NO=2;

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
  public static final Integer IDX_CTIME=3;

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
  public static final Integer IDX_REGISTER_START=4;

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
  public static final Integer IDX_PROTOCOL_TYPE_ID=5;

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
  public static final Integer IDX_PROTOCOL_LENGTH=6;

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
  public static final Integer IDX_NAME=7;

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
  public static final Integer IDX_DEVICE_TYPE_ID=8;

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
   * 字段UPDATE_TIME在数据中的名称.
   */
  public static final String FLD_UPDATE_TIME="UPDATE_TIME";

  /**
   * 获取字段UPDATE_TIME的索引值.
   */
  public static final Integer IDX_UPDATE_TIME=9;

 /**
   * 字段UPDATE_TIME.
   */
  private java.sql.Timestamp UPDATE_TIME;

  /**
   * 返回字段UPDATE_TIME的值.
   * @return UPDATE_TIME  更新时间  timestamp
  */
  public java.sql.Timestamp getUPDATE_TIME() {
    return UPDATE_TIME;
  }

  /**
   * 设置字段UPDATE_TIME的值.
   * @param update_time  更新时间  timestamp
   */
  public void setUPDATE_TIME(java.sql.Timestamp update_time) {
    this.UPDATE_TIME=update_time;
  }

  /**
   * 字段ORDER_IN_GATEWAY在数据中的名称.
   */
  public static final String FLD_ORDER_IN_GATEWAY="ORDER_IN_GATEWAY";

  /**
   * 获取字段ORDER_IN_GATEWAY的索引值.
   */
  public static final Integer IDX_ORDER_IN_GATEWAY=10;

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
  public static final Integer IDX_DATA_FIRST_TIME=11;

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
  public static final Integer IDX_DATA_LAST_TIME=12;

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
  public static final Integer IDX_IS_NOTIFY_USER=13;

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
   * 字段STATE在数据中的名称.
   */
  public static final String FLD_STATE="STATE";

  /**
   * 获取字段STATE的索引值.
   */
  public static final Integer IDX_STATE=14;

 /**
   * 字段STATE.
   */
  private Integer STATE;

  /**
   * 返回字段STATE的值.
   * @return STATE  网关状态 0:离线 1:在线 2:升级中  int
  */
  public Integer getSTATE() {
    return STATE;
  }

  /**
   * 设置字段STATE的值.
   * @param state  网关状态 0:离线 1:在线 2:升级中  int
   */
  public void setSTATE(Integer state) {
    this.STATE=state;
  }

  /**
   * 字段TOKEN在数据中的名称.
   */
  public static final String FLD_TOKEN="TOKEN";

  /**
   * 获取字段TOKEN的索引值.
   */
  public static final Integer IDX_TOKEN=15;

 /**
   * 字段TOKEN.
   */
  private Long TOKEN;

  /**
   * 返回字段TOKEN的值.
   * @return TOKEN  网关token  bigint
  */
  public Long getTOKEN() {
    return TOKEN;
  }

  /**
   * 设置字段TOKEN的值.
   * @param token  网关token  bigint
   */
  public void setTOKEN(Long token) {
    this.TOKEN=token;
  }

  /**
   * 字段ADDRESS在数据中的名称.
   */
  public static final String FLD_ADDRESS="ADDRESS";

  /**
   * 获取字段ADDRESS的索引值.
   */
  public static final Integer IDX_ADDRESS=16;

 /**
   * 字段ADDRESS.
   */
  private String ADDRESS;

  /**
   * 返回字段ADDRESS的值.
   * @return ADDRESS  网关地址  varchar
  */
  public String getADDRESS() {
    return ADDRESS;
  }

  /**
   * 设置字段ADDRESS的值.
   * @param address  网关地址  varchar
   */
  public void setADDRESS(String address) {
    this.ADDRESS=address;
  }

  /**
   * 字段TYPE在数据中的名称.
   */
  public static final String FLD_TYPE="TYPE";

  /**
   * 获取字段TYPE的索引值.
   */
  public static final Integer IDX_TYPE=17;

 /**
   * 字段TYPE.
   */
  private String TYPE;

  /**
   * 返回字段TYPE的值.
   * @return TYPE  网关类型  varchar
  */
  public String getTYPE() {
    return TYPE;
  }

  /**
   * 设置字段TYPE的值.
   * @param type  网关类型  varchar
   */
  public void setTYPE(String type) {
    this.TYPE=type;
  }

  /**
   * 字段VER在数据中的名称.
   */
  public static final String FLD_VER="VER";

  /**
   * 获取字段VER的索引值.
   */
  public static final Integer IDX_VER=18;

 /**
   * 字段VER.
   */
  private String VER;

  /**
   * 返回字段VER的值.
   * @return VER  网关版本  varchar
  */
  public String getVER() {
    return VER;
  }

  /**
   * 设置字段VER的值.
   * @param ver  网关版本  varchar
   */
  public void setVER(String ver) {
    this.VER=ver;
  }

  /**
   * 字段VER_HARD在数据中的名称.
   */
  public static final String FLD_VER_HARD="VER_HARD";

  /**
   * 获取字段VER_HARD的索引值.
   */
  public static final Integer IDX_VER_HARD=19;

 /**
   * 字段VER_HARD.
   */
  private String VER_HARD;

  /**
   * 返回字段VER_HARD的值.
   * @return VER_HARD  硬件版本  varchar
  */
  public String getVER_HARD() {
    return VER_HARD;
  }

  /**
   * 设置字段VER_HARD的值.
   * @param ver_hard  硬件版本  varchar
   */
  public void setVER_HARD(String ver_hard) {
    this.VER_HARD=ver_hard;
  }

  /**
   * 字段UPLOAD_INTERVAL在数据中的名称.
   */
  public static final String FLD_UPLOAD_INTERVAL="UPLOAD_INTERVAL";

  /**
   * 获取字段UPLOAD_INTERVAL的索引值.
   */
  public static final Integer IDX_UPLOAD_INTERVAL=20;

 /**
   * 字段UPLOAD_INTERVAL.
   */
  private Integer UPLOAD_INTERVAL;

  /**
   * 返回字段UPLOAD_INTERVAL的值.
   * @return UPLOAD_INTERVAL  上传频率，以秒为单位  int
  */
  public Integer getUPLOAD_INTERVAL() {
    return UPLOAD_INTERVAL;
  }

  /**
   * 设置字段UPLOAD_INTERVAL的值.
   * @param upload_interval  上传频率，以秒为单位  int
   */
  public void setUPLOAD_INTERVAL(Integer upload_interval) {
    this.UPLOAD_INTERVAL=upload_interval;
  }

  /**
   * 字段MEMORY_USED在数据中的名称.
   */
  public static final String FLD_MEMORY_USED="MEMORY_USED";

  /**
   * 获取字段MEMORY_USED的索引值.
   */
  public static final Integer IDX_MEMORY_USED=21;

 /**
   * 字段MEMORY_USED.
   */
  private String MEMORY_USED;

  /**
   * 返回字段MEMORY_USED的值.
   * @return MEMORY_USED   内存使用率  varchar
  */
  public String getMEMORY_USED() {
    return MEMORY_USED;
  }

  /**
   * 设置字段MEMORY_USED的值.
   * @param memory_used   内存使用率  varchar
   */
  public void setMEMORY_USED(String memory_used) {
    this.MEMORY_USED=memory_used;
  }

  /**
   * 字段CPU_USED在数据中的名称.
   */
  public static final String FLD_CPU_USED="CPU_USED";

  /**
   * 获取字段CPU_USED的索引值.
   */
  public static final Integer IDX_CPU_USED=22;

 /**
   * 字段CPU_USED.
   */
  private String CPU_USED;

  /**
   * 返回字段CPU_USED的值.
   * @return CPU_USED  CPU使用率  varchar
  */
  public String getCPU_USED() {
    return CPU_USED;
  }

  /**
   * 设置字段CPU_USED的值.
   * @param cpu_used  CPU使用率  varchar
   */
  public void setCPU_USED(String cpu_used) {
    this.CPU_USED=cpu_used;
  }

}

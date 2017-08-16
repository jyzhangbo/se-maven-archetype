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

 *         DEVICE_ID   ID Long<br/>
 *         DEVICE_NAME   设备名称 String<br/>
 *         DEVICE_NO   设备序列号 String<br/>
 *         CTIME   安装时间 java.sql.Timestamp<br/>
 *         REGISTER_START   寄存器起始地址 Integer<br/>
 *         PROTOCOL_TYPE_ID   设备协议类型ID Long<br/>
 *         PROTOCOL_LENGTH   协议的长度 Integer<br/>
 *         DEVICE_TYPE_ID   设备类型ID Long<br/>
 *         UPDATE_TIME   更新时间 java.sql.Timestamp<br/>
 *         FILED_NAME   字段名称 String<br/>
 *         SHOW_NAME   展示的字段名称 String<br/>
 *         REGISTER_ADDR   寄存器地址 Integer<br/>
 *         REGISTER_LENGTH   寄存器长度 Integer<br/>
 *         TEMPLET_TYPE_ID   模板类型id Long<br/>
 *         COLLECTION_POINT   采集点 String<br/>
 *         GATEWAY_ID   网关ID Long<br/>
 *         PROTOCOL_ID   ID Long<br/>
 */

@Table("VIEW_DEVICE_PROTOCOL")
public class VIEW_DEVICE_PROTOCOLObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_VIEW_DEVICE_PROTOCOL="VIEW_DEVICE_PROTOCOL";
  public VIEW_DEVICE_PROTOCOLObj() {
  }
  /**
   * 根据字段名称获取字段的值. 
   */
  @Override
  public Object getFieldValue(String fieldName,Integer fieldIndex) {
    if (fieldName != null && fieldName.length() > 0) {
      if (FLD_DEVICE_ID.equals(fieldName)) {
        return DEVICE_ID;
      }
      if (FLD_DEVICE_NAME.equals(fieldName)) {
        return DEVICE_NAME;
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
      if (FLD_DEVICE_TYPE_ID.equals(fieldName)) {
        return DEVICE_TYPE_ID;
      }
      if (FLD_UPDATE_TIME.equals(fieldName)) {
        return UPDATE_TIME;
      }
      if (FLD_FILED_NAME.equals(fieldName)) {
        return FILED_NAME;
      }
      if (FLD_SHOW_NAME.equals(fieldName)) {
        return SHOW_NAME;
      }
      if (FLD_REGISTER_ADDR.equals(fieldName)) {
        return REGISTER_ADDR;
      }
      if (FLD_REGISTER_LENGTH.equals(fieldName)) {
        return REGISTER_LENGTH;
      }
      if (FLD_TEMPLET_TYPE_ID.equals(fieldName)) {
        return TEMPLET_TYPE_ID;
      }
      if (FLD_COLLECTION_POINT.equals(fieldName)) {
        return COLLECTION_POINT;
      }
      if (FLD_GATEWAY_ID.equals(fieldName)) {
        return GATEWAY_ID;
      }
      if (FLD_PROTOCOL_ID.equals(fieldName)) {
        return PROTOCOL_ID;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 17) {
      if (fieldIndex == 0) {
        return DEVICE_ID;
      }
      if (fieldIndex == 1) {
        return DEVICE_NAME;
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
        return DEVICE_TYPE_ID;
      }
      if (fieldIndex == 8) {
        return UPDATE_TIME;
      }
      if (fieldIndex == 9) {
        return FILED_NAME;
      }
      if (fieldIndex == 10) {
        return SHOW_NAME;
      }
      if (fieldIndex == 11) {
        return REGISTER_ADDR;
      }
      if (fieldIndex == 12) {
        return REGISTER_LENGTH;
      }
      if (fieldIndex == 13) {
        return TEMPLET_TYPE_ID;
      }
      if (fieldIndex == 14) {
        return COLLECTION_POINT;
      }
      if (fieldIndex == 15) {
        return GATEWAY_ID;
      }
      if (fieldIndex == 16) {
        return PROTOCOL_ID;
      }
    } else {
      return null;
    }
    return null;
  }

  /**
   * 字段DEVICE_ID在数据中的名称.
   */
  public static final String FLD_DEVICE_ID="DEVICE_ID";

  /**
   * 获取字段DEVICE_ID的索引值.
   */
  public static final Integer IDX_DEVICE_ID=0;

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
   * 字段DEVICE_NAME在数据中的名称.
   */
  public static final String FLD_DEVICE_NAME="DEVICE_NAME";

  /**
   * 获取字段DEVICE_NAME的索引值.
   */
  public static final Integer IDX_DEVICE_NAME=1;

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
   * 字段DEVICE_TYPE_ID在数据中的名称.
   */
  public static final String FLD_DEVICE_TYPE_ID="DEVICE_TYPE_ID";

  /**
   * 获取字段DEVICE_TYPE_ID的索引值.
   */
  public static final Integer IDX_DEVICE_TYPE_ID=7;

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
  public static final Integer IDX_UPDATE_TIME=8;

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
   * 字段FILED_NAME在数据中的名称.
   */
  public static final String FLD_FILED_NAME="FILED_NAME";

  /**
   * 获取字段FILED_NAME的索引值.
   */
  public static final Integer IDX_FILED_NAME=9;

 /**
   * 字段FILED_NAME.
   */
  private String FILED_NAME;

  /**
   * 返回字段FILED_NAME的值.
   * @return FILED_NAME  字段名称  varchar
  */
  public String getFILED_NAME() {
    return FILED_NAME;
  }

  /**
   * 设置字段FILED_NAME的值.
   * @param filed_name  字段名称  varchar
   */
  public void setFILED_NAME(String filed_name) {
    this.FILED_NAME=filed_name;
  }

  /**
   * 字段SHOW_NAME在数据中的名称.
   */
  public static final String FLD_SHOW_NAME="SHOW_NAME";

  /**
   * 获取字段SHOW_NAME的索引值.
   */
  public static final Integer IDX_SHOW_NAME=10;

 /**
   * 字段SHOW_NAME.
   */
  private String SHOW_NAME;

  /**
   * 返回字段SHOW_NAME的值.
   * @return SHOW_NAME  展示的字段名称  varchar
  */
  public String getSHOW_NAME() {
    return SHOW_NAME;
  }

  /**
   * 设置字段SHOW_NAME的值.
   * @param show_name  展示的字段名称  varchar
   */
  public void setSHOW_NAME(String show_name) {
    this.SHOW_NAME=show_name;
  }

  /**
   * 字段REGISTER_ADDR在数据中的名称.
   */
  public static final String FLD_REGISTER_ADDR="REGISTER_ADDR";

  /**
   * 获取字段REGISTER_ADDR的索引值.
   */
  public static final Integer IDX_REGISTER_ADDR=11;

 /**
   * 字段REGISTER_ADDR.
   */
  private Integer REGISTER_ADDR;

  /**
   * 返回字段REGISTER_ADDR的值.
   * @return REGISTER_ADDR  寄存器地址  int
  */
  public Integer getREGISTER_ADDR() {
    return REGISTER_ADDR;
  }

  /**
   * 设置字段REGISTER_ADDR的值.
   * @param register_addr  寄存器地址  int
   */
  public void setREGISTER_ADDR(Integer register_addr) {
    this.REGISTER_ADDR=register_addr;
  }

  /**
   * 字段REGISTER_LENGTH在数据中的名称.
   */
  public static final String FLD_REGISTER_LENGTH="REGISTER_LENGTH";

  /**
   * 获取字段REGISTER_LENGTH的索引值.
   */
  public static final Integer IDX_REGISTER_LENGTH=12;

 /**
   * 字段REGISTER_LENGTH.
   */
  private Integer REGISTER_LENGTH;

  /**
   * 返回字段REGISTER_LENGTH的值.
   * @return REGISTER_LENGTH  寄存器长度  int
  */
  public Integer getREGISTER_LENGTH() {
    return REGISTER_LENGTH;
  }

  /**
   * 设置字段REGISTER_LENGTH的值.
   * @param register_length  寄存器长度  int
   */
  public void setREGISTER_LENGTH(Integer register_length) {
    this.REGISTER_LENGTH=register_length;
  }

  /**
   * 字段TEMPLET_TYPE_ID在数据中的名称.
   */
  public static final String FLD_TEMPLET_TYPE_ID="TEMPLET_TYPE_ID";

  /**
   * 获取字段TEMPLET_TYPE_ID的索引值.
   */
  public static final Integer IDX_TEMPLET_TYPE_ID=13;

 /**
   * 字段TEMPLET_TYPE_ID.
   */
  private Long TEMPLET_TYPE_ID;

  /**
   * 返回字段TEMPLET_TYPE_ID的值.
   * @return TEMPLET_TYPE_ID  模板类型id  bigint
  */
  public Long getTEMPLET_TYPE_ID() {
    return TEMPLET_TYPE_ID;
  }

  /**
   * 设置字段TEMPLET_TYPE_ID的值.
   * @param templet_type_id  模板类型id  bigint
   */
  public void setTEMPLET_TYPE_ID(Long templet_type_id) {
    this.TEMPLET_TYPE_ID=templet_type_id;
  }

  /**
   * 字段COLLECTION_POINT在数据中的名称.
   */
  public static final String FLD_COLLECTION_POINT="COLLECTION_POINT";

  /**
   * 获取字段COLLECTION_POINT的索引值.
   */
  public static final Integer IDX_COLLECTION_POINT=14;

 /**
   * 字段COLLECTION_POINT.
   */
  private String COLLECTION_POINT;

  /**
   * 返回字段COLLECTION_POINT的值.
   * @return COLLECTION_POINT  采集点  varchar
  */
  public String getCOLLECTION_POINT() {
    return COLLECTION_POINT;
  }

  /**
   * 设置字段COLLECTION_POINT的值.
   * @param collection_point  采集点  varchar
   */
  public void setCOLLECTION_POINT(String collection_point) {
    this.COLLECTION_POINT=collection_point;
  }

  /**
   * 字段GATEWAY_ID在数据中的名称.
   */
  public static final String FLD_GATEWAY_ID="GATEWAY_ID";

  /**
   * 获取字段GATEWAY_ID的索引值.
   */
  public static final Integer IDX_GATEWAY_ID=15;

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
   * 字段PROTOCOL_ID在数据中的名称.
   */
  public static final String FLD_PROTOCOL_ID="PROTOCOL_ID";

  /**
   * 获取字段PROTOCOL_ID的索引值.
   */
  public static final Integer IDX_PROTOCOL_ID=16;

 /**
   * 字段PROTOCOL_ID.
   */
  private Long PROTOCOL_ID;

  /**
   * 返回字段PROTOCOL_ID的值.
   * @return PROTOCOL_ID  ID  bigint
  */
  public Long getPROTOCOL_ID() {
    return PROTOCOL_ID;
  }

  /**
   * 设置字段PROTOCOL_ID的值.
   * @param protocol_id  ID  bigint
   */
  public void setPROTOCOL_ID(Long protocol_id) {
    this.PROTOCOL_ID=protocol_id;
  }

}

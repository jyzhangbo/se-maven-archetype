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

 *         ID   设备协议信息模板ID Long<br/>
 *         TEMPLET_TYPE_ID   协议类型ID Long<br/>
 *         REGISTER_ADDR   寄存器地址 Integer<br/>
 *         REGISTER_LENGTH   寄存器长度 Integer<br/>
 *         FIELD_NAME   字段名称 String<br/>
 *         DATA_FORMAT   数据格式 String<br/>
 *         SHOW_NAME   字段名称中文 String<br/>
 *         IS_COMMON   是否常用 1:常用  0:不常用 Integer<br/>
 *         COLLECTION_POINT   采集点 String<br/>
 */

@Table("API_DEVICE_PROTOCOL_TEMPLET")
public class API_DEVICE_PROTOCOL_TEMPLETObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_API_DEVICE_PROTOCOL_TEMPLET="API_DEVICE_PROTOCOL_TEMPLET";
  public API_DEVICE_PROTOCOL_TEMPLETObj() {
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
      if (FLD_TEMPLET_TYPE_ID.equals(fieldName)) {
        return TEMPLET_TYPE_ID;
      }
      if (FLD_REGISTER_ADDR.equals(fieldName)) {
        return REGISTER_ADDR;
      }
      if (FLD_REGISTER_LENGTH.equals(fieldName)) {
        return REGISTER_LENGTH;
      }
      if (FLD_FIELD_NAME.equals(fieldName)) {
        return FIELD_NAME;
      }
      if (FLD_DATA_FORMAT.equals(fieldName)) {
        return DATA_FORMAT;
      }
      if (FLD_SHOW_NAME.equals(fieldName)) {
        return SHOW_NAME;
      }
      if (FLD_IS_COMMON.equals(fieldName)) {
        return IS_COMMON;
      }
      if (FLD_COLLECTION_POINT.equals(fieldName)) {
        return COLLECTION_POINT;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 9) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return TEMPLET_TYPE_ID;
      }
      if (fieldIndex == 2) {
        return REGISTER_ADDR;
      }
      if (fieldIndex == 3) {
        return REGISTER_LENGTH;
      }
      if (fieldIndex == 4) {
        return FIELD_NAME;
      }
      if (fieldIndex == 5) {
        return DATA_FORMAT;
      }
      if (fieldIndex == 6) {
        return SHOW_NAME;
      }
      if (fieldIndex == 7) {
        return IS_COMMON;
      }
      if (fieldIndex == 8) {
        return COLLECTION_POINT;
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
   * @return ID  设备协议信息模板ID  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  设备协议信息模板ID  bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段TEMPLET_TYPE_ID在数据中的名称.
   */
  public static final String FLD_TEMPLET_TYPE_ID="TEMPLET_TYPE_ID";

  /**
   * 获取字段TEMPLET_TYPE_ID的索引值.
   */
  public static final Integer IDX_TEMPLET_TYPE_ID=1;

 /**
   * 字段TEMPLET_TYPE_ID.
   */
  private Long TEMPLET_TYPE_ID;

  /**
   * 返回字段TEMPLET_TYPE_ID的值.
   * @return TEMPLET_TYPE_ID  协议类型ID  bigint
  */
  public Long getTEMPLET_TYPE_ID() {
    return TEMPLET_TYPE_ID;
  }

  /**
   * 设置字段TEMPLET_TYPE_ID的值.
   * @param templet_type_id  协议类型ID  bigint
   */
  public void setTEMPLET_TYPE_ID(Long templet_type_id) {
    this.TEMPLET_TYPE_ID=templet_type_id;
  }

  /**
   * 字段REGISTER_ADDR在数据中的名称.
   */
  public static final String FLD_REGISTER_ADDR="REGISTER_ADDR";

  /**
   * 获取字段REGISTER_ADDR的索引值.
   */
  public static final Integer IDX_REGISTER_ADDR=2;

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
  public static final Integer IDX_REGISTER_LENGTH=3;

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
   * 字段FIELD_NAME在数据中的名称.
   */
  public static final String FLD_FIELD_NAME="FIELD_NAME";

  /**
   * 获取字段FIELD_NAME的索引值.
   */
  public static final Integer IDX_FIELD_NAME=4;

 /**
   * 字段FIELD_NAME.
   */
  private String FIELD_NAME;

  /**
   * 返回字段FIELD_NAME的值.
   * @return FIELD_NAME  字段名称  varchar
  */
  public String getFIELD_NAME() {
    return FIELD_NAME;
  }

  /**
   * 设置字段FIELD_NAME的值.
   * @param field_name  字段名称  varchar
   */
  public void setFIELD_NAME(String field_name) {
    this.FIELD_NAME=field_name;
  }

  /**
   * 字段DATA_FORMAT在数据中的名称.
   */
  public static final String FLD_DATA_FORMAT="DATA_FORMAT";

  /**
   * 获取字段DATA_FORMAT的索引值.
   */
  public static final Integer IDX_DATA_FORMAT=5;

 /**
   * 字段DATA_FORMAT.
   */
  private String DATA_FORMAT;

  /**
   * 返回字段DATA_FORMAT的值.
   * @return DATA_FORMAT  数据格式  varchar
  */
  public String getDATA_FORMAT() {
    return DATA_FORMAT;
  }

  /**
   * 设置字段DATA_FORMAT的值.
   * @param data_format  数据格式  varchar
   */
  public void setDATA_FORMAT(String data_format) {
    this.DATA_FORMAT=data_format;
  }

  /**
   * 字段SHOW_NAME在数据中的名称.
   */
  public static final String FLD_SHOW_NAME="SHOW_NAME";

  /**
   * 获取字段SHOW_NAME的索引值.
   */
  public static final Integer IDX_SHOW_NAME=6;

 /**
   * 字段SHOW_NAME.
   */
  private String SHOW_NAME;

  /**
   * 返回字段SHOW_NAME的值.
   * @return SHOW_NAME  字段名称中文  varchar
  */
  public String getSHOW_NAME() {
    return SHOW_NAME;
  }

  /**
   * 设置字段SHOW_NAME的值.
   * @param show_name  字段名称中文  varchar
   */
  public void setSHOW_NAME(String show_name) {
    this.SHOW_NAME=show_name;
  }

  /**
   * 字段IS_COMMON在数据中的名称.
   */
  public static final String FLD_IS_COMMON="IS_COMMON";

  /**
   * 获取字段IS_COMMON的索引值.
   */
  public static final Integer IDX_IS_COMMON=7;

 /**
   * 字段IS_COMMON.
   */
  private Integer IS_COMMON;

  /**
   * 返回字段IS_COMMON的值.
   * @return IS_COMMON  是否常用 1:常用  0:不常用  int
  */
  public Integer getIS_COMMON() {
    return IS_COMMON;
  }

  /**
   * 设置字段IS_COMMON的值.
   * @param is_common  是否常用 1:常用  0:不常用  int
   */
  public void setIS_COMMON(Integer is_common) {
    this.IS_COMMON=is_common;
  }

  /**
   * 字段COLLECTION_POINT在数据中的名称.
   */
  public static final String FLD_COLLECTION_POINT="COLLECTION_POINT";

  /**
   * 获取字段COLLECTION_POINT的索引值.
   */
  public static final Integer IDX_COLLECTION_POINT=8;

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

}

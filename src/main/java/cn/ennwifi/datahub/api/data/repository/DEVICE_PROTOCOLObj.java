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
 *         GATEWAY_ID   网关ID Long<br/>
 *         DEVICE_ID   设备ID Long<br/>
 *         TEMPLET_TYPE_ID   模板类型id Long<br/>
 *         FIELD_NAME   字段名称 String<br/>
 *         REGISTER_ADDR   寄存器地址 Integer<br/>
 *         REGISTER_LENGTH   寄存器长度 Integer<br/>
 *         SHOW_NAME   展示的字段名称 String<br/>
 *         COLLECTION_POINT   采集点 String<br/>
 */

@Table("DEVICE_PROTOCOL")
public class DEVICE_PROTOCOLObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_DEVICE_PROTOCOL="DEVICE_PROTOCOL";
  public DEVICE_PROTOCOLObj() {
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
      if (FLD_TEMPLET_TYPE_ID.equals(fieldName)) {
        return TEMPLET_TYPE_ID;
      }
      if (FLD_FIELD_NAME.equals(fieldName)) {
        return FIELD_NAME;
      }
      if (FLD_REGISTER_ADDR.equals(fieldName)) {
        return REGISTER_ADDR;
      }
      if (FLD_REGISTER_LENGTH.equals(fieldName)) {
        return REGISTER_LENGTH;
      }
      if (FLD_SHOW_NAME.equals(fieldName)) {
        return SHOW_NAME;
      }
      if (FLD_COLLECTION_POINT.equals(fieldName)) {
        return COLLECTION_POINT;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 9) {
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
        return TEMPLET_TYPE_ID;
      }
      if (fieldIndex == 4) {
        return FIELD_NAME;
      }
      if (fieldIndex == 5) {
        return REGISTER_ADDR;
      }
      if (fieldIndex == 6) {
        return REGISTER_LENGTH;
      }
      if (fieldIndex == 7) {
        return SHOW_NAME;
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
  public static final Integer IDX_DEVICE_ID=2;

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
   * 字段TEMPLET_TYPE_ID在数据中的名称.
   */
  public static final String FLD_TEMPLET_TYPE_ID="TEMPLET_TYPE_ID";

  /**
   * 获取字段TEMPLET_TYPE_ID的索引值.
   */
  public static final Integer IDX_TEMPLET_TYPE_ID=3;

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
   * 字段REGISTER_ADDR在数据中的名称.
   */
  public static final String FLD_REGISTER_ADDR="REGISTER_ADDR";

  /**
   * 获取字段REGISTER_ADDR的索引值.
   */
  public static final Integer IDX_REGISTER_ADDR=5;

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
  public static final Integer IDX_REGISTER_LENGTH=6;

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
   * 字段SHOW_NAME在数据中的名称.
   */
  public static final String FLD_SHOW_NAME="SHOW_NAME";

  /**
   * 获取字段SHOW_NAME的索引值.
   */
  public static final Integer IDX_SHOW_NAME=7;

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

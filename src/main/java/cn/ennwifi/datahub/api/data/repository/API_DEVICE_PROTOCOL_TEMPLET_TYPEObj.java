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

 *         DEVICE_TYPE_ID   设备类型id Long<br/>
 *         PROTOCOL_TYPE_ID   协议类型id Long<br/>
 *         TEMPLET_TYPE_ID   模板类型id Long<br/>
 *         DEVICE_TYPE_NAME   设备类型名称 String<br/>
 *         PROTOCOL_TYPE_NAME   协议类型名称 String<br/>
 *         TEMPLET_TYPE_NAME   模板类型名称 String<br/>
 */

@Table("API_DEVICE_PROTOCOL_TEMPLET_TYPE")
@PK({"DEVICE_TYPE_ID","PROTOCOL_TYPE_ID"})
public class API_DEVICE_PROTOCOL_TEMPLET_TYPEObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_API_DEVICE_PROTOCOL_TEMPLET_TYPE="API_DEVICE_PROTOCOL_TEMPLET_TYPE";
  public API_DEVICE_PROTOCOL_TEMPLET_TYPEObj() {
  }
  /**
   * 根据字段名称获取字段的值. 
   */
  @Override
  public Object getFieldValue(String fieldName,Integer fieldIndex) {
    if (fieldName != null && fieldName.length() > 0) {
      if (FLD_DEVICE_TYPE_ID.equals(fieldName)) {
        return DEVICE_TYPE_ID;
      }
      if (FLD_PROTOCOL_TYPE_ID.equals(fieldName)) {
        return PROTOCOL_TYPE_ID;
      }
      if (FLD_TEMPLET_TYPE_ID.equals(fieldName)) {
        return TEMPLET_TYPE_ID;
      }
      if (FLD_DEVICE_TYPE_NAME.equals(fieldName)) {
        return DEVICE_TYPE_NAME;
      }
      if (FLD_PROTOCOL_TYPE_NAME.equals(fieldName)) {
        return PROTOCOL_TYPE_NAME;
      }
      if (FLD_TEMPLET_TYPE_NAME.equals(fieldName)) {
        return TEMPLET_TYPE_NAME;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 6) {
      if (fieldIndex == 0) {
        return DEVICE_TYPE_ID;
      }
      if (fieldIndex == 1) {
        return PROTOCOL_TYPE_ID;
      }
      if (fieldIndex == 2) {
        return TEMPLET_TYPE_ID;
      }
      if (fieldIndex == 3) {
        return DEVICE_TYPE_NAME;
      }
      if (fieldIndex == 4) {
        return PROTOCOL_TYPE_NAME;
      }
      if (fieldIndex == 5) {
        return TEMPLET_TYPE_NAME;
      }
    } else {
      return null;
    }
    return null;
  }

  /**
   * 字段DEVICE_TYPE_ID在数据中的名称.
   */
  public static final String FLD_DEVICE_TYPE_ID="DEVICE_TYPE_ID";

  /**
   * 获取字段DEVICE_TYPE_ID的索引值.
   */
  public static final Integer IDX_DEVICE_TYPE_ID=0;

 /**
   * 字段DEVICE_TYPE_ID.
   */
  private Long DEVICE_TYPE_ID;

  /**
   * 返回字段DEVICE_TYPE_ID的值.
   * @return DEVICE_TYPE_ID  设备类型id  bigint
  */
  public Long getDEVICE_TYPE_ID() {
    return DEVICE_TYPE_ID;
  }

  /**
   * 设置字段DEVICE_TYPE_ID的值.
   * @param device_type_id  设备类型id  bigint
   */
  public void setDEVICE_TYPE_ID(Long device_type_id) {
    this.DEVICE_TYPE_ID=device_type_id;
  }

  /**
   * 字段PROTOCOL_TYPE_ID在数据中的名称.
   */
  public static final String FLD_PROTOCOL_TYPE_ID="PROTOCOL_TYPE_ID";

  /**
   * 获取字段PROTOCOL_TYPE_ID的索引值.
   */
  public static final Integer IDX_PROTOCOL_TYPE_ID=1;

 /**
   * 字段PROTOCOL_TYPE_ID.
   */
  private Long PROTOCOL_TYPE_ID;

  /**
   * 返回字段PROTOCOL_TYPE_ID的值.
   * @return PROTOCOL_TYPE_ID  协议类型id  bigint
  */
  public Long getPROTOCOL_TYPE_ID() {
    return PROTOCOL_TYPE_ID;
  }

  /**
   * 设置字段PROTOCOL_TYPE_ID的值.
   * @param protocol_type_id  协议类型id  bigint
   */
  public void setPROTOCOL_TYPE_ID(Long protocol_type_id) {
    this.PROTOCOL_TYPE_ID=protocol_type_id;
  }

  /**
   * 字段TEMPLET_TYPE_ID在数据中的名称.
   */
  public static final String FLD_TEMPLET_TYPE_ID="TEMPLET_TYPE_ID";

  /**
   * 获取字段TEMPLET_TYPE_ID的索引值.
   */
  public static final Integer IDX_TEMPLET_TYPE_ID=2;

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
   * 字段DEVICE_TYPE_NAME在数据中的名称.
   */
  public static final String FLD_DEVICE_TYPE_NAME="DEVICE_TYPE_NAME";

  /**
   * 获取字段DEVICE_TYPE_NAME的索引值.
   */
  public static final Integer IDX_DEVICE_TYPE_NAME=3;

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

  /**
   * 字段PROTOCOL_TYPE_NAME在数据中的名称.
   */
  public static final String FLD_PROTOCOL_TYPE_NAME="PROTOCOL_TYPE_NAME";

  /**
   * 获取字段PROTOCOL_TYPE_NAME的索引值.
   */
  public static final Integer IDX_PROTOCOL_TYPE_NAME=4;

 /**
   * 字段PROTOCOL_TYPE_NAME.
   */
  private String PROTOCOL_TYPE_NAME;

  /**
   * 返回字段PROTOCOL_TYPE_NAME的值.
   * @return PROTOCOL_TYPE_NAME  协议类型名称  varchar
  */
  public String getPROTOCOL_TYPE_NAME() {
    return PROTOCOL_TYPE_NAME;
  }

  /**
   * 设置字段PROTOCOL_TYPE_NAME的值.
   * @param protocol_type_name  协议类型名称  varchar
   */
  public void setPROTOCOL_TYPE_NAME(String protocol_type_name) {
    this.PROTOCOL_TYPE_NAME=protocol_type_name;
  }

  /**
   * 字段TEMPLET_TYPE_NAME在数据中的名称.
   */
  public static final String FLD_TEMPLET_TYPE_NAME="TEMPLET_TYPE_NAME";

  /**
   * 获取字段TEMPLET_TYPE_NAME的索引值.
   */
  public static final Integer IDX_TEMPLET_TYPE_NAME=5;

 /**
   * 字段TEMPLET_TYPE_NAME.
   */
  private String TEMPLET_TYPE_NAME;

  /**
   * 返回字段TEMPLET_TYPE_NAME的值.
   * @return TEMPLET_TYPE_NAME  模板类型名称  varchar
  */
  public String getTEMPLET_TYPE_NAME() {
    return TEMPLET_TYPE_NAME;
  }

  /**
   * 设置字段TEMPLET_TYPE_NAME的值.
   * @param templet_type_name  模板类型名称  varchar
   */
  public void setTEMPLET_TYPE_NAME(String templet_type_name) {
    this.TEMPLET_TYPE_NAME=templet_type_name;
  }

}

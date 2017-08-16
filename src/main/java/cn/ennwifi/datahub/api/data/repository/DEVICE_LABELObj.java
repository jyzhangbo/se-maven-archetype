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

 *         ID   设备标签表ID Long<br/>
 *         GATEWAY_ID   网关id Long<br/>
 *         DEVICE_ID   设备id Long<br/>
 *         LABEL_NAME   标签名称 String<br/>
 *         VALUE   值 String<br/>
 */

@Table("DEVICE_LABEL")
public class DEVICE_LABELObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_DEVICE_LABEL="DEVICE_LABEL";
  public DEVICE_LABELObj() {
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
      if (FLD_LABEL_NAME.equals(fieldName)) {
        return LABEL_NAME;
      }
      if (FLD_VALUE.equals(fieldName)) {
        return VALUE;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 5) {
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
        return LABEL_NAME;
      }
      if (fieldIndex == 4) {
        return VALUE;
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
   * @return ID  设备标签表ID  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  设备标签表ID  bigint
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
   * @return GATEWAY_ID  网关id  bigint
  */
  public Long getGATEWAY_ID() {
    return GATEWAY_ID;
  }

  /**
   * 设置字段GATEWAY_ID的值.
   * @param gateway_id  网关id  bigint
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
   * @return DEVICE_ID  设备id  bigint
  */
  public Long getDEVICE_ID() {
    return DEVICE_ID;
  }

  /**
   * 设置字段DEVICE_ID的值.
   * @param device_id  设备id  bigint
   */
  public void setDEVICE_ID(Long device_id) {
    this.DEVICE_ID=device_id;
  }

  /**
   * 字段LABEL_NAME在数据中的名称.
   */
  public static final String FLD_LABEL_NAME="LABEL_NAME";

  /**
   * 获取字段LABEL_NAME的索引值.
   */
  public static final Integer IDX_LABEL_NAME=3;

 /**
   * 字段LABEL_NAME.
   */
  private String LABEL_NAME;

  /**
   * 返回字段LABEL_NAME的值.
   * @return LABEL_NAME  标签名称  varchar
  */
  public String getLABEL_NAME() {
    return LABEL_NAME;
  }

  /**
   * 设置字段LABEL_NAME的值.
   * @param label_name  标签名称  varchar
   */
  public void setLABEL_NAME(String label_name) {
    this.LABEL_NAME=label_name;
  }

  /**
   * 字段VALUE在数据中的名称.
   */
  public static final String FLD_VALUE="VALUE";

  /**
   * 获取字段VALUE的索引值.
   */
  public static final Integer IDX_VALUE=4;

 /**
   * 字段VALUE.
   */
  private String VALUE;

  /**
   * 返回字段VALUE的值.
   * @return VALUE  值  varchar
  */
  public String getVALUE() {
    return VALUE;
  }

  /**
   * 设置字段VALUE的值.
   * @param value  值  varchar
   */
  public void setVALUE(String value) {
    this.VALUE=value;
  }

}

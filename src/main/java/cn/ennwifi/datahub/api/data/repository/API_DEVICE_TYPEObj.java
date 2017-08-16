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

 *         ID   设备类型ID Long<br/>
 *         DEVICE_TYPE_NAME   设备类型名称 String<br/>
 */

@Table("API_DEVICE_TYPE")
public class API_DEVICE_TYPEObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_API_DEVICE_TYPE="API_DEVICE_TYPE";
  public API_DEVICE_TYPEObj() {
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
      if (FLD_DEVICE_TYPE_NAME.equals(fieldName)) {
        return DEVICE_TYPE_NAME;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 2) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return DEVICE_TYPE_NAME;
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
   * @return ID  设备类型ID  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  设备类型ID  bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段DEVICE_TYPE_NAME在数据中的名称.
   */
  public static final String FLD_DEVICE_TYPE_NAME="DEVICE_TYPE_NAME";

  /**
   * 获取字段DEVICE_TYPE_NAME的索引值.
   */
  public static final Integer IDX_DEVICE_TYPE_NAME=1;

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

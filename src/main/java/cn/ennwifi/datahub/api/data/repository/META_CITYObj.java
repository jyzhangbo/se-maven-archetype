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

 *         ID    Long<br/>
 *         CITY_NAME   城市名称 String<br/>
 *         PROVINCE_ID   省id Long<br/>
 */

@Table("META_CITY")
public class META_CITYObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_META_CITY="META_CITY";
  public META_CITYObj() {
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
      if (FLD_CITY_NAME.equals(fieldName)) {
        return CITY_NAME;
      }
      if (FLD_PROVINCE_ID.equals(fieldName)) {
        return PROVINCE_ID;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 3) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return CITY_NAME;
      }
      if (fieldIndex == 2) {
        return PROVINCE_ID;
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
   * @return ID    bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id    bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段CITY_NAME在数据中的名称.
   */
  public static final String FLD_CITY_NAME="CITY_NAME";

  /**
   * 获取字段CITY_NAME的索引值.
   */
  public static final Integer IDX_CITY_NAME=1;

 /**
   * 字段CITY_NAME.
   */
  private String CITY_NAME;

  /**
   * 返回字段CITY_NAME的值.
   * @return CITY_NAME  城市名称  varchar
  */
  public String getCITY_NAME() {
    return CITY_NAME;
  }

  /**
   * 设置字段CITY_NAME的值.
   * @param city_name  城市名称  varchar
   */
  public void setCITY_NAME(String city_name) {
    this.CITY_NAME=city_name;
  }

  /**
   * 字段PROVINCE_ID在数据中的名称.
   */
  public static final String FLD_PROVINCE_ID="PROVINCE_ID";

  /**
   * 获取字段PROVINCE_ID的索引值.
   */
  public static final Integer IDX_PROVINCE_ID=2;

 /**
   * 字段PROVINCE_ID.
   */
  private Long PROVINCE_ID;

  /**
   * 返回字段PROVINCE_ID的值.
   * @return PROVINCE_ID  省id  bigint
  */
  public Long getPROVINCE_ID() {
    return PROVINCE_ID;
  }

  /**
   * 设置字段PROVINCE_ID的值.
   * @param province_id  省id  bigint
   */
  public void setPROVINCE_ID(Long province_id) {
    this.PROVINCE_ID=province_id;
  }

}

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

 *         ID   省id Long<br/>
 *         PROVINCE_NAME   省名称 String<br/>
 */

@Table("META_PROVINCE")
public class META_PROVINCEObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_META_PROVINCE="META_PROVINCE";
  public META_PROVINCEObj() {
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
      if (FLD_PROVINCE_NAME.equals(fieldName)) {
        return PROVINCE_NAME;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 2) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return PROVINCE_NAME;
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
   * @return ID  省id  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  省id  bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段PROVINCE_NAME在数据中的名称.
   */
  public static final String FLD_PROVINCE_NAME="PROVINCE_NAME";

  /**
   * 获取字段PROVINCE_NAME的索引值.
   */
  public static final Integer IDX_PROVINCE_NAME=1;

 /**
   * 字段PROVINCE_NAME.
   */
  private String PROVINCE_NAME;

  /**
   * 返回字段PROVINCE_NAME的值.
   * @return PROVINCE_NAME  省名称  varchar
  */
  public String getPROVINCE_NAME() {
    return PROVINCE_NAME;
  }

  /**
   * 设置字段PROVINCE_NAME的值.
   * @param province_name  省名称  varchar
   */
  public void setPROVINCE_NAME(String province_name) {
    this.PROVINCE_NAME=province_name;
  }

}

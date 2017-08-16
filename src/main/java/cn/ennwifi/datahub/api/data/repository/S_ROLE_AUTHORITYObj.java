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

 *         ROLE_ID    Long<br/>
 *         AUTHORITY_ID    Long<br/>
 */

@Table("S_ROLE_AUTHORITY")
@PK({"ROLE_ID","AUTHORITY_ID"})
public class S_ROLE_AUTHORITYObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_S_ROLE_AUTHORITY="S_ROLE_AUTHORITY";
  public S_ROLE_AUTHORITYObj() {
  }
  /**
   * 根据字段名称获取字段的值. 
   */
  @Override
  public Object getFieldValue(String fieldName,Integer fieldIndex) {
    if (fieldName != null && fieldName.length() > 0) {
      if (FLD_ROLE_ID.equals(fieldName)) {
        return ROLE_ID;
      }
      if (FLD_AUTHORITY_ID.equals(fieldName)) {
        return AUTHORITY_ID;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 2) {
      if (fieldIndex == 0) {
        return ROLE_ID;
      }
      if (fieldIndex == 1) {
        return AUTHORITY_ID;
      }
    } else {
      return null;
    }
    return null;
  }

  /**
   * 字段ROLE_ID在数据中的名称.
   */
  public static final String FLD_ROLE_ID="ROLE_ID";

  /**
   * 获取字段ROLE_ID的索引值.
   */
  public static final Integer IDX_ROLE_ID=0;

 /**
   * 字段ROLE_ID.
   */
  private Long ROLE_ID;

  /**
   * 返回字段ROLE_ID的值.
   * @return ROLE_ID    bigint
  */
  public Long getROLE_ID() {
    return ROLE_ID;
  }

  /**
   * 设置字段ROLE_ID的值.
   * @param role_id    bigint
   */
  public void setROLE_ID(Long role_id) {
    this.ROLE_ID=role_id;
  }

  /**
   * 字段AUTHORITY_ID在数据中的名称.
   */
  public static final String FLD_AUTHORITY_ID="AUTHORITY_ID";

  /**
   * 获取字段AUTHORITY_ID的索引值.
   */
  public static final Integer IDX_AUTHORITY_ID=1;

 /**
   * 字段AUTHORITY_ID.
   */
  private Long AUTHORITY_ID;

  /**
   * 返回字段AUTHORITY_ID的值.
   * @return AUTHORITY_ID    bigint
  */
  public Long getAUTHORITY_ID() {
    return AUTHORITY_ID;
  }

  /**
   * 设置字段AUTHORITY_ID的值.
   * @param authority_id    bigint
   */
  public void setAUTHORITY_ID(Long authority_id) {
    this.AUTHORITY_ID=authority_id;
  }

}

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

 *         ID   大区ID Long<br/>
 *         NAME   大区名称 String<br/>
 *         ORDER_NUM   排序号码 Integer<br/>
 */

@Table("META_AREAS")
public class META_AREASObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_META_AREAS="META_AREAS";
  public META_AREASObj() {
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
      if (FLD_NAME.equals(fieldName)) {
        return NAME;
      }
      if (FLD_ORDER_NUM.equals(fieldName)) {
        return ORDER_NUM;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 3) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return NAME;
      }
      if (fieldIndex == 2) {
        return ORDER_NUM;
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
   * @return ID  大区ID  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  大区ID  bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段NAME在数据中的名称.
   */
  public static final String FLD_NAME="NAME";

  /**
   * 获取字段NAME的索引值.
   */
  public static final Integer IDX_NAME=1;

 /**
   * 字段NAME.
   */
  private String NAME;

  /**
   * 返回字段NAME的值.
   * @return NAME  大区名称  varchar
  */
  public String getNAME() {
    return NAME;
  }

  /**
   * 设置字段NAME的值.
   * @param name  大区名称  varchar
   */
  public void setNAME(String name) {
    this.NAME=name;
  }

  /**
   * 字段ORDER_NUM在数据中的名称.
   */
  public static final String FLD_ORDER_NUM="ORDER_NUM";

  /**
   * 获取字段ORDER_NUM的索引值.
   */
  public static final Integer IDX_ORDER_NUM=2;

 /**
   * 字段ORDER_NUM.
   */
  private Integer ORDER_NUM;

  /**
   * 返回字段ORDER_NUM的值.
   * @return ORDER_NUM  排序号码  int
  */
  public Integer getORDER_NUM() {
    return ORDER_NUM;
  }

  /**
   * 设置字段ORDER_NUM的值.
   * @param order_num  排序号码  int
   */
  public void setORDER_NUM(Integer order_num) {
    this.ORDER_NUM=order_num;
  }

}

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

 *         ID   用户类型ID Long<br/>
 *         TYPE_CODE   类型code String<br/>
 *         TYPE_NAME   类型名称 String<br/>
 *         SHOW_NAME   显示名称 String<br/>
 */

@Table("S_USER_TYPE")
public class S_USER_TYPEObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_S_USER_TYPE="S_USER_TYPE";
  public S_USER_TYPEObj() {
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
      if (FLD_TYPE_CODE.equals(fieldName)) {
        return TYPE_CODE;
      }
      if (FLD_TYPE_NAME.equals(fieldName)) {
        return TYPE_NAME;
      }
      if (FLD_SHOW_NAME.equals(fieldName)) {
        return SHOW_NAME;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 4) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return TYPE_CODE;
      }
      if (fieldIndex == 2) {
        return TYPE_NAME;
      }
      if (fieldIndex == 3) {
        return SHOW_NAME;
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
   * @return ID  用户类型ID  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  用户类型ID  bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段TYPE_CODE在数据中的名称.
   */
  public static final String FLD_TYPE_CODE="TYPE_CODE";

  /**
   * 获取字段TYPE_CODE的索引值.
   */
  public static final Integer IDX_TYPE_CODE=1;

 /**
   * 字段TYPE_CODE.
   */
  private String TYPE_CODE;

  /**
   * 返回字段TYPE_CODE的值.
   * @return TYPE_CODE  类型code  varchar
  */
  public String getTYPE_CODE() {
    return TYPE_CODE;
  }

  /**
   * 设置字段TYPE_CODE的值.
   * @param type_code  类型code  varchar
   */
  public void setTYPE_CODE(String type_code) {
    this.TYPE_CODE=type_code;
  }

  /**
   * 字段TYPE_NAME在数据中的名称.
   */
  public static final String FLD_TYPE_NAME="TYPE_NAME";

  /**
   * 获取字段TYPE_NAME的索引值.
   */
  public static final Integer IDX_TYPE_NAME=2;

 /**
   * 字段TYPE_NAME.
   */
  private String TYPE_NAME;

  /**
   * 返回字段TYPE_NAME的值.
   * @return TYPE_NAME  类型名称  varchar
  */
  public String getTYPE_NAME() {
    return TYPE_NAME;
  }

  /**
   * 设置字段TYPE_NAME的值.
   * @param type_name  类型名称  varchar
   */
  public void setTYPE_NAME(String type_name) {
    this.TYPE_NAME=type_name;
  }

  /**
   * 字段SHOW_NAME在数据中的名称.
   */
  public static final String FLD_SHOW_NAME="SHOW_NAME";

  /**
   * 获取字段SHOW_NAME的索引值.
   */
  public static final Integer IDX_SHOW_NAME=3;

 /**
   * 字段SHOW_NAME.
   */
  private String SHOW_NAME;

  /**
   * 返回字段SHOW_NAME的值.
   * @return SHOW_NAME  显示名称  varchar
  */
  public String getSHOW_NAME() {
    return SHOW_NAME;
  }

  /**
   * 设置字段SHOW_NAME的值.
   * @param show_name  显示名称  varchar
   */
  public void setSHOW_NAME(String show_name) {
    this.SHOW_NAME=show_name;
  }

}

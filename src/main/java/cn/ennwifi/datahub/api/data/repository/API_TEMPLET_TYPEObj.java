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

 *         ID   模板类型id Long<br/>
 *         TEMPLET_NAME   模板名称 String<br/>
 *         PROTOCOL_ID   协议类型id Long<br/>
 *         PROTOCOL_NAME   协议类型名称 String<br/>
 */

@Table("API_TEMPLET_TYPE")
public class API_TEMPLET_TYPEObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_API_TEMPLET_TYPE="API_TEMPLET_TYPE";
  public API_TEMPLET_TYPEObj() {
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
      if (FLD_TEMPLET_NAME.equals(fieldName)) {
        return TEMPLET_NAME;
      }
      if (FLD_PROTOCOL_ID.equals(fieldName)) {
        return PROTOCOL_ID;
      }
      if (FLD_PROTOCOL_NAME.equals(fieldName)) {
        return PROTOCOL_NAME;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 4) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return TEMPLET_NAME;
      }
      if (fieldIndex == 2) {
        return PROTOCOL_ID;
      }
      if (fieldIndex == 3) {
        return PROTOCOL_NAME;
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
   * @return ID  模板类型id  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  模板类型id  bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段TEMPLET_NAME在数据中的名称.
   */
  public static final String FLD_TEMPLET_NAME="TEMPLET_NAME";

  /**
   * 获取字段TEMPLET_NAME的索引值.
   */
  public static final Integer IDX_TEMPLET_NAME=1;

 /**
   * 字段TEMPLET_NAME.
   */
  private String TEMPLET_NAME;

  /**
   * 返回字段TEMPLET_NAME的值.
   * @return TEMPLET_NAME  模板名称  varchar
  */
  public String getTEMPLET_NAME() {
    return TEMPLET_NAME;
  }

  /**
   * 设置字段TEMPLET_NAME的值.
   * @param templet_name  模板名称  varchar
   */
  public void setTEMPLET_NAME(String templet_name) {
    this.TEMPLET_NAME=templet_name;
  }

  /**
   * 字段PROTOCOL_ID在数据中的名称.
   */
  public static final String FLD_PROTOCOL_ID="PROTOCOL_ID";

  /**
   * 获取字段PROTOCOL_ID的索引值.
   */
  public static final Integer IDX_PROTOCOL_ID=2;

 /**
   * 字段PROTOCOL_ID.
   */
  private Long PROTOCOL_ID;

  /**
   * 返回字段PROTOCOL_ID的值.
   * @return PROTOCOL_ID  协议类型id  bigint
  */
  public Long getPROTOCOL_ID() {
    return PROTOCOL_ID;
  }

  /**
   * 设置字段PROTOCOL_ID的值.
   * @param protocol_id  协议类型id  bigint
   */
  public void setPROTOCOL_ID(Long protocol_id) {
    this.PROTOCOL_ID=protocol_id;
  }

  /**
   * 字段PROTOCOL_NAME在数据中的名称.
   */
  public static final String FLD_PROTOCOL_NAME="PROTOCOL_NAME";

  /**
   * 获取字段PROTOCOL_NAME的索引值.
   */
  public static final Integer IDX_PROTOCOL_NAME=3;

 /**
   * 字段PROTOCOL_NAME.
   */
  private String PROTOCOL_NAME;

  /**
   * 返回字段PROTOCOL_NAME的值.
   * @return PROTOCOL_NAME  协议类型名称  varchar
  */
  public String getPROTOCOL_NAME() {
    return PROTOCOL_NAME;
  }

  /**
   * 设置字段PROTOCOL_NAME的值.
   * @param protocol_name  协议类型名称  varchar
   */
  public void setPROTOCOL_NAME(String protocol_name) {
    this.PROTOCOL_NAME=protocol_name;
  }

}

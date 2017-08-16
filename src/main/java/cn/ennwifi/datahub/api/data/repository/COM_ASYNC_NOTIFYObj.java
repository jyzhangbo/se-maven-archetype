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

 *         ID   操作序列ID Long<br/>
 *         TYPE   通信类型 Integer<br/>
 *         NEXT_CHECK_TIME   下一次检查时间 Long<br/>
 *         CONTENT   通知内容 String<br/>
 *         C_TIME   创建时间 java.sql.Timestamp<br/>
 *         DEVICE_ID   设备ID Long<br/>
 *         SEQUENCE_NO   序列号 String<br/>
 */

@Table("COM_ASYNC_NOTIFY")
public class COM_ASYNC_NOTIFYObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_COM_ASYNC_NOTIFY="COM_ASYNC_NOTIFY";
  public COM_ASYNC_NOTIFYObj() {
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
      if (FLD_TYPE.equals(fieldName)) {
        return TYPE;
      }
      if (FLD_NEXT_CHECK_TIME.equals(fieldName)) {
        return NEXT_CHECK_TIME;
      }
      if (FLD_CONTENT.equals(fieldName)) {
        return CONTENT;
      }
      if (FLD_C_TIME.equals(fieldName)) {
        return C_TIME;
      }
      if (FLD_DEVICE_ID.equals(fieldName)) {
        return DEVICE_ID;
      }
      if (FLD_SEQUENCE_NO.equals(fieldName)) {
        return SEQUENCE_NO;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 7) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return TYPE;
      }
      if (fieldIndex == 2) {
        return NEXT_CHECK_TIME;
      }
      if (fieldIndex == 3) {
        return CONTENT;
      }
      if (fieldIndex == 4) {
        return C_TIME;
      }
      if (fieldIndex == 5) {
        return DEVICE_ID;
      }
      if (fieldIndex == 6) {
        return SEQUENCE_NO;
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
   * @return ID  操作序列ID  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  操作序列ID  bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段TYPE在数据中的名称.
   */
  public static final String FLD_TYPE="TYPE";

  /**
   * 获取字段TYPE的索引值.
   */
  public static final Integer IDX_TYPE=1;

 /**
   * 字段TYPE.
   */
  private Integer TYPE;

  /**
   * 返回字段TYPE的值.
   * @return TYPE  通信类型  int
  */
  public Integer getTYPE() {
    return TYPE;
  }

  /**
   * 设置字段TYPE的值.
   * @param type  通信类型  int
   */
  public void setTYPE(Integer type) {
    this.TYPE=type;
  }

  /**
   * 字段NEXT_CHECK_TIME在数据中的名称.
   */
  public static final String FLD_NEXT_CHECK_TIME="NEXT_CHECK_TIME";

  /**
   * 获取字段NEXT_CHECK_TIME的索引值.
   */
  public static final Integer IDX_NEXT_CHECK_TIME=2;

 /**
   * 字段NEXT_CHECK_TIME.
   */
  private Long NEXT_CHECK_TIME;

  /**
   * 返回字段NEXT_CHECK_TIME的值.
   * @return NEXT_CHECK_TIME  下一次检查时间  bigint
  */
  public Long getNEXT_CHECK_TIME() {
    return NEXT_CHECK_TIME;
  }

  /**
   * 设置字段NEXT_CHECK_TIME的值.
   * @param next_check_time  下一次检查时间  bigint
   */
  public void setNEXT_CHECK_TIME(Long next_check_time) {
    this.NEXT_CHECK_TIME=next_check_time;
  }

  /**
   * 字段CONTENT在数据中的名称.
   */
  public static final String FLD_CONTENT="CONTENT";

  /**
   * 获取字段CONTENT的索引值.
   */
  public static final Integer IDX_CONTENT=3;

 /**
   * 字段CONTENT.
   */
  private String CONTENT;

  /**
   * 返回字段CONTENT的值.
   * @return CONTENT  通知内容  varchar
  */
  public String getCONTENT() {
    return CONTENT;
  }

  /**
   * 设置字段CONTENT的值.
   * @param content  通知内容  varchar
   */
  public void setCONTENT(String content) {
    this.CONTENT=content;
  }

  /**
   * 字段C_TIME在数据中的名称.
   */
  public static final String FLD_C_TIME="C_TIME";

  /**
   * 获取字段C_TIME的索引值.
   */
  public static final Integer IDX_C_TIME=4;

 /**
   * 字段C_TIME.
   */
  private java.sql.Timestamp C_TIME;

  /**
   * 返回字段C_TIME的值.
   * @return C_TIME  创建时间  timestamp
  */
  public java.sql.Timestamp getC_TIME() {
    return C_TIME;
  }

  /**
   * 设置字段C_TIME的值.
   * @param c_time  创建时间  timestamp
   */
  public void setC_TIME(java.sql.Timestamp c_time) {
    this.C_TIME=c_time;
  }

  /**
   * 字段DEVICE_ID在数据中的名称.
   */
  public static final String FLD_DEVICE_ID="DEVICE_ID";

  /**
   * 获取字段DEVICE_ID的索引值.
   */
  public static final Integer IDX_DEVICE_ID=5;

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
   * 字段SEQUENCE_NO在数据中的名称.
   */
  public static final String FLD_SEQUENCE_NO="SEQUENCE_NO";

  /**
   * 获取字段SEQUENCE_NO的索引值.
   */
  public static final Integer IDX_SEQUENCE_NO=6;

 /**
   * 字段SEQUENCE_NO.
   */
  private String SEQUENCE_NO;

  /**
   * 返回字段SEQUENCE_NO的值.
   * @return SEQUENCE_NO  序列号  varchar
  */
  public String getSEQUENCE_NO() {
    return SEQUENCE_NO;
  }

  /**
   * 设置字段SEQUENCE_NO的值.
   * @param sequence_no  序列号  varchar
   */
  public void setSEQUENCE_NO(String sequence_no) {
    this.SEQUENCE_NO=sequence_no;
  }

}

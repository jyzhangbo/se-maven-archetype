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

 *         ID   设备报警ID Long<br/>
 *         DEVICE_ID   设备id Long<br/>
 *         DEVICE_NO   设备编号 String<br/>
 *         GATEWAY_ID   网关id Long<br/>
 *         USER_ID   用户id Long<br/>
 *         ALARM_TIME   报警时间 java.sql.Timestamp<br/>
 *         ALARM_MSG   报警内容 String<br/>
 */

@Table("DEVICE_ALARM")
public class DEVICE_ALARMObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_DEVICE_ALARM="DEVICE_ALARM";
  public DEVICE_ALARMObj() {
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
      if (FLD_DEVICE_ID.equals(fieldName)) {
        return DEVICE_ID;
      }
      if (FLD_DEVICE_NO.equals(fieldName)) {
        return DEVICE_NO;
      }
      if (FLD_GATEWAY_ID.equals(fieldName)) {
        return GATEWAY_ID;
      }
      if (FLD_USER_ID.equals(fieldName)) {
        return USER_ID;
      }
      if (FLD_ALARM_TIME.equals(fieldName)) {
        return ALARM_TIME;
      }
      if (FLD_ALARM_MSG.equals(fieldName)) {
        return ALARM_MSG;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 7) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return DEVICE_ID;
      }
      if (fieldIndex == 2) {
        return DEVICE_NO;
      }
      if (fieldIndex == 3) {
        return GATEWAY_ID;
      }
      if (fieldIndex == 4) {
        return USER_ID;
      }
      if (fieldIndex == 5) {
        return ALARM_TIME;
      }
      if (fieldIndex == 6) {
        return ALARM_MSG;
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
   * @return ID  设备报警ID  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  设备报警ID  bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段DEVICE_ID在数据中的名称.
   */
  public static final String FLD_DEVICE_ID="DEVICE_ID";

  /**
   * 获取字段DEVICE_ID的索引值.
   */
  public static final Integer IDX_DEVICE_ID=1;

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
   * 字段DEVICE_NO在数据中的名称.
   */
  public static final String FLD_DEVICE_NO="DEVICE_NO";

  /**
   * 获取字段DEVICE_NO的索引值.
   */
  public static final Integer IDX_DEVICE_NO=2;

 /**
   * 字段DEVICE_NO.
   */
  private String DEVICE_NO;

  /**
   * 返回字段DEVICE_NO的值.
   * @return DEVICE_NO  设备编号  varchar
  */
  public String getDEVICE_NO() {
    return DEVICE_NO;
  }

  /**
   * 设置字段DEVICE_NO的值.
   * @param device_no  设备编号  varchar
   */
  public void setDEVICE_NO(String device_no) {
    this.DEVICE_NO=device_no;
  }

  /**
   * 字段GATEWAY_ID在数据中的名称.
   */
  public static final String FLD_GATEWAY_ID="GATEWAY_ID";

  /**
   * 获取字段GATEWAY_ID的索引值.
   */
  public static final Integer IDX_GATEWAY_ID=3;

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
   * 字段USER_ID在数据中的名称.
   */
  public static final String FLD_USER_ID="USER_ID";

  /**
   * 获取字段USER_ID的索引值.
   */
  public static final Integer IDX_USER_ID=4;

 /**
   * 字段USER_ID.
   */
  private Long USER_ID;

  /**
   * 返回字段USER_ID的值.
   * @return USER_ID  用户id  bigint
  */
  public Long getUSER_ID() {
    return USER_ID;
  }

  /**
   * 设置字段USER_ID的值.
   * @param user_id  用户id  bigint
   */
  public void setUSER_ID(Long user_id) {
    this.USER_ID=user_id;
  }

  /**
   * 字段ALARM_TIME在数据中的名称.
   */
  public static final String FLD_ALARM_TIME="ALARM_TIME";

  /**
   * 获取字段ALARM_TIME的索引值.
   */
  public static final Integer IDX_ALARM_TIME=5;

 /**
   * 字段ALARM_TIME.
   */
  private java.sql.Timestamp ALARM_TIME;

  /**
   * 返回字段ALARM_TIME的值.
   * @return ALARM_TIME  报警时间  timestamp
  */
  public java.sql.Timestamp getALARM_TIME() {
    return ALARM_TIME;
  }

  /**
   * 设置字段ALARM_TIME的值.
   * @param alarm_time  报警时间  timestamp
   */
  public void setALARM_TIME(java.sql.Timestamp alarm_time) {
    this.ALARM_TIME=alarm_time;
  }

  /**
   * 字段ALARM_MSG在数据中的名称.
   */
  public static final String FLD_ALARM_MSG="ALARM_MSG";

  /**
   * 获取字段ALARM_MSG的索引值.
   */
  public static final Integer IDX_ALARM_MSG=6;

 /**
   * 字段ALARM_MSG.
   */
  private String ALARM_MSG;

  /**
   * 返回字段ALARM_MSG的值.
   * @return ALARM_MSG  报警内容  varchar
  */
  public String getALARM_MSG() {
    return ALARM_MSG;
  }

  /**
   * 设置字段ALARM_MSG的值.
   * @param alarm_msg  报警内容  varchar
   */
  public void setALARM_MSG(String alarm_msg) {
    this.ALARM_MSG=alarm_msg;
  }

}

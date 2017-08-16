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

 *         GATEWAY_ID   网关ID Long<br/>
 *         DEVICE_ID   设备ID Long<br/>
 *         BIND_TIME   绑定时间 java.sql.Timestamp<br/>
 *         UNBIND_TIME   解绑时间 java.sql.Timestamp<br/>
 */

@Table("GATEWAY_DEVICE_HISTORY")
@PK({"GATEWAY_ID","DEVICE_ID","BIND_TIME"})
public class GATEWAY_DEVICE_HISTORYObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_GATEWAY_DEVICE_HISTORY="GATEWAY_DEVICE_HISTORY";
  public GATEWAY_DEVICE_HISTORYObj() {
  }
  /**
   * 根据字段名称获取字段的值. 
   */
  @Override
  public Object getFieldValue(String fieldName,Integer fieldIndex) {
    if (fieldName != null && fieldName.length() > 0) {
      if (FLD_GATEWAY_ID.equals(fieldName)) {
        return GATEWAY_ID;
      }
      if (FLD_DEVICE_ID.equals(fieldName)) {
        return DEVICE_ID;
      }
      if (FLD_BIND_TIME.equals(fieldName)) {
        return BIND_TIME;
      }
      if (FLD_UNBIND_TIME.equals(fieldName)) {
        return UNBIND_TIME;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 4) {
      if (fieldIndex == 0) {
        return GATEWAY_ID;
      }
      if (fieldIndex == 1) {
        return DEVICE_ID;
      }
      if (fieldIndex == 2) {
        return BIND_TIME;
      }
      if (fieldIndex == 3) {
        return UNBIND_TIME;
      }
    } else {
      return null;
    }
    return null;
  }

  /**
   * 字段GATEWAY_ID在数据中的名称.
   */
  public static final String FLD_GATEWAY_ID="GATEWAY_ID";

  /**
   * 获取字段GATEWAY_ID的索引值.
   */
  public static final Integer IDX_GATEWAY_ID=0;

 /**
   * 字段GATEWAY_ID.
   */
  private Long GATEWAY_ID;

  /**
   * 返回字段GATEWAY_ID的值.
   * @return GATEWAY_ID  网关ID  bigint
  */
  public Long getGATEWAY_ID() {
    return GATEWAY_ID;
  }

  /**
   * 设置字段GATEWAY_ID的值.
   * @param gateway_id  网关ID  bigint
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
  public static final Integer IDX_DEVICE_ID=1;

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
   * 字段BIND_TIME在数据中的名称.
   */
  public static final String FLD_BIND_TIME="BIND_TIME";

  /**
   * 获取字段BIND_TIME的索引值.
   */
  public static final Integer IDX_BIND_TIME=2;

 /**
   * 字段BIND_TIME.
   */
  private java.sql.Timestamp BIND_TIME;

  /**
   * 返回字段BIND_TIME的值.
   * @return BIND_TIME  绑定时间  timestamp
  */
  public java.sql.Timestamp getBIND_TIME() {
    return BIND_TIME;
  }

  /**
   * 设置字段BIND_TIME的值.
   * @param bind_time  绑定时间  timestamp
   */
  public void setBIND_TIME(java.sql.Timestamp bind_time) {
    this.BIND_TIME=bind_time;
  }

  /**
   * 字段UNBIND_TIME在数据中的名称.
   */
  public static final String FLD_UNBIND_TIME="UNBIND_TIME";

  /**
   * 获取字段UNBIND_TIME的索引值.
   */
  public static final Integer IDX_UNBIND_TIME=3;

 /**
   * 字段UNBIND_TIME.
   */
  private java.sql.Timestamp UNBIND_TIME;

  /**
   * 返回字段UNBIND_TIME的值.
   * @return UNBIND_TIME  解绑时间  timestamp
  */
  public java.sql.Timestamp getUNBIND_TIME() {
    return UNBIND_TIME;
  }

  /**
   * 设置字段UNBIND_TIME的值.
   * @param unbind_time  解绑时间  timestamp
   */
  public void setUNBIND_TIME(java.sql.Timestamp unbind_time) {
    this.UNBIND_TIME=unbind_time;
  }

}

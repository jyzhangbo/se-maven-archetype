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

 *         ID   网关是否在线ID Long<br/>
 *         GATEWAY_ID   网关id Long<br/>
 *         CREATE_TIME   在线离线时间 java.sql.Timestamp<br/>
 *         IS_ONLINE   在线状态 0:离线 1:在线 Integer<br/>
 */

@Table("GATEWAY_ISONLINE")
public class GATEWAY_ISONLINEObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_GATEWAY_ISONLINE="GATEWAY_ISONLINE";
  public GATEWAY_ISONLINEObj() {
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
      if (FLD_GATEWAY_ID.equals(fieldName)) {
        return GATEWAY_ID;
      }
      if (FLD_CREATE_TIME.equals(fieldName)) {
        return CREATE_TIME;
      }
      if (FLD_IS_ONLINE.equals(fieldName)) {
        return IS_ONLINE;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 4) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return GATEWAY_ID;
      }
      if (fieldIndex == 2) {
        return CREATE_TIME;
      }
      if (fieldIndex == 3) {
        return IS_ONLINE;
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
   * @return ID  网关是否在线ID  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  网关是否在线ID  bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段GATEWAY_ID在数据中的名称.
   */
  public static final String FLD_GATEWAY_ID="GATEWAY_ID";

  /**
   * 获取字段GATEWAY_ID的索引值.
   */
  public static final Integer IDX_GATEWAY_ID=1;

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
   * 字段CREATE_TIME在数据中的名称.
   */
  public static final String FLD_CREATE_TIME="CREATE_TIME";

  /**
   * 获取字段CREATE_TIME的索引值.
   */
  public static final Integer IDX_CREATE_TIME=2;

 /**
   * 字段CREATE_TIME.
   */
  private java.sql.Timestamp CREATE_TIME;

  /**
   * 返回字段CREATE_TIME的值.
   * @return CREATE_TIME  在线离线时间  timestamp
  */
  public java.sql.Timestamp getCREATE_TIME() {
    return CREATE_TIME;
  }

  /**
   * 设置字段CREATE_TIME的值.
   * @param create_time  在线离线时间  timestamp
   */
  public void setCREATE_TIME(java.sql.Timestamp create_time) {
    this.CREATE_TIME=create_time;
  }

  /**
   * 字段IS_ONLINE在数据中的名称.
   */
  public static final String FLD_IS_ONLINE="IS_ONLINE";

  /**
   * 获取字段IS_ONLINE的索引值.
   */
  public static final Integer IDX_IS_ONLINE=3;

 /**
   * 字段IS_ONLINE.
   */
  private Integer IS_ONLINE;

  /**
   * 返回字段IS_ONLINE的值.
   * @return IS_ONLINE  在线状态 0:离线 1:在线  int
  */
  public Integer getIS_ONLINE() {
    return IS_ONLINE;
  }

  /**
   * 设置字段IS_ONLINE的值.
   * @param is_online  在线状态 0:离线 1:在线  int
   */
  public void setIS_ONLINE(Integer is_online) {
    this.IS_ONLINE=is_online;
  }

}

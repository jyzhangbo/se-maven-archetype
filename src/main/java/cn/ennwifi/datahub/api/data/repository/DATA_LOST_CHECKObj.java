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
 * 数据库表 数据遗漏检查表<br/>
 * @author zhangjsf@enn.cn

 *         <b>字段列表</b><br/>

 *         ID   规则ID Integer<br/>
 *         GATEWAY_ID   网关ID Integer<br/>
 *         DEVICE_ID   设备ID Integer<br/>
 *         LAST_LAST_TIME   上上一次时间，非空 Long<br/>
 *         LAST_TIME   上一次时间，可以为空 Long<br/>
 *         CURRENT_TIMES   当前次数 Integer<br/>
 *         RETRY_TIME   重试次数 Integer<br/>
 *         COLLECT_INTERVAL   上传时间间隔(毫秒,可以理解为频率) Integer<br/>
 *         ENABLED   是否启用,缺省启用规则 Integer<br/>
 */

@Table("DATA_LOST_CHECK")
public class DATA_LOST_CHECKObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_DATA_LOST_CHECK="DATA_LOST_CHECK";
  public DATA_LOST_CHECKObj() {
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
      if (FLD_DEVICE_ID.equals(fieldName)) {
        return DEVICE_ID;
      }
      if (FLD_LAST_LAST_TIME.equals(fieldName)) {
        return LAST_LAST_TIME;
      }
      if (FLD_LAST_TIME.equals(fieldName)) {
        return LAST_TIME;
      }
      if (FLD_CURRENT_TIMES.equals(fieldName)) {
        return CURRENT_TIMES;
      }
      if (FLD_RETRY_TIME.equals(fieldName)) {
        return RETRY_TIME;
      }
      if (FLD_COLLECT_INTERVAL.equals(fieldName)) {
        return COLLECT_INTERVAL;
      }
      if (FLD_ENABLED.equals(fieldName)) {
        return ENABLED;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 9) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return GATEWAY_ID;
      }
      if (fieldIndex == 2) {
        return DEVICE_ID;
      }
      if (fieldIndex == 3) {
        return LAST_LAST_TIME;
      }
      if (fieldIndex == 4) {
        return LAST_TIME;
      }
      if (fieldIndex == 5) {
        return CURRENT_TIMES;
      }
      if (fieldIndex == 6) {
        return RETRY_TIME;
      }
      if (fieldIndex == 7) {
        return COLLECT_INTERVAL;
      }
      if (fieldIndex == 8) {
        return ENABLED;
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
  private Integer ID;

  /**
   * 返回字段ID的值.
   * @return ID  规则ID  int
  */
  public Integer getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  规则ID  int
   */
  public void setID(Integer id) {
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
  private Integer GATEWAY_ID;

  /**
   * 返回字段GATEWAY_ID的值.
   * @return GATEWAY_ID  网关ID  int
  */
  public Integer getGATEWAY_ID() {
    return GATEWAY_ID;
  }

  /**
   * 设置字段GATEWAY_ID的值.
   * @param gateway_id  网关ID  int
   */
  public void setGATEWAY_ID(Integer gateway_id) {
    this.GATEWAY_ID=gateway_id;
  }

  /**
   * 字段DEVICE_ID在数据中的名称.
   */
  public static final String FLD_DEVICE_ID="DEVICE_ID";

  /**
   * 获取字段DEVICE_ID的索引值.
   */
  public static final Integer IDX_DEVICE_ID=2;

 /**
   * 字段DEVICE_ID.
   */
  private Integer DEVICE_ID;

  /**
   * 返回字段DEVICE_ID的值.
   * @return DEVICE_ID  设备ID  int
  */
  public Integer getDEVICE_ID() {
    return DEVICE_ID;
  }

  /**
   * 设置字段DEVICE_ID的值.
   * @param device_id  设备ID  int
   */
  public void setDEVICE_ID(Integer device_id) {
    this.DEVICE_ID=device_id;
  }

  /**
   * 字段LAST_LAST_TIME在数据中的名称.
   */
  public static final String FLD_LAST_LAST_TIME="LAST_LAST_TIME";

  /**
   * 获取字段LAST_LAST_TIME的索引值.
   */
  public static final Integer IDX_LAST_LAST_TIME=3;

 /**
   * 字段LAST_LAST_TIME.
   */
  private Long LAST_LAST_TIME;

  /**
   * 返回字段LAST_LAST_TIME的值.
   * @return LAST_LAST_TIME  上上一次时间，非空  bigint
  */
  public Long getLAST_LAST_TIME() {
    return LAST_LAST_TIME;
  }

  /**
   * 设置字段LAST_LAST_TIME的值.
   * @param last_last_time  上上一次时间，非空  bigint
   */
  public void setLAST_LAST_TIME(Long last_last_time) {
    this.LAST_LAST_TIME=last_last_time;
  }

  /**
   * 字段LAST_TIME在数据中的名称.
   */
  public static final String FLD_LAST_TIME="LAST_TIME";

  /**
   * 获取字段LAST_TIME的索引值.
   */
  public static final Integer IDX_LAST_TIME=4;

 /**
   * 字段LAST_TIME.
   */
  private Long LAST_TIME;

  /**
   * 返回字段LAST_TIME的值.
   * @return LAST_TIME  上一次时间，可以为空  bigint
  */
  public Long getLAST_TIME() {
    return LAST_TIME;
  }

  /**
   * 设置字段LAST_TIME的值.
   * @param last_time  上一次时间，可以为空  bigint
   */
  public void setLAST_TIME(Long last_time) {
    this.LAST_TIME=last_time;
  }

  /**
   * 字段CURRENT_TIMES在数据中的名称.
   */
  public static final String FLD_CURRENT_TIMES="CURRENT_TIMES";

  /**
   * 获取字段CURRENT_TIMES的索引值.
   */
  public static final Integer IDX_CURRENT_TIMES=5;

 /**
   * 字段CURRENT_TIMES.
   */
  private Integer CURRENT_TIMES;

  /**
   * 返回字段CURRENT_TIMES的值.
   * @return CURRENT_TIMES  当前次数  int
  */
  public Integer getCURRENT_TIMES() {
    return CURRENT_TIMES;
  }

  /**
   * 设置字段CURRENT_TIMES的值.
   * @param current_times  当前次数  int
   */
  public void setCURRENT_TIMES(Integer current_times) {
    this.CURRENT_TIMES=current_times;
  }

  /**
   * 字段RETRY_TIME在数据中的名称.
   */
  public static final String FLD_RETRY_TIME="RETRY_TIME";

  /**
   * 获取字段RETRY_TIME的索引值.
   */
  public static final Integer IDX_RETRY_TIME=6;

 /**
   * 字段RETRY_TIME.
   */
  private Integer RETRY_TIME;

  /**
   * 返回字段RETRY_TIME的值.
   * @return RETRY_TIME  重试次数  int
  */
  public Integer getRETRY_TIME() {
    return RETRY_TIME;
  }

  /**
   * 设置字段RETRY_TIME的值.
   * @param retry_time  重试次数  int
   */
  public void setRETRY_TIME(Integer retry_time) {
    this.RETRY_TIME=retry_time;
  }

  /**
   * 字段COLLECT_INTERVAL在数据中的名称.
   */
  public static final String FLD_COLLECT_INTERVAL="COLLECT_INTERVAL";

  /**
   * 获取字段COLLECT_INTERVAL的索引值.
   */
  public static final Integer IDX_COLLECT_INTERVAL=7;

 /**
   * 字段COLLECT_INTERVAL.
   */
  private Integer COLLECT_INTERVAL;

  /**
   * 返回字段COLLECT_INTERVAL的值.
   * @return COLLECT_INTERVAL  上传时间间隔(毫秒,可以理解为频率)  int
  */
  public Integer getCOLLECT_INTERVAL() {
    return COLLECT_INTERVAL;
  }

  /**
   * 设置字段COLLECT_INTERVAL的值.
   * @param collect_interval  上传时间间隔(毫秒,可以理解为频率)  int
   */
  public void setCOLLECT_INTERVAL(Integer collect_interval) {
    this.COLLECT_INTERVAL=collect_interval;
  }

  /**
   * 字段ENABLED在数据中的名称.
   */
  public static final String FLD_ENABLED="ENABLED";

  /**
   * 获取字段ENABLED的索引值.
   */
  public static final Integer IDX_ENABLED=8;

 /**
   * 字段ENABLED.
   */
  private Integer ENABLED;

  /**
   * 返回字段ENABLED的值.
   * @return ENABLED  是否启用,缺省启用规则  int
  */
  public Integer getENABLED() {
    return ENABLED;
  }

  /**
   * 设置字段ENABLED的值.
   * @param enabled  是否启用,缺省启用规则  int
   */
  public void setENABLED(Integer enabled) {
    this.ENABLED=enabled;
  }

}

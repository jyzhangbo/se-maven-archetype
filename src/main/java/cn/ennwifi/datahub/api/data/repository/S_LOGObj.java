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

 *         ID   ID Long<br/>
 *         IP   日志的IP地址 String<br/>
 *         SOURCE_IP   请求的原IP地址 String<br/>
 *         LEVEL   日志级别 INFO ERROR DEBUG WARN String<br/>
 *         CTIME   创建日期 java.sql.Timestamp<br/>
 *         CONTENT    String<br/>
 *         TARGET   日志相关的目标对象 String<br/>
 */

@Table("S_LOG")
public class S_LOGObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_S_LOG="S_LOG";
  public S_LOGObj() {
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
      if (FLD_IP.equals(fieldName)) {
        return IP;
      }
      if (FLD_SOURCE_IP.equals(fieldName)) {
        return SOURCE_IP;
      }
      if (FLD_LEVEL.equals(fieldName)) {
        return LEVEL;
      }
      if (FLD_CTIME.equals(fieldName)) {
        return CTIME;
      }
      if (FLD_CONTENT.equals(fieldName)) {
        return CONTENT;
      }
      if (FLD_TARGET.equals(fieldName)) {
        return TARGET;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 7) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return IP;
      }
      if (fieldIndex == 2) {
        return SOURCE_IP;
      }
      if (fieldIndex == 3) {
        return LEVEL;
      }
      if (fieldIndex == 4) {
        return CTIME;
      }
      if (fieldIndex == 5) {
        return CONTENT;
      }
      if (fieldIndex == 6) {
        return TARGET;
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
   * @return ID  ID  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  ID  bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段IP在数据中的名称.
   */
  public static final String FLD_IP="IP";

  /**
   * 获取字段IP的索引值.
   */
  public static final Integer IDX_IP=1;

 /**
   * 字段IP.
   */
  private String IP;

  /**
   * 返回字段IP的值.
   * @return IP  日志的IP地址  varchar
  */
  public String getIP() {
    return IP;
  }

  /**
   * 设置字段IP的值.
   * @param ip  日志的IP地址  varchar
   */
  public void setIP(String ip) {
    this.IP=ip;
  }

  /**
   * 字段SOURCE_IP在数据中的名称.
   */
  public static final String FLD_SOURCE_IP="SOURCE_IP";

  /**
   * 获取字段SOURCE_IP的索引值.
   */
  public static final Integer IDX_SOURCE_IP=2;

 /**
   * 字段SOURCE_IP.
   */
  private String SOURCE_IP;

  /**
   * 返回字段SOURCE_IP的值.
   * @return SOURCE_IP  请求的原IP地址  varchar
  */
  public String getSOURCE_IP() {
    return SOURCE_IP;
  }

  /**
   * 设置字段SOURCE_IP的值.
   * @param source_ip  请求的原IP地址  varchar
   */
  public void setSOURCE_IP(String source_ip) {
    this.SOURCE_IP=source_ip;
  }

  /**
   * 字段LEVEL在数据中的名称.
   */
  public static final String FLD_LEVEL="LEVEL";

  /**
   * 获取字段LEVEL的索引值.
   */
  public static final Integer IDX_LEVEL=3;

 /**
   * 字段LEVEL.
   */
  private String LEVEL;

  /**
   * 返回字段LEVEL的值.
   * @return LEVEL  日志级别 INFO ERROR DEBUG WARN  varchar
  */
  public String getLEVEL() {
    return LEVEL;
  }

  /**
   * 设置字段LEVEL的值.
   * @param level  日志级别 INFO ERROR DEBUG WARN  varchar
   */
  public void setLEVEL(String level) {
    this.LEVEL=level;
  }

  /**
   * 字段CTIME在数据中的名称.
   */
  public static final String FLD_CTIME="CTIME";

  /**
   * 获取字段CTIME的索引值.
   */
  public static final Integer IDX_CTIME=4;

 /**
   * 字段CTIME.
   */
  private java.sql.Timestamp CTIME;

  /**
   * 返回字段CTIME的值.
   * @return CTIME  创建日期  timestamp
  */
  public java.sql.Timestamp getCTIME() {
    return CTIME;
  }

  /**
   * 设置字段CTIME的值.
   * @param ctime  创建日期  timestamp
   */
  public void setCTIME(java.sql.Timestamp ctime) {
    this.CTIME=ctime;
  }

  /**
   * 字段CONTENT在数据中的名称.
   */
  public static final String FLD_CONTENT="CONTENT";

  /**
   * 获取字段CONTENT的索引值.
   */
  public static final Integer IDX_CONTENT=5;

 /**
   * 字段CONTENT.
   */
  private String CONTENT;

  /**
   * 返回字段CONTENT的值.
   * @return CONTENT    varchar
  */
  public String getCONTENT() {
    return CONTENT;
  }

  /**
   * 设置字段CONTENT的值.
   * @param content    varchar
   */
  public void setCONTENT(String content) {
    this.CONTENT=content;
  }

  /**
   * 字段TARGET在数据中的名称.
   */
  public static final String FLD_TARGET="TARGET";

  /**
   * 获取字段TARGET的索引值.
   */
  public static final Integer IDX_TARGET=6;

 /**
   * 字段TARGET.
   */
  private String TARGET;

  /**
   * 返回字段TARGET的值.
   * @return TARGET  日志相关的目标对象  varchar
  */
  public String getTARGET() {
    return TARGET;
  }

  /**
   * 设置字段TARGET的值.
   * @param target  日志相关的目标对象  varchar
   */
  public void setTARGET(String target) {
    this.TARGET=target;
  }

}

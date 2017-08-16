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

 *         ID    Long<br/>
 *         APP_ID   APPID String<br/>
 *         MSG_FROM    String<br/>
 *         MSG_TO    String<br/>
 *         MSG_TIME    java.sql.Timestamp<br/>
 *         MSG_TYPE   消息类型 String<br/>
 *         MSG_CONTENT    String<br/>
 */

@Table("WX_MSG")
public class WX_MSGObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_WX_MSG="WX_MSG";
  public WX_MSGObj() {
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
      if (FLD_APP_ID.equals(fieldName)) {
        return APP_ID;
      }
      if (FLD_MSG_FROM.equals(fieldName)) {
        return MSG_FROM;
      }
      if (FLD_MSG_TO.equals(fieldName)) {
        return MSG_TO;
      }
      if (FLD_MSG_TIME.equals(fieldName)) {
        return MSG_TIME;
      }
      if (FLD_MSG_TYPE.equals(fieldName)) {
        return MSG_TYPE;
      }
      if (FLD_MSG_CONTENT.equals(fieldName)) {
        return MSG_CONTENT;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 7) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return APP_ID;
      }
      if (fieldIndex == 2) {
        return MSG_FROM;
      }
      if (fieldIndex == 3) {
        return MSG_TO;
      }
      if (fieldIndex == 4) {
        return MSG_TIME;
      }
      if (fieldIndex == 5) {
        return MSG_TYPE;
      }
      if (fieldIndex == 6) {
        return MSG_CONTENT;
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
   * @return ID    bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id    bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段APP_ID在数据中的名称.
   */
  public static final String FLD_APP_ID="APP_ID";

  /**
   * 获取字段APP_ID的索引值.
   */
  public static final Integer IDX_APP_ID=1;

 /**
   * 字段APP_ID.
   */
  private String APP_ID;

  /**
   * 返回字段APP_ID的值.
   * @return APP_ID  APPID  varchar
  */
  public String getAPP_ID() {
    return APP_ID;
  }

  /**
   * 设置字段APP_ID的值.
   * @param app_id  APPID  varchar
   */
  public void setAPP_ID(String app_id) {
    this.APP_ID=app_id;
  }

  /**
   * 字段MSG_FROM在数据中的名称.
   */
  public static final String FLD_MSG_FROM="MSG_FROM";

  /**
   * 获取字段MSG_FROM的索引值.
   */
  public static final Integer IDX_MSG_FROM=2;

 /**
   * 字段MSG_FROM.
   */
  private String MSG_FROM;

  /**
   * 返回字段MSG_FROM的值.
   * @return MSG_FROM    varchar
  */
  public String getMSG_FROM() {
    return MSG_FROM;
  }

  /**
   * 设置字段MSG_FROM的值.
   * @param msg_from    varchar
   */
  public void setMSG_FROM(String msg_from) {
    this.MSG_FROM=msg_from;
  }

  /**
   * 字段MSG_TO在数据中的名称.
   */
  public static final String FLD_MSG_TO="MSG_TO";

  /**
   * 获取字段MSG_TO的索引值.
   */
  public static final Integer IDX_MSG_TO=3;

 /**
   * 字段MSG_TO.
   */
  private String MSG_TO;

  /**
   * 返回字段MSG_TO的值.
   * @return MSG_TO    varchar
  */
  public String getMSG_TO() {
    return MSG_TO;
  }

  /**
   * 设置字段MSG_TO的值.
   * @param msg_to    varchar
   */
  public void setMSG_TO(String msg_to) {
    this.MSG_TO=msg_to;
  }

  /**
   * 字段MSG_TIME在数据中的名称.
   */
  public static final String FLD_MSG_TIME="MSG_TIME";

  /**
   * 获取字段MSG_TIME的索引值.
   */
  public static final Integer IDX_MSG_TIME=4;

 /**
   * 字段MSG_TIME.
   */
  private java.sql.Timestamp MSG_TIME;

  /**
   * 返回字段MSG_TIME的值.
   * @return MSG_TIME    timestamp
  */
  public java.sql.Timestamp getMSG_TIME() {
    return MSG_TIME;
  }

  /**
   * 设置字段MSG_TIME的值.
   * @param msg_time    timestamp
   */
  public void setMSG_TIME(java.sql.Timestamp msg_time) {
    this.MSG_TIME=msg_time;
  }

  /**
   * 字段MSG_TYPE在数据中的名称.
   */
  public static final String FLD_MSG_TYPE="MSG_TYPE";

  /**
   * 获取字段MSG_TYPE的索引值.
   */
  public static final Integer IDX_MSG_TYPE=5;

 /**
   * 字段MSG_TYPE.
   */
  private String MSG_TYPE;

  /**
   * 返回字段MSG_TYPE的值.
   * @return MSG_TYPE  消息类型  varchar
  */
  public String getMSG_TYPE() {
    return MSG_TYPE;
  }

  /**
   * 设置字段MSG_TYPE的值.
   * @param msg_type  消息类型  varchar
   */
  public void setMSG_TYPE(String msg_type) {
    this.MSG_TYPE=msg_type;
  }

  /**
   * 字段MSG_CONTENT在数据中的名称.
   */
  public static final String FLD_MSG_CONTENT="MSG_CONTENT";

  /**
   * 获取字段MSG_CONTENT的索引值.
   */
  public static final Integer IDX_MSG_CONTENT=6;

 /**
   * 字段MSG_CONTENT.
   */
  private String MSG_CONTENT;

  /**
   * 返回字段MSG_CONTENT的值.
   * @return MSG_CONTENT    varchar
  */
  public String getMSG_CONTENT() {
    return MSG_CONTENT;
  }

  /**
   * 设置字段MSG_CONTENT的值.
   * @param msg_content    varchar
   */
  public void setMSG_CONTENT(String msg_content) {
    this.MSG_CONTENT=msg_content;
  }

}

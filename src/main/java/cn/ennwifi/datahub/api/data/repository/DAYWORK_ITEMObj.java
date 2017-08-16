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
 * 数据库表 日报记录<br/>
 * @author zhangjsf@enn.cn

 *         <b>字段列表</b><br/>

 *         ID   DAYWORK_ID Integer<br/>
 *         UID   用户ID Integer<br/>
 *         DATE_VAL   日期字符串(YYYY-MM-DD) String<br/>
 *         TITLE   今日工作 String<br/>
 *         CTIME    java.sql.Timestamp<br/>
 *         UTIME    java.sql.Timestamp<br/>
 *         TAGS   明日工作 String<br/>
 *         ITEM_EVAL   今日工作执行情况 String<br/>
 *         PERCENT    Integer<br/>
 *         SUMMARY   任务解释 String<br/>
 *         TYPE   工作类型 0今日工作 1明日计划 Integer<br/>
 */

@Table("DAYWORK_ITEM")
public class DAYWORK_ITEMObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_DAYWORK_ITEM="DAYWORK_ITEM";
  public DAYWORK_ITEMObj() {
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
      if (FLD_UID.equals(fieldName)) {
        return UID;
      }
      if (FLD_DATE_VAL.equals(fieldName)) {
        return DATE_VAL;
      }
      if (FLD_TITLE.equals(fieldName)) {
        return TITLE;
      }
      if (FLD_CTIME.equals(fieldName)) {
        return CTIME;
      }
      if (FLD_UTIME.equals(fieldName)) {
        return UTIME;
      }
      if (FLD_TAGS.equals(fieldName)) {
        return TAGS;
      }
      if (FLD_ITEM_EVAL.equals(fieldName)) {
        return ITEM_EVAL;
      }
      if (FLD_PERCENT.equals(fieldName)) {
        return PERCENT;
      }
      if (FLD_SUMMARY.equals(fieldName)) {
        return SUMMARY;
      }
      if (FLD_TYPE.equals(fieldName)) {
        return TYPE;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 11) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return UID;
      }
      if (fieldIndex == 2) {
        return DATE_VAL;
      }
      if (fieldIndex == 3) {
        return TITLE;
      }
      if (fieldIndex == 4) {
        return CTIME;
      }
      if (fieldIndex == 5) {
        return UTIME;
      }
      if (fieldIndex == 6) {
        return TAGS;
      }
      if (fieldIndex == 7) {
        return ITEM_EVAL;
      }
      if (fieldIndex == 8) {
        return PERCENT;
      }
      if (fieldIndex == 9) {
        return SUMMARY;
      }
      if (fieldIndex == 10) {
        return TYPE;
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
   * @return ID  DAYWORK_ID  int
  */
  public Integer getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  DAYWORK_ID  int
   */
  public void setID(Integer id) {
    this.ID=id;
  }

  /**
   * 字段UID在数据中的名称.
   */
  public static final String FLD_UID="UID";

  /**
   * 获取字段UID的索引值.
   */
  public static final Integer IDX_UID=1;

 /**
   * 字段UID.
   */
  private Integer UID;

  /**
   * 返回字段UID的值.
   * @return UID  用户ID  int
  */
  public Integer getUID() {
    return UID;
  }

  /**
   * 设置字段UID的值.
   * @param uid  用户ID  int
   */
  public void setUID(Integer uid) {
    this.UID=uid;
  }

  /**
   * 字段DATE_VAL在数据中的名称.
   */
  public static final String FLD_DATE_VAL="DATE_VAL";

  /**
   * 获取字段DATE_VAL的索引值.
   */
  public static final Integer IDX_DATE_VAL=2;

 /**
   * 字段DATE_VAL.
   */
  private String DATE_VAL;

  /**
   * 返回字段DATE_VAL的值.
   * @return DATE_VAL  日期字符串(YYYY-MM-DD)  varchar
  */
  public String getDATE_VAL() {
    return DATE_VAL;
  }

  /**
   * 设置字段DATE_VAL的值.
   * @param date_val  日期字符串(YYYY-MM-DD)  varchar
   */
  public void setDATE_VAL(String date_val) {
    this.DATE_VAL=date_val;
  }

  /**
   * 字段TITLE在数据中的名称.
   */
  public static final String FLD_TITLE="TITLE";

  /**
   * 获取字段TITLE的索引值.
   */
  public static final Integer IDX_TITLE=3;

 /**
   * 字段TITLE.
   */
  private String TITLE;

  /**
   * 返回字段TITLE的值.
   * @return TITLE  今日工作  varchar
  */
  public String getTITLE() {
    return TITLE;
  }

  /**
   * 设置字段TITLE的值.
   * @param title  今日工作  varchar
   */
  public void setTITLE(String title) {
    this.TITLE=title;
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
   * @return CTIME    timestamp
  */
  public java.sql.Timestamp getCTIME() {
    return CTIME;
  }

  /**
   * 设置字段CTIME的值.
   * @param ctime    timestamp
   */
  public void setCTIME(java.sql.Timestamp ctime) {
    this.CTIME=ctime;
  }

  /**
   * 字段UTIME在数据中的名称.
   */
  public static final String FLD_UTIME="UTIME";

  /**
   * 获取字段UTIME的索引值.
   */
  public static final Integer IDX_UTIME=5;

 /**
   * 字段UTIME.
   */
  private java.sql.Timestamp UTIME;

  /**
   * 返回字段UTIME的值.
   * @return UTIME    timestamp
  */
  public java.sql.Timestamp getUTIME() {
    return UTIME;
  }

  /**
   * 设置字段UTIME的值.
   * @param utime    timestamp
   */
  public void setUTIME(java.sql.Timestamp utime) {
    this.UTIME=utime;
  }

  /**
   * 字段TAGS在数据中的名称.
   */
  public static final String FLD_TAGS="TAGS";

  /**
   * 获取字段TAGS的索引值.
   */
  public static final Integer IDX_TAGS=6;

 /**
   * 字段TAGS.
   */
  private String TAGS;

  /**
   * 返回字段TAGS的值.
   * @return TAGS  明日工作  varchar
  */
  public String getTAGS() {
    return TAGS;
  }

  /**
   * 设置字段TAGS的值.
   * @param tags  明日工作  varchar
   */
  public void setTAGS(String tags) {
    this.TAGS=tags;
  }

  /**
   * 字段ITEM_EVAL在数据中的名称.
   */
  public static final String FLD_ITEM_EVAL="ITEM_EVAL";

  /**
   * 获取字段ITEM_EVAL的索引值.
   */
  public static final Integer IDX_ITEM_EVAL=7;

 /**
   * 字段ITEM_EVAL.
   */
  private String ITEM_EVAL;

  /**
   * 返回字段ITEM_EVAL的值.
   * @return ITEM_EVAL  今日工作执行情况  varchar
  */
  public String getITEM_EVAL() {
    return ITEM_EVAL;
  }

  /**
   * 设置字段ITEM_EVAL的值.
   * @param item_eval  今日工作执行情况  varchar
   */
  public void setITEM_EVAL(String item_eval) {
    this.ITEM_EVAL=item_eval;
  }

  /**
   * 字段PERCENT在数据中的名称.
   */
  public static final String FLD_PERCENT="PERCENT";

  /**
   * 获取字段PERCENT的索引值.
   */
  public static final Integer IDX_PERCENT=8;

 /**
   * 字段PERCENT.
   */
  private Integer PERCENT;

  /**
   * 返回字段PERCENT的值.
   * @return PERCENT    int
  */
  public Integer getPERCENT() {
    return PERCENT;
  }

  /**
   * 设置字段PERCENT的值.
   * @param percent    int
   */
  public void setPERCENT(Integer percent) {
    this.PERCENT=percent;
  }

  /**
   * 字段SUMMARY在数据中的名称.
   */
  public static final String FLD_SUMMARY="SUMMARY";

  /**
   * 获取字段SUMMARY的索引值.
   */
  public static final Integer IDX_SUMMARY=9;

 /**
   * 字段SUMMARY.
   */
  private String SUMMARY;

  /**
   * 返回字段SUMMARY的值.
   * @return SUMMARY  任务解释  varchar
  */
  public String getSUMMARY() {
    return SUMMARY;
  }

  /**
   * 设置字段SUMMARY的值.
   * @param summary  任务解释  varchar
   */
  public void setSUMMARY(String summary) {
    this.SUMMARY=summary;
  }

  /**
   * 字段TYPE在数据中的名称.
   */
  public static final String FLD_TYPE="TYPE";

  /**
   * 获取字段TYPE的索引值.
   */
  public static final Integer IDX_TYPE=10;

 /**
   * 字段TYPE.
   */
  private Integer TYPE;

  /**
   * 返回字段TYPE的值.
   * @return TYPE  工作类型 0今日工作 1明日计划  int
  */
  public Integer getTYPE() {
    return TYPE;
  }

  /**
   * 设置字段TYPE的值.
   * @param type  工作类型 0今日工作 1明日计划  int
   */
  public void setTYPE(Integer type) {
    this.TYPE=type;
  }

}

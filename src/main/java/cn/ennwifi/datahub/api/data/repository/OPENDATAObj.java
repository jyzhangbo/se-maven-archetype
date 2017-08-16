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

 *         POINTID    Integer<br/>
 *         POINTNAME    String<br/>
 *         RECORDTIME    java.sql.Timestamp<br/>
 *         IA    Integer<br/>
 *         P    Float<br/>
 */

@Table("OPENDATA")
public class OPENDATAObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_OPENDATA="OPENDATA";
  public OPENDATAObj() {
  }
  /**
   * 根据字段名称获取字段的值. 
   */
  @Override
  public Object getFieldValue(String fieldName,Integer fieldIndex) {
    if (fieldName != null && fieldName.length() > 0) {
      if (FLD_POINTID.equals(fieldName)) {
        return POINTID;
      }
      if (FLD_POINTNAME.equals(fieldName)) {
        return POINTNAME;
      }
      if (FLD_RECORDTIME.equals(fieldName)) {
        return RECORDTIME;
      }
      if (FLD_IA.equals(fieldName)) {
        return IA;
      }
      if (FLD_P.equals(fieldName)) {
        return P;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 5) {
      if (fieldIndex == 0) {
        return POINTID;
      }
      if (fieldIndex == 1) {
        return POINTNAME;
      }
      if (fieldIndex == 2) {
        return RECORDTIME;
      }
      if (fieldIndex == 3) {
        return IA;
      }
      if (fieldIndex == 4) {
        return P;
      }
    } else {
      return null;
    }
    return null;
  }

  /**
   * 字段POINTID在数据中的名称.
   */
  public static final String FLD_POINTID="POINTID";

  /**
   * 获取字段POINTID的索引值.
   */
  public static final Integer IDX_POINTID=0;
	@Id

 /**
   * 字段POINTID.
   */
  private Integer POINTID;

  /**
   * 返回字段POINTID的值.
   * @return POINTID    int
  */
  public Integer getPOINTID() {
    return POINTID;
  }

  /**
   * 设置字段POINTID的值.
   * @param pointid    int
   */
  public void setPOINTID(Integer pointid) {
    this.POINTID=pointid;
  }

  /**
   * 字段POINTNAME在数据中的名称.
   */
  public static final String FLD_POINTNAME="POINTNAME";

  /**
   * 获取字段POINTNAME的索引值.
   */
  public static final Integer IDX_POINTNAME=1;

 /**
   * 字段POINTNAME.
   */
  private String POINTNAME;

  /**
   * 返回字段POINTNAME的值.
   * @return POINTNAME    varchar
  */
  public String getPOINTNAME() {
    return POINTNAME;
  }

  /**
   * 设置字段POINTNAME的值.
   * @param pointname    varchar
   */
  public void setPOINTNAME(String pointname) {
    this.POINTNAME=pointname;
  }

  /**
   * 字段RECORDTIME在数据中的名称.
   */
  public static final String FLD_RECORDTIME="RECORDTIME";

  /**
   * 获取字段RECORDTIME的索引值.
   */
  public static final Integer IDX_RECORDTIME=2;

 /**
   * 字段RECORDTIME.
   */
  private java.sql.Timestamp RECORDTIME;

  /**
   * 返回字段RECORDTIME的值.
   * @return RECORDTIME    datetime
  */
  public java.sql.Timestamp getRECORDTIME() {
    return RECORDTIME;
  }

  /**
   * 设置字段RECORDTIME的值.
   * @param recordtime    datetime
   */
  public void setRECORDTIME(java.sql.Timestamp recordtime) {
    this.RECORDTIME=recordtime;
  }

  /**
   * 字段IA在数据中的名称.
   */
  public static final String FLD_IA="IA";

  /**
   * 获取字段IA的索引值.
   */
  public static final Integer IDX_IA=3;

 /**
   * 字段IA.
   */
  private Integer IA;

  /**
   * 返回字段IA的值.
   * @return IA    int
  */
  public Integer getIA() {
    return IA;
  }

  /**
   * 设置字段IA的值.
   * @param ia    int
   */
  public void setIA(Integer ia) {
    this.IA=ia;
  }

  /**
   * 字段P在数据中的名称.
   */
  public static final String FLD_P="P";

  /**
   * 获取字段P的索引值.
   */
  public static final Integer IDX_P=4;

 /**
   * 字段P.
   */
  private Float P;

  /**
   * 返回字段P的值.
   * @return P    float
  */
  public Float getP() {
    return P;
  }

  /**
   * 设置字段P的值.
   * @param p    float
   */
  public void setP(Float p) {
    this.P=p;
  }

}

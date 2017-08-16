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
 * 数据库表 日报配置信息<br/>
 * @author zhangjsf@enn.cn

 *         <b>字段列表</b><br/>

 *         USER_ID    Integer<br/>
 *         MAILS    String<br/>
 */

@Table("DAYWORK_CONF")
public class DAYWORK_CONFObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_DAYWORK_CONF="DAYWORK_CONF";
  public DAYWORK_CONFObj() {
  }
  /**
   * 根据字段名称获取字段的值. 
   */
  @Override
  public Object getFieldValue(String fieldName,Integer fieldIndex) {
    if (fieldName != null && fieldName.length() > 0) {
      if (FLD_USER_ID.equals(fieldName)) {
        return USER_ID;
      }
      if (FLD_MAILS.equals(fieldName)) {
        return MAILS;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 2) {
      if (fieldIndex == 0) {
        return USER_ID;
      }
      if (fieldIndex == 1) {
        return MAILS;
      }
    } else {
      return null;
    }
    return null;
  }

  /**
   * 字段USER_ID在数据中的名称.
   */
  public static final String FLD_USER_ID="USER_ID";

  /**
   * 获取字段USER_ID的索引值.
   */
  public static final Integer IDX_USER_ID=0;
	@Id(auto = false)

 /**
   * 字段USER_ID.
   */
  private Integer USER_ID;

  /**
   * 返回字段USER_ID的值.
   * @return USER_ID    int
  */
  public Integer getUSER_ID() {
    return USER_ID;
  }

  /**
   * 设置字段USER_ID的值.
   * @param user_id    int
   */
  public void setUSER_ID(Integer user_id) {
    this.USER_ID=user_id;
  }

  /**
   * 字段MAILS在数据中的名称.
   */
  public static final String FLD_MAILS="MAILS";

  /**
   * 获取字段MAILS的索引值.
   */
  public static final Integer IDX_MAILS=1;

 /**
   * 字段MAILS.
   */
  private String MAILS;

  /**
   * 返回字段MAILS的值.
   * @return MAILS    varchar
  */
  public String getMAILS() {
    return MAILS;
  }

  /**
   * 设置字段MAILS的值.
   * @param mails    varchar
   */
  public void setMAILS(String mails) {
    this.MAILS=mails;
  }

}

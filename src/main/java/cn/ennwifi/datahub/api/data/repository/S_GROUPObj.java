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
 *         API_GROUP    String<br/>
 *         SUMMARY    String<br/>
 */

@Table("S_GROUP")
public class S_GROUPObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_S_GROUP="S_GROUP";
  public S_GROUPObj() {
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
      if (FLD_API_GROUP.equals(fieldName)) {
        return API_GROUP;
      }
      if (FLD_SUMMARY.equals(fieldName)) {
        return SUMMARY;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 3) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return API_GROUP;
      }
      if (fieldIndex == 2) {
        return SUMMARY;
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
   * 字段API_GROUP在数据中的名称.
   */
  public static final String FLD_API_GROUP="API_GROUP";

  /**
   * 获取字段API_GROUP的索引值.
   */
  public static final Integer IDX_API_GROUP=1;

 /**
   * 字段API_GROUP.
   */
  private String API_GROUP;

  /**
   * 返回字段API_GROUP的值.
   * @return API_GROUP    varchar
  */
  public String getAPI_GROUP() {
    return API_GROUP;
  }

  /**
   * 设置字段API_GROUP的值.
   * @param api_group    varchar
   */
  public void setAPI_GROUP(String api_group) {
    this.API_GROUP=api_group;
  }

  /**
   * 字段SUMMARY在数据中的名称.
   */
  public static final String FLD_SUMMARY="SUMMARY";

  /**
   * 获取字段SUMMARY的索引值.
   */
  public static final Integer IDX_SUMMARY=2;

 /**
   * 字段SUMMARY.
   */
  private String SUMMARY;

  /**
   * 返回字段SUMMARY的值.
   * @return SUMMARY    varchar
  */
  public String getSUMMARY() {
    return SUMMARY;
  }

  /**
   * 设置字段SUMMARY的值.
   * @param summary    varchar
   */
  public void setSUMMARY(String summary) {
    this.SUMMARY=summary;
  }

}

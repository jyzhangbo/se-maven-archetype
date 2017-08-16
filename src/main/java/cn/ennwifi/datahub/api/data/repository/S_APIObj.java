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
 *         API_NAME    String<br/>
 *         API_URL    String<br/>
 *         SUMMARY    String<br/>
 */

@Table("S_API")
public class S_APIObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_S_API="S_API";
  public S_APIObj() {
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
      if (FLD_API_NAME.equals(fieldName)) {
        return API_NAME;
      }
      if (FLD_API_URL.equals(fieldName)) {
        return API_URL;
      }
      if (FLD_SUMMARY.equals(fieldName)) {
        return SUMMARY;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 5) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return API_GROUP;
      }
      if (fieldIndex == 2) {
        return API_NAME;
      }
      if (fieldIndex == 3) {
        return API_URL;
      }
      if (fieldIndex == 4) {
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
   * 字段API_NAME在数据中的名称.
   */
  public static final String FLD_API_NAME="API_NAME";

  /**
   * 获取字段API_NAME的索引值.
   */
  public static final Integer IDX_API_NAME=2;

 /**
   * 字段API_NAME.
   */
  private String API_NAME;

  /**
   * 返回字段API_NAME的值.
   * @return API_NAME    varchar
  */
  public String getAPI_NAME() {
    return API_NAME;
  }

  /**
   * 设置字段API_NAME的值.
   * @param api_name    varchar
   */
  public void setAPI_NAME(String api_name) {
    this.API_NAME=api_name;
  }

  /**
   * 字段API_URL在数据中的名称.
   */
  public static final String FLD_API_URL="API_URL";

  /**
   * 获取字段API_URL的索引值.
   */
  public static final Integer IDX_API_URL=3;

 /**
   * 字段API_URL.
   */
  private String API_URL;

  /**
   * 返回字段API_URL的值.
   * @return API_URL    varchar
  */
  public String getAPI_URL() {
    return API_URL;
  }

  /**
   * 设置字段API_URL的值.
   * @param api_url    varchar
   */
  public void setAPI_URL(String api_url) {
    this.API_URL=api_url;
  }

  /**
   * 字段SUMMARY在数据中的名称.
   */
  public static final String FLD_SUMMARY="SUMMARY";

  /**
   * 获取字段SUMMARY的索引值.
   */
  public static final Integer IDX_SUMMARY=4;

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

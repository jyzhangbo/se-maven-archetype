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

 *         ID   网关驱动ID Long<br/>
 *         GATEWAY_TYPE   网关类型 String<br/>
 *         PATH   驱动存放的相对路径 String<br/>
 *         SIZE   大小 Long<br/>
 *         SUMMARY   版本描述 String<br/>
 *         CREATE_TIME   创建时间 java.sql.Timestamp<br/>
 *         VER   版本 String<br/>
 *         MD5   更新包MD5 String<br/>
 */

@Table("GATEWAY_DRIVER")
public class GATEWAY_DRIVERObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_GATEWAY_DRIVER="GATEWAY_DRIVER";
  public GATEWAY_DRIVERObj() {
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
      if (FLD_GATEWAY_TYPE.equals(fieldName)) {
        return GATEWAY_TYPE;
      }
      if (FLD_PATH.equals(fieldName)) {
        return PATH;
      }
      if (FLD_SIZE.equals(fieldName)) {
        return SIZE;
      }
      if (FLD_SUMMARY.equals(fieldName)) {
        return SUMMARY;
      }
      if (FLD_CREATE_TIME.equals(fieldName)) {
        return CREATE_TIME;
      }
      if (FLD_VER.equals(fieldName)) {
        return VER;
      }
      if (FLD_MD5.equals(fieldName)) {
        return MD5;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 8) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return GATEWAY_TYPE;
      }
      if (fieldIndex == 2) {
        return PATH;
      }
      if (fieldIndex == 3) {
        return SIZE;
      }
      if (fieldIndex == 4) {
        return SUMMARY;
      }
      if (fieldIndex == 5) {
        return CREATE_TIME;
      }
      if (fieldIndex == 6) {
        return VER;
      }
      if (fieldIndex == 7) {
        return MD5;
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
   * @return ID  网关驱动ID  bigint
  */
  public Long getID() {
    return ID;
  }

  /**
   * 设置字段ID的值.
   * @param id  网关驱动ID  bigint
   */
  public void setID(Long id) {
    this.ID=id;
  }

  /**
   * 字段GATEWAY_TYPE在数据中的名称.
   */
  public static final String FLD_GATEWAY_TYPE="GATEWAY_TYPE";

  /**
   * 获取字段GATEWAY_TYPE的索引值.
   */
  public static final Integer IDX_GATEWAY_TYPE=1;

 /**
   * 字段GATEWAY_TYPE.
   */
  private String GATEWAY_TYPE;

  /**
   * 返回字段GATEWAY_TYPE的值.
   * @return GATEWAY_TYPE  网关类型  varchar
  */
  public String getGATEWAY_TYPE() {
    return GATEWAY_TYPE;
  }

  /**
   * 设置字段GATEWAY_TYPE的值.
   * @param gateway_type  网关类型  varchar
   */
  public void setGATEWAY_TYPE(String gateway_type) {
    this.GATEWAY_TYPE=gateway_type;
  }

  /**
   * 字段PATH在数据中的名称.
   */
  public static final String FLD_PATH="PATH";

  /**
   * 获取字段PATH的索引值.
   */
  public static final Integer IDX_PATH=2;

 /**
   * 字段PATH.
   */
  private String PATH;

  /**
   * 返回字段PATH的值.
   * @return PATH  驱动存放的相对路径  varchar
  */
  public String getPATH() {
    return PATH;
  }

  /**
   * 设置字段PATH的值.
   * @param path  驱动存放的相对路径  varchar
   */
  public void setPATH(String path) {
    this.PATH=path;
  }

  /**
   * 字段SIZE在数据中的名称.
   */
  public static final String FLD_SIZE="SIZE";

  /**
   * 获取字段SIZE的索引值.
   */
  public static final Integer IDX_SIZE=3;

 /**
   * 字段SIZE.
   */
  private Long SIZE;

  /**
   * 返回字段SIZE的值.
   * @return SIZE  大小  bigint
  */
  public Long getSIZE() {
    return SIZE;
  }

  /**
   * 设置字段SIZE的值.
   * @param size  大小  bigint
   */
  public void setSIZE(Long size) {
    this.SIZE=size;
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
   * @return SUMMARY  版本描述  varchar
  */
  public String getSUMMARY() {
    return SUMMARY;
  }

  /**
   * 设置字段SUMMARY的值.
   * @param summary  版本描述  varchar
   */
  public void setSUMMARY(String summary) {
    this.SUMMARY=summary;
  }

  /**
   * 字段CREATE_TIME在数据中的名称.
   */
  public static final String FLD_CREATE_TIME="CREATE_TIME";

  /**
   * 获取字段CREATE_TIME的索引值.
   */
  public static final Integer IDX_CREATE_TIME=5;

 /**
   * 字段CREATE_TIME.
   */
  private java.sql.Timestamp CREATE_TIME;

  /**
   * 返回字段CREATE_TIME的值.
   * @return CREATE_TIME  创建时间  timestamp
  */
  public java.sql.Timestamp getCREATE_TIME() {
    return CREATE_TIME;
  }

  /**
   * 设置字段CREATE_TIME的值.
   * @param create_time  创建时间  timestamp
   */
  public void setCREATE_TIME(java.sql.Timestamp create_time) {
    this.CREATE_TIME=create_time;
  }

  /**
   * 字段VER在数据中的名称.
   */
  public static final String FLD_VER="VER";

  /**
   * 获取字段VER的索引值.
   */
  public static final Integer IDX_VER=6;

 /**
   * 字段VER.
   */
  private String VER;

  /**
   * 返回字段VER的值.
   * @return VER  版本  varchar
  */
  public String getVER() {
    return VER;
  }

  /**
   * 设置字段VER的值.
   * @param ver  版本  varchar
   */
  public void setVER(String ver) {
    this.VER=ver;
  }

  /**
   * 字段MD5在数据中的名称.
   */
  public static final String FLD_MD5="MD5";

  /**
   * 获取字段MD5的索引值.
   */
  public static final Integer IDX_MD5=7;

 /**
   * 字段MD5.
   */
  private String MD5;

  /**
   * 返回字段MD5的值.
   * @return MD5  更新包MD5  varchar
  */
  public String getMD5() {
    return MD5;
  }

  /**
   * 设置字段MD5的值.
   * @param md5  更新包MD5  varchar
   */
  public void setMD5(String md5) {
    this.MD5=md5;
  }

}

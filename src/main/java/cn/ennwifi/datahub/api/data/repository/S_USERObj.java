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
 *         TYPE   登录类型 Integer<br/>
 *         HASH   哈希值 String<br/>
 *         USER_ID   用户登录唯一名称标识 String<br/>
 *         PWD   密码 String<br/>
 *         REAL_NAME   真实姓名 String<br/>
 *         AVATOR   头像的相对地址 String<br/>
 *         GENDER   性别 String<br/>
 *         EMAIL   邮箱 String<br/>
 *         MOBILE   手机 String<br/>
 *         TITLE   用户说明 String<br/>
 *         TOKEN   登录的TOKEN String<br/>
 *         CREATE_TIME    java.sql.Timestamp<br/>
 *         UPDATE_TIME    java.sql.Timestamp<br/>
 *         IS_SEND_MESSAGE   是否发短信 0:不发 1:发 Integer<br/>
 */

@Table("S_USER")
public class S_USERObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_S_USER="S_USER";
  public S_USERObj() {
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
      if (FLD_TYPE.equals(fieldName)) {
        return TYPE;
      }
      if (FLD_HASH.equals(fieldName)) {
        return HASH;
      }
      if (FLD_USER_ID.equals(fieldName)) {
        return USER_ID;
      }
      if (FLD_PWD.equals(fieldName)) {
        return PWD;
      }
      if (FLD_REAL_NAME.equals(fieldName)) {
        return REAL_NAME;
      }
      if (FLD_AVATOR.equals(fieldName)) {
        return AVATOR;
      }
      if (FLD_GENDER.equals(fieldName)) {
        return GENDER;
      }
      if (FLD_EMAIL.equals(fieldName)) {
        return EMAIL;
      }
      if (FLD_MOBILE.equals(fieldName)) {
        return MOBILE;
      }
      if (FLD_TITLE.equals(fieldName)) {
        return TITLE;
      }
      if (FLD_TOKEN.equals(fieldName)) {
        return TOKEN;
      }
      if (FLD_CREATE_TIME.equals(fieldName)) {
        return CREATE_TIME;
      }
      if (FLD_UPDATE_TIME.equals(fieldName)) {
        return UPDATE_TIME;
      }
      if (FLD_IS_SEND_MESSAGE.equals(fieldName)) {
        return IS_SEND_MESSAGE;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 15) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return TYPE;
      }
      if (fieldIndex == 2) {
        return HASH;
      }
      if (fieldIndex == 3) {
        return USER_ID;
      }
      if (fieldIndex == 4) {
        return PWD;
      }
      if (fieldIndex == 5) {
        return REAL_NAME;
      }
      if (fieldIndex == 6) {
        return AVATOR;
      }
      if (fieldIndex == 7) {
        return GENDER;
      }
      if (fieldIndex == 8) {
        return EMAIL;
      }
      if (fieldIndex == 9) {
        return MOBILE;
      }
      if (fieldIndex == 10) {
        return TITLE;
      }
      if (fieldIndex == 11) {
        return TOKEN;
      }
      if (fieldIndex == 12) {
        return CREATE_TIME;
      }
      if (fieldIndex == 13) {
        return UPDATE_TIME;
      }
      if (fieldIndex == 14) {
        return IS_SEND_MESSAGE;
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
   * 字段TYPE在数据中的名称.
   */
  public static final String FLD_TYPE="TYPE";

  /**
   * 获取字段TYPE的索引值.
   */
  public static final Integer IDX_TYPE=1;

 /**
   * 字段TYPE.
   */
  private Integer TYPE;

  /**
   * 返回字段TYPE的值.
   * @return TYPE  登录类型  int
  */
  public Integer getTYPE() {
    return TYPE;
  }

  /**
   * 设置字段TYPE的值.
   * @param type  登录类型  int
   */
  public void setTYPE(Integer type) {
    this.TYPE=type;
  }

  /**
   * 字段HASH在数据中的名称.
   */
  public static final String FLD_HASH="HASH";

  /**
   * 获取字段HASH的索引值.
   */
  public static final Integer IDX_HASH=2;

 /**
   * 字段HASH.
   */
  private String HASH;

  /**
   * 返回字段HASH的值.
   * @return HASH  哈希值  varchar
  */
  public String getHASH() {
    return HASH;
  }

  /**
   * 设置字段HASH的值.
   * @param hash  哈希值  varchar
   */
  public void setHASH(String hash) {
    this.HASH=hash;
  }

  /**
   * 字段USER_ID在数据中的名称.
   */
  public static final String FLD_USER_ID="USER_ID";

  /**
   * 获取字段USER_ID的索引值.
   */
  public static final Integer IDX_USER_ID=3;

 /**
   * 字段USER_ID.
   */
  private String USER_ID;

  /**
   * 返回字段USER_ID的值.
   * @return USER_ID  用户登录唯一名称标识  varchar
  */
  public String getUSER_ID() {
    return USER_ID;
  }

  /**
   * 设置字段USER_ID的值.
   * @param user_id  用户登录唯一名称标识  varchar
   */
  public void setUSER_ID(String user_id) {
    this.USER_ID=user_id;
  }

  /**
   * 字段PWD在数据中的名称.
   */
  public static final String FLD_PWD="PWD";

  /**
   * 获取字段PWD的索引值.
   */
  public static final Integer IDX_PWD=4;

 /**
   * 字段PWD.
   */
  private String PWD;

  /**
   * 返回字段PWD的值.
   * @return PWD  密码  varchar
  */
  public String getPWD() {
    return PWD;
  }

  /**
   * 设置字段PWD的值.
   * @param pwd  密码  varchar
   */
  public void setPWD(String pwd) {
    this.PWD=pwd;
  }

  /**
   * 字段REAL_NAME在数据中的名称.
   */
  public static final String FLD_REAL_NAME="REAL_NAME";

  /**
   * 获取字段REAL_NAME的索引值.
   */
  public static final Integer IDX_REAL_NAME=5;

 /**
   * 字段REAL_NAME.
   */
  private String REAL_NAME;

  /**
   * 返回字段REAL_NAME的值.
   * @return REAL_NAME  真实姓名  varchar
  */
  public String getREAL_NAME() {
    return REAL_NAME;
  }

  /**
   * 设置字段REAL_NAME的值.
   * @param real_name  真实姓名  varchar
   */
  public void setREAL_NAME(String real_name) {
    this.REAL_NAME=real_name;
  }

  /**
   * 字段AVATOR在数据中的名称.
   */
  public static final String FLD_AVATOR="AVATOR";

  /**
   * 获取字段AVATOR的索引值.
   */
  public static final Integer IDX_AVATOR=6;

 /**
   * 字段AVATOR.
   */
  private String AVATOR;

  /**
   * 返回字段AVATOR的值.
   * @return AVATOR  头像的相对地址  varchar
  */
  public String getAVATOR() {
    return AVATOR;
  }

  /**
   * 设置字段AVATOR的值.
   * @param avator  头像的相对地址  varchar
   */
  public void setAVATOR(String avator) {
    this.AVATOR=avator;
  }

  /**
   * 字段GENDER在数据中的名称.
   */
  public static final String FLD_GENDER="GENDER";

  /**
   * 获取字段GENDER的索引值.
   */
  public static final Integer IDX_GENDER=7;

 /**
   * 字段GENDER.
   */
  private String GENDER;

  /**
   * 返回字段GENDER的值.
   * @return GENDER  性别  varchar
  */
  public String getGENDER() {
    return GENDER;
  }

  /**
   * 设置字段GENDER的值.
   * @param gender  性别  varchar
   */
  public void setGENDER(String gender) {
    this.GENDER=gender;
  }

  /**
   * 字段EMAIL在数据中的名称.
   */
  public static final String FLD_EMAIL="EMAIL";

  /**
   * 获取字段EMAIL的索引值.
   */
  public static final Integer IDX_EMAIL=8;

 /**
   * 字段EMAIL.
   */
  private String EMAIL;

  /**
   * 返回字段EMAIL的值.
   * @return EMAIL  邮箱  varchar
  */
  public String getEMAIL() {
    return EMAIL;
  }

  /**
   * 设置字段EMAIL的值.
   * @param email  邮箱  varchar
   */
  public void setEMAIL(String email) {
    this.EMAIL=email;
  }

  /**
   * 字段MOBILE在数据中的名称.
   */
  public static final String FLD_MOBILE="MOBILE";

  /**
   * 获取字段MOBILE的索引值.
   */
  public static final Integer IDX_MOBILE=9;

 /**
   * 字段MOBILE.
   */
  private String MOBILE;

  /**
   * 返回字段MOBILE的值.
   * @return MOBILE  手机  varchar
  */
  public String getMOBILE() {
    return MOBILE;
  }

  /**
   * 设置字段MOBILE的值.
   * @param mobile  手机  varchar
   */
  public void setMOBILE(String mobile) {
    this.MOBILE=mobile;
  }

  /**
   * 字段TITLE在数据中的名称.
   */
  public static final String FLD_TITLE="TITLE";

  /**
   * 获取字段TITLE的索引值.
   */
  public static final Integer IDX_TITLE=10;

 /**
   * 字段TITLE.
   */
  private String TITLE;

  /**
   * 返回字段TITLE的值.
   * @return TITLE  用户说明  varchar
  */
  public String getTITLE() {
    return TITLE;
  }

  /**
   * 设置字段TITLE的值.
   * @param title  用户说明  varchar
   */
  public void setTITLE(String title) {
    this.TITLE=title;
  }

  /**
   * 字段TOKEN在数据中的名称.
   */
  public static final String FLD_TOKEN="TOKEN";

  /**
   * 获取字段TOKEN的索引值.
   */
  public static final Integer IDX_TOKEN=11;

 /**
   * 字段TOKEN.
   */
  private String TOKEN;

  /**
   * 返回字段TOKEN的值.
   * @return TOKEN  登录的TOKEN  varchar
  */
  public String getTOKEN() {
    return TOKEN;
  }

  /**
   * 设置字段TOKEN的值.
   * @param token  登录的TOKEN  varchar
   */
  public void setTOKEN(String token) {
    this.TOKEN=token;
  }

  /**
   * 字段CREATE_TIME在数据中的名称.
   */
  public static final String FLD_CREATE_TIME="CREATE_TIME";

  /**
   * 获取字段CREATE_TIME的索引值.
   */
  public static final Integer IDX_CREATE_TIME=12;

 /**
   * 字段CREATE_TIME.
   */
  private java.sql.Timestamp CREATE_TIME;

  /**
   * 返回字段CREATE_TIME的值.
   * @return CREATE_TIME    timestamp
  */
  public java.sql.Timestamp getCREATE_TIME() {
    return CREATE_TIME;
  }

  /**
   * 设置字段CREATE_TIME的值.
   * @param create_time    timestamp
   */
  public void setCREATE_TIME(java.sql.Timestamp create_time) {
    this.CREATE_TIME=create_time;
  }

  /**
   * 字段UPDATE_TIME在数据中的名称.
   */
  public static final String FLD_UPDATE_TIME="UPDATE_TIME";

  /**
   * 获取字段UPDATE_TIME的索引值.
   */
  public static final Integer IDX_UPDATE_TIME=13;

 /**
   * 字段UPDATE_TIME.
   */
  private java.sql.Timestamp UPDATE_TIME;

  /**
   * 返回字段UPDATE_TIME的值.
   * @return UPDATE_TIME    timestamp
  */
  public java.sql.Timestamp getUPDATE_TIME() {
    return UPDATE_TIME;
  }

  /**
   * 设置字段UPDATE_TIME的值.
   * @param update_time    timestamp
   */
  public void setUPDATE_TIME(java.sql.Timestamp update_time) {
    this.UPDATE_TIME=update_time;
  }

  /**
   * 字段IS_SEND_MESSAGE在数据中的名称.
   */
  public static final String FLD_IS_SEND_MESSAGE="IS_SEND_MESSAGE";

  /**
   * 获取字段IS_SEND_MESSAGE的索引值.
   */
  public static final Integer IDX_IS_SEND_MESSAGE=14;

 /**
   * 字段IS_SEND_MESSAGE.
   */
  private Integer IS_SEND_MESSAGE;

  /**
   * 返回字段IS_SEND_MESSAGE的值.
   * @return IS_SEND_MESSAGE  是否发短信 0:不发 1:发  int
  */
  public Integer getIS_SEND_MESSAGE() {
    return IS_SEND_MESSAGE;
  }

  /**
   * 设置字段IS_SEND_MESSAGE的值.
   * @param is_send_message  是否发短信 0:不发 1:发  int
   */
  public void setIS_SEND_MESSAGE(Integer is_send_message) {
    this.IS_SEND_MESSAGE=is_send_message;
  }

}

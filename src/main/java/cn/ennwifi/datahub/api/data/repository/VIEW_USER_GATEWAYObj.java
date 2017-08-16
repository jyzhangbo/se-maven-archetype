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
 * 数据库表 VIEW<br/>
 * @author zhangjsf@enn.cn

 *         <b>字段列表</b><br/>

 *         USER_ID   用户id Long<br/>
 *         GATEWAY_ID   网关id Long<br/>
 *         BIND_TIME   添加时间 java.sql.Timestamp<br/>
 *         USER_TYPE   登录类型 Integer<br/>
 *         HASH   哈希值 String<br/>
 *         USER_LOGIN_NAME   用户登录唯一名称标识 String<br/>
 *         PWD   密码 String<br/>
 *         REAL_NAME   真实姓名 String<br/>
 *         AVATOR   头像的相对地址 String<br/>
 *         GENDER   性别 String<br/>
 *         EMAIL   邮箱 String<br/>
 *         MOBILE   手机 String<br/>
 *         TITLE   用户说明 String<br/>
 *         USER_TOKEN   登录的TOKEN String<br/>
 *         USER_CTIME    java.sql.Timestamp<br/>
 *         USER_UPDATE_TIME    java.sql.Timestamp<br/>
 *         IS_SEND_MESSAGE   是否发短信 0:不发 1:发 Integer<br/>
 *         GATEWAY_CTIME   安装时间 java.sql.Timestamp<br/>
 *         GATEWAY_NAME   设备名称 String<br/>
 *         GATEWAY_UPDATE_TIME   更新时间 java.sql.Timestamp<br/>
 *         GATEWAY_STATE   网关状态 0:离线 1:在线 2:升级中 Integer<br/>
 *         GATEWAY_TOKEN   网关token Long<br/>
 *         GATEWAY_ADDRESS   网关地址 String<br/>
 *         GATEWAY_TYPE   网关类型 String<br/>
 *         GATEWAY_VER   网关版本 String<br/>
 */

@Table("VIEW_USER_GATEWAY")
public class VIEW_USER_GATEWAYObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_VIEW_USER_GATEWAY="VIEW_USER_GATEWAY";
  public VIEW_USER_GATEWAYObj() {
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
      if (FLD_GATEWAY_ID.equals(fieldName)) {
        return GATEWAY_ID;
      }
      if (FLD_BIND_TIME.equals(fieldName)) {
        return BIND_TIME;
      }
      if (FLD_USER_TYPE.equals(fieldName)) {
        return USER_TYPE;
      }
      if (FLD_HASH.equals(fieldName)) {
        return HASH;
      }
      if (FLD_USER_LOGIN_NAME.equals(fieldName)) {
        return USER_LOGIN_NAME;
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
      if (FLD_USER_TOKEN.equals(fieldName)) {
        return USER_TOKEN;
      }
      if (FLD_USER_CTIME.equals(fieldName)) {
        return USER_CTIME;
      }
      if (FLD_USER_UPDATE_TIME.equals(fieldName)) {
        return USER_UPDATE_TIME;
      }
      if (FLD_IS_SEND_MESSAGE.equals(fieldName)) {
        return IS_SEND_MESSAGE;
      }
      if (FLD_GATEWAY_CTIME.equals(fieldName)) {
        return GATEWAY_CTIME;
      }
      if (FLD_GATEWAY_NAME.equals(fieldName)) {
        return GATEWAY_NAME;
      }
      if (FLD_GATEWAY_UPDATE_TIME.equals(fieldName)) {
        return GATEWAY_UPDATE_TIME;
      }
      if (FLD_GATEWAY_STATE.equals(fieldName)) {
        return GATEWAY_STATE;
      }
      if (FLD_GATEWAY_TOKEN.equals(fieldName)) {
        return GATEWAY_TOKEN;
      }
      if (FLD_GATEWAY_ADDRESS.equals(fieldName)) {
        return GATEWAY_ADDRESS;
      }
      if (FLD_GATEWAY_TYPE.equals(fieldName)) {
        return GATEWAY_TYPE;
      }
      if (FLD_GATEWAY_VER.equals(fieldName)) {
        return GATEWAY_VER;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 25) {
      if (fieldIndex == 0) {
        return USER_ID;
      }
      if (fieldIndex == 1) {
        return GATEWAY_ID;
      }
      if (fieldIndex == 2) {
        return BIND_TIME;
      }
      if (fieldIndex == 3) {
        return USER_TYPE;
      }
      if (fieldIndex == 4) {
        return HASH;
      }
      if (fieldIndex == 5) {
        return USER_LOGIN_NAME;
      }
      if (fieldIndex == 6) {
        return PWD;
      }
      if (fieldIndex == 7) {
        return REAL_NAME;
      }
      if (fieldIndex == 8) {
        return AVATOR;
      }
      if (fieldIndex == 9) {
        return GENDER;
      }
      if (fieldIndex == 10) {
        return EMAIL;
      }
      if (fieldIndex == 11) {
        return MOBILE;
      }
      if (fieldIndex == 12) {
        return TITLE;
      }
      if (fieldIndex == 13) {
        return USER_TOKEN;
      }
      if (fieldIndex == 14) {
        return USER_CTIME;
      }
      if (fieldIndex == 15) {
        return USER_UPDATE_TIME;
      }
      if (fieldIndex == 16) {
        return IS_SEND_MESSAGE;
      }
      if (fieldIndex == 17) {
        return GATEWAY_CTIME;
      }
      if (fieldIndex == 18) {
        return GATEWAY_NAME;
      }
      if (fieldIndex == 19) {
        return GATEWAY_UPDATE_TIME;
      }
      if (fieldIndex == 20) {
        return GATEWAY_STATE;
      }
      if (fieldIndex == 21) {
        return GATEWAY_TOKEN;
      }
      if (fieldIndex == 22) {
        return GATEWAY_ADDRESS;
      }
      if (fieldIndex == 23) {
        return GATEWAY_TYPE;
      }
      if (fieldIndex == 24) {
        return GATEWAY_VER;
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

 /**
   * 字段USER_ID.
   */
  private Long USER_ID;

  /**
   * 返回字段USER_ID的值.
   * @return USER_ID  用户id  bigint
  */
  public Long getUSER_ID() {
    return USER_ID;
  }

  /**
   * 设置字段USER_ID的值.
   * @param user_id  用户id  bigint
   */
  public void setUSER_ID(Long user_id) {
    this.USER_ID=user_id;
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
  private Long GATEWAY_ID;

  /**
   * 返回字段GATEWAY_ID的值.
   * @return GATEWAY_ID  网关id  bigint
  */
  public Long getGATEWAY_ID() {
    return GATEWAY_ID;
  }

  /**
   * 设置字段GATEWAY_ID的值.
   * @param gateway_id  网关id  bigint
   */
  public void setGATEWAY_ID(Long gateway_id) {
    this.GATEWAY_ID=gateway_id;
  }

  /**
   * 字段BIND_TIME在数据中的名称.
   */
  public static final String FLD_BIND_TIME="BIND_TIME";

  /**
   * 获取字段BIND_TIME的索引值.
   */
  public static final Integer IDX_BIND_TIME=2;

 /**
   * 字段BIND_TIME.
   */
  private java.sql.Timestamp BIND_TIME;

  /**
   * 返回字段BIND_TIME的值.
   * @return BIND_TIME  添加时间  timestamp
  */
  public java.sql.Timestamp getBIND_TIME() {
    return BIND_TIME;
  }

  /**
   * 设置字段BIND_TIME的值.
   * @param bind_time  添加时间  timestamp
   */
  public void setBIND_TIME(java.sql.Timestamp bind_time) {
    this.BIND_TIME=bind_time;
  }

  /**
   * 字段USER_TYPE在数据中的名称.
   */
  public static final String FLD_USER_TYPE="USER_TYPE";

  /**
   * 获取字段USER_TYPE的索引值.
   */
  public static final Integer IDX_USER_TYPE=3;

 /**
   * 字段USER_TYPE.
   */
  private Integer USER_TYPE;

  /**
   * 返回字段USER_TYPE的值.
   * @return USER_TYPE  登录类型  int
  */
  public Integer getUSER_TYPE() {
    return USER_TYPE;
  }

  /**
   * 设置字段USER_TYPE的值.
   * @param user_type  登录类型  int
   */
  public void setUSER_TYPE(Integer user_type) {
    this.USER_TYPE=user_type;
  }

  /**
   * 字段HASH在数据中的名称.
   */
  public static final String FLD_HASH="HASH";

  /**
   * 获取字段HASH的索引值.
   */
  public static final Integer IDX_HASH=4;

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
   * 字段USER_LOGIN_NAME在数据中的名称.
   */
  public static final String FLD_USER_LOGIN_NAME="USER_LOGIN_NAME";

  /**
   * 获取字段USER_LOGIN_NAME的索引值.
   */
  public static final Integer IDX_USER_LOGIN_NAME=5;

 /**
   * 字段USER_LOGIN_NAME.
   */
  private String USER_LOGIN_NAME;

  /**
   * 返回字段USER_LOGIN_NAME的值.
   * @return USER_LOGIN_NAME  用户登录唯一名称标识  varchar
  */
  public String getUSER_LOGIN_NAME() {
    return USER_LOGIN_NAME;
  }

  /**
   * 设置字段USER_LOGIN_NAME的值.
   * @param user_login_name  用户登录唯一名称标识  varchar
   */
  public void setUSER_LOGIN_NAME(String user_login_name) {
    this.USER_LOGIN_NAME=user_login_name;
  }

  /**
   * 字段PWD在数据中的名称.
   */
  public static final String FLD_PWD="PWD";

  /**
   * 获取字段PWD的索引值.
   */
  public static final Integer IDX_PWD=6;

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
  public static final Integer IDX_REAL_NAME=7;

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
  public static final Integer IDX_AVATOR=8;

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
  public static final Integer IDX_GENDER=9;

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
  public static final Integer IDX_EMAIL=10;

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
  public static final Integer IDX_MOBILE=11;

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
  public static final Integer IDX_TITLE=12;

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
   * 字段USER_TOKEN在数据中的名称.
   */
  public static final String FLD_USER_TOKEN="USER_TOKEN";

  /**
   * 获取字段USER_TOKEN的索引值.
   */
  public static final Integer IDX_USER_TOKEN=13;

 /**
   * 字段USER_TOKEN.
   */
  private String USER_TOKEN;

  /**
   * 返回字段USER_TOKEN的值.
   * @return USER_TOKEN  登录的TOKEN  varchar
  */
  public String getUSER_TOKEN() {
    return USER_TOKEN;
  }

  /**
   * 设置字段USER_TOKEN的值.
   * @param user_token  登录的TOKEN  varchar
   */
  public void setUSER_TOKEN(String user_token) {
    this.USER_TOKEN=user_token;
  }

  /**
   * 字段USER_CTIME在数据中的名称.
   */
  public static final String FLD_USER_CTIME="USER_CTIME";

  /**
   * 获取字段USER_CTIME的索引值.
   */
  public static final Integer IDX_USER_CTIME=14;

 /**
   * 字段USER_CTIME.
   */
  private java.sql.Timestamp USER_CTIME;

  /**
   * 返回字段USER_CTIME的值.
   * @return USER_CTIME    timestamp
  */
  public java.sql.Timestamp getUSER_CTIME() {
    return USER_CTIME;
  }

  /**
   * 设置字段USER_CTIME的值.
   * @param user_ctime    timestamp
   */
  public void setUSER_CTIME(java.sql.Timestamp user_ctime) {
    this.USER_CTIME=user_ctime;
  }

  /**
   * 字段USER_UPDATE_TIME在数据中的名称.
   */
  public static final String FLD_USER_UPDATE_TIME="USER_UPDATE_TIME";

  /**
   * 获取字段USER_UPDATE_TIME的索引值.
   */
  public static final Integer IDX_USER_UPDATE_TIME=15;

 /**
   * 字段USER_UPDATE_TIME.
   */
  private java.sql.Timestamp USER_UPDATE_TIME;

  /**
   * 返回字段USER_UPDATE_TIME的值.
   * @return USER_UPDATE_TIME    timestamp
  */
  public java.sql.Timestamp getUSER_UPDATE_TIME() {
    return USER_UPDATE_TIME;
  }

  /**
   * 设置字段USER_UPDATE_TIME的值.
   * @param user_update_time    timestamp
   */
  public void setUSER_UPDATE_TIME(java.sql.Timestamp user_update_time) {
    this.USER_UPDATE_TIME=user_update_time;
  }

  /**
   * 字段IS_SEND_MESSAGE在数据中的名称.
   */
  public static final String FLD_IS_SEND_MESSAGE="IS_SEND_MESSAGE";

  /**
   * 获取字段IS_SEND_MESSAGE的索引值.
   */
  public static final Integer IDX_IS_SEND_MESSAGE=16;

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

  /**
   * 字段GATEWAY_CTIME在数据中的名称.
   */
  public static final String FLD_GATEWAY_CTIME="GATEWAY_CTIME";

  /**
   * 获取字段GATEWAY_CTIME的索引值.
   */
  public static final Integer IDX_GATEWAY_CTIME=17;

 /**
   * 字段GATEWAY_CTIME.
   */
  private java.sql.Timestamp GATEWAY_CTIME;

  /**
   * 返回字段GATEWAY_CTIME的值.
   * @return GATEWAY_CTIME  安装时间  timestamp
  */
  public java.sql.Timestamp getGATEWAY_CTIME() {
    return GATEWAY_CTIME;
  }

  /**
   * 设置字段GATEWAY_CTIME的值.
   * @param gateway_ctime  安装时间  timestamp
   */
  public void setGATEWAY_CTIME(java.sql.Timestamp gateway_ctime) {
    this.GATEWAY_CTIME=gateway_ctime;
  }

  /**
   * 字段GATEWAY_NAME在数据中的名称.
   */
  public static final String FLD_GATEWAY_NAME="GATEWAY_NAME";

  /**
   * 获取字段GATEWAY_NAME的索引值.
   */
  public static final Integer IDX_GATEWAY_NAME=18;

 /**
   * 字段GATEWAY_NAME.
   */
  private String GATEWAY_NAME;

  /**
   * 返回字段GATEWAY_NAME的值.
   * @return GATEWAY_NAME  设备名称  varchar
  */
  public String getGATEWAY_NAME() {
    return GATEWAY_NAME;
  }

  /**
   * 设置字段GATEWAY_NAME的值.
   * @param gateway_name  设备名称  varchar
   */
  public void setGATEWAY_NAME(String gateway_name) {
    this.GATEWAY_NAME=gateway_name;
  }

  /**
   * 字段GATEWAY_UPDATE_TIME在数据中的名称.
   */
  public static final String FLD_GATEWAY_UPDATE_TIME="GATEWAY_UPDATE_TIME";

  /**
   * 获取字段GATEWAY_UPDATE_TIME的索引值.
   */
  public static final Integer IDX_GATEWAY_UPDATE_TIME=19;

 /**
   * 字段GATEWAY_UPDATE_TIME.
   */
  private java.sql.Timestamp GATEWAY_UPDATE_TIME;

  /**
   * 返回字段GATEWAY_UPDATE_TIME的值.
   * @return GATEWAY_UPDATE_TIME  更新时间  timestamp
  */
  public java.sql.Timestamp getGATEWAY_UPDATE_TIME() {
    return GATEWAY_UPDATE_TIME;
  }

  /**
   * 设置字段GATEWAY_UPDATE_TIME的值.
   * @param gateway_update_time  更新时间  timestamp
   */
  public void setGATEWAY_UPDATE_TIME(java.sql.Timestamp gateway_update_time) {
    this.GATEWAY_UPDATE_TIME=gateway_update_time;
  }

  /**
   * 字段GATEWAY_STATE在数据中的名称.
   */
  public static final String FLD_GATEWAY_STATE="GATEWAY_STATE";

  /**
   * 获取字段GATEWAY_STATE的索引值.
   */
  public static final Integer IDX_GATEWAY_STATE=20;

 /**
   * 字段GATEWAY_STATE.
   */
  private Integer GATEWAY_STATE;

  /**
   * 返回字段GATEWAY_STATE的值.
   * @return GATEWAY_STATE  网关状态 0:离线 1:在线 2:升级中  int
  */
  public Integer getGATEWAY_STATE() {
    return GATEWAY_STATE;
  }

  /**
   * 设置字段GATEWAY_STATE的值.
   * @param gateway_state  网关状态 0:离线 1:在线 2:升级中  int
   */
  public void setGATEWAY_STATE(Integer gateway_state) {
    this.GATEWAY_STATE=gateway_state;
  }

  /**
   * 字段GATEWAY_TOKEN在数据中的名称.
   */
  public static final String FLD_GATEWAY_TOKEN="GATEWAY_TOKEN";

  /**
   * 获取字段GATEWAY_TOKEN的索引值.
   */
  public static final Integer IDX_GATEWAY_TOKEN=21;

 /**
   * 字段GATEWAY_TOKEN.
   */
  private Long GATEWAY_TOKEN;

  /**
   * 返回字段GATEWAY_TOKEN的值.
   * @return GATEWAY_TOKEN  网关token  bigint
  */
  public Long getGATEWAY_TOKEN() {
    return GATEWAY_TOKEN;
  }

  /**
   * 设置字段GATEWAY_TOKEN的值.
   * @param gateway_token  网关token  bigint
   */
  public void setGATEWAY_TOKEN(Long gateway_token) {
    this.GATEWAY_TOKEN=gateway_token;
  }

  /**
   * 字段GATEWAY_ADDRESS在数据中的名称.
   */
  public static final String FLD_GATEWAY_ADDRESS="GATEWAY_ADDRESS";

  /**
   * 获取字段GATEWAY_ADDRESS的索引值.
   */
  public static final Integer IDX_GATEWAY_ADDRESS=22;

 /**
   * 字段GATEWAY_ADDRESS.
   */
  private String GATEWAY_ADDRESS;

  /**
   * 返回字段GATEWAY_ADDRESS的值.
   * @return GATEWAY_ADDRESS  网关地址  varchar
  */
  public String getGATEWAY_ADDRESS() {
    return GATEWAY_ADDRESS;
  }

  /**
   * 设置字段GATEWAY_ADDRESS的值.
   * @param gateway_address  网关地址  varchar
   */
  public void setGATEWAY_ADDRESS(String gateway_address) {
    this.GATEWAY_ADDRESS=gateway_address;
  }

  /**
   * 字段GATEWAY_TYPE在数据中的名称.
   */
  public static final String FLD_GATEWAY_TYPE="GATEWAY_TYPE";

  /**
   * 获取字段GATEWAY_TYPE的索引值.
   */
  public static final Integer IDX_GATEWAY_TYPE=23;

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
   * 字段GATEWAY_VER在数据中的名称.
   */
  public static final String FLD_GATEWAY_VER="GATEWAY_VER";

  /**
   * 获取字段GATEWAY_VER的索引值.
   */
  public static final Integer IDX_GATEWAY_VER=24;

 /**
   * 字段GATEWAY_VER.
   */
  private String GATEWAY_VER;

  /**
   * 返回字段GATEWAY_VER的值.
   * @return GATEWAY_VER  网关版本  varchar
  */
  public String getGATEWAY_VER() {
    return GATEWAY_VER;
  }

  /**
   * 设置字段GATEWAY_VER的值.
   * @param gateway_ver  网关版本  varchar
   */
  public void setGATEWAY_VER(String gateway_ver) {
    this.GATEWAY_VER=gateway_ver;
  }

}

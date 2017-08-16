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
 *         GATEWAY_ID   网关id Long<br/>
 *         GATEWAY_NAME   网关名称 String<br/>
 *         SERVER_IP   服务器ip String<br/>
 *         UPLOAD_INTERVAL   发送间隔 Integer<br/>
 *         OVER_TIME   超时时间 Integer<br/>
 *         COM1_BTL   com1波特率 String<br/>
 *         COM1_SJW   com1数据位 String<br/>
 *         COM1_TZW   com1停止位 String<br/>
 *         COM1_JYW   com1校验位 String<br/>
 *         COM1_DEVICE   com1设备配置 String<br/>
 *         COM2_BTL   com1串口 String<br/>
 *         COM2_SJW   com2串口 String<br/>
 *         COM2_TZW    String<br/>
 *         COM2_JYW    String<br/>
 *         COM2_DEVICE   com2设备管理 String<br/>
 *         COM3_BTL   com3串口 String<br/>
 *         COM3_SJW    String<br/>
 *         COM3_TZW    String<br/>
 *         COM3_JYW    String<br/>
 *         COM3_DEVICE   com3设备配置 String<br/>
 *         COM4_BTL    String<br/>
 *         COM4_SJW    String<br/>
 *         COM4_TZW    String<br/>
 *         COM4_JYW   com4串口 String<br/>
 *         COM4_DEVICE   com4设备配置 String<br/>
 *         LAN_LJFS   lan口 String<br/>
 *         LAN_YDIP    String<br/>
 *         LAN_YDDK    String<br/>
 *         LAN_BDIP    String<br/>
 *         LAN_BDDK    String<br/>
 *         LAN_DEVICE   lan口设备配置 String<br/>
 *         COM_SERIAL_PORT   COM XML String<br/>
 *         LAN_SERIAL_PORT   LAN XML String<br/>
 */

@Table("GATEWAY_CONFIGURE")
public class GATEWAY_CONFIGUREObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_GATEWAY_CONFIGURE="GATEWAY_CONFIGURE";
  public GATEWAY_CONFIGUREObj() {
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
      if (FLD_GATEWAY_ID.equals(fieldName)) {
        return GATEWAY_ID;
      }
      if (FLD_GATEWAY_NAME.equals(fieldName)) {
        return GATEWAY_NAME;
      }
      if (FLD_SERVER_IP.equals(fieldName)) {
        return SERVER_IP;
      }
      if (FLD_UPLOAD_INTERVAL.equals(fieldName)) {
        return UPLOAD_INTERVAL;
      }
      if (FLD_OVER_TIME.equals(fieldName)) {
        return OVER_TIME;
      }
      if (FLD_COM1_BTL.equals(fieldName)) {
        return COM1_BTL;
      }
      if (FLD_COM1_SJW.equals(fieldName)) {
        return COM1_SJW;
      }
      if (FLD_COM1_TZW.equals(fieldName)) {
        return COM1_TZW;
      }
      if (FLD_COM1_JYW.equals(fieldName)) {
        return COM1_JYW;
      }
      if (FLD_COM1_DEVICE.equals(fieldName)) {
        return COM1_DEVICE;
      }
      if (FLD_COM2_BTL.equals(fieldName)) {
        return COM2_BTL;
      }
      if (FLD_COM2_SJW.equals(fieldName)) {
        return COM2_SJW;
      }
      if (FLD_COM2_TZW.equals(fieldName)) {
        return COM2_TZW;
      }
      if (FLD_COM2_JYW.equals(fieldName)) {
        return COM2_JYW;
      }
      if (FLD_COM2_DEVICE.equals(fieldName)) {
        return COM2_DEVICE;
      }
      if (FLD_COM3_BTL.equals(fieldName)) {
        return COM3_BTL;
      }
      if (FLD_COM3_SJW.equals(fieldName)) {
        return COM3_SJW;
      }
      if (FLD_COM3_TZW.equals(fieldName)) {
        return COM3_TZW;
      }
      if (FLD_COM3_JYW.equals(fieldName)) {
        return COM3_JYW;
      }
      if (FLD_COM3_DEVICE.equals(fieldName)) {
        return COM3_DEVICE;
      }
      if (FLD_COM4_BTL.equals(fieldName)) {
        return COM4_BTL;
      }
      if (FLD_COM4_SJW.equals(fieldName)) {
        return COM4_SJW;
      }
      if (FLD_COM4_TZW.equals(fieldName)) {
        return COM4_TZW;
      }
      if (FLD_COM4_JYW.equals(fieldName)) {
        return COM4_JYW;
      }
      if (FLD_COM4_DEVICE.equals(fieldName)) {
        return COM4_DEVICE;
      }
      if (FLD_LAN_LJFS.equals(fieldName)) {
        return LAN_LJFS;
      }
      if (FLD_LAN_YDIP.equals(fieldName)) {
        return LAN_YDIP;
      }
      if (FLD_LAN_YDDK.equals(fieldName)) {
        return LAN_YDDK;
      }
      if (FLD_LAN_BDIP.equals(fieldName)) {
        return LAN_BDIP;
      }
      if (FLD_LAN_BDDK.equals(fieldName)) {
        return LAN_BDDK;
      }
      if (FLD_LAN_DEVICE.equals(fieldName)) {
        return LAN_DEVICE;
      }
      if (FLD_COM_SERIAL_PORT.equals(fieldName)) {
        return COM_SERIAL_PORT;
      }
      if (FLD_LAN_SERIAL_PORT.equals(fieldName)) {
        return LAN_SERIAL_PORT;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 34) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return GATEWAY_ID;
      }
      if (fieldIndex == 2) {
        return GATEWAY_NAME;
      }
      if (fieldIndex == 3) {
        return SERVER_IP;
      }
      if (fieldIndex == 4) {
        return UPLOAD_INTERVAL;
      }
      if (fieldIndex == 5) {
        return OVER_TIME;
      }
      if (fieldIndex == 6) {
        return COM1_BTL;
      }
      if (fieldIndex == 7) {
        return COM1_SJW;
      }
      if (fieldIndex == 8) {
        return COM1_TZW;
      }
      if (fieldIndex == 9) {
        return COM1_JYW;
      }
      if (fieldIndex == 10) {
        return COM1_DEVICE;
      }
      if (fieldIndex == 11) {
        return COM2_BTL;
      }
      if (fieldIndex == 12) {
        return COM2_SJW;
      }
      if (fieldIndex == 13) {
        return COM2_TZW;
      }
      if (fieldIndex == 14) {
        return COM2_JYW;
      }
      if (fieldIndex == 15) {
        return COM2_DEVICE;
      }
      if (fieldIndex == 16) {
        return COM3_BTL;
      }
      if (fieldIndex == 17) {
        return COM3_SJW;
      }
      if (fieldIndex == 18) {
        return COM3_TZW;
      }
      if (fieldIndex == 19) {
        return COM3_JYW;
      }
      if (fieldIndex == 20) {
        return COM3_DEVICE;
      }
      if (fieldIndex == 21) {
        return COM4_BTL;
      }
      if (fieldIndex == 22) {
        return COM4_SJW;
      }
      if (fieldIndex == 23) {
        return COM4_TZW;
      }
      if (fieldIndex == 24) {
        return COM4_JYW;
      }
      if (fieldIndex == 25) {
        return COM4_DEVICE;
      }
      if (fieldIndex == 26) {
        return LAN_LJFS;
      }
      if (fieldIndex == 27) {
        return LAN_YDIP;
      }
      if (fieldIndex == 28) {
        return LAN_YDDK;
      }
      if (fieldIndex == 29) {
        return LAN_BDIP;
      }
      if (fieldIndex == 30) {
        return LAN_BDDK;
      }
      if (fieldIndex == 31) {
        return LAN_DEVICE;
      }
      if (fieldIndex == 32) {
        return COM_SERIAL_PORT;
      }
      if (fieldIndex == 33) {
        return LAN_SERIAL_PORT;
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
   * 字段GATEWAY_NAME在数据中的名称.
   */
  public static final String FLD_GATEWAY_NAME="GATEWAY_NAME";

  /**
   * 获取字段GATEWAY_NAME的索引值.
   */
  public static final Integer IDX_GATEWAY_NAME=2;

 /**
   * 字段GATEWAY_NAME.
   */
  private String GATEWAY_NAME;

  /**
   * 返回字段GATEWAY_NAME的值.
   * @return GATEWAY_NAME  网关名称  varchar
  */
  public String getGATEWAY_NAME() {
    return GATEWAY_NAME;
  }

  /**
   * 设置字段GATEWAY_NAME的值.
   * @param gateway_name  网关名称  varchar
   */
  public void setGATEWAY_NAME(String gateway_name) {
    this.GATEWAY_NAME=gateway_name;
  }

  /**
   * 字段SERVER_IP在数据中的名称.
   */
  public static final String FLD_SERVER_IP="SERVER_IP";

  /**
   * 获取字段SERVER_IP的索引值.
   */
  public static final Integer IDX_SERVER_IP=3;

 /**
   * 字段SERVER_IP.
   */
  private String SERVER_IP;

  /**
   * 返回字段SERVER_IP的值.
   * @return SERVER_IP  服务器ip  varchar
  */
  public String getSERVER_IP() {
    return SERVER_IP;
  }

  /**
   * 设置字段SERVER_IP的值.
   * @param server_ip  服务器ip  varchar
   */
  public void setSERVER_IP(String server_ip) {
    this.SERVER_IP=server_ip;
  }

  /**
   * 字段UPLOAD_INTERVAL在数据中的名称.
   */
  public static final String FLD_UPLOAD_INTERVAL="UPLOAD_INTERVAL";

  /**
   * 获取字段UPLOAD_INTERVAL的索引值.
   */
  public static final Integer IDX_UPLOAD_INTERVAL=4;

 /**
   * 字段UPLOAD_INTERVAL.
   */
  private Integer UPLOAD_INTERVAL;

  /**
   * 返回字段UPLOAD_INTERVAL的值.
   * @return UPLOAD_INTERVAL  发送间隔  int
  */
  public Integer getUPLOAD_INTERVAL() {
    return UPLOAD_INTERVAL;
  }

  /**
   * 设置字段UPLOAD_INTERVAL的值.
   * @param upload_interval  发送间隔  int
   */
  public void setUPLOAD_INTERVAL(Integer upload_interval) {
    this.UPLOAD_INTERVAL=upload_interval;
  }

  /**
   * 字段OVER_TIME在数据中的名称.
   */
  public static final String FLD_OVER_TIME="OVER_TIME";

  /**
   * 获取字段OVER_TIME的索引值.
   */
  public static final Integer IDX_OVER_TIME=5;

 /**
   * 字段OVER_TIME.
   */
  private Integer OVER_TIME;

  /**
   * 返回字段OVER_TIME的值.
   * @return OVER_TIME  超时时间  int
  */
  public Integer getOVER_TIME() {
    return OVER_TIME;
  }

  /**
   * 设置字段OVER_TIME的值.
   * @param over_time  超时时间  int
   */
  public void setOVER_TIME(Integer over_time) {
    this.OVER_TIME=over_time;
  }

  /**
   * 字段COM1_BTL在数据中的名称.
   */
  public static final String FLD_COM1_BTL="COM1_BTL";

  /**
   * 获取字段COM1_BTL的索引值.
   */
  public static final Integer IDX_COM1_BTL=6;

 /**
   * 字段COM1_BTL.
   */
  private String COM1_BTL;

  /**
   * 返回字段COM1_BTL的值.
   * @return COM1_BTL  com1波特率  varchar
  */
  public String getCOM1_BTL() {
    return COM1_BTL;
  }

  /**
   * 设置字段COM1_BTL的值.
   * @param com1_btl  com1波特率  varchar
   */
  public void setCOM1_BTL(String com1_btl) {
    this.COM1_BTL=com1_btl;
  }

  /**
   * 字段COM1_SJW在数据中的名称.
   */
  public static final String FLD_COM1_SJW="COM1_SJW";

  /**
   * 获取字段COM1_SJW的索引值.
   */
  public static final Integer IDX_COM1_SJW=7;

 /**
   * 字段COM1_SJW.
   */
  private String COM1_SJW;

  /**
   * 返回字段COM1_SJW的值.
   * @return COM1_SJW  com1数据位  varchar
  */
  public String getCOM1_SJW() {
    return COM1_SJW;
  }

  /**
   * 设置字段COM1_SJW的值.
   * @param com1_sjw  com1数据位  varchar
   */
  public void setCOM1_SJW(String com1_sjw) {
    this.COM1_SJW=com1_sjw;
  }

  /**
   * 字段COM1_TZW在数据中的名称.
   */
  public static final String FLD_COM1_TZW="COM1_TZW";

  /**
   * 获取字段COM1_TZW的索引值.
   */
  public static final Integer IDX_COM1_TZW=8;

 /**
   * 字段COM1_TZW.
   */
  private String COM1_TZW;

  /**
   * 返回字段COM1_TZW的值.
   * @return COM1_TZW  com1停止位  varchar
  */
  public String getCOM1_TZW() {
    return COM1_TZW;
  }

  /**
   * 设置字段COM1_TZW的值.
   * @param com1_tzw  com1停止位  varchar
   */
  public void setCOM1_TZW(String com1_tzw) {
    this.COM1_TZW=com1_tzw;
  }

  /**
   * 字段COM1_JYW在数据中的名称.
   */
  public static final String FLD_COM1_JYW="COM1_JYW";

  /**
   * 获取字段COM1_JYW的索引值.
   */
  public static final Integer IDX_COM1_JYW=9;

 /**
   * 字段COM1_JYW.
   */
  private String COM1_JYW;

  /**
   * 返回字段COM1_JYW的值.
   * @return COM1_JYW  com1校验位  varchar
  */
  public String getCOM1_JYW() {
    return COM1_JYW;
  }

  /**
   * 设置字段COM1_JYW的值.
   * @param com1_jyw  com1校验位  varchar
   */
  public void setCOM1_JYW(String com1_jyw) {
    this.COM1_JYW=com1_jyw;
  }

  /**
   * 字段COM1_DEVICE在数据中的名称.
   */
  public static final String FLD_COM1_DEVICE="COM1_DEVICE";

  /**
   * 获取字段COM1_DEVICE的索引值.
   */
  public static final Integer IDX_COM1_DEVICE=10;

 /**
   * 字段COM1_DEVICE.
   */
  private String COM1_DEVICE;

  /**
   * 返回字段COM1_DEVICE的值.
   * @return COM1_DEVICE  com1设备配置  text
  */
  public String getCOM1_DEVICE() {
    return COM1_DEVICE;
  }

  /**
   * 设置字段COM1_DEVICE的值.
   * @param com1_device  com1设备配置  text
   */
  public void setCOM1_DEVICE(String com1_device) {
    this.COM1_DEVICE=com1_device;
  }

  /**
   * 字段COM2_BTL在数据中的名称.
   */
  public static final String FLD_COM2_BTL="COM2_BTL";

  /**
   * 获取字段COM2_BTL的索引值.
   */
  public static final Integer IDX_COM2_BTL=11;

 /**
   * 字段COM2_BTL.
   */
  private String COM2_BTL;

  /**
   * 返回字段COM2_BTL的值.
   * @return COM2_BTL  com1串口  varchar
  */
  public String getCOM2_BTL() {
    return COM2_BTL;
  }

  /**
   * 设置字段COM2_BTL的值.
   * @param com2_btl  com1串口  varchar
   */
  public void setCOM2_BTL(String com2_btl) {
    this.COM2_BTL=com2_btl;
  }

  /**
   * 字段COM2_SJW在数据中的名称.
   */
  public static final String FLD_COM2_SJW="COM2_SJW";

  /**
   * 获取字段COM2_SJW的索引值.
   */
  public static final Integer IDX_COM2_SJW=12;

 /**
   * 字段COM2_SJW.
   */
  private String COM2_SJW;

  /**
   * 返回字段COM2_SJW的值.
   * @return COM2_SJW  com2串口  varchar
  */
  public String getCOM2_SJW() {
    return COM2_SJW;
  }

  /**
   * 设置字段COM2_SJW的值.
   * @param com2_sjw  com2串口  varchar
   */
  public void setCOM2_SJW(String com2_sjw) {
    this.COM2_SJW=com2_sjw;
  }

  /**
   * 字段COM2_TZW在数据中的名称.
   */
  public static final String FLD_COM2_TZW="COM2_TZW";

  /**
   * 获取字段COM2_TZW的索引值.
   */
  public static final Integer IDX_COM2_TZW=13;

 /**
   * 字段COM2_TZW.
   */
  private String COM2_TZW;

  /**
   * 返回字段COM2_TZW的值.
   * @return COM2_TZW    varchar
  */
  public String getCOM2_TZW() {
    return COM2_TZW;
  }

  /**
   * 设置字段COM2_TZW的值.
   * @param com2_tzw    varchar
   */
  public void setCOM2_TZW(String com2_tzw) {
    this.COM2_TZW=com2_tzw;
  }

  /**
   * 字段COM2_JYW在数据中的名称.
   */
  public static final String FLD_COM2_JYW="COM2_JYW";

  /**
   * 获取字段COM2_JYW的索引值.
   */
  public static final Integer IDX_COM2_JYW=14;

 /**
   * 字段COM2_JYW.
   */
  private String COM2_JYW;

  /**
   * 返回字段COM2_JYW的值.
   * @return COM2_JYW    varchar
  */
  public String getCOM2_JYW() {
    return COM2_JYW;
  }

  /**
   * 设置字段COM2_JYW的值.
   * @param com2_jyw    varchar
   */
  public void setCOM2_JYW(String com2_jyw) {
    this.COM2_JYW=com2_jyw;
  }

  /**
   * 字段COM2_DEVICE在数据中的名称.
   */
  public static final String FLD_COM2_DEVICE="COM2_DEVICE";

  /**
   * 获取字段COM2_DEVICE的索引值.
   */
  public static final Integer IDX_COM2_DEVICE=15;

 /**
   * 字段COM2_DEVICE.
   */
  private String COM2_DEVICE;

  /**
   * 返回字段COM2_DEVICE的值.
   * @return COM2_DEVICE  com2设备管理  text
  */
  public String getCOM2_DEVICE() {
    return COM2_DEVICE;
  }

  /**
   * 设置字段COM2_DEVICE的值.
   * @param com2_device  com2设备管理  text
   */
  public void setCOM2_DEVICE(String com2_device) {
    this.COM2_DEVICE=com2_device;
  }

  /**
   * 字段COM3_BTL在数据中的名称.
   */
  public static final String FLD_COM3_BTL="COM3_BTL";

  /**
   * 获取字段COM3_BTL的索引值.
   */
  public static final Integer IDX_COM3_BTL=16;

 /**
   * 字段COM3_BTL.
   */
  private String COM3_BTL;

  /**
   * 返回字段COM3_BTL的值.
   * @return COM3_BTL  com3串口  varchar
  */
  public String getCOM3_BTL() {
    return COM3_BTL;
  }

  /**
   * 设置字段COM3_BTL的值.
   * @param com3_btl  com3串口  varchar
   */
  public void setCOM3_BTL(String com3_btl) {
    this.COM3_BTL=com3_btl;
  }

  /**
   * 字段COM3_SJW在数据中的名称.
   */
  public static final String FLD_COM3_SJW="COM3_SJW";

  /**
   * 获取字段COM3_SJW的索引值.
   */
  public static final Integer IDX_COM3_SJW=17;

 /**
   * 字段COM3_SJW.
   */
  private String COM3_SJW;

  /**
   * 返回字段COM3_SJW的值.
   * @return COM3_SJW    varchar
  */
  public String getCOM3_SJW() {
    return COM3_SJW;
  }

  /**
   * 设置字段COM3_SJW的值.
   * @param com3_sjw    varchar
   */
  public void setCOM3_SJW(String com3_sjw) {
    this.COM3_SJW=com3_sjw;
  }

  /**
   * 字段COM3_TZW在数据中的名称.
   */
  public static final String FLD_COM3_TZW="COM3_TZW";

  /**
   * 获取字段COM3_TZW的索引值.
   */
  public static final Integer IDX_COM3_TZW=18;

 /**
   * 字段COM3_TZW.
   */
  private String COM3_TZW;

  /**
   * 返回字段COM3_TZW的值.
   * @return COM3_TZW    varchar
  */
  public String getCOM3_TZW() {
    return COM3_TZW;
  }

  /**
   * 设置字段COM3_TZW的值.
   * @param com3_tzw    varchar
   */
  public void setCOM3_TZW(String com3_tzw) {
    this.COM3_TZW=com3_tzw;
  }

  /**
   * 字段COM3_JYW在数据中的名称.
   */
  public static final String FLD_COM3_JYW="COM3_JYW";

  /**
   * 获取字段COM3_JYW的索引值.
   */
  public static final Integer IDX_COM3_JYW=19;

 /**
   * 字段COM3_JYW.
   */
  private String COM3_JYW;

  /**
   * 返回字段COM3_JYW的值.
   * @return COM3_JYW    varchar
  */
  public String getCOM3_JYW() {
    return COM3_JYW;
  }

  /**
   * 设置字段COM3_JYW的值.
   * @param com3_jyw    varchar
   */
  public void setCOM3_JYW(String com3_jyw) {
    this.COM3_JYW=com3_jyw;
  }

  /**
   * 字段COM3_DEVICE在数据中的名称.
   */
  public static final String FLD_COM3_DEVICE="COM3_DEVICE";

  /**
   * 获取字段COM3_DEVICE的索引值.
   */
  public static final Integer IDX_COM3_DEVICE=20;

 /**
   * 字段COM3_DEVICE.
   */
  private String COM3_DEVICE;

  /**
   * 返回字段COM3_DEVICE的值.
   * @return COM3_DEVICE  com3设备配置  text
  */
  public String getCOM3_DEVICE() {
    return COM3_DEVICE;
  }

  /**
   * 设置字段COM3_DEVICE的值.
   * @param com3_device  com3设备配置  text
   */
  public void setCOM3_DEVICE(String com3_device) {
    this.COM3_DEVICE=com3_device;
  }

  /**
   * 字段COM4_BTL在数据中的名称.
   */
  public static final String FLD_COM4_BTL="COM4_BTL";

  /**
   * 获取字段COM4_BTL的索引值.
   */
  public static final Integer IDX_COM4_BTL=21;

 /**
   * 字段COM4_BTL.
   */
  private String COM4_BTL;

  /**
   * 返回字段COM4_BTL的值.
   * @return COM4_BTL    varchar
  */
  public String getCOM4_BTL() {
    return COM4_BTL;
  }

  /**
   * 设置字段COM4_BTL的值.
   * @param com4_btl    varchar
   */
  public void setCOM4_BTL(String com4_btl) {
    this.COM4_BTL=com4_btl;
  }

  /**
   * 字段COM4_SJW在数据中的名称.
   */
  public static final String FLD_COM4_SJW="COM4_SJW";

  /**
   * 获取字段COM4_SJW的索引值.
   */
  public static final Integer IDX_COM4_SJW=22;

 /**
   * 字段COM4_SJW.
   */
  private String COM4_SJW;

  /**
   * 返回字段COM4_SJW的值.
   * @return COM4_SJW    varchar
  */
  public String getCOM4_SJW() {
    return COM4_SJW;
  }

  /**
   * 设置字段COM4_SJW的值.
   * @param com4_sjw    varchar
   */
  public void setCOM4_SJW(String com4_sjw) {
    this.COM4_SJW=com4_sjw;
  }

  /**
   * 字段COM4_TZW在数据中的名称.
   */
  public static final String FLD_COM4_TZW="COM4_TZW";

  /**
   * 获取字段COM4_TZW的索引值.
   */
  public static final Integer IDX_COM4_TZW=23;

 /**
   * 字段COM4_TZW.
   */
  private String COM4_TZW;

  /**
   * 返回字段COM4_TZW的值.
   * @return COM4_TZW    varchar
  */
  public String getCOM4_TZW() {
    return COM4_TZW;
  }

  /**
   * 设置字段COM4_TZW的值.
   * @param com4_tzw    varchar
   */
  public void setCOM4_TZW(String com4_tzw) {
    this.COM4_TZW=com4_tzw;
  }

  /**
   * 字段COM4_JYW在数据中的名称.
   */
  public static final String FLD_COM4_JYW="COM4_JYW";

  /**
   * 获取字段COM4_JYW的索引值.
   */
  public static final Integer IDX_COM4_JYW=24;

 /**
   * 字段COM4_JYW.
   */
  private String COM4_JYW;

  /**
   * 返回字段COM4_JYW的值.
   * @return COM4_JYW  com4串口  varchar
  */
  public String getCOM4_JYW() {
    return COM4_JYW;
  }

  /**
   * 设置字段COM4_JYW的值.
   * @param com4_jyw  com4串口  varchar
   */
  public void setCOM4_JYW(String com4_jyw) {
    this.COM4_JYW=com4_jyw;
  }

  /**
   * 字段COM4_DEVICE在数据中的名称.
   */
  public static final String FLD_COM4_DEVICE="COM4_DEVICE";

  /**
   * 获取字段COM4_DEVICE的索引值.
   */
  public static final Integer IDX_COM4_DEVICE=25;

 /**
   * 字段COM4_DEVICE.
   */
  private String COM4_DEVICE;

  /**
   * 返回字段COM4_DEVICE的值.
   * @return COM4_DEVICE  com4设备配置  text
  */
  public String getCOM4_DEVICE() {
    return COM4_DEVICE;
  }

  /**
   * 设置字段COM4_DEVICE的值.
   * @param com4_device  com4设备配置  text
   */
  public void setCOM4_DEVICE(String com4_device) {
    this.COM4_DEVICE=com4_device;
  }

  /**
   * 字段LAN_LJFS在数据中的名称.
   */
  public static final String FLD_LAN_LJFS="LAN_LJFS";

  /**
   * 获取字段LAN_LJFS的索引值.
   */
  public static final Integer IDX_LAN_LJFS=26;

 /**
   * 字段LAN_LJFS.
   */
  private String LAN_LJFS;

  /**
   * 返回字段LAN_LJFS的值.
   * @return LAN_LJFS  lan口  varchar
  */
  public String getLAN_LJFS() {
    return LAN_LJFS;
  }

  /**
   * 设置字段LAN_LJFS的值.
   * @param lan_ljfs  lan口  varchar
   */
  public void setLAN_LJFS(String lan_ljfs) {
    this.LAN_LJFS=lan_ljfs;
  }

  /**
   * 字段LAN_YDIP在数据中的名称.
   */
  public static final String FLD_LAN_YDIP="LAN_YDIP";

  /**
   * 获取字段LAN_YDIP的索引值.
   */
  public static final Integer IDX_LAN_YDIP=27;

 /**
   * 字段LAN_YDIP.
   */
  private String LAN_YDIP;

  /**
   * 返回字段LAN_YDIP的值.
   * @return LAN_YDIP    varchar
  */
  public String getLAN_YDIP() {
    return LAN_YDIP;
  }

  /**
   * 设置字段LAN_YDIP的值.
   * @param lan_ydip    varchar
   */
  public void setLAN_YDIP(String lan_ydip) {
    this.LAN_YDIP=lan_ydip;
  }

  /**
   * 字段LAN_YDDK在数据中的名称.
   */
  public static final String FLD_LAN_YDDK="LAN_YDDK";

  /**
   * 获取字段LAN_YDDK的索引值.
   */
  public static final Integer IDX_LAN_YDDK=28;

 /**
   * 字段LAN_YDDK.
   */
  private String LAN_YDDK;

  /**
   * 返回字段LAN_YDDK的值.
   * @return LAN_YDDK    varchar
  */
  public String getLAN_YDDK() {
    return LAN_YDDK;
  }

  /**
   * 设置字段LAN_YDDK的值.
   * @param lan_yddk    varchar
   */
  public void setLAN_YDDK(String lan_yddk) {
    this.LAN_YDDK=lan_yddk;
  }

  /**
   * 字段LAN_BDIP在数据中的名称.
   */
  public static final String FLD_LAN_BDIP="LAN_BDIP";

  /**
   * 获取字段LAN_BDIP的索引值.
   */
  public static final Integer IDX_LAN_BDIP=29;

 /**
   * 字段LAN_BDIP.
   */
  private String LAN_BDIP;

  /**
   * 返回字段LAN_BDIP的值.
   * @return LAN_BDIP    varchar
  */
  public String getLAN_BDIP() {
    return LAN_BDIP;
  }

  /**
   * 设置字段LAN_BDIP的值.
   * @param lan_bdip    varchar
   */
  public void setLAN_BDIP(String lan_bdip) {
    this.LAN_BDIP=lan_bdip;
  }

  /**
   * 字段LAN_BDDK在数据中的名称.
   */
  public static final String FLD_LAN_BDDK="LAN_BDDK";

  /**
   * 获取字段LAN_BDDK的索引值.
   */
  public static final Integer IDX_LAN_BDDK=30;

 /**
   * 字段LAN_BDDK.
   */
  private String LAN_BDDK;

  /**
   * 返回字段LAN_BDDK的值.
   * @return LAN_BDDK    varchar
  */
  public String getLAN_BDDK() {
    return LAN_BDDK;
  }

  /**
   * 设置字段LAN_BDDK的值.
   * @param lan_bddk    varchar
   */
  public void setLAN_BDDK(String lan_bddk) {
    this.LAN_BDDK=lan_bddk;
  }

  /**
   * 字段LAN_DEVICE在数据中的名称.
   */
  public static final String FLD_LAN_DEVICE="LAN_DEVICE";

  /**
   * 获取字段LAN_DEVICE的索引值.
   */
  public static final Integer IDX_LAN_DEVICE=31;

 /**
   * 字段LAN_DEVICE.
   */
  private String LAN_DEVICE;

  /**
   * 返回字段LAN_DEVICE的值.
   * @return LAN_DEVICE  lan口设备配置  text
  */
  public String getLAN_DEVICE() {
    return LAN_DEVICE;
  }

  /**
   * 设置字段LAN_DEVICE的值.
   * @param lan_device  lan口设备配置  text
   */
  public void setLAN_DEVICE(String lan_device) {
    this.LAN_DEVICE=lan_device;
  }

  /**
   * 字段COM_SERIAL_PORT在数据中的名称.
   */
  public static final String FLD_COM_SERIAL_PORT="COM_SERIAL_PORT";

  /**
   * 获取字段COM_SERIAL_PORT的索引值.
   */
  public static final Integer IDX_COM_SERIAL_PORT=32;

 /**
   * 字段COM_SERIAL_PORT.
   */
  private String COM_SERIAL_PORT;

  /**
   * 返回字段COM_SERIAL_PORT的值.
   * @return COM_SERIAL_PORT  COM XML  varchar
  */
  public String getCOM_SERIAL_PORT() {
    return COM_SERIAL_PORT;
  }

  /**
   * 设置字段COM_SERIAL_PORT的值.
   * @param com_serial_port  COM XML  varchar
   */
  public void setCOM_SERIAL_PORT(String com_serial_port) {
    this.COM_SERIAL_PORT=com_serial_port;
  }

  /**
   * 字段LAN_SERIAL_PORT在数据中的名称.
   */
  public static final String FLD_LAN_SERIAL_PORT="LAN_SERIAL_PORT";

  /**
   * 获取字段LAN_SERIAL_PORT的索引值.
   */
  public static final Integer IDX_LAN_SERIAL_PORT=33;

 /**
   * 字段LAN_SERIAL_PORT.
   */
  private String LAN_SERIAL_PORT;

  /**
   * 返回字段LAN_SERIAL_PORT的值.
   * @return LAN_SERIAL_PORT  LAN XML  varchar
  */
  public String getLAN_SERIAL_PORT() {
    return LAN_SERIAL_PORT;
  }

  /**
   * 设置字段LAN_SERIAL_PORT的值.
   * @param lan_serial_port  LAN XML  varchar
   */
  public void setLAN_SERIAL_PORT(String lan_serial_port) {
    this.LAN_SERIAL_PORT=lan_serial_port;
  }

}

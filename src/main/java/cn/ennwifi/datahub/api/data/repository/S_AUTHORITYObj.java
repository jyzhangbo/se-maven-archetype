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
 *         NAME   权限名称 String<br/>
 *         PARA   菜单项执模块的入口参数 String<br/>
 *         PID    Long<br/>
 *         ICON    String<br/>
 *         PATH   功能路径 String<br/>
 *         RANK   排序 Integer<br/>
 *         SUMMARY   概要 String<br/>
 *         MODULE_CODE   菜单项的之行动做类型
WEB页面--> VALUE字段中填写 URL路径
GWT模型--> VALUE字段中填写 GWT模块名
 String<br/>
 *         STYLE   菜单显示的样式名称 String<br/>
 */

@Table("S_AUTHORITY")
public class S_AUTHORITYObj implements java.io.Serializable,com.google.gwt.user.client.rpc.IsSerializable,
    com.ksyzt.gwt.client.data.IFieldValue{
  /**
   * 缺省的序列化值.
  */
  private static final long serialVersionUID = 1L;

  /**
     * 表明. 
     */
  public static final String TBL_S_AUTHORITY="S_AUTHORITY";
  public S_AUTHORITYObj() {
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
      if (FLD_NAME.equals(fieldName)) {
        return NAME;
      }
      if (FLD_PARA.equals(fieldName)) {
        return PARA;
      }
      if (FLD_PID.equals(fieldName)) {
        return PID;
      }
      if (FLD_ICON.equals(fieldName)) {
        return ICON;
      }
      if (FLD_PATH.equals(fieldName)) {
        return PATH;
      }
      if (FLD_RANK.equals(fieldName)) {
        return RANK;
      }
      if (FLD_SUMMARY.equals(fieldName)) {
        return SUMMARY;
      }
      if (FLD_MODULE_CODE.equals(fieldName)) {
        return MODULE_CODE;
      }
      if (FLD_STYLE.equals(fieldName)) {
        return STYLE;
      }
    } else if (fieldIndex != null && fieldIndex >= 0 && fieldIndex < 10) {
      if (fieldIndex == 0) {
        return ID;
      }
      if (fieldIndex == 1) {
        return NAME;
      }
      if (fieldIndex == 2) {
        return PARA;
      }
      if (fieldIndex == 3) {
        return PID;
      }
      if (fieldIndex == 4) {
        return ICON;
      }
      if (fieldIndex == 5) {
        return PATH;
      }
      if (fieldIndex == 6) {
        return RANK;
      }
      if (fieldIndex == 7) {
        return SUMMARY;
      }
      if (fieldIndex == 8) {
        return MODULE_CODE;
      }
      if (fieldIndex == 9) {
        return STYLE;
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
   * 字段NAME在数据中的名称.
   */
  public static final String FLD_NAME="NAME";

  /**
   * 获取字段NAME的索引值.
   */
  public static final Integer IDX_NAME=1;

 /**
   * 字段NAME.
   */
  private String NAME;

  /**
   * 返回字段NAME的值.
   * @return NAME  权限名称  varchar
  */
  public String getNAME() {
    return NAME;
  }

  /**
   * 设置字段NAME的值.
   * @param name  权限名称  varchar
   */
  public void setNAME(String name) {
    this.NAME=name;
  }

  /**
   * 字段PARA在数据中的名称.
   */
  public static final String FLD_PARA="PARA";

  /**
   * 获取字段PARA的索引值.
   */
  public static final Integer IDX_PARA=2;

 /**
   * 字段PARA.
   */
  private String PARA;

  /**
   * 返回字段PARA的值.
   * @return PARA  菜单项执模块的入口参数  varchar
  */
  public String getPARA() {
    return PARA;
  }

  /**
   * 设置字段PARA的值.
   * @param para  菜单项执模块的入口参数  varchar
   */
  public void setPARA(String para) {
    this.PARA=para;
  }

  /**
   * 字段PID在数据中的名称.
   */
  public static final String FLD_PID="PID";

  /**
   * 获取字段PID的索引值.
   */
  public static final Integer IDX_PID=3;

 /**
   * 字段PID.
   */
  private Long PID;

  /**
   * 返回字段PID的值.
   * @return PID    bigint
  */
  public Long getPID() {
    return PID;
  }

  /**
   * 设置字段PID的值.
   * @param pid    bigint
   */
  public void setPID(Long pid) {
    this.PID=pid;
  }

  /**
   * 字段ICON在数据中的名称.
   */
  public static final String FLD_ICON="ICON";

  /**
   * 获取字段ICON的索引值.
   */
  public static final Integer IDX_ICON=4;

 /**
   * 字段ICON.
   */
  private String ICON;

  /**
   * 返回字段ICON的值.
   * @return ICON    varchar
  */
  public String getICON() {
    return ICON;
  }

  /**
   * 设置字段ICON的值.
   * @param icon    varchar
   */
  public void setICON(String icon) {
    this.ICON=icon;
  }

  /**
   * 字段PATH在数据中的名称.
   */
  public static final String FLD_PATH="PATH";

  /**
   * 获取字段PATH的索引值.
   */
  public static final Integer IDX_PATH=5;

 /**
   * 字段PATH.
   */
  private String PATH;

  /**
   * 返回字段PATH的值.
   * @return PATH  功能路径  varchar
  */
  public String getPATH() {
    return PATH;
  }

  /**
   * 设置字段PATH的值.
   * @param path  功能路径  varchar
   */
  public void setPATH(String path) {
    this.PATH=path;
  }

  /**
   * 字段RANK在数据中的名称.
   */
  public static final String FLD_RANK="RANK";

  /**
   * 获取字段RANK的索引值.
   */
  public static final Integer IDX_RANK=6;

 /**
   * 字段RANK.
   */
  private Integer RANK;

  /**
   * 返回字段RANK的值.
   * @return RANK  排序  int
  */
  public Integer getRANK() {
    return RANK;
  }

  /**
   * 设置字段RANK的值.
   * @param rank  排序  int
   */
  public void setRANK(Integer rank) {
    this.RANK=rank;
  }

  /**
   * 字段SUMMARY在数据中的名称.
   */
  public static final String FLD_SUMMARY="SUMMARY";

  /**
   * 获取字段SUMMARY的索引值.
   */
  public static final Integer IDX_SUMMARY=7;

 /**
   * 字段SUMMARY.
   */
  private String SUMMARY;

  /**
   * 返回字段SUMMARY的值.
   * @return SUMMARY  概要  varchar
  */
  public String getSUMMARY() {
    return SUMMARY;
  }

  /**
   * 设置字段SUMMARY的值.
   * @param summary  概要  varchar
   */
  public void setSUMMARY(String summary) {
    this.SUMMARY=summary;
  }

  /**
   * 字段MODULE_CODE在数据中的名称.
   */
  public static final String FLD_MODULE_CODE="MODULE_CODE";

  /**
   * 获取字段MODULE_CODE的索引值.
   */
  public static final Integer IDX_MODULE_CODE=8;

 /**
   * 字段MODULE_CODE.
   */
  private String MODULE_CODE;

  /**
   * 返回字段MODULE_CODE的值.
   * @return MODULE_CODE  菜单项的之行动做类型
WEB页面--> VALUE字段中填写 URL路径
GWT模型--> VALUE字段中填写 GWT模块名
  varchar
  */
  public String getMODULE_CODE() {
    return MODULE_CODE;
  }

  /**
   * 设置字段MODULE_CODE的值.
   * @param module_code  菜单项的之行动做类型
WEB页面--> VALUE字段中填写 URL路径
GWT模型--> VALUE字段中填写 GWT模块名
  varchar
   */
  public void setMODULE_CODE(String module_code) {
    this.MODULE_CODE=module_code;
  }

  /**
   * 字段STYLE在数据中的名称.
   */
  public static final String FLD_STYLE="STYLE";

  /**
   * 获取字段STYLE的索引值.
   */
  public static final Integer IDX_STYLE=9;

 /**
   * 字段STYLE.
   */
  private String STYLE;

  /**
   * 返回字段STYLE的值.
   * @return STYLE  菜单显示的样式名称  varchar
  */
  public String getSTYLE() {
    return STYLE;
  }

  /**
   * 设置字段STYLE的值.
   * @param style  菜单显示的样式名称  varchar
   */
  public void setSTYLE(String style) {
    this.STYLE=style;
  }

}

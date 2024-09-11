package com.entity.vo;

import com.entity.KuandaixinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 宽带信息表
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-02-03
 */
@TableName("kuandaixinxi")
public class KuandaixinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * id
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 所属用户
     */

    @TableField(value = "yh_types")
    private Integer yhTypes;


    /**
     * 安装地址
     */

    @TableField(value = "family")
    private String family;


    /**
     * 联系电话
     */

    @TableField(value = "number")
    private String number;


    /**
     * 套餐信息
     */

    @TableField(value = "kd_types")
    private Integer kdTypes;


    /**
     * 安装时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
     * 是否安装
     */

    @TableField(value = "mariadb_types")
    private Integer mariadbTypes;


    /**
	 * 设置：id
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：id
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：所属用户
	 */
    public Integer getYhTypes() {
        return yhTypes;
    }


    /**
	 * 获取：所属用户
	 */

    public void setYhTypes(Integer yhTypes) {
        this.yhTypes = yhTypes;
    }
    /**
	 * 设置：安装地址
	 */
    public String getFamily() {
        return family;
    }


    /**
	 * 获取：安装地址
	 */

    public void setFamily(String family) {
        this.family = family;
    }
    /**
	 * 设置：联系电话
	 */
    public String getNumber() {
        return number;
    }


    /**
	 * 获取：联系电话
	 */

    public void setNumber(String number) {
        this.number = number;
    }
    /**
	 * 设置：套餐信息
	 */
    public Integer getKdTypes() {
        return kdTypes;
    }


    /**
	 * 获取：套餐信息
	 */

    public void setKdTypes(Integer kdTypes) {
        this.kdTypes = kdTypes;
    }
    /**
	 * 设置：安装时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：安装时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
	 * 设置：是否安装
	 */
    public Integer getMariadbTypes() {
        return mariadbTypes;
    }


    /**
	 * 获取：是否安装
	 */

    public void setMariadbTypes(Integer mariadbTypes) {
        this.mariadbTypes = mariadbTypes;
    }

}
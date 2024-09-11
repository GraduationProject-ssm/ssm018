package com.entity.model;

import com.entity.KuandaileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-02-03
 */
public class KuandaileixingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * id
     */
    private Integer id;


    /**
     * 宽带名称
     */
    private String kdname;


    /**
     * 套餐描述
     */
    private String noticeContent;


    /**
     * 
     */
    private Double money;


    /**
     * 缴费时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date moneyTime;


    /**
     * 宽带速度
     */
    private Integer speed;


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
	 * 设置：宽带名称
	 */
    public String getKdname() {
        return kdname;
    }


    /**
	 * 获取：宽带名称
	 */

    public void setKdname(String kdname) {
        this.kdname = kdname;
    }
    /**
	 * 设置：套餐描述
	 */
    public String getNoticeContent() {
        return noticeContent;
    }


    /**
	 * 获取：套餐描述
	 */

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }
    /**
	 * 设置：
	 */
    public Double getMoney() {
        return money;
    }


    /**
	 * 获取：
	 */

    public void setMoney(Double money) {
        this.money = money;
    }
    /**
	 * 设置：缴费时间
	 */
    public Date getMoneyTime() {
        return moneyTime;
    }


    /**
	 * 获取：缴费时间
	 */

    public void setMoneyTime(Date moneyTime) {
        this.moneyTime = moneyTime;
    }
    /**
	 * 设置：宽带速度
	 */
    public Integer getSpeed() {
        return speed;
    }


    /**
	 * 获取：宽带速度
	 */

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    }

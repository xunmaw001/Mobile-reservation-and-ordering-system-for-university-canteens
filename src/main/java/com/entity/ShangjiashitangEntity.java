package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 商家食堂
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-24 19:17:45
 */
@TableName("shangjiashitang")
public class ShangjiashitangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangjiashitangEntity() {
		
	}
	
	public ShangjiashitangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 食堂名称
	 */
					
	private String shitangmingcheng;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 食堂图片
	 */
					
	private String shitangtupian;
	
	/**
	 * 联系人
	 */
					
	private String lianxiren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：食堂名称
	 */
	public void setShitangmingcheng(String shitangmingcheng) {
		this.shitangmingcheng = shitangmingcheng;
	}
	/**
	 * 获取：食堂名称
	 */
	public String getShitangmingcheng() {
		return shitangmingcheng;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：食堂图片
	 */
	public void setShitangtupian(String shitangtupian) {
		this.shitangtupian = shitangtupian;
	}
	/**
	 * 获取：食堂图片
	 */
	public String getShitangtupian() {
		return shitangtupian;
	}
	/**
	 * 设置：联系人
	 */
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}

}

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
 * 公交信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-24 19:59:22
 */
@TableName("gongjiaoxinxi")
public class GongjiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongjiaoxinxiEntity() {
		
	}
	
	public GongjiaoxinxiEntity(T t) {
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
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 公交编号
	 */
					
	private String gongjiaobianhao;
	
	/**
	 * 公交班次
	 */
					
	private String gongjiaobanci;
	
	/**
	 * 起点站
	 */
					
	private String qidianzhan;
	
	/**
	 * 公交线路
	 */
					
	private String gongjiaoxianlu;
	
	/**
	 * 终点站
	 */
					
	private String zhongdianzhan;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 途经站点
	 */
					
	private String tujingzhandian;
	
	/**
	 * 首班车时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shoubancheshijian;
	
	/**
	 * 末班车时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date mobancheshijian;
	
	/**
	 * 发车间隔
	 */
					
	private String fachejiange;
	
	/**
	 * 票价
	 */
					
	private Integer piaojia;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	/**
	 * 收藏数
	 */
					
	private Integer storeupnum;
	
	
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
	 * 设置：公交编号
	 */
	public void setGongjiaobianhao(String gongjiaobianhao) {
		this.gongjiaobianhao = gongjiaobianhao;
	}
	/**
	 * 获取：公交编号
	 */
	public String getGongjiaobianhao() {
		return gongjiaobianhao;
	}
	/**
	 * 设置：公交班次
	 */
	public void setGongjiaobanci(String gongjiaobanci) {
		this.gongjiaobanci = gongjiaobanci;
	}
	/**
	 * 获取：公交班次
	 */
	public String getGongjiaobanci() {
		return gongjiaobanci;
	}
	/**
	 * 设置：起点站
	 */
	public void setQidianzhan(String qidianzhan) {
		this.qidianzhan = qidianzhan;
	}
	/**
	 * 获取：起点站
	 */
	public String getQidianzhan() {
		return qidianzhan;
	}
	/**
	 * 设置：公交线路
	 */
	public void setGongjiaoxianlu(String gongjiaoxianlu) {
		this.gongjiaoxianlu = gongjiaoxianlu;
	}
	/**
	 * 获取：公交线路
	 */
	public String getGongjiaoxianlu() {
		return gongjiaoxianlu;
	}
	/**
	 * 设置：终点站
	 */
	public void setZhongdianzhan(String zhongdianzhan) {
		this.zhongdianzhan = zhongdianzhan;
	}
	/**
	 * 获取：终点站
	 */
	public String getZhongdianzhan() {
		return zhongdianzhan;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：途经站点
	 */
	public void setTujingzhandian(String tujingzhandian) {
		this.tujingzhandian = tujingzhandian;
	}
	/**
	 * 获取：途经站点
	 */
	public String getTujingzhandian() {
		return tujingzhandian;
	}
	/**
	 * 设置：首班车时间
	 */
	public void setShoubancheshijian(Date shoubancheshijian) {
		this.shoubancheshijian = shoubancheshijian;
	}
	/**
	 * 获取：首班车时间
	 */
	public Date getShoubancheshijian() {
		return shoubancheshijian;
	}
	/**
	 * 设置：末班车时间
	 */
	public void setMobancheshijian(Date mobancheshijian) {
		this.mobancheshijian = mobancheshijian;
	}
	/**
	 * 获取：末班车时间
	 */
	public Date getMobancheshijian() {
		return mobancheshijian;
	}
	/**
	 * 设置：发车间隔
	 */
	public void setFachejiange(String fachejiange) {
		this.fachejiange = fachejiange;
	}
	/**
	 * 获取：发车间隔
	 */
	public String getFachejiange() {
		return fachejiange;
	}
	/**
	 * 设置：票价
	 */
	public void setPiaojia(Integer piaojia) {
		this.piaojia = piaojia;
	}
	/**
	 * 获取：票价
	 */
	public Integer getPiaojia() {
		return piaojia;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
	/**
	 * 设置：收藏数
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}

package com.dvd.domain;

import java.util.Date;


/**
 * dvd实体类
 * 
 * @author acer
 * 
 */
public class Dvd {
	
	private int dvdId; // dvd的id
	private String dvdName; // dvd名称
	private int dvdState; // 是否借出状态
	private Date dvdDate; // 借出日期
	public int getDvdId() {
		return dvdId;
	}
	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}
	public Dvd() {
		super();
		
	}
	public Dvd(int dvdId, String dvdName, int dvdState, Date dvdDate) {
		super();
		this.dvdId = dvdId;
		this.dvdName = dvdName;
		this.dvdState = dvdState;
		this.dvdDate = dvdDate;
	}
	public String getDvdName() {
		return dvdName;
	}
	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}
	public int getDvdState() {
		return dvdState;
	}
	public void setDvdState(int dvdState) {
		this.dvdState = dvdState;
	}
	public Date getDvdDate() {
		return dvdDate;
	}
	public void setDvdDate(Date dvdDate) {
		this.dvdDate = dvdDate;
	}
	
}

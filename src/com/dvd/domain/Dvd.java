package com.dvd.domain;

import java.util.Date;


/**
 * dvdʵ����
 * 
 * @author acer
 * 
 */
public class Dvd {
	
	private int dvdId; // dvd��id
	private String dvdName; // dvd����
	private int dvdState; // �Ƿ���״̬
	private Date dvdDate; // �������
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

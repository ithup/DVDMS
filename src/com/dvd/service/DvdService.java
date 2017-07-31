package com.dvd.service;

import java.util.List;

import com.dvd.data.DvdData;
import com.dvd.domain.Dvd;

/**
 * DVD���ܵ�ʵ�֣�
 * 		1.����DVD
 * 		2.�鿴DVD
 * 		3.ɾ��DVD
 * 		4.���
 * 		5.�黹
 * @author acer
 *
 */
public class DvdService {
	DvdData dvdData=new DvdData();
	List<Dvd> initDvdData=null;
	/**
	 * ��ʾdvd��Ϣ
	 * @return
	 */
	public List<Dvd> showDvdInfo(){
		initDvdData = dvdData.initData();
		return initDvdData;
	}
	/**
	 * ����DVD��Ϣ
	 * @param dvd
	 * @return
	 */
	public boolean addDvd(Dvd dvd) {
		initDvdData = dvdData.initData();
		return initDvdData.add(dvd);
	}
	/**
	 * ���ݴ���DVD���ƣ�ɾ��ָ��DVD��Ϣ
	 * @param dvdName
	 */
	public boolean delete(String dvdName){
		initDvdData = dvdData.initData();
		boolean falg=false;
		for (Dvd dvd : initDvdData) {
			if(dvdName.equals(dvd.getDvdName()) && dvd.getDvdState() == 1){
				falg=true;
			}else{
				falg=false;
			}
		}
		return falg;
	}
}

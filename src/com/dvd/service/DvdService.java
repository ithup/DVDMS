package com.dvd.service;

import java.util.List;

import com.dvd.data.DvdData;
import com.dvd.domain.Dvd;

/**
 * DVD功能的实现：
 * 		1.新增DVD
 * 		2.查看DVD
 * 		3.删除DVD
 * 		4.借出
 * 		5.归还
 * @author acer
 *
 */
public class DvdService {
	DvdData dvdData=new DvdData();
	List<Dvd> initDvdData=null;
	/**
	 * 显示dvd信息
	 * @return
	 */
	public List<Dvd> showDvdInfo(){
		initDvdData = dvdData.initData();
		return initDvdData;
	}
	/**
	 * 增加DVD信息
	 * @param dvd
	 * @return
	 */
	public boolean addDvd(Dvd dvd) {
		initDvdData = dvdData.initData();
		return initDvdData.add(dvd);
	}
	/**
	 * 根据传递DVD名称，删除指定DVD信息
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

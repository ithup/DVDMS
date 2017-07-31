package com.dvd.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.dvd.domain.Dvd;

/**
 * dvd数据层
 * 
 * @author acer
 *
 */
public class DvdData {
	
	/**
	 * 初始化数据方法
	 * @return
	 */
	public  List<Dvd> initData() {
		// 创建集合
		List<Dvd> dvdList = new ArrayList<>();
		// 创建DVD对象
		Dvd dvd1 = new Dvd(1, "罗马假日", 0,new Date());
		Dvd dvd2 = new Dvd(2, "风声鹤唳", 0,new Date());
		Dvd dvd3 = new Dvd(3, "浪漫满屋", 0, new Date());

		// 把DVD对象放入集合中
		dvdList.add(dvd1);
		dvdList.add(dvd2);
		dvdList.add(dvd3);
		return dvdList;
	}
}

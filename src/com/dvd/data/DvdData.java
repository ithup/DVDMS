package com.dvd.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.dvd.domain.Dvd;

/**
 * dvd���ݲ�
 * 
 * @author acer
 *
 */
public class DvdData {
	
	/**
	 * ��ʼ�����ݷ���
	 * @return
	 */
	public  List<Dvd> initData() {
		// ��������
		List<Dvd> dvdList = new ArrayList<>();
		// ����DVD����
		Dvd dvd1 = new Dvd(1, "�������", 0,new Date());
		Dvd dvd2 = new Dvd(2, "�������", 0,new Date());
		Dvd dvd3 = new Dvd(3, "��������", 0, new Date());

		// ��DVD������뼯����
		dvdList.add(dvd1);
		dvdList.add(dvd2);
		dvdList.add(dvd3);
		return dvdList;
	}
}

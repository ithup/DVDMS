package com.dvd.test;

import java.util.List;

import org.junit.Test;

import com.dvd.domain.Dvd;
import com.dvd.service.DvdService;

public class DvdDataTest {
	@Test
	public void showDVDInfo(){
		DvdService dvdService=new DvdService();
		List<Dvd> dvdInfo = dvdService.showDvdInfo();
		for (Dvd dvd : dvdInfo) {
			System.out.println(dvd);
		}
	}
}

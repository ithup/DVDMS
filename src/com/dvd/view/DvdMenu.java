package com.dvd.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.dvd.domain.Dvd;
import com.dvd.service.DvdService;

/**
 * 显示页面
 * 
 * @author acer
 * 
 */
public class DvdMenu {
	// 调用service 层方法
	private static DvdService dvdService = new DvdService();
	// 用户输入
	private static Scanner input = new Scanner(System.in);

	public static void showMenu() {
		while (true) {
			System.out.println("欢迎使用迷你DVD管理器");
			System.out.println("-------------------------------------");
			System.out.println("\t0.借出排行榜");
			System.out.println("\t1.新增DVD");
			System.out.println("\t2.查看DVD");
			System.out.println("\t3.删除DVD");
			System.out.println("\t4.借出DVD");
			System.out.println("\t5.归还DVD");
			System.out.println("\t6.退出");
			System.out.println("-------------------------------------");
			System.out.print("请选择:");
			int choice = input.nextInt(); // 用户输入
			switch (choice) {
			case 0:
				findDvdInfo();// 增加DVD信息方法
				break;
			case 1:
				addDvdInfo();// 增加DVD信息方法
				break;
			case 2:
				findDvdInfo();
				break;
			case 3:
				deleteDvdInfo();// 删除DVD信息
				break;
			case 4:
				borrowDVD();
				break;
			case 5:
				returnDVD(); // 归还DVD
				break;
			case 6:
				System.out.println("谢谢使用");
				System.exit(0);
				break;
			}
			// 完成操作返回方法
			System.out.println("输入0返回：");
			int num = input.nextInt();
			if (num == 0) {
				showMenu();
			}
		}
	}

	private static void borrowDVD() {

	}

	private static void returnDVD() {

	}

	/**
	 * 删除DVD信息
	 */
	private static void deleteDvdInfo() {
		System.out.println("------>删除DVD");
		System.out.print("请输入DVD名称：");
		String dvdName = input.next();
		if (dvdService.delete(dvdName)) {
			System.out.println("删除成功！");
		} else {
			System.out.println("《" + dvdName + "》为借出状态，不能删除！");
		}
	}

	/**
	 * 增加DVD信息
	 */
	private static void addDvdInfo() {
		System.out.println("----->新增DVD");
		System.out.print("请输入ID:");
		int id = input.nextInt(); // 输入DVDid
		System.out.print("请输入名称:");
		String dvdName = input.next();// 输入DVD名称
		Dvd dvd = new Dvd();
		dvd.setDvdId(id);
		dvd.setDvdName(dvdName);
		dvd.setDvdState(0);
		dvd.setDvdDate(new Date());
		if (dvdService.addDvd(dvd)) {
			System.out.println("新增《" + dvdName + "》成功");
		} else {
			System.out.println("新增失败！");
		}
	}

	/**
	 * 显示DVD信息
	 */
	private static void findDvdInfo() {
		// 日期转换
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<Dvd> dvdInfo = dvdService.showDvdInfo();
		System.out.println("------>查看DVD");
		System.out.println("序号" + "\t" + "状态" + "\t" + "名称" + "\t" + "借出日期");
		for (Dvd dvd : dvdInfo) {
			System.out.println(dvd.getDvdId() + "\t" + dvd.getDvdState() + "\t"
					+ dvd.getDvdName() + "\t" + sdf.format(dvd.getDvdDate()));
		}
	}

}

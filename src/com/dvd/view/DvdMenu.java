package com.dvd.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.dvd.domain.Dvd;
import com.dvd.service.DvdService;

/**
 * ��ʾҳ��
 * 
 * @author acer
 * 
 */
public class DvdMenu {
	// ����service �㷽��
	private static DvdService dvdService = new DvdService();
	// �û�����
	private static Scanner input = new Scanner(System.in);

	public static void showMenu() {
		while (true) {
			System.out.println("��ӭʹ������DVD������");
			System.out.println("-------------------------------------");
			System.out.println("\t0.������а�");
			System.out.println("\t1.����DVD");
			System.out.println("\t2.�鿴DVD");
			System.out.println("\t3.ɾ��DVD");
			System.out.println("\t4.���DVD");
			System.out.println("\t5.�黹DVD");
			System.out.println("\t6.�˳�");
			System.out.println("-------------------------------------");
			System.out.print("��ѡ��:");
			int choice = input.nextInt(); // �û�����
			switch (choice) {
			case 0:
				findDvdInfo();// ����DVD��Ϣ����
				break;
			case 1:
				addDvdInfo();// ����DVD��Ϣ����
				break;
			case 2:
				findDvdInfo();
				break;
			case 3:
				deleteDvdInfo();// ɾ��DVD��Ϣ
				break;
			case 4:
				borrowDVD();
				break;
			case 5:
				returnDVD(); // �黹DVD
				break;
			case 6:
				System.out.println("ллʹ��");
				System.exit(0);
				break;
			}
			// ��ɲ������ط���
			System.out.println("����0���أ�");
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
	 * ɾ��DVD��Ϣ
	 */
	private static void deleteDvdInfo() {
		System.out.println("------>ɾ��DVD");
		System.out.print("������DVD���ƣ�");
		String dvdName = input.next();
		if (dvdService.delete(dvdName)) {
			System.out.println("ɾ���ɹ���");
		} else {
			System.out.println("��" + dvdName + "��Ϊ���״̬������ɾ����");
		}
	}

	/**
	 * ����DVD��Ϣ
	 */
	private static void addDvdInfo() {
		System.out.println("----->����DVD");
		System.out.print("������ID:");
		int id = input.nextInt(); // ����DVDid
		System.out.print("����������:");
		String dvdName = input.next();// ����DVD����
		Dvd dvd = new Dvd();
		dvd.setDvdId(id);
		dvd.setDvdName(dvdName);
		dvd.setDvdState(0);
		dvd.setDvdDate(new Date());
		if (dvdService.addDvd(dvd)) {
			System.out.println("������" + dvdName + "���ɹ�");
		} else {
			System.out.println("����ʧ�ܣ�");
		}
	}

	/**
	 * ��ʾDVD��Ϣ
	 */
	private static void findDvdInfo() {
		// ����ת��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		List<Dvd> dvdInfo = dvdService.showDvdInfo();
		System.out.println("------>�鿴DVD");
		System.out.println("���" + "\t" + "״̬" + "\t" + "����" + "\t" + "�������");
		for (Dvd dvd : dvdInfo) {
			System.out.println(dvd.getDvdId() + "\t" + dvd.getDvdState() + "\t"
					+ dvd.getDvdName() + "\t" + sdf.format(dvd.getDvdDate()));
		}
	}

}

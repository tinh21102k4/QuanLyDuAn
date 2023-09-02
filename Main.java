/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDuAn;

import java.util.Scanner;


public class Main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien ql = new QuanLySinhVien();
        int ct;
        do {
            System.out.println("===========Menu===========");
            System.out.println("1.       Nhập 1 danh sách đối tượng");
            System.out.println("2.    Xuất danh sách đối tượng đã nhập");
            System.out.println("3.    Xóa NV theo mã NV nhập vào");
            System.out.println("4.    Tìm nhân viên theo mã NV nhập vào");
            System.out.println("5.    Xuất danh sách NV theo khoảng lương nhập vào");
            System.out.println("0. Thoat");
            System.out.println("6. Ke thua");
            System.out.println("7. Sap xep");
            System.out.println("Nhap chuong trinh:");
            ct = Integer.parseInt(sc.nextLine());
            switch (ct) {
                case 1 -> {
                    ql.bai1();
                    break;
                }
                case 2 -> {
                    ql.bai2();
                    break;
                }
                case 3 -> {
                    ql.bai3();
                    break;
                }
                case 4 -> {
                    ql.bai4();
                    break;
                }
                case 5 -> {
                    ql.bai5();
                    break;
                }
                case 0 -> {
                    System.exit(0);
                }
            }
        } while (ct != 0);
    }
}
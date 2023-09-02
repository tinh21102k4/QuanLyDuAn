/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDuAn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QuanLySinhVien {

    List<SinhVienPoly> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void bai1() {
        String nhapNua;
        do {
            System.out.println("Nhap ho ten:");
            String hoTen = sc.nextLine();
            System.out.println("Nhap chuyen nganh:");
            String cn = sc.nextLine();
            System.out.println("Diem:");
            double diem = Double.parseDouble(sc.nextLine());
            SinhVienPoly sv = new SinhVienPoly(hoTen, cn, diem);
            ds.add(sv);
            System.out.println("Nhap tiep hay khong co/khong:");
            nhapNua = sc.nextLine();

        } while (nhapNua.equalsIgnoreCase("co"));
    }

    public void bai2() {
        for (SinhVienPoly sv : ds) {
            System.out.println(sv.toString());
        }

    }

    public void bai3() {
        for (SinhVienPoly sv : ds) {
            if (sv.getDiem() < 9 && sv.getDiem() >= 7.5 && sv.getNganhHoc().equalsIgnoreCase("IT")) {
                System.out.println(sv.toString());
            }
        }
    }

    public void bai4() {
        // Tang dan
        System.out.println("Danh sach tang dan theo diem");
        ds.sort((sv1, sv2) -> (int) (sv1.getDiem() - sv2.getDiem()));
        bai2();
        // Diem giam dan
        System.out.println("Danh sach giam dan theo diem");
        ds.sort((sv1, sv2) -> (int) (sv2.getDiem() - sv1.getDiem()));
        bai2();
        // Diem giam dan
        System.out.println("Danh sach tang dan theo ten");
        ds.sort((sv1, sv2) -> sv1.getHoTen().compareTo(sv2.getHoTen()));
        bai2();
    }

    public void bai5() {
        SinhVienPoly it = new SinhVienIT(9, 7.5, 8, "thuy", "cntt", 8.5);
        SinhVienPoly biz = new SinhVienBiz(8, 9, "duy", "dig", 8);
        System.out.println(it.toString());
        System.out.println(biz.toString());

    }
}
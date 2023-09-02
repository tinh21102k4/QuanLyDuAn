/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyDuAn;


public class SinhVienBiz extends SinhVienPoly {

    private double marketings;
    private double sales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double marketings, double sales, String hoTen, String nganhHoc, double diem) {
        super(hoTen, nganhHoc, diem);
        this.marketings = marketings;
        this.sales = sales;
    }

    public double getMarketings() {
        return marketings;
    }

    public void setMarketings(double marketings) {
        this.marketings = marketings;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double getDiemTb() {
        return (this.marketings * 2 + this.sales) / 3;
    }

    @Override
    public String toString() {
        return "SinhVienBiz{" + super.toString()+ "marketings=" + marketings + ", sales=" + sales + '}';
    }
    
    
}
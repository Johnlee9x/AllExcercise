package bai1.data;

import data.CanBo;

public class NhanVien extends CanBo {
    private String congViec;
    public NhanVien(String congViec, String hoTen, Integer tuoi, String gioiTinh, String email){
        super(hoTen, tuoi, gioiTinh, email);
        this.congViec = congViec;
    }

    @Override
    public String toString(){
        return "Nhan vien ten la: "+ this.hoTen +", Tuoi "+ this.tuoi+" , Gioi tinh: "+ this.gioiTinh+ " , Email: "+ this.email
                +", Cong viec: " + this.congViec ;
    }
}

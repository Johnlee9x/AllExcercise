package bai1.data;
import util.MyUtil;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cabinet {
    public List<CanBo> listCanBo ;
    public Cabinet(List<CanBo> list){
        this.listCanBo = list;
    }
    Scanner sc = new Scanner(System.in);
    public void themCongNhan(){
        String hoTen;
        Integer tuoi;
        String gioiTinh;
        String email;
        Integer capBac;
        tuoi = MyUtil.getAnInteger("Moi nhap so tuoi cua Cong Nhan ( tuoi >= 18 && tuoi <= 50 ): ",
                "khong hop le, nhap lai", 18, 50);
        hoTen = MyUtil.getString("Moi nhap ho ten cua Cong Nhan: ",
                "khong hop le, nhap lai");
        gioiTinh = MyUtil.getString("Moi nhap gioi tinh cua Cong Nhan: ",
                "khong hop le, nhap lai");
        email = MyUtil.getAString("Moi nhap email cua cong nhan " +
                        " dinh dang XXXXX@gmail.com" +
                        "X represent letter digits: ","khong hop le, nhap lai: ",
                "^[\\w]+@(\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,})$");
        capBac = MyUtil.getAnInteger("Moi nhap cao cap bac cua cong nhan( bac >= 1 && bac <= 10 )",
                "khong hop le, nhap lai", 1, 10);
        listCanBo.add(new CongNhan(capBac, hoTen, tuoi, gioiTinh, email));
        System.out.println("them thanh cong");
    }
    public void themNhanVien(){
        String hoTen;
        Integer tuoi;
        String gioiTinh;
        String email;
        String congViec;
        tuoi = MyUtil.getAnInteger("Moi nhap so tuoi cua Nhan Vien ( tuoi >= 18 && tuoi <= 50 ): ",
                "khong hop le, nhap lai", 18, 50);
        hoTen = MyUtil.getString("Moi nhap ho ten cua Nhan Vien: ",
                "khong hop le, nhap lai");
        gioiTinh = MyUtil.getString("Moi nhap gioi tinh cua Nhan Vien: ",
                "khong hop le, nhap lai");
        email = MyUtil.getAString("Moi nhap email cua Nhan Vien " +
                        " dinh dang XXXXX@gmail.com" +
                        "X represent letter digits: ","khong hop le, nhap lai: ",
                "^[\\w]+@(\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,})$");
        congViec = MyUtil.getString("Moi nhap cong viec cua Nhan Vien: ", "khong hop le, nhap lai");
        listCanBo.add(new NhanVien(congViec, hoTen, tuoi, gioiTinh,email));
        System.out.println("Them Nhan Vien thanh  cong");
    }
    public void themKySu(){
        String hoTen;
        Integer tuoi;
        String gioiTinh;
        String email;
        String nganhHoc;
        tuoi = MyUtil.getAnInteger("Moi nhap so tuoi cua ky Su ( tuoi >= 18 && tuoi <= 50 ): ",
                "khong hop le, nhap lai", 18, 50);
        hoTen = MyUtil.getString("Moi nhap ho ten cua ky Su: ",
                "khong hop le, nhap lai");
        gioiTinh = MyUtil.getString("Moi nhap gioi tinh cua Ky Su: ",
                "khong hop le, nhap lai");
        email = MyUtil.getAString("Moi nhap email cua ky Su " +
                        " dinh dang XXXXX@gmail.com" +
                        "X represent letter digits: ","khong hop le, nhap lai: ",
                "^[\\w]+@(\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,})$");
        nganhHoc = MyUtil.getString("Moi nhap nganh hoc cua Ky Su: ",
                "khong hop le, nhap lai");
        listCanBo.add(new KySu(nganhHoc, hoTen, tuoi, gioiTinh, email));
        System.out.println("Them Ky Su thanh cong");
    }
    public  CanBo searchByName(String name){
        return this.listCanBo.stream().filter(e->e.getHoTen().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
    public void showInfor2(){
        this.listCanBo.forEach(System.out::println);
    }
    public List<CanBo> getListCanBoById(int id){
        return listCanBo.stream().filter(canB ->{
            if(id == 1) return canB instanceof CongNhan;
            else if(id == 2) return canB instanceof KySu;
            else if(id == 3) return canB instanceof NhanVien;
            return false;
        } ).collect(Collectors.toList());
    }



}


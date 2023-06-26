package bai1.data;

import data.CanBo;

public class KySu extends CanBo {
    private String nganhDaoTao;
    public KySu(String nganhDaoTao, String hoTen, Integer tuoi, String gioiTinh, String email){
        super(hoTen, tuoi, gioiTinh, email);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString(){
        return "Ky su ten la: "+ this.hoTen +", Tuoi "+ this.tuoi+" ,Gioi tinh: "+ this.gioiTinh+ " ,Email: "+ this.email
                +", Nganh dao tao: " + this.nganhDaoTao;
    }
}

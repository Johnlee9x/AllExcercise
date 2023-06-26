package bai1.data;
public class CongNhan extends CanBo  {
    private Integer bac;
    public CongNhan(Integer bac, String hoaTen, Integer tuoi, String gioiTinh, String email){
        super(hoaTen, tuoi, gioiTinh, email);
        this.bac = bac;
    }

    @Override
    public String toString(){
        return "Cong nhan ten la: "+ this.hoTen +", Tuoi "+ this.tuoi+" , Gioi tinh: "+ this.gioiTinh+ " ,Email: "+ this.email
                +", Cap bac: " + this.bac ;
    }



}

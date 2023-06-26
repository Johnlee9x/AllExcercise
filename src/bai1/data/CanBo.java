package bai1.data;
public abstract class CanBo  {
    protected String hoTen;
    protected Integer tuoi;
    protected String gioiTinh;
    protected String email;
    CanBo(String hoTen, Integer tuoi, String gioiTinh, String email){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.email = email;
    }
    public String getHoTen() {
        return hoTen;
    }
    @Override
    public String toString(){
        return "Ten: "+ this.hoTen +", tuoi "+ this.tuoi+" ,gioi tinh: "+ this.gioiTinh+ " ,dia chi: "+ this.email;
    }

}

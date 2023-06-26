package bai1.application_management;

import data.Cabinet;
import data.CanBo;
import ui.Menu;
import util.MyUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<CanBo> listCanBo = new ArrayList<>();
        Cabinet cabinet = new Cabinet(listCanBo);
        List<String> listOption = new ArrayList<>();
        Menu menu = new Menu("Chao mung den voi phan mem quan ly nhan su", listOption);
        menu.addNewOption("1. Them Cong Nhan");
        menu.addNewOption("2. Them Nhan Vien");
        menu.addNewOption("3. Them Ky Su");
        menu.addNewOption("4. Tim kiem theo ho ten");
        menu.addNewOption("5. Hien thi toan bo thong tin cua cong nhan vien ");
        menu.addNewOption("6. Thoat ");
        int choice;
        do{
            menu.showAllOption();
            choice = menu.getChoice();
            switch (choice){
                case 1:
                    cabinet.themCongNhan();
                    break;
                case 2:
                    cabinet.themNhanVien();
                    break;
                case 3:
                    cabinet.themKySu();
                    break;
                case 4:
                    String name = MyUtil.getString("Moi nhap ten cua cong nhan vien de tim: ",
                            "khong hop le, nhap lai");
                    if(cabinet.searchByName(name) != null){
                        System.out.println(cabinet.searchByName(name).toString());
                        break;
                    }
                    else {
                        System.out.println("khong tim thay");
                    }
                    break;
                case 5:
                    if(listCanBo.isEmpty()){
                        System.out.println("Danh sach trong");
                        break;
                    }
                    else {
                        System.out.println("Danh sach can bo: ");
                        cabinet.showInfor2();
                    }
                    break;
                case 6:
                    System.out.println("xin chao, hen gap lai");
                    System.exit(1);

            }
        }while (choice != 0);
    }
}
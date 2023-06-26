package bai4.data;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import util.MyUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cabinet {
    Scanner sc = new Scanner(System.in);
    List<Family> listFamly;
    public Cabinet(List<Family> listFamly){
        this.listFamly = listFamly;
    }
    public void addAFamily(){
        String address;
        int numOfMemInfa;
        List<Person> listPeople = new ArrayList<>();
        address = MyUtil.getString("Please, enter the Address",
                "InputMissMatch");
        numOfMemInfa = MyUtil.getAnInteger("Please, enter the number Member",
                "InputMissMatch and Try again");
        for(int i = 0; i < numOfMemInfa; i++){
            String name;
            int age;
            String job;
            String id;
            name = MyUtil.getString("Please, enter the Name, Member "+ (i + 1),
                    "InputMissMatch");
            age = MyUtil.getAnInteger("Please, enter the number of Age, Member "+ (i + 1),
                    "InputMissMatch and Try again");
            job = MyUtil.getString("Please, enter the Job, Member "+ (i + 1),
                    "InputMissMatch");
            id = MyUtil.getString("Please, enter the Id, Member "+ (i + 1),
                    "InputMissMatch");
            listPeople.add(new Person(name, age, job, id));
        }
        listFamly.add(new Family(address, numOfMemInfa, listPeople));
        System.out.println("Add successfully");
    }
    public void printNFam(int n){
        if(!listFamly.isEmpty()){
            if(n >= listFamly.size()){
                for (Family family : listFamly) {
                    System.out.println(family.toString());
                    family.getList().forEach(System.out::println);
                }
            }
            else {
                listFamly.stream().limit(n).forEach(e->{
                    System.out.println(e);
                    e.getList().forEach(System.out::println);
                });
            }
        }
    }
}

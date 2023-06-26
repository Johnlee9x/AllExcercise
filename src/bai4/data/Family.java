package bai4.data;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.List;

public class Family {
    private String address;
    private int numOfMemFamily;
    List<Person> list;
    public Family(String address, int numOfMemFamily, List<Person> list){
        this.address = address;
        this.numOfMemFamily = numOfMemFamily;
        this.list = list;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumOfMemFamily() {
        return numOfMemFamily;
    }

    public void setNumOfMemFamily(int numOfMemFamily) {
        this.numOfMemFamily = numOfMemFamily;
    }

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

    @Override
    public String toString(){
        return "Address: " + this.address + ", NumberOfFamily: " + this.numOfMemFamily;
    }
}

package bai15.data;

import java.util.List;

public class Department {
    private String departmentName;
    private List<Student_Base> studentList;
    public Department(String departmentName, List<Student_Base> studentList){
        this.departmentName = departmentName;
        this.studentList = studentList;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Student_Base> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student_Base> studentList) {
        this.studentList = studentList;
    }
}

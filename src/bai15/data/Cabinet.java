package bai15.data;

import util.MyUtil;

import java.util.*;

public class Cabinet {
    List<Student_Base> listStudent;
    List<Department> departmentList;
    public Cabinet(List<Student_Base> listStudent, List<Department> departmentList){
        this.listStudent = listStudent;
        this.departmentList = departmentList;
    }
    public void addOfficialStudent(){
        String id;
        String name;
        String dOB;
        String yOfEntering;
        double score;
        int nameOfSemester;
        double averageScore;
        id = MyUtil.getID("Enter the id: ", "InputMissMatch", "^.*$");
        name = MyUtil.getString("Enter the name of Student: ",
                "InputInvalid and Try again");
        dOB = MyUtil.getString("Enter the Student's DOB: ",
                "InputInvalid and Try again");
        yOfEntering = MyUtil.getString("Enter the Student's year that start learning: ",
                "InputInvalid and Try again");
        score = MyUtil.getADouble("Enter the score that Employee got: ",
                "InputInvalid and Try again");
        nameOfSemester = MyUtil.getAnInteger("Enter the current Semester's name",
                "InputInvalid and Try again");
        averageScore = MyUtil.getADouble("Enter the average score: ",
                "InputInvalid and Try again");
        List<ResultLearning> resultLearningList = new ArrayList<>();
        resultLearningList.add(new ResultLearning(nameOfSemester, averageScore));
        listStudent.add(new OfficialStudent(id, name, dOB, yOfEntering, score,
               resultLearningList));
        System.out.println("Add successfully");
    }
    public void addNoneOfficialStudent(){
        String id;
        String name;
        String dOB;
        String yOfEntering;
        double score;
        int nameOfSemester;
        double averageScore;
        String placeLearning;
        id = MyUtil.getID("Enter the id: ",
                "InputMissMatch", "^.*$");
        name = MyUtil.getString("Enter the name of Student: ",
                "InputInvalid and Try again");
        dOB = MyUtil.getString("Enter the Student's DOB: ",
                "InputInvalid and Try again");
        yOfEntering = MyUtil.getString("Enter the Student's year that start learning: ",
                "InputInvalid and Try again");
        score = MyUtil.getADouble("Enter the score that Employee got: ",
                "InputInvalid and Try again");
        nameOfSemester = MyUtil.getAnInteger("Enter the current Semester's name",
                "InputInvalid and Try again");
        averageScore = MyUtil.getADouble("Enter the average score: ",
                "InputInvalid and Try again");
        placeLearning = MyUtil.getString("Enter the place Where Student is learning: ",
                "InputInvalid and Try again");
        List<ResultLearning> resultLearningList = new ArrayList<>();
        resultLearningList.add(new ResultLearning(nameOfSemester, averageScore));
        listStudent.add(new NoneOfficialStudent(placeLearning, id, name, dOB, yOfEntering, score,resultLearningList));
        System.out.println("Add successfully");
    }
    public Student_Base checkOfficialStudent(String id){
        if(listStudent.isEmpty()) return null;
        return this.listStudent.stream().filter(e->e.getId().equalsIgnoreCase(id) && (e instanceof OfficialStudent)).findFirst().orElse(null);
    }
    public Student_Base getStudentById( String id){
        return this.listStudent.stream().filter(e->e.getId().equalsIgnoreCase(id)).findFirst().orElse(null);
    }
    //get averageScore
    public double getScoreBySemester(int semester, String id){
        if(getStudentById(id) == null){
            System.out.println("The id does not exist");
        }
        return 1;
    }
    //sum of Official Student
    public int sumOfficialStudent (){
        Iterator<Student_Base> iterator = listStudent.iterator();
        int cnt = 0;
        while (iterator.hasNext()){
            Student_Base studentBase = iterator.next();
            if(studentBase instanceof OfficialStudent) cnt++;
        }
        return cnt;
    }
    //find the student that has a highest inputScore;
    public void sortStudent(){
        if(this.listStudent.isEmpty()) {
            System.out.println("there is no student to search");
        }else{
            listStudent.sort((s1,s2)->{
                if(s1.getScore().compareTo(s2.getScore()) > 0) return 1;
                else if(s1.getScore().compareTo(s2.getScore()) < 0) return -1;
                else return 0;
            });
        }
    }
    //list NoneOfficial Student

    public List<NoneOfficialStudent> getListNoneOfficialStudent(){
        List<NoneOfficialStudent> noneOfficialStudents = new ArrayList<>();
        if(this.departmentList.isEmpty()){
            System.out.println("There is nothing");
        }
        else{
            noneOfficialStudents = new ArrayList<>();
            Iterator<Student_Base> iterator = listStudent.iterator();
            while (iterator.hasNext()){
                Student_Base studentBase = iterator.next();
                if(studentBase instanceof NoneOfficialStudent){
                    NoneOfficialStudent noneOfficialStudent = (NoneOfficialStudent) studentBase;
                    noneOfficialStudents.add(noneOfficialStudent);
                }
            }
        }
        if(noneOfficialStudents.isEmpty()) return null;
        return noneOfficialStudents;
    }
    //list students that have the highest average score
    public List<Student_Base> getListStudent() {
        return listStudent;
    }
}

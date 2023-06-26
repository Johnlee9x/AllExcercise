package bai15.data;

import java.util.List;

public abstract class Student_Base{
    protected String id;
    protected String name;
    protected String dOB;
    protected String yearOfEntering;
    protected Double score;
    protected List<ResultLearning> resultLearningList;
    public Student_Base(String id, String name, String dOB, String yearOfEntering,
                        Double score, List<ResultLearning> resultLearningList){
        this.id = id;
        this.name = name;
        this.dOB = dOB;
        this.yearOfEntering = yearOfEntering;
        this.score = score;
        this.resultLearningList = resultLearningList;
    }
    public String toString(){
        return "Id: " + this.id + ", Name: " + this.name + ", DOB: " + this.dOB;
    }

    public String getId() {
        return id;
    }

    public Double getScore() {
        return score;
    }

}

package bai15.data;

public class ResultLearning {
    private Integer nameOfSemester;
    private Double averageScore;
    public ResultLearning(){

    }
    public ResultLearning(int nameOfSemester, Double averageScore){
        this.averageScore = averageScore;
        this.nameOfSemester = nameOfSemester;
    }

    public int getNameOfSemester() {
        return nameOfSemester;
    }

    public void setNameOfSemester(int nameOfSemester) {
        this.nameOfSemester = nameOfSemester;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }
}

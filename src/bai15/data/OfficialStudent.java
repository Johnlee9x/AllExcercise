package bai15.data;

import java.util.List;

public class OfficialStudent extends Student_Base{
    public OfficialStudent(String id, String name, String dOB, String yearOfEntering, Double score,
                           List<ResultLearning> resultLearningList) {
        super(id, name, dOB, yearOfEntering, score, resultLearningList);
    }
}

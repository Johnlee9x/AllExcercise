package bai15.data;

import java.util.List;

public class NoneOfficialStudent extends Student_Base{
    private String placeLearning;
    public NoneOfficialStudent( String placeLearning,String id, String name, String dOB, String yearOfEntering, Double score,
                               List<ResultLearning> resultLearningList) {
        super(id, name, dOB, yearOfEntering, score, resultLearningList);
        this.placeLearning = placeLearning;
    }
}

package project1;

import java.util.List;
import java.util.Map;

//Question interface allows multiple question types to be used such as T/F, ABC questions
//and questions that accept multiple submission
public interface Question {
	public Map<?, ?> candidateAnswers();
	public boolean multipleChoice();
	public List<?> answerChoices();

}

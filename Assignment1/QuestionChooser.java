package project1;

import java.util.List;
import java.util.Map;

//QuestionChooser class chooses what type of question will be presented to iVote
public class QuestionChooser {

	public Map<?, ?> getCandidateAnswers(Question question){
		return question.candidateAnswers();
	}
	
	public boolean getQuestionType(Question question){
		return question.multipleChoice();
	}
	
	public List<?> getAnswerChoices(Question question){
		return question.answerChoices();
	}
}

package project1;

import java.util.List;
import java.util.Map;

//IVote class will configure type of question and answer choices. Afterwards will accept people's submission before displaying results
public class IVote {
	/*answerChoices will hold a list of possible answers (true/false, ABC, etc.)
	candidateAnswers will keep track of the number of times a answer has been chosen
	multipleChoice is a boolean variable that tells whether question accepts multiple answers*/
	private List<?> answerChoices;
	private Map<?, ?> candidateAnswers;
	private boolean multipleChoice;
	
	public IVote(Question questionType){
		QuestionChooser qc = new QuestionChooser();
		answerChoices = qc.getAnswerChoices(questionType);
		candidateAnswers = qc.getCandidateAnswers(questionType);
		multipleChoice = qc.getQuestionType(questionType);
		//send candidateAnswers to PersonGenerator class which will create a group of students that will submit answers
		candidateAnswers = new PersonGenerator().Generator(candidateAnswers, answerChoices, multipleChoice);
		System.out.println("Question parameters: \n" + "Multiple Choices: " + multipleChoice + "\nAnswer Choices: " + candidateAnswers.keySet());
		System.out.println("Results: " + candidateAnswers.entrySet());
		
	}

}

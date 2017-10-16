package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//This type of question is a True/False question and (obvioulsy) accepts one answer
public class SingleChoiceTF implements Question {

	@Override
	public Map<String, Integer> candidateAnswers() {
		Map<String, Integer> answerChoices = new HashMap<String, Integer>();
		answerChoices.put("True", 0);
		answerChoices.put("False", 0);
		
		return answerChoices;
	}	
		
	@Override
	public boolean multipleChoice() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public List<?> answerChoices() {
		List<String> answerChoice = new ArrayList<String>();
		answerChoice.addAll(Arrays.asList("True", "False"));
		return answerChoice;
	}
}

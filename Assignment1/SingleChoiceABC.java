package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//This type of question has ABC as answer choices and only accepts one answer
public class SingleChoiceABC implements Question {

	@Override
	public Map<String, Integer> candidateAnswers() {
		Map<String, Integer> answerChoices = new HashMap<String, Integer>();
		answerChoices.put("A", 0);
		answerChoices.put("B", 0);
		answerChoices.put("C", 0);
		answerChoices.put("D", 0);
		answerChoices.put("E", 0);
		
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
		answerChoice.addAll(Arrays.asList("A","B","C","D","E"));
		return answerChoice;
	}
}

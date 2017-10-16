package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//SetAnswer class randomly chooses answer(s) for a person and increments the number of times that answer(s) has been chosen 
public class SetAnswer extends RandomGenerator{

	public Person setAnswer(Map<String, Integer> candidateAnswer, List<?> answerChoices, Person person, boolean multipleChoice){
		
		List<String> personAnswer = new ArrayList<String>();
		int choose = 0;
		
		//If question accept one answer, choose one of the answer choices and set it as person's answer
		if (!multipleChoice){
			choose = randomNumber(answerChoices.size());
			personAnswer.add((String)answerChoices.get(choose));
			candidateAnswer.replace((String) answerChoices.get(choose), (Integer)(candidateAnswer.get((answerChoices.get(choose)))+1));	
			person.setAnswer(personAnswer);
		}
		
		//If question accept multiple answer, go through all the answer choice and randomly choose if that answer has been chosen or not
		else if (multipleChoice){
			for(int i = 0; i < answerChoices.size(); i++){
				choose = randomNumber(2);
				if (choose == 1){
					personAnswer.add((String) answerChoices.get(i));
					candidateAnswer.replace((String) answerChoices.get(i), (Integer)(candidateAnswer.get((answerChoices.get(i)))+1));
				}
			}
			//If no answer has been chosen at the end, forcefully select one answer as the person's choice
			//This part can be edited out if person is allowed to not submit answers
			if (personAnswer.size() == 0){
				choose = randomNumber(answerChoices.size());
				personAnswer.add((String)answerChoices.get(choose));
				candidateAnswer.replace((String) answerChoices.get(choose), (Integer)(candidateAnswer.get((answerChoices.get(choose)))+1));
			}
			person.setAnswer(personAnswer);
		}
		
		return person;
	}
	
	//This class is called in the event a student decide to change their answer
	public Person replaceAnswer(Map<String, Integer> candidateAnswer, List<?> answerChoices, Person person, boolean multipleChoice){
		
		//First clear the person's answer and decrement the number of times a answer has been chosen
		for (int i = 0; i < person.getAnswer().size(); i++){
			candidateAnswer.replace((String) person.getAnswer().get(i), (Integer)(candidateAnswer.get((person.getAnswer().get(i)))-1));
		}
		person.getAnswer().clear();
		
		//Afterwards call the setAnswer class to have the student randomly choose some answer(s) again
		setAnswer(candidateAnswer, answerChoices, person, multipleChoice);
		
		return person;
	}
	
}

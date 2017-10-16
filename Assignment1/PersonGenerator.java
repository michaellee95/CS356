/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

import java.util.List;
import java.util.Map;

//This class will create a random group of people and assign a ID and set their answers
public class PersonGenerator extends RandomGenerator{

	//Create a random number of people
    public Map<?, ?> Generator(Map<?, ?> candidateAnswer, List<?> answerChoices, boolean multipleChoice){
      Person[] groupOfPeople = new Person[randomNumber(25)+25];
      System.out.println("Number of people: " + groupOfPeople.length);

      SetAnswer setAnswer = new SetAnswer();
      
      //For each person in the group set their ID and choose a answer for them
      //If student wishes to replace their answer call replaceAnswer method in setAnswer class
      //replaceAnswer class has been commented out but can be activated if needed
      for(int i = 0; i <groupOfPeople.length; i++){
    	  Person aPerson = new Student();
    	  aPerson.setId(i);
    	  setAnswer.setAnswer((Map<String, Integer>) candidateAnswer, answerChoices, aPerson, multipleChoice);
    	  //setAnswer.replaceAnswer((Map<String, Integer>) candidateAnswer, answerChoices, aPerson, multipleChoice);
    	  groupOfPeople[i] = aPerson;
      } 
      return candidateAnswer;
    }
}

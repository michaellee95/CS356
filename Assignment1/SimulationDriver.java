/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

import java.util.Random;

//SimulationDriver holds main method that will simualte the iVote service
public class SimulationDriver {
	
    public static void main(String[] args){
        
    	//Choose a random question type and answer choices to send to iVote
    	Random rand = new Random();
    	int questionConfigure = rand.nextInt(3);
    	
		if (questionConfigure == 0){
			IVote vote = new IVote(new MultipleChoiceABC());
		}
		
		
		else if (questionConfigure == 1){
			IVote vote = new IVote(new SingleChoiceABC());
		}
		
		else if (questionConfigure == 2){
			IVote vote = new IVote(new SingleChoiceTF());
		}
    }
}

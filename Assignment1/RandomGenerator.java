/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

import java.util.Random;

//The randomGenerator class returns a random number
class RandomGenerator {
    
    Random rand = new Random();
    
    public int randomNumber(int range){
        int randomNumber = rand.nextInt(range);
        return randomNumber;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project1;

import java.util.List;

//Student class will implement Person and hold student ID and answer
public class Student implements Person{
    
    private List<?> answer;
    private int id;
    
     @Override
    public List<?> getAnswer(){
        return answer; 
    }
    
     @Override
    public void setAnswer(List<?> answer){
        this.answer = answer;
    }
    
     @Override
    public int getId(){
        return id;
    } 
    
     @Override
    public void setId(int id){
    	this.id = id;
    }
}

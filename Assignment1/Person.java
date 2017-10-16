package project1;

import java.util.List;

//Person has been declared a interface to allow other people besides students to be able to implement it
public interface Person {
	public void setAnswer(List<?> answer);
	public List<?> getAnswer();
	public int getId();
	public void setId(int id);
	
}

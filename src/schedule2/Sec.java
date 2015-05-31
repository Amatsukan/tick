package schedule2;

public class Sec{
	private int sec = 0;
	
	public int add(){
		sec++;
		return sec;
	}
	
	public void zero(){
		sec=0;
	}
	
	public String toString(){
		return sec +"' ";
	}
}

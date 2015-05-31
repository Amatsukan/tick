package schedule2;

public class Minute {
	private int min = 0;
	private Sec sec = new Sec();
	
	public int add() {
		if(sec.add() == 60){
			min++;
			sec.zero();
		}
		return min;
	}

	public void zero() {
		min = 0;
	}

	public String toString() {
		return min + "\" " + sec;
	}
}

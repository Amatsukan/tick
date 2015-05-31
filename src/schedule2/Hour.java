package schedule2;

public class Hour{
	private int hour = 0;
	private Minute min = new Minute();
	
	public int add() {
		if(min.add() == 60){
			hour++;
			min.zero();
		}
		return hour;
	}

	public void zero() {
		hour = 0;
	}

	public String toString() {
		return hour + "h " + min;
	}
}

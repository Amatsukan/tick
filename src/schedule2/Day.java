package schedule2;

public class Day{
	private int day = 0;
	private Hour h = new Hour();
	
	public int add() {
		if(h.add() == 24){
			day++;
			h.zero();
		}
		return day;
	}

	public void zero() {
		day = 1;
	}

	public String toString() {
		return day + "day(s) " + h;
	}
}

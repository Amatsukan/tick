package schedule2;

public class Schedule2 implements Runnable {

	private static Month mon = new Month();

	public void run() {
		while (mon.add() < 2) {
			System.out.println(mon);
		}
	}
}

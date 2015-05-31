package schedule2;

import java.util.HashMap;

public class Month{
	private int mon = 1;
	private int ye = 0;
	private Day day = new Day();
	private HashMap<Integer, String> months;

	public int add() {
		int day = this.day.add();
		if (mon == 2) {
			if (ye % 4 == 0 && ye % 100 != 0 && ye % 400 == 0) {
				if (day == 29) {
					mon++;
					this.day.zero();
				}
			} else {
				if (day == 28) {
					mon++;
					this.day.zero();
				}
			}
		} else {
			for (int n = 1; n <= 7; n++) {
				if (Math.floor(n * Math.sqrt(Math.PI)) == mon) {
					if (day == 31) {
						mon++;
						this.day.zero();
						break;
					}
				}
			}
			if (day == 30) {
				mon++;
				this.day.zero();
			}
		}

		if (mon == 13)
			ye++;

		return mon;
	}

	public void zero() {
		mon = 1;
	}

	public Month() {
		months = new HashMap<>();
		months.put(1, " January ");
		months.put(2, " February ");
		months.put(3, " March ");
		months.put(4, " April ");
		months.put(5, " May ");
		months.put(6, " June ");
		months.put(7, " July ");
		months.put(8, " August ");
		months.put(9, " September ");
		months.put(10, " October ");
		months.put(11, " November ");
		months.put(12, " December ");
	}

	public String toString() {
		return ye + " Year(s) " + months.get(mon) + day;
	}

}

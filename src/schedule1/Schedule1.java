package schedule1;

import java.util.HashMap;

public class Schedule1 implements Runnable {

	private static int mon = 1, min, ho, day, sec, ye = 0;

	private static HashMap<Integer, String> months = new HashMap<>();

	public void whatever() {
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

	static int secs() {
		return ++sec;
	}

	static int mins() {
		if (secs() == 60) {
			sec = 0;
			min++;
		}
		return min;
	}

	static int hos() {
		if (mins() == 60) {
			ho++;
			min = 0;
		}
		
		return ho;
	}

	static int days() {
		if (hos() == 24) {
			day++;
			ho = 0;
		}
		return day;
	}

	static int mons() {
		days();
		if (mon == 2) {
			if (ye % 4 == 0 && ye % 100 != 0 && ye % 400 == 0) {
				if (day == 29) {
					mon++;
					day = 0;
				}
			} else {
				if (day == 28) {
					mon++;
					day = 0;
				}
			}
		} else {
			for (int n = 1; n <= 7; n++) {
				if (Math.floor(n * Math.sqrt(Math.PI)) == mon) {
					if (day == 31) {
						day = 1;
						return ++mon;
					}
				}
			}
			if (day == 30) {
				mon++;
				day = 0;
			}
		}
		return mon;
	}

	static void yes() {
		if (mons() == 13) {
			ye++;
		}
	}

	static public void print() {
		System.out.println(ye + " Year(s)  " + months.get(mon) + " " + day
				+ " day(s) " + ho + "h " + min + "\" " + sec + "' ");
	}

	public void run() {
		whatever();
		while (mon < 2) {
			yes();
			print();
		}
	}

}

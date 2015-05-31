package schedule1;

import java.util.HashMap;

public class Schedule2 implements Runnable {
	private static long date = 00000;
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
	
	public static void add(){
		date++;
	}
	
	public static int getsec(){
		return (int)(date%60);
	}
	public static int getmin(){
		return (int) ((date/60)%60);
	}
	
	private static int gethour() {
		return (int) (((date/60)/60)%24);
	}

	private static int getmon() {
		int mon = (int) (((((((date/60)/60)/24)/(30)))%12)+1);

		return mon;
	}

	private static int getday() {
		return (int) ((((date/60)/60)/24)%(31));
	}

	static public void print() {
		System.out.println(getyears() + " Year(s)  " + months.get(getmon()) + " " + getday()
				+ " day(s) " + gethour() + "h " + getmin() + "\" " + getsec() + "' " + date);
	}
	
	private static int getyears() {
		return (int) (((((((date/60)/60)/24)/(31)))/12));
	}

	public void run() {
		whatever();
		while (true) {
			add();
			print();
		}
	}
}

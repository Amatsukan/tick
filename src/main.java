import schedule1.Schedule2;
//import schedule2.Schedule2;




public class main {

	public static void main(String[] args) {

//		Thread schedule1 = new Thread(new Schedule2());
//		schedule1.start();
		
		Thread schedule2 = new Thread(new Schedule2());
		schedule2.start();
		
	}

}

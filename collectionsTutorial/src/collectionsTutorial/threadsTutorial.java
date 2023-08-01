package collectionsTutorial;

//public class threadsTutorial extends Thread {
//	
//	//if extending Thread class, must ovveride run()
//	
//	public void run() {
//		System.out.println("running");
//	}
//
//	public static void main(String[] args) {
//		//allows a program to operate more efficiently by doing multiple things at the same time.
//		
//		//extends the thread class
//		
//		threadsTutorial thread = new threadsTutorial();
//		thread.start();
//		
//		
//		
//		
//
//	}
//
//}


public class threadsTutorial implements Runnable {
	
	//if extending Thread class, must ovveride run()
	
	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		//allows a program to operate more efficiently by doing multiple things at the same time.
		
		//implements the runnable interface
		
		threadsTutorial obj = new threadsTutorial();
		
		Thread thread = new Thread(obj);
		thread.start();
		
		//
		Thread t = new Thread() {
			
			public void run() {
				System.out.println("running more");
			}
		};
		t.start();
		
		
		
		
		

	}

}
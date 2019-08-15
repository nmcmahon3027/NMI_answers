package helloPackage;

public class MoreStuff extends Thread {
	public void run(){
		for(int i=0; i<=10; i++){
			System.out.println(i);
			System.out.println("@@Printing " + i);
		}
	}


}

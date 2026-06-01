public class DownToFifty{
	public static void main(String[] args){
		for(int i = 50; i > 0; i--){
			System.out.println(i);
			try{Thread.sleep(1000);}
			catch(InterruptedException e){
				System.out.println("The thread was interrupted");
			}
		}
	}
}
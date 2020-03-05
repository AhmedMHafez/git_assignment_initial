public class MultiplicationSeries implements ISubscriber {
	public void notifySubscriber(String input){	
		// TODO Auto-generated method stub
		
		int n =Integer.parseInt(input);
		int result = n;
		
		
		while(n>1) {
			n-=1;
			result =result *n;
			

		}
		System.out.println("the multiplication series of  " + input +" is " + result );
	}
}

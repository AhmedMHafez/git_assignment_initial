public class Fibonacci implements ISubscriber {
   
   public static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
     
	@Override
	public void notifySubscriber(String input) {
		
		int numberofterms = Integer.parseInt(input);
		for (int i = 0 ; i <numberofterms ; i++ )
		{
			System.out.print(fib(i) + "\n");
		}
	}
}
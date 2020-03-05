import java.math.*;
public class Power implements ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		System.out.println("2 Power "+input+": "+Math.pow(2, Double.parseDouble(input)));
	}
}

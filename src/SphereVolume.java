
public class SphereVolume implements ISubscriber{
	public void notifySubscriber(String input) {
		Float Rad;
		double Res;
		Rad = Float.parseFloat(input);
		Res=(4/3)*(3.14)*(Rad*Rad*Rad);
		System.out.println("Sphere Volume =" + Res);
	}

}

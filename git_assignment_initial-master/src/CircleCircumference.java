public class CircleCircumference implements ISubscriber {
    
	public void notifySubscriber(String input) {
            double radius=Double.parseDouble(input);
            double circumference= Math.PI * 2*radius;
            System.out.println( "The circumference of this circle is: "+circumference) ;
    }
}
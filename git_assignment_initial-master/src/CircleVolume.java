import java.util.Scanner;
import java.lang.Math;

public class CircleVolume implements ISubscriber {

    public void notifySubscriber(String input) {
        final double PI = 3.1415926535;
        double radius = Double.parseDouble(input);
        double result = ((4.0/3.0)*PI*Math.pow(radius,3));
        System.out.println( "Circle Volume =  "+result) ;
    }
}

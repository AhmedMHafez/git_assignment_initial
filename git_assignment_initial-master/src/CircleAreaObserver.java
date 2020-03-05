public class CircleAreaObserver implements  ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        System.out.println("Circle of radius  = " + " has Area = "  + areaOfCircle(Integer.parseInt(input)));
    }
    private double areaOfCircle(int r){
        return Math.PI *r *2;

    }
}

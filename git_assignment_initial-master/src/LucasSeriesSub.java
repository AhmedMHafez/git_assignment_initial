import java.util.ArrayList;

public class LucasSeriesSub implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int numOfTerms = Integer.parseInt(input);
        ArrayList<Integer>lucesResult = new ArrayList<Integer>();
        int temp1 = 2  , temp2 = 1;
        int j = 0 , temp = 0;
        if(numOfTerms == 1)
        {
            lucesResult.add(temp1);
        }
        else if (numOfTerms == 2)
        {
            lucesResult.add(temp1);
            lucesResult.add(temp2);
        }
        else if (numOfTerms > 2)
        {
            lucesResult.add(temp1);
            lucesResult.add(temp2);
            for(int i = 2 ; i  < numOfTerms ; i++)
            {
                temp1 = lucesResult.get(j);
                temp2 = lucesResult.get(++j);
                temp = temp1 + temp2;
                lucesResult.add(temp);
            }
        }
        else
        {
            System.out.println("Not invalid Input");
            System.exit(0);
        }
        System.out.println("The Series is : " + lucesResult);
    }

}

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: amol.sharma
 * Date: 24/07/13
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class StatisticsWarmUp {

    public static void main(String args[]){

        // get the arguments and calculate the mean

        Integer numOfElements;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numOfElements =  Integer.parseInt(args[0]);
        for(int i=0; i<numOfElements; i++){
            numList.add(Integer.parseInt(args[i+ 1]));
        }


        for(int i=0; i<numList.size(); i++){
            System.out.println(numList.get(i));

        }

    }

}

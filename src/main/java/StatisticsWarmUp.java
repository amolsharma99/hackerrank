import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: amol.sharma
 * Date: 24/07/13
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class StatisticsWarmUp {

    public static void main(String args[]) {

        Integer numOfElements;
        Double mean = 0.0;
        Double median;
        Integer mod = 0;
        Double standardDeviation = 0.0;
        Integer[] hashCount = new Integer[100001];
        hashCount[0] = 0;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        numOfElements = scan.nextInt();
        for (int i = 0; i < numOfElements; i++) {
            numList.add(scan.nextInt());
        }


        for (int i = 0; i < numList.size(); i++) {
            mean = mean + numList.get(i);
            if (hashCount[Integer.parseInt(numList.get(i).toString())] == null) {
                hashCount[Integer.parseInt(numList.get(i).toString())] = 1;
            } else {
                hashCount[Integer.parseInt(numList.get(i).toString())]++;
            }
        }

        mean = mean / numOfElements;
        Collections.sort(numList);
        if (numOfElements % 2 != 0) {
            //middle element
            median = Double.valueOf(numList.get(numOfElements / 2));
        } else {
            median = Double.valueOf(numList.get(numOfElements / 2) + numList.get(numOfElements / 2 - 1));
            median = median / 2;
        }

        //mod
        Integer max = 0;
        for (Integer i = 0; i < 100001; i++) {
            if (hashCount[i] != null && hashCount[i] > max) {
                max = hashCount[i];
                mod = i;
            }
        }

//        standardDeviation
        for (int i = 0; i < numList.size(); i++) {
            standardDeviation = standardDeviation + (mean - numList.get(i)) * (mean - numList.get(i));
        }
        standardDeviation = standardDeviation / numOfElements;
        standardDeviation = Math.sqrt(standardDeviation);

        //95% CI
        Double lowerCI = mean - (1.96 * standardDeviation) / (Math.sqrt(numOfElements));
        Double upperCI = mean + (1.96 * standardDeviation) / (Math.sqrt(numOfElements));

        System.out.println(mean);
        System.out.println(median);
        System.out.println(mod);
        System.out.println(standardDeviation);
        System.out.println(lowerCI + " " + upperCI);

    }

}

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: amol.sharma
 * Date: 04/08/13
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class MarkAndToys {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int n, k;

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        k = scan.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int items=0, i=0;
        while(k>0 && i<n){
            if(arr[i]<k){
                k=k-arr[i];
                i++;
                items++;
            }
            else
                break;
        }

        System.out.println(items);
    }
}

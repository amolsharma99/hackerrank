import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: amol.sharma
 * Date: 04/08/13
 * Time: 11:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class BotSavesPrincess {

    static void displayPathtoPrincess(int n, String[] grid) {

        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if (grid[i].indexOf('p') >= 0) {
                x = i;//row found
                for (int j = 0; j < grid[i].length(); j++) {
                    if (grid[i].charAt(j) == 'p') {
                        y = j;
                        break;
                    }
                }
            }
        }

        //you have to go from (n/2,n/2) to (x,y)
        //if x++ then right
        //if x-- then left
        //if y++ then up
        //if y-- then down
        int r = n / 2, c = n / 2;
        while (r != x) {
            if (r < x) {
                r++;
                System.out.println("DOWN");
            } else {
                r--;
                System.out.println("UP");
            }
        }

        while (c != y) {
            if (c < y) {
                c++;
                System.out.println("RIGHT");
            } else {
                c--;
                System.out.println("LEFT");
            }
        }
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for (int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

        displayPathtoPrincess(m, grid);
    }
}

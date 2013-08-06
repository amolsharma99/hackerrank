import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: amol.sharma
 * Date: 04/08/13
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class BotSavesPrincess2 {

    static void nextMove(int n, int r, int c, String[] grid) {
        //you have to go from (r,c) to (x,y)
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
//                System.out.println(x + " " + y + " " + grid[i]);
            }
        }

        //you have to go from (r,c) to (x,y)
        //if x++ then right
        //if x-- then left
        //if y++ then up
        //if y-- then down
        boolean flag=false;
        while (r != x) {
            if (r < x) {
                r++;
                System.out.println("DOWN");
                flag=true;
                break;
            } else {
                r--;
                System.out.println("UP");
                flag=true;
                break;
            }
        }

        while (c != y && flag==false) {
            if (c < y) {
                c++;
                System.out.println("RIGHT");
                break;
            } else {
                c--;
                System.out.println("LEFT");
                break;
            }
        }


    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, r, c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];

        for (int i = 0; i < n; i++) {
            grid[i] = in.next();
        }
        nextMove(n, r, c, grid);

    }
}

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: amol.sharma
 * Date: 25/07/13
 * Time: 1:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class TextProcessingWarmUp {

    public static void main(String args[]) {
        Integer tc;
        Scanner scan = new Scanner(System.in);
        tc = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < tc; i++) {
            String text = scan.nextLine();
         //   System.out.println(text);
            Integer aCount = 0, anCount = 0, theCount = 0, datesCount = 0;
            //to find 'a' 'an' 'the' and dates
            String[] words = text.split(" ");
            for (int j = 0; j < words.length; j++) {
                if (words[j].replaceAll("^\"|\"$", "").matches("a")) {
                    aCount++;
                } else if (words[j].replaceAll("^\"|\"$", "").matches("an")) {
                    anCount++;
                } else if (words[j].replaceAll("^\"|\"$", "").matches("the") || words[j].matches("The")) {
                    theCount++;
                } else if (words[j].replaceAll("^\"|\"$", "").matches("\\d{4}-\\d{2}-\\d{2}") || words[j].replaceAll("^\"|\"$", "").matches("\\d{2}-\\d{2}-\\d{4}") ) {
                    datesCount++;
                }
            }

            System.out.println(aCount);
            System.out.println(anCount);
            System.out.println(theCount);
            System.out.println(datesCount);

        }

    }

}

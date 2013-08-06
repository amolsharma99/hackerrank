import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: amol.sharma
 * Date: 05/08/13
 * Time: 6:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class JourneyToTheMoon {

    public static void main(String[] args) {
        int n, relations;
        //n is the number of nodes
        //relations is the number of relations.
        //make a graph of n nodes
        //traverse the graph and in each component count the number of nodes in each componenet and multiply it

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        relations = scan.nextInt();
        ArrayList<Integer>[] mygraph = new ArrayList[n];
        for (int i = 0; i < n; i++)
            mygraph[i] = new ArrayList<Integer>();
        for (int i = 0; i < relations; i++) {
            int p, q;
            p = scan.nextInt();
            q = scan.nextInt();
            mygraph[p].add(q);
            mygraph[q].add(p);
        }

        ArrayList<Integer> counts = new ArrayList<Integer>();
        //graph is ready take visit array and traverse the complete graph
        Boolean[] visit = new Boolean[n];
        Arrays.fill(visit, false);
        for (int i = 0; i < n; i++) {
            if (visit[i] == false) {
                counts.add(bfs(mygraph, i, visit));
            }
        }
        long ans = 0;
        for (int i = 0; i < counts.size(); i++) {
            for (int j = 0; j < counts.size() && j != i; j++) {
                ans += counts.get(i)*counts.get(j);
            }
        }
        System.out.println(ans);
    }

    private static Integer bfs(ArrayList<Integer>[] mygraph, int i, Boolean[] visit) {

        Queue queue = new LinkedList();
        queue.add(i);
        int nodes = 1;
        while (!queue.isEmpty()) {
            //System.out.println("hi "+ queue.size());
            int temp = Integer.parseInt(queue.remove().toString());
            visit[temp] = true;
            for (int j = 0; j < mygraph[temp].size(); j++) {
                if (visit[mygraph[temp].get(j)] == false) {
                    nodes++;
                    queue.add(mygraph[temp].get(j));
                }
            }
            //System.out.println(queue.size());
        }
        return nodes;
    }
}

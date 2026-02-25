import java.util.*;

// https://leetcode.com/problems/baseball-game/submissions/1878653987/?envType=problem-list-v2&envId=array


public class BaseballGame {
    public static void main(String[] args) {
        String[] operations = { "5", "2", "C", "D", "+" };
        System.out.println("Total Score: " + calPoints(operations));
    }
    public static int calPoints(String[] operations) {
        ArrayList<Integer> record = new ArrayList<>();

        for (String op : operations) {

            if (op.equals("C")) {
                record.remove(record.size() - 1);               // invalidate last score

            } else if (op.equals("D")) {
                int last = record.get(record.size() - 1);     // double last score
                record.add(2 * last);

            } else if (op.equals("+")) {          // sum of last two scores
                int a = record.get(record.size() - 1);
                int b = record.get(record.size() - 2);
                record.add(a + b);

            } else { 
                record.add(Integer.parseInt(op));    // here Integer.parseInt(op) converts string to integer
            }
        }

        // sum all
        int sum = 0;
        for (int x : record) sum += x;

        return sum;
    }




    /*
     public int calPoints(String[] operations) {

        ArrayList<Integer> record = new ArrayList<>();
        int n = operations.length;

        for (int i = 0; i < n; i++) {

            String op = operations[i];

            if (op.equals("C")) {
                record.remove(record.size() - 1);

            } else if (op.equals("D")) {
                int last = record.get(record.size() - 1);
                record.add(2 * last);

            } else if (op.equals("+")) {
                int a = record.get(record.size() - 1);
                int b = record.get(record.size() - 2);
                record.add(a + b);

            } else {
                record.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int i = 0; i < record.size(); i++) {
            sum += record.get(i);
        }

        return sum;
    }
    */
}

import java.util.*;
import java.io.*;


public class Oscillations {

    private static class State {
        int location;
        int moves;
        State(int location, int moves) {
            this.location = location;
            this.moves = moves;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Queue < State > q = new LinkedList < State > ();
        int m = in .nextInt();

        q.add(new State(0, 0));
        while (q.size() > 0) {
            State s = q.remove();
            if (s.location == m) {
                System.out.print(s.moves - 1);
                break;
            }

            q.add(new State(s.location - s.moves, s.moves + 1));
            q.add(new State(s.location + s.moves, s.moves + 1));
        }
    }
}

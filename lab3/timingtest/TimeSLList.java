package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        AList<Integer> N = new AList<>();
        AList<Double> time = new AList<>();
        AList<Integer> opcount = new AList<>();


        int M = 10000;
        for(int i = 1; i <= 128; i = i*2) {
            SLList<Integer> demo = new SLList<>();
            int s = 0;
            while( s < i * 1000) {
                demo.addLast(s);
                s++;
            }

            Stopwatch sw = new Stopwatch();

            for(int j = 0; j < M; j++) {
                demo.getLast();
            }
            double timeInSeconds = sw.elapsedTime();

            N.addLast(s);
            time.addLast(timeInSeconds);
            opcount.addLast(M);
        }

        System.out.println("Timing table for getLast");
        printTimingTable(N, time, opcount);
    }

}

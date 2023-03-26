package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
    @Test
    public void testThreeAddThreeRemove() {
        AListNoResizing<Integer> listNoResizing = new AListNoResizing<>();
        BuggyAList<Integer> buggyAList = new BuggyAList<>();

        int size = 3;
        for(int i = 0; i < size; i++) {
            listNoResizing.addLast(i);
            buggyAList.addLast(i);
        }
        for(int i = 0; i < size; i++) {
            assertEquals(listNoResizing.removeLast(), buggyAList.removeLast());
        }
    }

    @Test
    public void randomizedTest() {
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> B = new BuggyAList<>();

        int N = 50000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 3);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                B.addLast(randVal);
                L.addLast(randVal);
                //System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                //System.out.println("size: " + size);
            }else {
                if(L.size() > 0) {
                    assertEquals(L.getLast(), B.getLast());
                    assertEquals(L.removeLast(), B.removeLast());
                }
            }
        }
    }


}

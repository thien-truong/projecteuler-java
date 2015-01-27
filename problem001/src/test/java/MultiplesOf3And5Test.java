import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;


public class MultiplesOf3And5Test {

    @Test
    public void findMultiplesOf3And5() {
        MultiplesOf3And5 multiplesOf3And5 = new MultiplesOf3And5();
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(5);
        expected.add(6);
        expected.add(9);
        ArrayList<Integer> multiples;
        multiples = multiplesOf3And5.findMultiplesOf3And5(10);

        assertEquals(expected, multiples);

    }
}

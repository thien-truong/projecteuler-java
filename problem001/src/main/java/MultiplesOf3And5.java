import java.util.ArrayList;

public class MultiplesOf3And5 {

    public ArrayList<Integer> findMultiplesOf3And5(int maxMultiple) {
        ArrayList<Integer> multiples = new ArrayList<Integer>();
        int possibleMultiple = 1;
        while (possibleMultiple < maxMultiple) {
            if (possibleMultiple % 3 == 0 || possibleMultiple % 5 == 0){
                multiples.add(possibleMultiple);
            }
            possibleMultiple = possibleMultiple + 1;
        }
        return multiples;
    }


}

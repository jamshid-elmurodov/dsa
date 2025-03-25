import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(List.of(1)));

        int currRow = 2;

        while (currRow <= numRows){
            List<Integer> lastRow = res.getLast();

            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for (int i = 1; i < currRow - 1; i++) {
                newRow.add(lastRow.get(i - 1) + lastRow.get(i));
            }

            newRow.add(1);
            res.add(newRow);
            currRow++;
        }

        return res;
    }
}

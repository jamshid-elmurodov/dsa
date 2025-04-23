package queue;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int stZeros = 0;
        int stOnes = 0;

        for (int i : students) {
            if (i == 1) stOnes++;
            else stZeros++;
        }

        for (int i : sandwiches) {
            if (i == 0) {
                if (stZeros == 0) return stOnes;
                stZeros--;
            }
            else {
                if (stOnes == 0) return stZeros;
                stOnes--;
            }
        }

        return stZeros + stOnes;
    }
}

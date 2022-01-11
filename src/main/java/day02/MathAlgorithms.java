package day02;

import java.util.ArrayList;
import java.util.List;

public class MathAlgorithms {

    public int getLNKO(int x, int y) {
        if (x == 0 || y == 0) {
            throw new IllegalArgumentException("parameters can not be ZERO");
        }

        var dividersX = getDividers(x);
        var dividersY = getDividers(y);
        for (int i : dividersX) {
            if (dividersY.contains(i)) {
                return i;
            }
        }
        return 1;
    }

    private List<Integer> getDividers(int number) {
        var result = new ArrayList<Integer>();
        for (int i = Math.abs(number); i >= 1; i--) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

}

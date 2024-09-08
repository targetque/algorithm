package codility;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int result[] = new int[N];
        int maxValue = 0;
        int lastUpdate = 0;

        for (int i = 0; i < A.length; i++) {
            final int pos = A[i] - 1;
            if (A[i] != N + 1) {
                if (result[pos] < lastUpdate) {
                    result[pos] = lastUpdate + 1;
                } else
                    result[pos]++;
                if (result[pos] > maxValue) {
                    maxValue = result[pos];
                }
            } else {
                lastUpdate = maxValue;
            }



        }
        for (int j = 0; j < N; j++) {
            if (result[j] < lastUpdate)
                result[j] = lastUpdate;
        }
        return result;
    }

    public static void main(String[] args) {
        //[3, 2, 2, 4, 2]
        MaxCounters s = new MaxCounters();
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] result = s.solution(5, A);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}

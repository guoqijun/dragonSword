package medium;

import java.util.*;

public class GetStrongestSolution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int len = arr.length;
        int mid = arr[(len - 1) / 2];
        int[] strong = new int[len];

        for (int index = 0; index < len; index++) {
            strong[index] = Math.abs(arr[index] - mid);
        }

        int maxStrong;
        int maxArr;
        int fuck;
        List<Integer> retIndex = new ArrayList<>();
        for (int index = 0; index < k; index++) {
            maxStrong = 0;
            maxArr = 0;
            for (fuck = 0; fuck < len; fuck++) {
                if (retIndex.contains(fuck)) {
                    continue;
                }
                if (strong[fuck] > maxStrong) {
                    maxStrong = strong[fuck];
                    maxArr = fuck;
                } else if (strong[fuck] == maxStrong) {
                    if (arr[fuck] > arr[maxArr]) {
                        maxArr = fuck;
                    }
                }
            }

            retIndex.add(maxArr);
        }

        int[] ret = new int[k];
        for (int index = 0; index < retIndex.size(); index++) {
            ret[index] = arr[retIndex.get(index)];
        }

        return ret;
    }
}

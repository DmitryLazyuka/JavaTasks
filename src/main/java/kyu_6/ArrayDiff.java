package kyu_6;

import java.util.ArrayList;
import java.util.List;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> listA = new ArrayList<>();
        for (int x : a) {
            listA.add(x);
        }
        List<Integer> listB = new ArrayList<>();
        for (int x : b) {
            listB.add(x);
        }

        listA.removeAll(listB);

        return listA.stream().mapToInt(Integer::intValue).toArray();
    }
}
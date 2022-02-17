package kyu_7;
//https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java

import java.util.*;
import java.util.stream.Collectors;

public class ListFiltering {
    public static List filterList(final List list) {

        return (List) list.stream()
                .filter(x -> x instanceof Integer)
                .collect(Collectors.toList());
    }
}
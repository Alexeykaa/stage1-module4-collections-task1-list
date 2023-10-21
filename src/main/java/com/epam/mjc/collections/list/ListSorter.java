package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int xa = Integer.parseInt(a);
        int ya = calculate(xa);
        int xb = Integer.parseInt(b);
        int yb = calculate(xb);
        int result;
        if (ya != yb) {
            result = ya - yb;
        } else {
            result = xa - xb;
        }
        return result;
    }

    private int calculate(int x) {
        return 5 * x * x + 3;
    }
}

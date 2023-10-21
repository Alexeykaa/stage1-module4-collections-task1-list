package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 2; i < sourceList.size(); i += 3) {
            String value = sourceList.get(i);
            result.add(value);
            result.add(value);
        }
        return result;
    }
}

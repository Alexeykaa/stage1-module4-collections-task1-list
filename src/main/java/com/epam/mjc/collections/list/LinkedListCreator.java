package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer value : sourceList) {
            if (value % 2 != 0) {
                result.addFirst(value);
            } else {
                result.addLast(value);
            }
        }
        return result;
    }
}

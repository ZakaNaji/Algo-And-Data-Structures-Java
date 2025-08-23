package com.znaji.datastructures.queue;

import java.util.ArrayList;

public class StackWithArrayList<T> {
    private ArrayList<T> top = new ArrayList<>();

    public void push(T value) {
        top.add(value);
    }

    @Override
    public String toString() {
        if (top.size() == 0) return "";
        T topValue = this.top.get(top.size()-1);
        return topValue.toString();
    }
}

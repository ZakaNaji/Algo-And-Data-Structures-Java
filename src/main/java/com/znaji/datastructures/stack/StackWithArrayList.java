package com.znaji.datastructures.stack;

import java.util.ArrayList;
import java.util.List;

public class StackWithArrayList <T>{
    List<T> values;

    StackWithArrayList() {
        values = new ArrayList<>();
    }

    public void push(T value) {
        values.add(value);
    }

    public T pop() {
        if (values.isEmpty()) return null;
        T temp = values.get(values.size()-1);
        values.remove(values.size()-1);
        return temp;
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack (top → bottom)\n");

        for (int i = values.size() - 1; i >= 0; i--) {
            sb.append("[ ").append(values.get(i)).append(" ]\n");
        }

        return sb.toString();
    }

    public T peek() {
        return values.get(values.size()-1);
    }
}

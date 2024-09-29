package com.znaji.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArray <T>{
    private int capacity;
    private int length;
    private T[] data;

    public MyArray(Class<T> clazz) {
        length = 0;
        capacity = 1;
        data = (T[])Array.newInstance(clazz, capacity);
    }

    public void push(T element) {
        if (capacity == length) {
            capacity *= 2;
            data = Arrays.copyOf(data, capacity);
        }
        data[length] = element;
        length++;
    }

    public T get(int index) {
        return data[index];
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "capacity=" + capacity +
                ", length=" + length +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}

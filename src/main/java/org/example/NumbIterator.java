package org.example;

import java.util.Iterator;

public class NumbIterator implements Iterator<Integer> {
    int min;
    int max;

    public NumbIterator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return (int) ((Math.random() * (max - min + 1) + min));
    }
}

package net.lecigne.javaprojects.ch03.nongeneric.sortable.impl;

import net.lecigne.javaprojects.ch03.nongeneric.sortable.Sortable;

public class ArraySortable implements Sortable {

    private Object[] elements;

    public ArraySortable(Object[] elements) {
        this.elements = elements;
    }

    @Override
    public Object get(int i) {
        return this.elements[i];
    }

    @Override
    public int size() {
        return this.elements.length;
    }

}

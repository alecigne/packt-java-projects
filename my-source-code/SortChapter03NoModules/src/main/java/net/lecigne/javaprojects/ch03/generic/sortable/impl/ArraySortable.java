package net.lecigne.javaprojects.ch03.generic.sortable.impl;

import net.lecigne.javaprojects.ch03.generic.sortable.Sortable;

public class ArraySortable<E> implements Sortable<E> {

    private E[] elements;

    public ArraySortable(E[] elements) {
        this.elements = elements;
    }

    @Override
    public E get(int i) {
        return this.elements[i];
    }

    @Override
    public int size() {
        return this.elements.length;
    }

}

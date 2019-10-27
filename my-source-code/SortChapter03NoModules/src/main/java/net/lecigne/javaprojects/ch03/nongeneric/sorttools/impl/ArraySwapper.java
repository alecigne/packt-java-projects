package net.lecigne.javaprojects.ch03.nongeneric.sorttools.impl;

import net.lecigne.javaprojects.ch03.nongeneric.sorttools.Swapper;

public class ArraySwapper implements Swapper {

    private Object[] elements;

    public ArraySwapper(Object[] elements) {
        this.elements = elements;
    }

    @Override
    public void swap(int i, int j) {
        final Object tmp = this.elements[j];
        this.elements[j] = this.elements[i];
        this.elements[i] = tmp;
    }

}

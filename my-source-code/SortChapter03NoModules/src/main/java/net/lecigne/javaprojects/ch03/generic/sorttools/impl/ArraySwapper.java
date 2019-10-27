package net.lecigne.javaprojects.ch03.generic.sorttools.impl;

import net.lecigne.javaprojects.ch03.generic.sorttools.Swapper;

public class ArraySwapper<E> implements Swapper {

    private E[] elements;

    public ArraySwapper(E[] elements) {
        this.elements = elements;
    }

    @Override
    public void swap(int i, int j) {
        final E tmp = this.elements[j];
        this.elements[j] = this.elements[i];
        this.elements[i] = tmp;
    }

}

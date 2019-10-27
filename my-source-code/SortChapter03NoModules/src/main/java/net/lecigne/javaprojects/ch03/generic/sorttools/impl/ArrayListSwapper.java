package net.lecigne.javaprojects.ch03.generic.sorttools.impl;

import java.util.ArrayList;

import net.lecigne.javaprojects.ch03.generic.sorttools.Swapper;

public class ArrayListSwapper<E> implements Swapper {

    private ArrayList<E> elements;

    public ArrayListSwapper(ArrayList<E> actualNames) {
        this.elements = actualNames;
    }

    @Override
    public void swap(int i, int j) {
        final var tmp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, tmp);
    }

}

package net.lecigne.javaprojects.ch03.nongeneric.sorttools.impl;

import java.util.ArrayList;

import net.lecigne.javaprojects.ch03.nongeneric.sorttools.Swapper;

public class ArrayListSwapper implements Swapper {

    private ArrayList elements;

    public ArrayListSwapper(ArrayList actualNames) {
        this.elements = actualNames;
    }

    @Override
    public void swap(int i, int j) {
        final var tmp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, tmp);
    }

}

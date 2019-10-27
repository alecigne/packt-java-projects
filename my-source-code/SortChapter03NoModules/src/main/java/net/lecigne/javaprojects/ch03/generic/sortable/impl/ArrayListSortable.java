package net.lecigne.javaprojects.ch03.generic.sortable.impl;

import java.util.ArrayList;

import net.lecigne.javaprojects.ch03.generic.sortable.Sortable;

public class ArrayListSortable<E> implements Sortable<E> {

    private ArrayList<E> elements;
    
    public ArrayListSortable(ArrayList<E> elements) {
        this.elements = elements;
    }

    @Override
    public E get(int i) {
        return this.elements.get(i);
    }

    @Override
    public int size() {
        return elements.size();
    }

    
    
}

package net.lecigne.javaprojects.ch03.nongeneric.sortable.impl;

import java.util.ArrayList;

import net.lecigne.javaprojects.ch03.nongeneric.sortable.Sortable;

public class ArrayListSortable implements Sortable {

    private ArrayList elements;
    
    public ArrayListSortable(ArrayList elements) {
        this.elements = elements;
    }

    @Override
    public Object get(int i) {
        return this.elements.get(i);
    }

    @Override
    public int size() {
        return elements.size();
    }

    
    
}

package net.lecigne.javaprojects;

import java.util.ArrayList;

public class ArrayListSortable implements Sortable {

    private ArrayList actualNames;
    
    public ArrayListSortable(ArrayList actualNames) {
        this.actualNames = actualNames;
    }

    @Override
    public Object get(int i) {
        return this.actualNames.get(i);
    }

    @Override
    public int size() {
        return this.actualNames.size();
    }

}

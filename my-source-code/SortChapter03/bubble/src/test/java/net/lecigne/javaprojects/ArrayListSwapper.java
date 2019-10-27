package net.lecigne.javaprojects;

import java.util.ArrayList;

public class ArrayListSwapper implements Swapper {

    private ArrayList actualNames;

    public ArrayListSwapper(ArrayList actualNames) {
        this.actualNames = actualNames;
    }

    @Override
    public void swap(int i, int j) {
        final var tmp = actualNames.get(i);
        actualNames.set(i, actualNames.get(j));
        actualNames.set(j, tmp);
    }

}

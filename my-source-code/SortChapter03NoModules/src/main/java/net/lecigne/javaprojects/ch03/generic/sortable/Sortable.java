package net.lecigne.javaprojects.ch03.generic.sortable;

public interface Sortable<E> {

    E get(int i);
    
    int size();
    
}

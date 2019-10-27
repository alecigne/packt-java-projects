package net.lecigne.javaprojects.ch03.nongeneric.sort.exception;

public class NonStringElementInCollection extends RuntimeException {

    private static final long serialVersionUID = -4880374476837903453L;

    public NonStringElementInCollection(String msg, Throwable e) {
        super(msg, e);
    }
    
}

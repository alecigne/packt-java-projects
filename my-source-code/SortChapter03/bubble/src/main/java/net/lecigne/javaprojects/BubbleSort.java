package net.lecigne.javaprojects;

import java.util.Comparator;

public class BubbleSort implements Sort, SortSupport {

    Swapper swapper = null;
    
    Comparator comparator = null;
    
    @Override
    public void setSwapper(Swapper swapper) {
        this.swapper = swapper;
    }

    @Override
    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(Sortable collection) {
        var n = collection.size();
        while (n > 1) {
            for (int j = 0; j < n - 1; j++) {
                if (comparator.compare(collection.get(j),
                        collection.get(j + 1)) > 0) {
                    swapper.swap(j, j + 1);
                }
            }
            n--;
        }
    }
}

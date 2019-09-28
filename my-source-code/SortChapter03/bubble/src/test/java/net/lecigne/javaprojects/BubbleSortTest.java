package net.lecigne.javaprojects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class BubbleSortTest {

    @Test
    public void canSortStrings() {
        
        // The names to sort
        
        var actualNames = new ArrayList(Arrays.asList(
                "Johnson", "Wilson",
                "Wilkinson", "Abraham", "Dagobert"));
        
        var names = new Sortable() {
            @Override
            public int size() {
                return actualNames.size();
            }
            
            @Override
            public Object get(int i) {
                return actualNames.get(i);
            }
        };
        
        // Our sorting instance
        
        var sort = new BubbleSort();
        
        // Just to show that classes can be inside a method :)
        class SwapActualNamesArrayElements implements Swapper {
            @Override
            public void swap(int i, int j) {
                final var tmp = actualNames.get(i);
                actualNames.set(i, actualNames.get(j));
                actualNames.set(j, tmp);
            }
        }
        
        var stringComparator = new Comparator() {
            @Override
            public int compare(Object first, Object second) {
                String firstString = (String) first;
                String secondString = (String) second;
                return firstString.compareTo(secondString);
            }
        };
        
        sort.setSwapper(new SwapActualNamesArrayElements());
        sort.setComparator(stringComparator);
        
        // Sorting
        
        sort.sort(names);

        // Checking
        
        Assert.assertEquals(List.of(
                "Abraham", "Dagobert",
                "Johnson", "Wilkinson", "Wilson"
                ), actualNames);
    }

}

package net.lecigne.javaprojects.ch03.nongeneric.sort.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import net.lecigne.javaprojects.ch03.nongeneric.sort.exception.NonStringElementInCollection;
import net.lecigne.javaprojects.ch03.nongeneric.sortable.impl.ArrayListSortable;
import net.lecigne.javaprojects.ch03.nongeneric.sortable.impl.ArraySortable;
import net.lecigne.javaprojects.ch03.nongeneric.sorttools.impl.ArrayListSwapper;
import net.lecigne.javaprojects.ch03.nongeneric.sorttools.impl.ArraySwapper;
import net.lecigne.javaprojects.ch03.nongeneric.sorttools.impl.StringComparator;

public class BubbleSortTest {

    @Test
    public void canSortArrayListOfStrings() {
        var actualNames = new ArrayList(Arrays.asList("Johnson", "Wilson",
                "Wilkinson", "Abraham", "Dagobert"));

        var expectedResult = List.of("Abraham", "Dagobert", "Johnson",
                "Wilkinson", "Wilson");

        var names = new ArrayListSortable(actualNames);
        var sort = new BubbleSort();
        sort.setComparator(new StringComparator());
        sort.setSwapper(new ArrayListSwapper(actualNames));
        sort.sort(names);
        Assert.assertEquals(expectedResult, actualNames);
    }

    @Test
    public void canSortArrayOfStrings() {
        var actualNames = new String[] { "Johnson", "Wilson", "Wilkinson",
                "Abraham", "Dagobert" };

        var expectedResult = new String[] { "Abraham", "Dagobert", "Johnson",
                "Wilkinson", "Wilson" };
        
        var names = new ArraySortable(actualNames);
        var sort = new BubbleSort();
        sort.setComparator(new StringComparator());
        sort.setSwapper(new ArraySwapper(actualNames));
        sort.sort(names);
        assertArrayEquals(expectedResult, actualNames);
    }
    
    @Test(expected = ClassCastException.class)
    public void canNotSortMixedElements() {
        var actualNames = new ArrayList(Arrays.asList(42, "Wilson",
                "Wilkinson", "Abraham", "Dagobert"));
        
        var names = new ArrayListSortable(actualNames);
        var sort = new BubbleSort();
        sort.setComparator(new StringComparator());
        sort.setSwapper(new ArrayListSwapper(actualNames));
        sort.sort(names);
    }
    
    @Test(expected = NonStringElementInCollection.class)
    public void canNotSortMixedElements2() {
        var actualNames = new ArrayList(Arrays.asList(42, "Wilson",
                "Wilkinson", "Abraham", "Dagobert"));
        
        var names = new ArrayListSortable(actualNames);
        var sort = new BubbleSort2();
        sort.setComparator(new StringComparator());
        sort.setSwapper(new ArrayListSwapper(actualNames));
        sort.sort(names);
    }

}

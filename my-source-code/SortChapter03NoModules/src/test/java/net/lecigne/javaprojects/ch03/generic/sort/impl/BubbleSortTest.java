package net.lecigne.javaprojects.ch03.generic.sort.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import net.lecigne.javaprojects.ch03.generic.sortable.Sortable;
import net.lecigne.javaprojects.ch03.generic.sortable.impl.ArrayListSortable;
import net.lecigne.javaprojects.ch03.generic.sortable.impl.ArraySortable;
import net.lecigne.javaprojects.ch03.generic.sorttools.impl.ArrayListSwapper;
import net.lecigne.javaprojects.ch03.generic.sorttools.impl.ArraySwapper;

public class BubbleSortTest {

    @Test
    public void canSortArrayListOfStrings() {
        var actualNames = new ArrayList<>(Arrays.asList("Johnson", "Wilson",
                "Wilkinson", "Abraham", "Dagobert"));

        var expectedResult = List.of("Abraham", "Dagobert", "Johnson",
                "Wilkinson", "Wilson");

        Sortable<String> names = new ArrayListSortable<>(actualNames);
        var sort = new BubbleSort<String>();
        sort.setComparator(String::compareTo);
        sort.setSwapper(new ArrayListSwapper<>(actualNames));
        sort.sort(names);
        Assert.assertEquals(expectedResult, actualNames);
    }

    @Test
    public void canSortArrayOfStrings() {
        var actualNames = new String[] { "Johnson", "Wilson", "Wilkinson",
                "Abraham", "Dagobert" };

        var expectedResult = new String[] { "Abraham", "Dagobert", "Johnson",
                "Wilkinson", "Wilson" };
        
        Sortable<String> names = new ArraySortable<>(actualNames);
        var sort = new BubbleSort<String>();
        sort.setComparator(String::compareTo);
        sort.setSwapper(new ArraySwapper<String>(actualNames));
        sort.sort(names);
        assertArrayEquals(expectedResult, actualNames);
    }
    
}

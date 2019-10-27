package net.lecigne.javaprojects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class BubbleSortTest2 {

    @Test
    public void canSortStrings() {
        
        var actualNames = new ArrayList(Arrays.asList(
                "Johnson", "Wilson",
                "Wilkinson", "Abraham", "Dagobert"));
        
        var expectedResult = List.of(
                "Abraham", "Dagobert",
                "Johnson", "Wilkinson", "Wilson"
            );
        
        var names = new ArrayListSortable(actualNames);
        var sort = new BubbleSort();
        sort.setComparator(new StringComparator());
        sort.setSwapper(new ArrayListSwapper(actualNames));
        sort.sort(names);
        Assert.assertEquals(expectedResult, actualNames);
        
    }
    
}

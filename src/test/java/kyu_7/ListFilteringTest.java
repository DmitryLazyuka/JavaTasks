package kyu_7;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListFilteringTest {

    @Test
    public void examples() {

        assertEquals(Arrays.asList(new Object[]{1, 2}), ListFiltering.filterList(Arrays.asList(new Object[]{1, 2, "a", "b"})));
        assertEquals(Arrays.asList(new Object[]{1, 0, 15}), ListFiltering.filterList(Arrays.asList(new Object[]{1, "a", "b", 0, 15})));
        assertEquals(Arrays.asList(new Object[]{1, 2, 123}), ListFiltering.filterList(Arrays.asList(new Object[]{1, 2, "aasf", "1", "123", 123})));
    }
}

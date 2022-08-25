package task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void datesToStringFormat() {
        Task1 task1 = new Task1();
        List<String> dates = new ArrayList<>(List.of("04/05/2022", "01|01|2001", "2014/01/04", "12-24-2012", "24-12-2012"));
        List<String> expected = new ArrayList<>(List.of("20220504", "20140104", "20121224"));
        List<String> actual = task1.datesToStringFormat(dates);
        assertEquals(expected, actual, "Method datesToStringFormat error");
    }
}
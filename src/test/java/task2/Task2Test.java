package task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void findFirstUniqueName() {
        Task2 task2 = new Task2();
        List<String> names1 = new ArrayList<>(List.of("Oleg", "Ivan", "Oleg", "Anton"));
        String expected1 = "Ivan";
        String actual1 = task2.findFirstUniqueName(names1);
        assertEquals(expected1, actual1, "Method findFirstUniqueName error");

        List<String> names2 = new ArrayList<>(List.of("Oleg", "Ivan", "Oleg", "Ivan"));
        String expected2 = null;
        String actual2 = task2.findFirstUniqueName(names2);
        assertEquals(expected2, actual2, "Method findFirstUniqueName error");
    }
}
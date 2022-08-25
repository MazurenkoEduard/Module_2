package main;

import task1.Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        List<String> dates = List.of("05/04/2022", "04-05-2022", "2022/04/05");
        System.out.println("Task1");
        System.out.println("Input: " + dates);
        System.out.println("Output: " + task1.datesToStringFormat(dates));
        System.out.println();
    }
}

package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String outcome = "";

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                int multiplication = i * j;
                if (multiplication < 10) {
                    outcome += String.format("  %s |", multiplication);
                } else if (multiplication >= 100) {
                    outcome += String.format("%s |", multiplication);
                } else if (multiplication >= 10) {
                    outcome += String.format(" %s |", multiplication);
                }


            }
            outcome += "\n";
        }
        System.out.println(outcome);

        return outcome;
    }
}

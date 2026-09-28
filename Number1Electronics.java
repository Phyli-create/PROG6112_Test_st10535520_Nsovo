/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronics;

/**
 *
 * @author emeris
 */
public class Number1Electronics {

    public static void main(String[] args) {

        // Single-dimensional array for cities
        String[] cities = {
            "CAPE TOWN",
            "PORT ELIZABETH",
            "PRETORIA"
        };

        // Single-dimensional array for gaming consoles
        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        };

        // Two-dimensional array for sales
        // Rows = cities
        // Columns = gaming consoles
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Display report heading
        System.out.println("------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------");

        // Display column headings
        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "", consoles[0], consoles[1], consoles[2]);

        // Display sales data
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------");

        // Array to store total sales for each city
        int[] cityTotals = new int[cities.length];

        // Calculate and display totals
        for (int i = 0; i < sales.length; i++) {

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }

            cityTotals[i] = total;

            System.out.printf("%-20s %d%n", cities[i], cityTotals[i]);
        }

        // Determine city with the most sales
        int highestSales = cityTotals[0];
        int highestCityIndex = 0;

        for (int i = 1; i < cityTotals.length; i++) {

            if (cityTotals[i] > highestSales) {
                highestSales = cityTotals[i];
                highestCityIndex = i;
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: "
                + cities[highestCityIndex]);

        System.out.println("------------------------------------------------------------");
    }
}
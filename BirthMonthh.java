/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.birthmonthh;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Jecka Vien
 */
public class BirthMonthh {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> group1 = new HashSet<>();
        Set<String> group2 = new HashSet<>();
        Set<String> self = new HashSet<>();

        // Input birth months for groups
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter birth month: ");
            String birthMonth = sc.nextLine();

            if (isValidMonth(birthMonth)) {
                if (i < 3) {
                    group1.add(birthMonth);
                } else {
                    group2.add(birthMonth);
                }
            } else {
                System.out.println("Invalid month. Please enter a valid month.");
                i--; // Decrement to repeat the current iteration
            }
        }

        // Display groups
        System.out.println("Group 1: " + group1);
        System.out.println("Group 2: " + group2);

        // Input user's birth month
        System.out.print("Enter your birth month: ");
        String selfBirthMonth = sc.nextLine();
        self.add(selfBirthMonth);

        // Set operations
        Set<String> union = new HashSet<>(group1);
        union.addAll(group2);
        System.out.println("Union: " + union);

        Set<String> intersection = new HashSet<>(group1);
        intersection.retainAll(group2);
        System.out.println("Intersection: " + intersection);

        Set<String> difference = new HashSet<>(group1);
        difference.removeAll(group2);
        System.out.println("Difference: " + difference);

        // Check if user shares a birth month with classmates
        if (intersection.contains(selfBirthMonth)) {
            System.out.println("You share the same birth month with some of your classmates.");
        } else {
            System.out.println("You don't share a birth month with your classmates.");
        }
    }

    private static boolean isValidMonth(String month) {
        // You can implement validation logic here based on your requirements
        // For simplicity, assume any non-empty string is a valid month
        return !month.isEmpty();
    }
}

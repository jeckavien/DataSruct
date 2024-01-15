/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.adjacencylist;

import java.util.ArrayList;

/**
 *
 * @author jecka vien
 */
public class Adjacencylist {
 public static void main (String args[]) {
        // a list consisting of lists
        ArrayList<ArrayList<Character>> adjList = new ArrayList<>();
        char[] vertices = {'A', 'B', 'C', 'D', 'E','F','G'};
        int num = 7;  // number of vertices
        
        for (int i = 0; i < num; i++) { 
            adjList.add(new ArrayList<>());
        }
        
        adjList.get(0).add('B');
        adjList.get(1).add('C');
        adjList.get(2).add('A');
        adjList.get(2).add('E');
        adjList.get(3).add('C');
        adjList.get(3).add('E');
        adjList.get(3).add('F');
        adjList.get(3).add('G');
        adjList.get(4).add('C');
        adjList.get(4).add('D');
        adjList.get(4).add('F');
        adjList.get(5).add('D');
        adjList.get(5).add('E');
        adjList.get(6).add('D');
        
        int v = 0; //  display letters A to E //  displaying content of each list
        for (int i = 0; i < num; i++, v++) {
            System.out.println(vertices[v] + ": " + adjList.get(i));
        }
    }
}
   


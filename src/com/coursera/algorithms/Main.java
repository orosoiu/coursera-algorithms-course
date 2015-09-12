package com.coursera.algorithms;

import com.coursera.algorithms.unionfind.impl.QuickFind;

import java.util.Scanner;

/**
 * Created by orosoiu on 12/09/15.
 */
class Main {

    public static void main(String[] args) {
        QuickFind quickFind = new QuickFind(10);
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nodes to connect, separated by space. Enter an empty line to finish.\n");
        while(true) {
            input = scanner.nextLine();
            if(input == null || "".equals(input)) {
                break;
            }

            String[] nodes = input.split(" ", 2);
            quickFind.union(Integer.valueOf(nodes[0]), Integer.valueOf(nodes[1]));
            System.out.println(quickFind.toString());
        }
    }
}

package com.coursera.algorithms;

import com.coursera.algorithms.unionquickfind.UnionQuickFind;

import java.util.Scanner;

/**
 * Created by orosoiu on 12/09/15.
 */
public class Main {

    public static void main(String[] args) {
        UnionQuickFind unionQuickFind = new UnionQuickFind(10);
        String input = null;
        Scanner scanner = new Scanner(System.in);
        if (scanner == null) {
            System.out.println("Unable to fetch console");
            System.exit(1);
        }
        System.out.println("Enter the nodes to connect, separated by space. Enter an empty line to finish.\n");
        while(true) {
            input = scanner.nextLine();
            if(input == null || "".equals(input)) {
                break;
            }

            String[] nodes = input.split(" ", 2);
            unionQuickFind.unionEager(Integer.valueOf(nodes[0]), Integer.valueOf(nodes[1]));
            System.out.println(unionQuickFind.toString());
        }
    }
}

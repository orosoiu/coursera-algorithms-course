package com.coursera.algorithms.unionfind.impl;

import com.coursera.algorithms.unionfind.AbstractUnionFind;

/**
 * Created by orosoiu on 12/09/15.
 */
public class WeightedQuickUnion extends QuickUnion {
    private int[] branchSize;

    public WeightedQuickUnion(int N) {
        super(N);
        branchSize = new int[roots.length];
        for(int i=0; i<branchSize.length; i++) {
            branchSize[i] = 1;
        }
    }

    @Override
    public void union(int firstNode, int secondNode) {
        int firstNodeRoot = getRoot(firstNode);
        int secondNodeRoot = getRoot(secondNode);

        if(firstNodeRoot == secondNodeRoot) {
            return;
        }

        if(branchSize[firstNodeRoot] < branchSize[secondNodeRoot]) {
            roots[firstNodeRoot] = secondNodeRoot;
            branchSize[secondNodeRoot] += branchSize[firstNodeRoot];
        } else {
            roots[secondNodeRoot] = firstNodeRoot;
            branchSize[firstNodeRoot] += branchSize[secondNodeRoot];
        }
    }
}

package com.coursera.algorithms.unionfind.impl;

import com.coursera.algorithms.unionfind.AbstractUnionFind;

/**
 * Created by orosoiu on 12/09/15.
 */
public class QuickUnion extends AbstractUnionFind {

    protected QuickUnion(int N) {
        super(N);
    }

    protected int getRoot(int node) {
        while(roots[node] != node) {
            node = roots[node];
        }
        return node;
    }

    @Override
    public boolean areNodesConnected(int p, int q) {
        return getRoot(p) == getRoot(q);
    }

    /**
     * Make the root of the second tree point to the root of the first tree
     * @param firstNode first node
     * @param secondNode second node
     */
    @Override
    public void union(int firstNode, int secondNode) {
        int firstNodeRoot = getRoot(firstNode);
        int secondNodeRoot = getRoot(secondNode);
        roots[secondNodeRoot] = firstNodeRoot;
    }
}

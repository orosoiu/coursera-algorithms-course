package com.coursera.algorithms.unionfind;

import java.util.Arrays;

/**
 * Created by orosoiu on 12/09/15.
 */
public abstract class AbstractUnionFind {
    protected final int[] roots;

    protected AbstractUnionFind(int N) {
        roots = new int[N];
        for (int i=0; i<N; i++) {
            roots[i] = i;
        }
    }

    protected int getPoolSize() {
        return roots.length;
    }

    /**
     * Tells whether the nodes are connected
     * @param p first node
     * @param q second node
     * @return
     */
    public abstract boolean areNodesConnected(int p, int q);

    /**
     * The method that joins two nodes together
     * @param firstNode first node
     * @param secondNode second node
     */
    public abstract void union(int firstNode, int secondNode);

    @Override
    public String toString() {
        return Arrays.toString(roots);
    }
}

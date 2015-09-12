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

    protected int getRoot(int v) {
        while(roots[v] != v) {
            v = roots[v];
        }
        return v;
    }

    protected int getPoolSize() {
        return roots.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(roots);
    }

    /**
     * The method that joins two nodes together
     * @param p first node
     * @param q second node
     */
    public abstract void union(int p, int q);
}

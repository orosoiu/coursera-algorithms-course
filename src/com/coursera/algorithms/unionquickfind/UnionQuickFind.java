package com.coursera.algorithms.unionquickfind;

import java.util.Arrays;

/**
 * Created by orosoiu on 12/09/15.
 */
public class UnionQuickFind {
    private int[] roots;

    public UnionQuickFind(int N) {
        roots = new int[N];
        for (int i=0; i<N; i++) {
            roots[i] = i;
        }
    }

    public int root(int v) {
        while(roots[v] != v) {
            v = roots[v];
        }
        return v;
    }

    public void unionEager(int p, int q) {
        int pid = roots[p];
        int qid = roots[q];
        for (int i=0; i<getPoolSize(); i++) {
            if(roots[i] == pid) {
                roots[i] = qid;
            }
        }
    }

    public int getPoolSize() {
        return roots.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(roots);
    }
}
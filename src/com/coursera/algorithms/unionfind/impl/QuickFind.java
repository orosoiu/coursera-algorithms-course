package com.coursera.algorithms.unionfind.impl;

import com.coursera.algorithms.unionfind.AbstractUnionFind;

/**
 * Created by orosoiu on 12/09/15.
 */
public class QuickFind extends AbstractUnionFind {
    public QuickFind(int N) {
        super(N);
    }

    @Override
    public void union(int p, int q) {
        int pid = roots[p];
        int qid = roots[q];
        for (int i=0; i<getPoolSize(); i++) {
            if(roots[i] == pid) {
                roots[i] = qid;
            }
        }
    }
}
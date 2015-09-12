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
    public boolean areNodesConnected(int firstNode, int secondNode) {
        return roots[firstNode] == roots[secondNode];
    }

    @Override
    public void union(int firstNode, int secondNode) {
        int firstNodeRoot = roots[firstNode];
        int secondNodeRoot = roots[secondNode];
        for (int i=0; i<getPoolSize(); i++) {
            if(roots[i] == firstNodeRoot) {
                roots[i] = secondNodeRoot;
            }
        }
    }
}
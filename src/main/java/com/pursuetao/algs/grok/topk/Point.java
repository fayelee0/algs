package com.pursuetao.algs.grok.topk;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distance() {
        return x * x + y * y;
    }
}

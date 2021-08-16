package com.shui.headfirstdesignpatterns.chapter8.forth;

/**
 * @author shui.
 * @date 2021/8/16.
 * @time 16:36.
 */
class Duck implements Comparable {

    String name;
    int weight;

    public Duck(String name, int wight) {
        this.name = name;
        this.weight = wight;
    }

    @Override
    public String toString() {
        return "name='" + name + " wights=" + weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck that = (Duck) o;
        if (weight < that.weight) {
            return -1;
        } else if (weight == that.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}

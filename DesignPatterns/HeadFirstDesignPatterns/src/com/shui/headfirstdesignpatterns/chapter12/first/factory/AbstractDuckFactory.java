package com.shui.headfirstdesignpatterns.chapter12.first.factory;

import com.shui.headfirstdesignpatterns.chapter12.first.Quackable;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 17:39.
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}

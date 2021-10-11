package com.shui.headfirstdesignpatterns.chapter12.first.factory;

import com.shui.headfirstdesignpatterns.chapter12.first.*;
import com.shui.headfirstdesignpatterns.chapter12.first.decorator.QuackCounter;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 17:41.
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}

package com.shui.headfirstdesignpatterns.chapter12.first.factory;

import com.shui.headfirstdesignpatterns.chapter12.first.*;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 17:40.
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}

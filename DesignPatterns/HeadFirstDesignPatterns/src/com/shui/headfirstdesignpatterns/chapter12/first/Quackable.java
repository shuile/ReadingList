package com.shui.headfirstdesignpatterns.chapter12.first;

import com.shui.headfirstdesignpatterns.chapter12.first.observer.QuackObservable;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 17:22.
 */
public interface Quackable extends QuackObservable {
    public void quack();
}

package com.shui.headfirstdesignpatterns.chapter5;

/**
 * @author shui.
 * @date 2021/7/16.
 * @time 00:47.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler mInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = true;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if (mInstance == null) {
            mInstance = new ChocolateBoiler();
        }
        return mInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // 在锅炉内填满巧克力和牛奶的混合物
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // 排除煮沸的巧克力和牛奶
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // 将锅炉煮沸
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

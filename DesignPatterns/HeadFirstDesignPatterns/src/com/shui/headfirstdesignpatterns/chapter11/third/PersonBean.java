package com.shui.headfirstdesignpatterns.chapter11.third;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 16:16.
 */
public interface PersonBean {
    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);
}

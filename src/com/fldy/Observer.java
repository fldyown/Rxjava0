package com.fldy;

/**
 * 观察者
 *
 * @param <E>
 */
public interface Observer<E> {
    /**
     * 事件响应
     *
     * @param e
     */
    void onEvent(E e);
}

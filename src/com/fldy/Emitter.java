package com.fldy;

/**
 * 事件发射器
 *
 * @param <E>
 */
public interface Emitter<E> {
    /**
     * 事件传递
     *
     * @param e
     */
    void onNext(E e);
}

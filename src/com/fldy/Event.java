package com.fldy;

/**
 * 事件
 *
 * @param <E>
 */
public interface Event<E> {
    /**
     * 事件源
     *
     * @param e
     */
    void source(Emitter<E> e);
}

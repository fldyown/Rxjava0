package com.fldy;

/**
 * 事件
 *
 * @param <E>
 */
public abstract class Event<E> {

    public E e;

    final void event(E e) {
        this.e = e;
    }

    abstract void source();
}

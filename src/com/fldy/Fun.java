package com.fldy;

/**
 * 事件处理
 *
 * @param <E>
 * @param <R>
 */
public interface Fun<E, R> {
    /**
     * 处理逻辑
     *
     * @param e
     * @return
     */
    R apply(E e);
}

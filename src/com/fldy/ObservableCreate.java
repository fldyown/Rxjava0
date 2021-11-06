package com.fldy;

/**
 * 被观察者实现
 *
 * @param <E>
 */
public class ObservableCreate<E> extends Observable {
    /**
     * 事件
     */
    Event<E> e;

    /**
     * 创建被观察者
     *
     * @param e
     */
    ObservableCreate(Event e) {
        this.e = e;
    }

    /**
     * 实现事件订阅
     *
     * @param o
     */
    @Override
    protected void subscriptActual(Observer o) {
        e.source(e -> o.onEvent(e));
    }
}

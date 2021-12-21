package com.fldy;

/**
 * 关联观察着和被观察者
 *
 * @param <E>
 * @param <R>
 */
public class Map<E, R> extends Observable<T> {
    /**
     * 事件处理
     */
    Fun<E, R> function;
    /**
     * 被观察者
     */
    Observable<E> observable;

    /**
     * 创建事件处理
     *
     * @param o
     * @param f
     */
    Map(Observable<E> o, Fun f) {
        this.observable = o;
        this.function = f;
    }

    /**
     * 实现事件处理和订阅
     *
     * @param o
     */
    @Override
    protected void subscriptActual(Observer o) {
        observable.subscript((Observer<E>) e -> {
            R r = function.apply(e);
            o.onEvent(r);
        });
    }
}

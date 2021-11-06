package com.fldy;

/**
 * 被观察者
 *
 * @param <E>
 */
public abstract class Observable<E> {

    /**
     * 订阅
     *
     * @param o
     */
    public void subscript(Observer o) {
        subscriptActual(o);
    }

    /**
     * 实际订阅
     *
     * @param o
     */
    protected abstract void subscriptActual(Observer o);

    /**
     * 创建事件
     *
     * @param e
     * @return
     */
    public static Observable create(Event e) {
        return new ObservableCreate(e);
    }

    /**
     * 事件转换
     *
     * @param f
     * @param <R>
     * @return
     */
    public <R> Observable map(Function<E, R> f) {
        return new Map(this, f);
    }
}

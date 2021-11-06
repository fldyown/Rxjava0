package com.fldy;

public class T {
    public static void main(String[] args) {

        Observable.create(new Event<String>() {
            @Override
            public void source(Emitter<String> e) {
                e.onNext("发射事件");
            }
        }).map(new Function<String, String>() {
            @Override
            public String apply(String o) {
                return o + ":第一次处理";
            }
        }).map(new Function<String, String>() {
            @Override
            public String apply(String o) {
                return o + ":第二次处理";
            }
        }).map(new Function<String, String>() {
            @Override
            public String apply(String o) {
                return o + ":第三次处理";
            }
        }).subscript(new Observer<String>() {
            @Override
            public void onEvent(String s) {
                System.out.println(s);
            }
        });


    }
}

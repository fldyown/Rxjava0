package com.fldy;

public class T {
    public static void main(String[] args) {

        Observable.create(new Event<String>() {
            @Override
            void source() {
                //事件源
                event("发送数据");
            }
        })
                .map((Fun<String, String>) e -> e + ":第一次处理")
                .map((Fun<String, String>) e -> e + ":第二次处理")
                .map((Fun<String, String>) e -> e + ":第三次处理")
                .subscript((Observer<String>) s -> System.out.println(s));
    }
}

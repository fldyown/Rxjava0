##
	极简响应式编程
	
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
        
## Rxjava 基本逻辑
	1、观察者模式
	2、被观察者持有观察者的引用
	3、上游事件持有下游事件的引用
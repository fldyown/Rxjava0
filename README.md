##
	极简响应式编程
	
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
                    
    //输出结果：发送数据:第一次处理:第二次处理:第三次处理
        
## Rxjava 基本逻辑
	1、观察者模式
	2、被观察者持有观察者的引用
	3、上游事件持有下游事件的引用
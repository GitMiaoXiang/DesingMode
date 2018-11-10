package ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynarmicProxy implements InvocationHandler {

    //被代理者
    Class aClass = null;

    //被代理的实例
    Object obj = null;

    //我要代理谁


    public DynarmicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(this.obj, args);
        return invoke;
    }
}

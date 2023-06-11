package com.dock.utils;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {

    /**
     * 通过反射获取HttpServletRequest对象
     * @return HttpServletRequest对象
     */
    public static HttpServletRequest getHttpServletRequest() {
        try {
            // 获取当前线程的类加载器
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            // 加载HttpServletRequest类
            Class<?> requestClass = classLoader.loadClass("javax.servlet.http.HttpServletRequest");
            // 获取RequestContextHolder类的静态变量requestAttributes
            Field requestAttributesField = Class.forName("org.springframework.web.context.request.RequestContextHolder")
                .getDeclaredField("requestAttributes");
            requestAttributesField.setAccessible(true);
            // 获取当前请求的RequestAttributes对象
            Object requestAttributes = requestAttributesField.get(null);
            // 获取RequestContextHolder类的静态方法getRequestAttributes()
            Class<?> requestContextHolderClass = classLoader.loadClass("org.springframework.web.context.request.RequestContextHolder");
            Object requestAttributesObj = requestContextHolderClass.getMethod("getRequestAttributes").invoke(null);
            // 获取RequestContextHolder类的静态方法getRequestAttributes().getRequest()
            Method getRequestMethod = requestAttributesObj.getClass().getMethod("getRequest");
            // 调用getRequest()方法获取HttpServletRequest对象
            return (HttpServletRequest) getRequestMethod.invoke(requestAttributesObj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


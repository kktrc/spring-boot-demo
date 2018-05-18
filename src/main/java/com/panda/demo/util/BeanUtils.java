package com.panda.demo.util;

import java.lang.reflect.InvocationTargetException;
import javax.validation.constraints.NotNull;

public class BeanUtils {

    /**
     *
     * 复制属性
     * @param src 源对象
     * @param dest 复制对象
     */
    public static void copyProperties(@NotNull Object src, @NotNull Object dest) {

        try {
            org.apache.commons.beanutils.BeanUtils.copyProperties(dest, src);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

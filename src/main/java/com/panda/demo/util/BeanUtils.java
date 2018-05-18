package com.panda.demo.util;

import java.lang.reflect.InvocationTargetException;
import javax.validation.constraints.NotNull;

public class BeanUtils {


    public void copyProperties(@NotNull Object src, @NotNull Object source) {

        try {
            org.apache.commons.beanutils.BeanUtils.copyProperties(src, source);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

package com.panda.demo.cache;

public interface Cache {




    boolean put(String key, Object value);




    Object getByKey(String key);



    boolean refresh();
}

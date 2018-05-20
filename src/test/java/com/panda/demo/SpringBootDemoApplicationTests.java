package com.panda.demo;

import com.panda.demo.dataobject.MenuDO;
import com.panda.demo.mapper.MenuMapper;
import javax.annotation.Resource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {


    @Resource
    private MenuMapper menuMapper;


    @Test
    public void contextLoads() {
    }



    @Test
    public void testSaveMenuDO() {

        MenuDO menuDO = new MenuDO();
        menuDO.setTitle("订单");
        menuDO.setIcon("rocket");
        menuDO.setLink("/app/animation");
        menuDO.setRemark("菜单");
        menuDO.setCreator("系统");
        menuDO.setModifier("系统");

        int update = menuMapper.saveMenuDO(menuDO);

        Assert.assertTrue(update == 1);
    }
}

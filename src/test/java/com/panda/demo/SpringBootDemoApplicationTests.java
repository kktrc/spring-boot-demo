package com.panda.demo;

import com.panda.demo.dataobject.EmployeeDO;
import com.panda.demo.dataobject.MenuDO;
import com.panda.demo.mapper.EmployeeMapper;
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


    @Resource
    private EmployeeMapper employeeMapper;



    @Test
    public void contextLoads() {
    }



    @Test
    public void testSaveMenuDO() {

        //MenuDO menuDO = new MenuDO();
        //menuDO.setTitle("订单");
        //menuDO.setIcon("rocket");
        //menuDO.setLink("/app/animation");
        //menuDO.setRemark("菜单");
        //menuDO.setCreator("系统");
        //menuDO.setModifier("系统");
        //
        //int update = menuMapper.saveMenuDO(menuDO);
        //
        //Assert.assertTrue(update == 1);
    }


    @Test
    public void testSaveEmployee() {

        //EmployeeDO emp = new EmployeeDO();
        //emp.setToken("" + System.currentTimeMillis());
        //emp.setUserName("18204314866");
        //emp.setPassword("19930205");
        //emp.setMobile("18204314866");
        //emp.setNickName("小磊");
        //emp.setName("磊");
        //emp.setCreator("系统");
        //emp.setModifier("系统");
        //
        //int update = employeeMapper.saveEmployee(emp);
        //
        //Assert.assertTrue(update == 1);
    }


    @Test
    public void testQueryEmployee() {


    }

}

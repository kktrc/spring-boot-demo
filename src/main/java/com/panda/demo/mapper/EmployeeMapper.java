package com.panda.demo.mapper;

import com.panda.demo.dataobject.EmployeeDO;
import com.panda.demo.queryobject.EmployeeQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {



    int saveEmployee(EmployeeDO record);




    List<EmployeeDO> queryEmployee(EmployeeQuery query);




    int deleteById(@Param("id") long id);





    int updateEmployee(EmployeeDO record);
}

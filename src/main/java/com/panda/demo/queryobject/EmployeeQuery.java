package com.panda.demo.queryobject;

import com.panda.demo.dataobject.EmployeeDO;
import java.util.List;
import lombok.Data;

@Data
public class EmployeeQuery extends EmployeeDO {

    private List<String> sorted;
}

package com.vkrajput.db;

import com.vkrajput.db.model.EmployeeDO;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.LinkedList;
import java.util.List;

public class Generator {

    public static EmployeeDO generateEmployee(){
        EmployeeDO employeeDO=new EmployeeDO();
        employeeDO.setAge(RandomUtils.nextInt(18,60));
        employeeDO.setFirstName(RandomStringUtils.randomAlphabetic(10,15).toUpperCase());
        employeeDO.setLastName(RandomStringUtils.randomAlphabetic(10,15).toUpperCase());
        return  employeeDO;
    }


    public static List<EmployeeDO>  generateEmployees(int noofEmployees){

        List<EmployeeDO> employeeDOList=new LinkedList<>();
        for(int i=0;i<noofEmployees;i++){
            EmployeeDO employeeDO=new EmployeeDO();
            employeeDO.setAge(RandomUtils.nextInt(18,60));
            employeeDO.setFirstName(RandomStringUtils.randomAlphabetic(10,15).toUpperCase());
            employeeDO.setLastName(RandomStringUtils.randomAlphabetic(10,15).toUpperCase());
            employeeDOList.add(employeeDO);
        }

        return  employeeDOList;

    }


}

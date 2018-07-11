package com.devil.test;

import com.google.common.collect.ImmutableList;

import java.math.BigDecimal;
import java.util.ArrayList;

public class DevilTest {
    public static void main(String[] args) {
        Staff staffa = new StaffA();
        Staff staffb = new StaffB();
        staffa.setSalary(new BigDecimal(100));
        IntermediaryImpl intermediary = new IntermediaryImpl(staffa, staffb);
        staffa.setStaffSalary(staffa.getSalary(),intermediary);//设置
        System.out.println(staffa.getSalary()+""+staffb.getSalary());//100,100
        staffb.setStaffSalary(staffb.getSalary().add(new BigDecimal(100)),intermediary);
        System.out.println(staffa.getSalary()+""+staffb.getSalary());//200,100
    }
}

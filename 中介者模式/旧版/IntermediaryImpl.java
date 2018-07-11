package com.devil.test;

import java.math.BigDecimal;
//中介者的实现类
public class IntermediaryImpl implements  Intermediary{
    private Staff staffA;
    private Staff staffB;

    public IntermediaryImpl(Staff staffA, Staff staffB) {
        this.staffA = staffA;
        this.staffB = staffB;
    }

    @Override
    public void aToB(BigDecimal salary) {
        staffB.setSalary(salary);
    }

    @Override
    public void bToA(BigDecimal salary) {
        staffA.setSalary(salary);
    }
}

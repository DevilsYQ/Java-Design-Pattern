package com.devil.test;

import java.math.BigDecimal;

public class StaffB extends Staff {
    @Override
    public void setStaffSalary(BigDecimal salary, Intermediary intermediary) {
        intermediary.bToA(salary);
    }
}

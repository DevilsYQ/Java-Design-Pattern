package com.devil.test;

import java.math.BigDecimal;

public class StaffA extends Staff {
    @Override
    public void setStaffSalary(BigDecimal salary, Intermediary intermediary) {
        intermediary.aToB(salary);
    }
}

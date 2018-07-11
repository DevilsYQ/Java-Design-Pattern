package com.devil.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Staff {
    private BigDecimal salary;
    public abstract void setStaffSalary(BigDecimal salary ,Intermediary intermediary);
}

package com.devil.test;

import java.math.BigDecimal;
//中介者抽象
public interface Intermediary {
    void aToB(BigDecimal salary);
    void bToA(BigDecimal salary);
}

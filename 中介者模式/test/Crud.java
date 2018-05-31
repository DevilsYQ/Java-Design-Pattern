package com.devil.test;

import com.fullshare.eb.order.domain.OrderRefund;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Crud extends CrudRepository<OrderRefund,Long>,JpaSpecificationExecutor {
    List<OrderRefund> findByRetryNumIsLessThan(Integer num);

}

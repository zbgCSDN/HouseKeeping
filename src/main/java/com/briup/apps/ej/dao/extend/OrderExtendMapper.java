package com.briup.apps.ej.dao.extend;

import com.briup.apps.ej.bean.extend.OrderExtend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author gujunqi
 * @create 2019-06-11-8:37
 */
public interface OrderExtendMapper {
    List<OrderExtend> findAllComment(Long id);

    List<OrderExtend> findAllAddress(Long id);

    List<OrderExtend> findAllCustomer(Long id);

    List<OrderExtend> findAllWaiter(Long id);

    List<OrderExtend> query(
            @Param("customerId") Long customerId,
            @Param("waiterId") Long waiterId
    );
}

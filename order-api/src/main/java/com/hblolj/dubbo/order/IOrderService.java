package com.hblolj.dubbo.order;

/**
 * @auther Ori
 * @Date 2019/6/13 21 36
 * @Description
 */
public interface IOrderService {

    OrderVO doOrder(OrderDTO dto);
}

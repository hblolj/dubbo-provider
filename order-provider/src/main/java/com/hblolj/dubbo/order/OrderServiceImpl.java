package com.hblolj.dubbo.order;

/**
 * @auther Ori
 * @Date 2019/6/13 21 42
 * @Description
 */
public class OrderServiceImpl implements IOrderService{

    public OrderVO doOrder(OrderDTO dto) {
        System.out.println("曾经爱过");
        OrderVO vo = new OrderVO();
        vo.setCode("1000");
        vo.setName("处理成功!");
        vo.setData("data");
        return vo;
    }
}

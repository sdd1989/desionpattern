package com.ql.prototype;
/**
 * 订单的接口，声明了可以克隆自身的方法
 */
public interface OrderApi {
    public int getOrderProductNum();
    public void setOrderProductNum(int num);
    /**
     * 克隆方法
     * @return 订单原型的实例
     */
    public OrderApi cloneOrder();
}

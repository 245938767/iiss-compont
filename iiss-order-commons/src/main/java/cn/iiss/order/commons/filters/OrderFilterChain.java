package cn.iiss.order.commons.filters;


import cn.iiss.order.commons.model.OrderContext;

public interface OrderFilterChain<T extends OrderContext> {


    /**
     * 订单上送支付处理流程
     *
     * @param context
     */
    void handle(T context);

    /**
     * 开启下一个鉴权
     *
     * @param ctx
     */
    void fireNext(T ctx);

}

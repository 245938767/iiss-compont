package cn.iiss.order.commons.filters;


import cn.iiss.order.commons.model.OrderContext;

public interface OrderFilter<T extends OrderContext> {

    /**
     * 过滤逻辑封装点
     *
     * @param context
     * @param chain
     */
    void doFilter(T context, OrderFilterChain chain);


}

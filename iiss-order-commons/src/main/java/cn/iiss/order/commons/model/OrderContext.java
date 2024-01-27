package cn.iiss.order.commons.model;

import cn.iiss.order.commons.constants.BizEnum;
import cn.iiss.order.commons.filters.selector.FilterSelector;

public interface OrderContext{

  /**
   * 获取业务编码
   * @return
   */
  BizEnum getBizCode();

  /**
   * 获取过滤器选择器
   * @return
   */
  FilterSelector getFilterSelector();

  /**
   * 是否继续链
   * @return
   */
  boolean continueChain();



}

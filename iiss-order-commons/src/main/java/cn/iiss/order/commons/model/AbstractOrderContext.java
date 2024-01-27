package cn.iiss.order.commons.model;


import cn.iiss.order.commons.constants.BizEnum;
import cn.iiss.order.commons.filters.selector.FilterSelector;

public abstract class AbstractOrderContext implements OrderContext{

  private final BizEnum bizEnum;
  private final FilterSelector selector;

  public AbstractOrderContext(BizEnum bizEnum, FilterSelector selector) {
    this.bizEnum = bizEnum;
    this.selector = selector;
  }

  @Override
  public BizEnum getBizCode() {
    return bizEnum;
  }

  @Override
  public FilterSelector getFilterSelector() {
    return selector;
  }
}

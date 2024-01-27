package cn.iiss.order.commons.filters.selector;


import cn.iiss.order.commons.constants.BizEnum;

public interface BizAware {

    /**
     * 获取当前业务编码
     *
     * @return
     */
    BizEnum getBizCode();
}

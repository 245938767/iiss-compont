package cn.iiss.order.commons.test.fee.calculator;

import cn.iiss.order.commons.pay.AbstractPayItem;
import cn.iiss.order.commons.pay.PayGroup;
import cn.iiss.order.commons.pay.PayType;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

/**
 * @author gim 2021/12/6 8:42 下午
 */
@Setter
@Getter
public class CouponPayItem extends AbstractPayItem {

    public CouponPayItem(BigDecimal money) {
        super(money, PayType.COIN, PayGroup.COUPON);
    }

    private String couponCode;

    private String source;
}

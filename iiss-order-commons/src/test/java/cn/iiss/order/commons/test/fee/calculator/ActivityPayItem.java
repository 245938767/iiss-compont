package cn.iiss.order.commons.test.fee.calculator;

import cn.iiss.order.commons.pay.AbstractPayItem;
import cn.iiss.order.commons.pay.PayGroup;
import cn.iiss.order.commons.pay.PayType;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

/**
 * @author gim 2021/12/6 8:47 下午
 */
@Setter
@Getter
public class ActivityPayItem extends AbstractPayItem {

    public ActivityPayItem(BigDecimal money) {
        super(money, PayType.ACTIVITY, PayGroup.COUPON);
    }

    private String activityName;
}

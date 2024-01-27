package cn.iiss.order.commons.pay;

import cn.iiss.commons.annotation.FieldDesc;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CoinPayItem extends AbstractPayItem {

    public CoinPayItem(BigDecimal money) {
        super(money, PayType.COIN, PayGroup.VIRTUAL_PROPERTY);
    }

    @FieldDesc(name = "来源")
    private String source;


}

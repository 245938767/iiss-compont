package cn.iiss.order.commons.fee;

import cn.iiss.order.commons.pay.PayItem;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
public interface FeeCalculate<O> {

  /**
   * 根据费用项计算每个费用项明细
   * @param list
   * @return
   */
  Map<FeeItemType, List<PayItem>> payItemList(List<FeeItem<O>> list);

  /**
   * waitPay
   * @param list
   * @return
   */
  Map<FeeItemType, BigDecimal> calculateWaitPay(List<FeeItem<O>> list);

  /**
   * 获取计算器的唯一编码
   * @return
   */
  Unique getUnique();

}

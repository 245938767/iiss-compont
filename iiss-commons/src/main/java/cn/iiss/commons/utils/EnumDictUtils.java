package cn.iiss.commons.utils;


import cn.iiss.commons.constants.BaseEnum;
import cn.iiss.commons.model.EnumVo;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class EnumDictUtils {

  private EnumDictUtils() {
  }

  public static <T extends Enum<T> & BaseEnum<T>> List<EnumVo> getEnumDictVo(Class<T> cls) {
    return EnumSet.allOf(cls).stream().map(et -> {
          EnumVo vo = new EnumVo();
          vo.setCode(et.getCode());
          vo.setName(et.getName());
          vo.setText(et.name());
          return vo;
        }
    ).collect(
        Collectors.toList());
  }
}

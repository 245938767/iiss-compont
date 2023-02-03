package cn.iiss.commonss.mapper;


import cn.iiss.commonss.constants.ValidStatus;

public class GenericEnumMapper {

  public Integer asInteger(ValidStatus status) {
    return status.getCode();
  }

  public ValidStatus asValidStatus(Integer code) {
    return ValidStatus.of(code).orElse(ValidStatus.INVALID);
  }
}
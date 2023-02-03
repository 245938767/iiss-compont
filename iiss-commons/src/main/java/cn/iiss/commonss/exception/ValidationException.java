package cn.iiss.commonss.exception;

import cn.iiss.commonss.model.ValidateResult;
import lombok.Getter;

import java.util.List;

/**
 * 校验异常
 *  xiao
 */
public class ValidationException extends RuntimeException {
  @Getter
  private List<ValidateResult> result;
  public ValidationException(List<ValidateResult> list){
    super();
    this.result = list;
  }
}

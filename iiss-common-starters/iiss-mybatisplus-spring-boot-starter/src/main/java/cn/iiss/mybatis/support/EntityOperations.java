package cn.iiss.mybatis.support;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author xiao
 */
@SuppressWarnings("unchecked")
public abstract class EntityOperations {

  public static <T> EntityUpdater<T> doUpdate(BaseMapper<T> baseMapper) {
    return new EntityUpdater<>(baseMapper);
  }

  public static <T> EntityCreator<T> doCreate(BaseMapper<T> baseMapper) {
    return new EntityCreator(baseMapper);
  }


}

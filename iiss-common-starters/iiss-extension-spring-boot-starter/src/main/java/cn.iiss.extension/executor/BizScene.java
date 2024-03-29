package cn.iiss.extension.executor;

/**
 * @author gim
 */
public interface BizScene {

  /**
   * 唯一的bizId ，这里为了更好的约定，bizId 的实现类最好使用枚举 例如
   *
   * @return
   * @refer BizEnum
   */
  String getBizId();


  class DefaultBizScene implements BizScene {

    public void setBizId(String bizId) {
      this.bizId = bizId;
    }

    private String bizId;

    public static DefaultBizScene of(String bizId) {
      DefaultBizScene defaultBizScene = new DefaultBizScene();
      defaultBizScene.setBizId(bizId);
      return defaultBizScene;
    }

    @Override
    public String getBizId() {
      return this.bizId;
    }
  }
}

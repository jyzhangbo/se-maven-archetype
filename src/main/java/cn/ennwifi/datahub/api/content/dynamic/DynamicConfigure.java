package cn.ennwifi.datahub.api.content.dynamic;

/**
 * @author zhangbo
 *
 */
public class DynamicConfigure {

  /** The instance. */
  private static DynamicConfigure INSTANCE;

  private Leader leader;

  private DynamicConfigure() {
    leader = new Leader();
  }

  public static final synchronized DynamicConfigure get() {
    if (INSTANCE == null) {
      INSTANCE = new DynamicConfigure();
    }
    return INSTANCE;
  }

  private Long startTime = 0l;

  /**
   * @return the startTime
   */
  public Long getStartTime() {
    return startTime;
  }

  /**
   * @param startTime the startTime to set
   */
  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  /**
   * @return the leader
   */
  public Leader getLeader() {
    return leader;
  }

}

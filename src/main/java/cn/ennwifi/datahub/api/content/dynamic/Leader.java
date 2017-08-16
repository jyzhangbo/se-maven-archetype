package cn.ennwifi.datahub.api.content.dynamic;

import java.util.concurrent.CountDownLatch;


/**
 * @author zhangbo
 *
 */
public class Leader {

  /** The leader latch. */
  private CountDownLatch leaderLatch;

  private boolean isLeader = false;

  public void onLeader() {
    isLeader = true;
    try {
      leaderLatch = new CountDownLatch(1);
      leaderLatch.await();
    } catch (InterruptedException e) {
      leaderLatch.countDown();
      e.printStackTrace();
    }
  }

  public void onQuit() {
    leaderLatch.countDown();
    isLeader = false;
  }

  public boolean getIsLeader() {
    return isLeader;
  }

}

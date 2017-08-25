package cn.ennwifi.datahub.api.tools;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

/**
 * @author zhangbo
 *
 */
@Component
public class MyEndpoint implements Endpoint<List<String>> {

  @Override
  public String getId() {
    return "server";
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public boolean isSensitive() {
    return false;
  }

  @Override
  public List<String> invoke() {
    List<String> serverDetails = new ArrayList<>();
    try {
      serverDetails.add("Server IP Address :" + InetAddress.getLocalHost().getHostAddress());
      serverDetails.add("Server OS:" + System.getProperty("os.name").toLowerCase());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

}

package cn.ennwifi.datahub.api.data.datasource;


import javax.sql.DataSource;

import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

import cn.ennwifi.datahub.api.configure.DataSourceProperties;

/**
 * 获取数据源.
 * 
 * @author zhangbo
 *
 */
@Configuration
public class DataBaseSource {

  @Autowired
  private DataSourceProperties dataSourceProperties;

  /**
   * 设置数据源.
   * 
   * @return DataSource
   */
  @Bean(name = {"mysqlDataSource"})
  public DataSource dataSource() {

    System.out.println("数据库连接地址：" + dataSourceProperties.getUrl());

    DruidDataSource ds = new DruidDataSource();
    ds.setUrl(dataSourceProperties.getUrl());
    ds.setPassword(dataSourceProperties.getPassword());
    ds.setUsername(dataSourceProperties.getUser());
    ds.setDriverClassName(dataSourceProperties.getDriver());
    ds.setMaxActive(30);
    ds.setMaxWait(5 * 1000);
    ds.setTestOnBorrow(true);
    ds.setTestWhileIdle(true);
    ds.setTestOnReturn(true);
    return ds;

  }

  /**
   * 获取数据库操作对象.
   * 
   * @param dataSource 数据源
   * @return Dao
   */
  @Bean
  public Dao dao(DataSource dataSource) {

    NutDao dao = new NutDao(dataSource);
    return dao;
  }

}

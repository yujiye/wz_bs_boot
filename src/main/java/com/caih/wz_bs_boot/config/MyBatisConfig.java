package com.caih.wz_bs_boot.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * Created by weijianfu on 2018/6/9.
 */
@Configuration
//加上这个注解，使得支持事务
@EnableTransactionManagement
public class MyBatisConfig implements TransactionManagementConfigurer {
    @Autowired
    private DataSource dynamicDataSource;

    private Log log = LogFactory.getLog(this.getClass());

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        log.debug(dynamicDataSource.getClass().getName());
        log.debug(dynamicDataSource.toString());
        return new DataSourceTransactionManager(dynamicDataSource);
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() {
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            //自动扫描entity目录, 省掉Configuration.xml里的手工配置
            bean.setTypeAliasesPackage("com.caih.wz_bs_boot.po");
            //添加XML目录
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            Resource[] resources = resolver.getResources("classpath*:com/caih/wz_bs_boot/**/*.xml");
            bean.setMapperLocations(resources);

            bean.setDataSource(dynamicDataSource);

            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}

//package web.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//
//@Configuration
//@PropertySource("classpath:db.properties")
//@EnableTransactionManagement
//@ComponentScan(value = "web")
//public class AppConfig {
//
//    @Autowired
//    private Environment env;
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(env.getProperty("db.driver"));
//        dataSource.setUrl(env.getProperty("db.url"));
//        dataSource.setUsername(env.getProperty("db.username"));
//        dataSource.setPassword(env.getProperty("db.password"));
//        return dataSource;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(){
//        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//
//        Properties props=new Properties();
//        props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
//        props.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
//
//        em.setDataSource(dataSource());
//        em.setJpaProperties(props);
//        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
////        em.setAnnotatedClasses(User.class);
//        em.setPackagesToScan("web");
//
//        return em;
//    }
////    @Bean
////    public LocalSessionFactoryBean getSessionFactory() {
////        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
////        factoryBean.setDataSource(dataSource());
////
////        Properties props=new Properties();
////        props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
////        props.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
////
////        factoryBean.setHibernateProperties(props);
////        factoryBean.setAnnotatedClasses(User.class);
////        return factoryBean;
////    }
//
////    @Bean
////    public HibernateTransactionManager getTransactionManager() {
////        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
////        transactionManager.setSessionFactory(entityManagerFactoryBean().getObject());
////        return transactionManager;
////    }
//}

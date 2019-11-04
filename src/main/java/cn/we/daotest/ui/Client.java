package cn.we.daotest.ui;


import cn.we.daotest.dao.IAccountDao;
import cn.we.daotest.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gradyzhou
 * @version 1.0, on 21:55 2019/9/19.
 */
/*
模拟表现层，调用业务层


 */
public class Client {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        IAccountService as = ac.getBean("accountServiceImpl", IAccountService.class);
        System.out.println(as);

        IAccountDao accountDao = ac.getBean("accountDao",IAccountDao.class);
        accountDao.saveAccount();
    }
}

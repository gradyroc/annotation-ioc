package cn.we.daotest.service.impl;


import cn.we.daotest.dao.IAccountDao;
import cn.we.daotest.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author gradyzhou
 * @version 1.0, on 21:34 2019/9/19.
 */
/*
账户的业务层实现类

曾经的xml配置
 <bean id="accountService" class="cn.we.daotest.service.impl.AccountServiceImpl"
    scope="" init-method="" destroy-method="">
        <property name="" value="" ref=""></property>


    </bean>

用于创建对象的
    相当于xml中<bean>相同
    @Component:
        将对象存入spring容器
        属性：
            value：用于指定bean的ID，当我们不写时，默认值为当前类名，切首字母小写

    @Controller： 表现层

    @Service：业务层
    @Repository：持久层

    以上3个注解作用和属性与Component一模一样，
    是spring框架提供的明确的3层使用的注解，使三层对象更加清晰

用于注入数据的
   bean标签中 <property>标签作用一样
    @Autowired
        自动按照类型注入，只要容器中有位移的bean对象类型和要注入的变量类型匹配，就可以注入成功
                        如果ioc容器中没有任何ban类型和要注入的变量类型匹配，则报错
                        如果IOC容器中有多个类型可以匹配，则先根据类型，再根据变量名名称和bean的ID匹配

        出现位置：
            变量、方法上
         细节：使用注解注入时，set方法就不是必须的了

用于改变作用范围的
    bean标签中 scope属性相同
和生命周期相关的
    和bean标签中 init-method 和 destory-mehod 作用一样
 */


//@Component
@Component("accountServiceImpl")
//@Service
//@Service(value = "accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao = null;


    public void saveAccount() {
        //业务层调持久层

        accountDao.saveAccount();

    }
}

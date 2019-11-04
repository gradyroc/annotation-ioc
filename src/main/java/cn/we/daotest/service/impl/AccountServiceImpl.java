package cn.we.daotest.service.impl;


import cn.we.daotest.service.IAccountService;
import org.springframework.stereotype.Component;

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

用于改变作用范围的
    bean标签中 scope属性相同
和生命周期相关的
    和bean标签中 init-method 和 destory-mehod 作用一样
 */

@Component
//@Component(value = "accountService")
public class AccountServiceImpl implements IAccountService {



    public AccountServiceImpl() {
    }


    public void saveAccount() {
        //业务层调持久层

        System.out.println("method in service executed name: ");

    }
}

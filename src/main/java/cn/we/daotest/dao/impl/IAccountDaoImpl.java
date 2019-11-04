package cn.we.daotest.dao.impl;

import cn.we.daotest.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * @author gradyzhou
 * @version 1.0, on 22:35 2019/11/4.
 */

@Repository("accountDao")
public class IAccountDaoImpl implements IAccountDao {

    public void saveAccount() {

        System.out.println("saveAccount");
    }
}

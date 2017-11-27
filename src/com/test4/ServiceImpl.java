package com.test4;

import com.test4.AccountService;
import com.test4.DaoImpl;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Transactional
 * propagation :  事务的传播行为
 * isolation : 事务的隔离级别
 */

@Transactional(propagation = Propagation.REQUIRED)
public class ServiceImpl implements AccountService {
    private DaoImpl dao;

    public void setDao(DaoImpl dao) {
        this.dao = dao;
    }




    @Override
    public void transfer(String in, String out, Double money) {

                dao.outMoney(out, money);
                //int i = 1 / 0;
                dao.inMoney(in, money);

    }
}

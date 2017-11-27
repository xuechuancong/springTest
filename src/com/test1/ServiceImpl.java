package com.test1;

import com.test1.AccountService;
import com.test1.DaoImpl;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

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

package com.test;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class ServiceImpl implements AccountService {
    private DaoImpl dao;

    public void setDao(DaoImpl dao) {
        this.dao = dao;
    }


    //注入事务管理模版

    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public void transfer(String in, String out, Double money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                dao.outMoney(out, money);
                //int i = 1 / 0;
                dao.inMoney(in, money);
            }
        });
    }
}

package com.test1;

import com.test1.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class DaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void outMoney(String out, Double money) {

        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql, money, out);


    }

    @Override
    public void inMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql, money, in);
    }
}

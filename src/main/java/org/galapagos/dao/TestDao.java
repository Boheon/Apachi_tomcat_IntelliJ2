package org.galapagos.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class TestDao {

    DataSource ds;

    public TestDao() {

        try {
            Context ctx;
            ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
        } catch(NamingException e){
            e.printStackTrace();
        }
    }
}

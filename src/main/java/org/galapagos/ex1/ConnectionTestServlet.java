package org.galapagos.ex1;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/test")
public class ConnectionTestServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Resource(name = "jdbc/mysql")
    DataSource dataFactory;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(Connection con = dataFactory.getConnection()){
            System.out.println("연결 획득 성공");
            //dao.getPAge(con, ...);
        }catch(Exception e){
            e.printStackTrace();
        };
    }
}

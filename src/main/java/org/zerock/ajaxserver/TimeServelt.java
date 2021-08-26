package org.zerock.ajaxserver;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TimeServelt", value = "/time")
public class TimeServelt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // {"time" : "2021-08-26"}
        response.setContentType("application/json; charset=UTF-8"); //서버에서 보내는 데이터는 json이라고 알려주는 것

        String str = "{\"time\" : \"2021-08-26\"}";

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //데이터 밀어주기
        response.getWriter().write(str); //보낼 때는 out으로

    }

}

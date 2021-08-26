package org.zerock.ajaxserver;

import com.google.gson.Gson;
import org.zerock.ajaxserver.dto.StoreDTO;
import org.zerock.ajaxserver.service.StoreService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AllStoreServlet", value = "/stores/all")
public class AllStoreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<StoreDTO> storeDTOList = StoreService.INSTANCE.getAll();

        Gson gson = new Gson();

        String jsonStr = gson.toJson(storeDTOList);

        System.out.println(jsonStr);

        //json 사용해서 서버에 보내줌
        response.setContentType("application/json; charset=UTF-8");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        response.getWriter().write(jsonStr);
    }

}

package cn.rain.ssm.demo1.controller;

import org.springframework.web.HttpRequestHandler;

import cn.rain.ssm.demo1.model.Items;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 左边 on 2017/5/31.
 * 这个Handler我们实现的是HttpRequestHandler接口，
 * 它可以被HttpRequestHandlerAdapter适配器执行。
 */
public class ItemsController_2 implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Items items1=new Items();
        items1.setName("联想笔记本");
        items1.setPrice(6000f);
        items1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items2 = new Items();
        items2.setName("苹果手机");
        items2.setPrice(5000f);
        items2.setDetail("iphone6苹果手机！");

        List<Items> itemsList=new ArrayList<Items>();
        itemsList.add(items1);
        itemsList.add(items2);

        //填充Model中的数据
        request.setAttribute("itemsList",itemsList);
        //请求转发到视图
        request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request,response);
    }
}

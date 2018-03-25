package cn.rain.ssm.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.rain.ssm.demo1.model.Items;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 左边 on 2017/5/31.
 */
@Controller // 标识这个类是一个Controller
public class ItemsController_3 {
	// 映射器拿到用户请求的url通过@RequestMapping(value="/queryItems")来寻找相应的Handler中的方法
    @RequestMapping(value = "/queryItems.action") 
    public ModelAndView queryItems(){
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

        ModelAndView modelAndView=new ModelAndView();

        modelAndView.addObject("itemsList",itemsList);

        modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
        return modelAndView;
    }
}

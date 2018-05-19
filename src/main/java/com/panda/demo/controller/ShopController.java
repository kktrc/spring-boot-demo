package com.panda.demo.controller;

import com.panda.demo.dto.ShopDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {



    @GetMapping(value = "/api/shop/getAll")
    public Object getAll() {

        List<ShopDto> shopList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ShopDto shop = new ShopDto();
            shop.setId(i + 0L);
            shop.setName("店" + i);
            shop.setMobile("18204314866");
            shop.setAddress("浦东新区浦东南路1101号远东大厦1112室");
            shop.setPosition("[31.229023],[121.517227]");
            shopList.add(shop);
        }
        return shopList;
    }



    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    public Object login(
        @RequestParam String userName,
        @RequestParam String password) {


        return "moshenglei".equals(userName) && "19930205".equals(password);
    }
}

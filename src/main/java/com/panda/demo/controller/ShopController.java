package com.panda.demo.controller;

import com.panda.demo.dto.ShopDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
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
            shopList.add(shop);
        }
        return shopList;
    }
}

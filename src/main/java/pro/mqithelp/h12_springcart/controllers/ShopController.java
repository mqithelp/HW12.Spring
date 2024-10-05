package pro.mqithelp.h12_springcart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.mqithelp.h12_springcart.service.ShopCartService;

@RestController
@RequestMapping(path = "/store/order")
public class ShopController {
    private final ShopCartService shopCartService;

    public ShopController(ShopCartService shopCartService) {
        this.shopCartService = shopCartService;
    }

    @GetMapping(path = "/")
    public String home() {
        return "onlineshop";
    }

    @GetMapping(path = "/add")
    public String addID(@RequestParam("id") Integer ... ids) {
        return shopCartService.addID(ids);
    }

    @GetMapping(path = "/get")
    public String getByID() {
        return shopCartService.getID(1);
    }
}

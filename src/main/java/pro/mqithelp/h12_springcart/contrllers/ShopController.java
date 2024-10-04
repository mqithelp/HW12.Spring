package pro.mqithelp.h12_springcart.contrllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/store/order")
public class ShopController {

    @GetMapping(path = "/")
    public String home() {
        return "onlineshop";
    }
    @GetMapping(path = "/add")
    public String addID() {
        return "Обращаемся к методу add из браузера, добавляем первые ID.";
    }

    @GetMapping(path = "/get")
    public String getByID() {
        return "Обращаемся к методу get сначала из браузера, потом из инкогнито. Списки должны быть разными и заполнены тем, что было в шагах 1–3 .";
    }
}

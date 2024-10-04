package pro.mqithelp.h12_springcart.contrllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/store/order/")
public class ShopController {

    @GetMapping(value = "add/")
    public void add() {

    }
@GetMapping(value = "get/")
    public void get(){

}
}

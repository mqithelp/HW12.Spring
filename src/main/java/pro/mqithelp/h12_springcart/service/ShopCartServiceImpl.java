package pro.mqithelp.h12_springcart.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ShopCartServiceImpl implements ShopCartService {

    @Override
    public String addID(Integer... ids) {

        return Arrays.stream(ids).toList().toString();
    }

    @Override
    public String getID(Integer... ids) {
        return "получаем ID";
    }
}

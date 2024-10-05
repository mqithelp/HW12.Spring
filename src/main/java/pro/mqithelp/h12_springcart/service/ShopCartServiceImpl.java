package pro.mqithelp.h12_springcart.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
//@Scope("prototype")
@SessionScope
public class ShopCartServiceImpl implements ShopCartService {
    private List<Integer> idsList = new ArrayList<>();
    @Override
    public String addID(Integer... ids) {
        idsList.addAll(List.of(ids));
        return "Добавлено :-)";
    }

    @Override
    public String getID(Integer... ids) {
        return idsList.toString();
    }
}

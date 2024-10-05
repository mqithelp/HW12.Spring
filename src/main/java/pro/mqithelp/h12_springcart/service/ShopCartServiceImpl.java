package pro.mqithelp.h12_springcart.service;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.mqithelp.h12_springcart.model.ItemRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class ShopCartServiceImpl implements ShopCartService {
    private final List<Integer> idsList;
    private final ItemRepository itemRepository;

    public ShopCartServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
        this.idsList = new ArrayList<>();
    }

    @Override
    public String addID(Integer... ids) {
        idsList.addAll(List.of(ids));
        itemRepository.save(List.of(ids));
        return "Добавлено :-)";
    }

    @Override
    public String getID() {
        List<String> result = new ArrayList<>(List.of());
        for (Integer id : idsList) {
            result.add(itemRepository.findByID(id).getDescriptionID());
        }
        return result.toString();
    }
}

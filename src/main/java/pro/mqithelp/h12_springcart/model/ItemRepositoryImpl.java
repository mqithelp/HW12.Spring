package pro.mqithelp.h12_springcart.model;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    private final Map<Integer, Item> listItems = new HashMap<>();

    @Override
    public void save(List<Integer> ids) {
        for (Integer id : ids) {
            listItems.put(id, new Item(id));
        }
    }

    @Override
    public Item findByID(Integer id) {
        return listItems.get(id);
    }
}

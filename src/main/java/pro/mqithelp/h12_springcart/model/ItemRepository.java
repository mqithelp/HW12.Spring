package pro.mqithelp.h12_springcart.model;

import java.util.List;

public interface ItemRepository {
    void save(List<Integer> ids);

    Item findByID(Integer id);
}

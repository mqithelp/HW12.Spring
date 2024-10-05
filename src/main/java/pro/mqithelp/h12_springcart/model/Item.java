package pro.mqithelp.h12_springcart.model;

public class Item {
    private final String descriptionID;

    public Item(Integer id) {
        this.descriptionID = "ID товара: " + id + "\n";
    }

    public String getDescriptionID() {
        return descriptionID;
    }
}

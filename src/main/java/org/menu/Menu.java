package org.menu;
import java.util.HashMap;
import java.util.Map;

public class Menu {

    private String name;
    private long id;

    private Map<String, Integer> size = new HashMap<>();

    public Map<String, Integer> getSize() {
        return size;
    }

    public long getId() {
        return id;
    }

    private Integer price;

    public Menu(long id, String name, Map<String, Integer> size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {

        return price;
    }
}

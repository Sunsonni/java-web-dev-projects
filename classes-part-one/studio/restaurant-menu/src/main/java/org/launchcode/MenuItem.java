package org.launchcode;

import java.util.Objects;

public class MenuItem {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Category category;
    private Boolean isNew;

    public MenuItem(Integer id, String name, String description, Double price, Category category, Boolean isNew) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(id, menuItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category=" + category.getName() +
                '}';
    }
}

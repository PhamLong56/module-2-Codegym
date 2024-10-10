package com.codegym.entity;

import java.util.ArrayList;
import java.util.List;



public class Menu {
    private String idMenu;
    private List<Item> items;

    public Menu(String idMenu) {
        this.idMenu = idMenu;
        this.items = new ArrayList<>();
    }

    public String getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "idMenu='" + idMenu + '\'' +
                ", items=" + items +
                '}';
    }

    public void addItem(Item item) {
        items.add(item);
    }
    public void removeItem(Item item) {
        items.remove(item);
    }
    public void showMenu(){
        for (Item item : items) {
            System.out.println(item);
        }
    }
}

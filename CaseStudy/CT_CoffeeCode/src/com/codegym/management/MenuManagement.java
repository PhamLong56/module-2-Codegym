package com.codegym.management;

import com.codegym.entity.Item;
import com.codegym.entity.Menu;

import java.util.List;


public class MenuManagement {
    private Menu menuManagement;

    public MenuManagement(Menu menuManagement) {
        this.menuManagement = menuManagement;
    }

    public void addItem(Item item) {
        menuManagement.getItems().add(item);
    }

    public void removeItem(Item item) {
        menuManagement.getItems().remove(item);
    }


    public void displayMenu() {
        for (Item item : menuManagement.getItems()) {
            System.out.println(item);
        }
    }


    public void searchMenu() {

    }
    public void updateMenu() {

    }
    public void removeMenu() {

    }
}

package org.shopping_basket;

public class ShopItem {

    private String name;
    private double price;
    private boolean buyOneGetOneFree;

    public ShopItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.buyOneGetOneFree = false;
    }

    public ShopItem(String name, double price, boolean buyOneGetOneFree) {
        this.name = name;
        this.price = price;
        this.buyOneGetOneFree = buyOneGetOneFree;
    }

    public ShopItem(ShopItem clone) {
        this.name = clone.name;
        this.price = clone.price;
        this.buyOneGetOneFree = clone.buyOneGetOneFree;
    }

    public double getPrice() {
        return price;
    }


    public boolean isBuyOneGetOneFree() {
        return buyOneGetOneFree;
    }

    public void setBuyOneGetOneFreeOn() {
        this.buyOneGetOneFree = true;
    }
}

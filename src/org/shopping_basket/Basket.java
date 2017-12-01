package org.shopping_basket;

import java.util.ArrayList;

public class Basket {

    private ArrayList<ShopItem> itemsInBasket;

    public Basket() {
        this.itemsInBasket = new ArrayList<ShopItem>();
    }

    public ArrayList<ShopItem> getItemsInBasket() {
        return itemsInBasket;
    }

    public void addItemToBasket(ShopItem item) {
        this.itemsInBasket.add(item);
    }

    public void removeItemFromBasket(ShopItem item) {
        this.itemsInBasket.remove(item);
    }

    public void removeAllItemsFromBasket() {
        this.itemsInBasket.removeAll(itemsInBasket);
    }


    public double calculateTotalCost() {
        double total = 0;
        for (ShopItem item : this.itemsInBasket) {
                total += item.getPrice();
        }
        return total;
    }
}

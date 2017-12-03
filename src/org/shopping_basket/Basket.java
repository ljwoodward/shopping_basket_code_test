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

    private double calculateCostOfItems(ArrayList<ShopItem> items) {
        double total = 0;
        for ( ShopItem item : items ) {
            total += item.getPrice();
        }
        return total;
    }

    public double calculateTotalCost() {
        double total = 0;
        for (ShopItem item : this.itemsInBasket) {
                total += item.getPrice();
        }
        return total;
    }

    public int countNumberOfItems(ShopItem itemToCount) {
        int total = 0;
        for ( ShopItem item : this.itemsInBasket ) {
            if ( item == itemToCount ){
                total++;
            }
        }
        return total;
    }

    public boolean areAllEligibleForToofer(ShopItem item) {
        boolean eligible = false;
        if ( countNumberOfItems(item) >= 2 && countNumberOfItems(item) % 2 == 0) {
            eligible = true;
        }
        return eligible;
    }
}

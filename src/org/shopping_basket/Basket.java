package org.shopping_basket;

import java.util.ArrayList;
import java.util.Iterator;

public class Basket {

    private ArrayList<ShopItem> itemsInBasket;
    private boolean loyaltyCard;

    public Basket() {
        this.itemsInBasket = new ArrayList<>();
        this.loyaltyCard = false;
    }

    public Basket(boolean loyaltyCard) {
        this.itemsInBasket = new ArrayList<>();
        this.loyaltyCard = loyaltyCard;
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
        if ( total >= 20) {
            total *= 0.9;
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

//    public boolean twoOrMoreAndEven(ShopItem item) {
//        boolean eligible = false;
//        if ( countNumberOfItems(item) >= 2 && countNumberOfItems(item) % 2 == 0) {
//            eligible = true;
//        }
//        return eligible;
//    }
//
//    public ArrayList<ShopItem> returnEligibleForToofer() {
//        ArrayList<ShopItem> tempArray = new ArrayList<>();
//        ArrayList<ShopItem> tooferArray = new ArrayList<>();
//        for (Iterator<ShopItem> iterator = this.itemsInBasket.iterator(); iterator.hasNext();){
//                ShopItem item = iterator.next();
//                if (item.isBuyOneGetOneFree() && !twoOrMoreAndEven(item)) {
//                    tempArray.add(item);
//                    iterator.remove();
//                } else if (item.isBuyOneGetOneFree() && twoOrMoreAndEven(item)) {
//                    tooferArray.add(item);
//                }
//        }
//        for (ShopItem item : this.itemsInBasket ) {
//            if ( tooferArray.contains(item) ) {
//                this.itemsInBasket.remove(item);
//            }
//        }
//        this.itemsInBasket.addAll(tempArray);
//        return tooferArray;
//    }



}

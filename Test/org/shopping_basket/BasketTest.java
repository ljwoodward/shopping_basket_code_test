package org.shopping_basket;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BasketTest {

    Basket basket;
    ShopItem item1;
    ShopItem item2;

    @Before
    public void before() {
        basket = new Basket();
        item1 = new ShopItem("Wheatabix", 1.99);
        item2 = new ShopItem("Aquafresh Toothpaste", 2.50);
        basket.addItemToBasket(item1);
        basket.addItemToBasket(item2);
    }

    @Test
    public void testAddToBasket() {
        ShopItem item = new ShopItem("Banana", 0.12);
        basket.addItemToBasket(item);
        int actual = basket.getItemsInBasket().size();
        assertEquals(3, actual);
    }

    @Test
    public void testRemoveFromBasket() {
        basket.removeItemFromBasket(item2);
        int actual = basket.getItemsInBasket().size();
        assertEquals(1, actual);
    }

    @Test
    public void testRemoveAllItemsFromBasket() {
        basket.removeAllItemsFromBasket();
        int actual = basket.getItemsInBasket().size();
        assertEquals(0, actual);
    }

    @Test
    public void testCalculateTotalCostOfBasket() {
        double actual = basket.calculateTotalCost();
        assertEquals(4.49, actual, 0);
    }

    @Test
    public void countMultipleItems() {
        basket.addItemToBasket(item1);
        int actual = basket.countNumberOfItems(item1);
        assertEquals(2, actual);
    }

    @Test
    public void tenPercentDiscountMoreThan20Pounds() {
        ShopItem newItem = new ShopItem("Champagne", 25.00);
        basket.addItemToBasket(newItem);
        double actual = basket.calculateTotalCost();
        assertEquals(26.54, actual, 0.0049);
    }

    @Test
    public void loyaltyCardDiscountApplied() {
        basket.setLoyaltyCard(true);
        double actual = basket.calculateTotalCost();
        assertEquals(4.40, actual, 0.0049);
    }

//    @Test
//    public void testAreEligibleForTwoForOneTrue() {
//        ShopItem newItem = new ShopItem("Pop Tarts", 1.50, true);
//        basket.addItemToBasket(newItem);
//        basket.addItemToBasket(newItem);
//        boolean actual = basket.twoOrMoreAndEven(newItem);
//        assertTrue(actual);
//    }
//
//    @Test
//    public void testAreEligibleForTwoForOneFalse() {
//        ShopItem newItem = new ShopItem("Pop Tarts", 1.50, true);
//        basket.addItemToBasket(newItem);
//        basket.addItemToBasket(newItem);
//        basket.addItemToBasket(newItem);
//        boolean actual = basket.twoOrMoreAndEven(newItem);
//        assertFalse(actual);
//    }
//
//    @Test
//    public void testReturnEligibleForToofer2Items() {
//        ShopItem newItem = new ShopItem("Pop Tarts", 1.50, true);
//        basket.addItemToBasket(newItem);
//        basket.addItemToBasket(newItem);
//        int actual = basket.returnEligibleForToofer().size();
//        int actual2 = basket.getItemsInBasket().size();
//        assertEquals(2, actual);
//        assertEquals(2, actual2);
//    }

//    @Test
//    public void testReturnEligibleForToofer3Items() {
//        ShopItem newItem = new ShopItem("Pop Tarts", 1.50, true);
//        basket.addItemToBasket(newItem);
//        basket.addItemToBasket(newItem);
//        basket.addItemToBasket(newItem);
//        int actual = basket.returnEligibleForToofer().size();
//        int actual2 = basket.getItemsInBasket().size();
//        assertEquals(2, actual);
//        assertEquals(3, actual2);
//    }

//    @Test
//    public void testBuyOneGetOneFree_2Items() {
//        item1.setBuyOneGetOneFreeOn();
//        basket.addItemToBasket(item1);
//        double actual = basket.calculateTotalCost();
//        assertEquals(4.49, actual, 0);
//    }
//






}

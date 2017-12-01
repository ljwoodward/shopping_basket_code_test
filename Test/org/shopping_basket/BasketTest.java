package org.shopping_basket;

import org.junit.*;

import static org.junit.Assert.assertEquals;

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



}

package org.shopping_basket;

import org.junit.*;

public class BasketTest {

    Basket basket;
    ShopItem item1;
    ShopItem item2;

    @Before
    public void before() {
        basket = new Basket();
        item1 = new ShopItem("Wheatabix", 1.99);
        item2 = new ShopItem("Aquafresh Toothpaste", 2.50);
    }



}

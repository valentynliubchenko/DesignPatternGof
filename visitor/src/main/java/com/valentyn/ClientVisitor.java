package com.valentyn;

public class ClientVisitor {

    public void executeVisitorPattern() {
        ItemElement[] items = new ItemElement[]{
                new Book(60, "1234"),
                new Video(120, "Avatar")
        };

        int total = calculatePrice(items);
        System.out.println("Total Cost = " + total);
    }

    private int calculatePrice(ItemElement[] items) {
        Visitor visitor = new ShoppingCartVisitor();
        int sum = 0;
        for (ItemElement item : items) {
            sum += item.accept(visitor);
        }
        return sum;
    }
}

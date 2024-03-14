package com.valentyn;

public class Video implements ItemElement {
    private int price;
    private String title;

    public Video(int price, String title) {
        this.price = price;
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
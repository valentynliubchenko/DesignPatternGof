package com.valentyn;

public class ShoppingCartVisitor implements Visitor {

    @Override
    public int visit(Book book) {
        // предположим, что на книги с ценой выше 50 дается скидка 5 долларов
        int cost = book.getPrice();
        if (cost > 50) {
            cost -= 5;
        }
        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
        return cost;
    }

    @Override
    public int visit(Video video) {
        // видео с ценой выше 100 долларов имеют скидку 10 долларов
        int cost = video.getPrice();
        if (cost > 100) {
            cost -= 10;
        }
        System.out.println("Video title::" + video.getTitle() + " cost =" + cost);
        return cost;
    }
}

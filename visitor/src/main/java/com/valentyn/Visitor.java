package com.valentyn;

public interface Visitor {
    int visit(Book book);
    int visit(Video video);
}

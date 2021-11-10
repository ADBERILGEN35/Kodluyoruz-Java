package com.kodluyoruz.optional;

import java.util.Optional;

public class RectangleGetter {
    private Optional<Rectangle> rectangle;

    public Rectangle getRectangle() {
        return rectangle.orElse(new Rectangle(1,1));
    }

    public RectangleGetter(Rectangle rectangle) {
        this.rectangle = Optional.ofNullable(rectangle);
    }
}

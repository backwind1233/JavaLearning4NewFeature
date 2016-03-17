package com.struts2;


/**
 * Created by zhihaoguo on 16/3/11.
 * zhihao.guo@dianping.com
 */
public abstract class ShapeDector implements Shape {
    protected Shape decorateShape;

    public ShapeDector(Shape decorateShape) {
        this.decorateShape = decorateShape;
    }

    public void draw() {
        decorateShape.draw();

    }
}

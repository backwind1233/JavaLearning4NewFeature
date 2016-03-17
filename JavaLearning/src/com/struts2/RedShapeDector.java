package com.struts2;

/**
 * Created by zhihaoguo on 16/3/11.
 * zhihao.guo@dianping.com
 */
public class RedShapeDector extends ShapeDector {
    public RedShapeDector(Shape decorateShape) {
        super(decorateShape);
    }

    @Override
    public void draw() {
        decorateShape.draw();
        setRedBorder(decorateShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}

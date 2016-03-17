package com.struts2;


/**
 * Created by zhihaoguo on 16/3/11.
 * zhihao.guo@dianping.com
 */


/**
 * 装饰器模式,有点感觉类似aop,或者动态代理的模式
 * http://www.runoob.com/design-pattern/decorator-pattern.html
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redcircle = new RedShapeDector(new Circle());

        Shape redRectangle = new RedShapeDector(new Rectangle());

        System.out.println("circle with normal border");
        circle.draw();

        System.out.println("circle with red border");
        redcircle.draw();

        System.out.println("rectangle with red border");
        redRectangle.draw();
    }
}

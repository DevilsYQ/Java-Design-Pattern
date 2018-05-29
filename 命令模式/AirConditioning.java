package com.devil.test;

public class AirConditioning//接受者角色  真实调用的对象
{
    public void up()
    {
        System.out.println("温度上升");
    }
    public void down()
    {
        System.out.println("温度下降");
    }
}

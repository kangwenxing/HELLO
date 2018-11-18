package com.company;

import java.awt.*;

public class GPSCar extends Car implements GPS{
    public GPSCar(String name, double speed) {
        super(name, speed);
    }

    public Point getLocation(){
        Point point = new Point();
        point.setLocation(super.getSpeed(),super.getSpeed());
        return point;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",坐标("+getLocation().x+","+getLocation().y+")");
        return  sb.toString();
    }
}

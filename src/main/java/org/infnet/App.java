package org.infnet;

import org.infnet.car.Ferrari;
import org.infnet.motorcycle.Kawasaki;
import org.infnet.race.Race;


public class App 
{
    public static void main( String[] args )
    {
        Ferrari ferrari = new Ferrari();
        Kawasaki kawasaki = new Kawasaki();
        Race race = new Race();

        ferrari.setSpeed(200);
        kawasaki.setSpeed(700);

        race.race(ferrari.getSpeed(), kawasaki.getSpeed());

    }
}

package com.itstep.pastukhov;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by lotrik on 12.07.15.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println ("Транспортная система Днепропетровска:");
        Transport transport = new Transport();
        Map<String, Integer> dnepropetrovskTransport = transport.getDnepropetrovskTransport();
        dnepropetrovskTransport.put("Тролейбус", 40);
        dnepropetrovskTransport.put("Трамвай", 34);
        dnepropetrovskTransport.put("Автобус", 46);
        dnepropetrovskTransport.put("Маршрутка", 134);

        Iterator iterator = dnepropetrovskTransport.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            System.out.println(pair.getKey() + " в количестве " + pair.getValue() + " шт.");
        }
    }
}

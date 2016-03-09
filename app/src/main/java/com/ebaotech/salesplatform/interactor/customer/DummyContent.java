package com.ebaotech.salesplatform.interactor.customer;

import com.ebaotech.salesplatform.domain.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *  Copyright (c) 2016.  ebaotech.com. All rights reserved.
 *  Author: Zhu Liliang; Date:3/2/16 11:23 PM
 */

public class DummyContent {


    public final static String[] names = {
            "Caesar", "Boaz", "Leander", "Norman", "Robin", "Randolph", "Cosmo", "Edmond", "Ophelia", "Sally", "May", "Keturah", "Marion", "Marian", "Hilary", "Dinah", "Daniel", "Eli", "Nathaniel", "Ethan", "Aaron", "Joshua", "Matthew", "Jadon", "Andrew", "Benjamin", "Zebedee", "John", "Tobiah", "Bartholomew", "Micah", "Obadiah", "Arthur", "Andrew", "Donald", "Peter", "Antonio", "Simon", "Charles", "Daniel", "John", "Sophia", "Helen", "Joseph", "Alexander", "Catherine", "George", "Charles", "Nathaniel", "Thomas", "Arthur", "Louis", "Andrew", "Michael", "Hugh", "George",
    };
    /**
     * An array of sample (dummy) items.
     */
    public static final List<Customer> ITEMS = new ArrayList<Customer>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Customer> ITEM_MAP = new HashMap<String, Customer>();

    private static final int COUNT = 55;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(Customer item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }

    private static Customer createDummyItem(int position) {
        return new Customer(String.valueOf(position), names[position], (6 + (int) (Math.random() * 45)), "Male", makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

}

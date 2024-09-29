package org.launchcode;

import java.util.HashMap;
import java.util.Date;

public class Menu {
    public HashMap<Integer, MenuItem> menuItems = new HashMap<Integer, MenuItem>();
    public Date lastUpdated = new Date();

    public void updateLastUpdated(){
        this.lastUpdated = new Date();
    }
}

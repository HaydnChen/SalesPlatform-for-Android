package com.ebaotech.salesplatform.ui.home;

import com.ebaotech.salesplatform.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright (C) 2016 ebaotech.com. All rights reserved.
 * Author: Zhu Liliang; Date:3/11/16.
 */
public class TabSectionContent {

    public static final List<TabSectionContent> ITEMS = new ArrayList<TabSectionContent>();
    public static final Map<Integer, TabSectionContent> ITEM_MAP = new HashMap<>();

    static {
        addItem(new TabSectionContent(0, "hard code: Home", R.drawable.ic_action_home, R.color.colorAccent, R.drawable.ic_action_add));
        addItem(new TabSectionContent(1, "hard code: Customer", R.drawable.ic_action_user, R.color.colorPrimaryDark, R.drawable.ic_action_add));
        addItem(new TabSectionContent(2, "hard code: FNA", R.drawable.ic_action_line_chart, R.color.color_error, R.drawable.ic_action_add));
        addItem(new TabSectionContent(3, "hard code: Quotation", R.drawable.ic_action_calculator, R.color.color_success, R.drawable.ic_action_add));
        addItem(new TabSectionContent(4, "hard code: Policy", R.drawable.ic_action_folder_open, R.color.colorAccent, R.drawable.ic_action_add));
    }


    private static void addItem(TabSectionContent item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.position, item);
    }

    public final int position;
    public final String tabName;
    public final int tabIcon;
    public final int fabColor;
    public final int fabIcon;

    private TabSectionContent(int position, String tabName, int tabIcon, int fabColor, int fabIcon) {
        this.position = position;
        this.tabName = tabName;
        this.tabIcon = tabIcon;
        this.fabColor = fabColor;
        this.fabIcon = fabIcon;
    }

    @Override
    public String toString() {
        return tabName;
    }
}

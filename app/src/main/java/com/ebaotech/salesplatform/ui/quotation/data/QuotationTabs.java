package com.ebaotech.salesplatform.ui.quotation.data;

import com.ebaotech.salesplatform.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class QuotationTabs {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<TabItem> ITEMS = new ArrayList<TabItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, TabItem> ITEM_MAP = new HashMap<String, TabItem>();

    static {
        addItem(new TabItem("1", R.string.quotation_edit__basic_info_tab,R.drawable.ic_person_black,"Enter Basic Information"));
        addItem(new TabItem("2", R.string.quotation_edit__quote_tab, R.drawable.ic_action_calculator_black, "Quote" ));
        addItem(new TabItem("3", R.string.quotation_edit__pdf_tab, R.drawable.ic_action_document, "Quote" ));
    }

    private static void addItem(TabItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class TabItem {
        public final String id;
        public final int tabName;   //in res
        public final int tabIcon;   //in res
        public final String tabDesc;

        public TabItem(String id, int tabName, int tabIcon, String tabDesc) {
            this.id = id;
            this.tabName = tabName;
            this.tabIcon = tabIcon;
            this.tabDesc = tabDesc;
        }

        @Override
        public String toString() {
            return tabDesc;
        }
    }
}

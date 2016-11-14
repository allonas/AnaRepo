

package com.ibm.mobileappbuilder.newapp20161114113756.ui;

import android.os.Bundle;

import com.ibm.mobileappbuilder.newapp20161114113756.R;

import java.util.ArrayList;
import java.util.List;

import ibmmobileappbuilder.MenuItem;


/**
 * MenuFragment menu fragment.
 */
public class MenuFragment extends ibmmobileappbuilder.ui.MenuFragment {
    /**
     * Default constructor
     */
    public MenuFragment(){
        super();
    }

    // Factory method
    public static MenuFragment newInstance(Bundle args) {
        MenuFragment fragment = new MenuFragment();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Menu Fragment interface
    @Override
    public List<MenuItem> getMenuItems() {
        ArrayList<MenuItem> items = new ArrayList<MenuItem>();
        return items;
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_list;
    }

    @Override
    public int getItemLayout() {
        return R.layout.menu_item;
    }
}

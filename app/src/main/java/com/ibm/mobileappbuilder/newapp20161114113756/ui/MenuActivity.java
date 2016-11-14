

package com.ibm.mobileappbuilder.newapp20161114113756.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.ibm.mobileappbuilder.newapp20161114113756.R;

import ibmmobileappbuilder.ui.BaseListingActivity;
/**
 * MenuActivity list activity
 */
public class MenuActivity extends BaseListingActivity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);

        if(isTaskRoot()) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        } else {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        
        setTitle(getString(R.string.menuActivity));
    }

    @Override
    protected Class<? extends Fragment> getFragmentClass() {
        return MenuFragment.class;
    }

}

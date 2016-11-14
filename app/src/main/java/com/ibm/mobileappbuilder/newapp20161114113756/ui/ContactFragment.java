
package com.ibm.mobileappbuilder.newapp20161114113756.ui;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ibm.mobileappbuilder.newapp20161114113756.R;
import ibmmobileappbuilder.ds.Datasource;
import android.widget.TextView;
import ibmmobileappbuilder.ds.SearchOptions;
import ibmmobileappbuilder.ds.filter.Filter;
import java.util.Arrays;
import com.ibm.mobileappbuilder.newapp20161114113756.ds.Item;
import com.ibm.mobileappbuilder.newapp20161114113756.ds.EmptyDatasource;

public class ContactFragment extends ibmmobileappbuilder.ui.DetailFragment<Item>  {

    private Datasource<Item> datasource;
    private SearchOptions searchOptions;

    public static ContactFragment newInstance(Bundle args){
        ContactFragment card = new ContactFragment();
        card.setArguments(args);

        return card;
    }

    public ContactFragment(){
        super();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        searchOptions = SearchOptions.Builder.searchOptions().build();
    }

    @Override
    public Datasource getDatasource() {
        if (datasource != null) {
            return datasource;
        }
        datasource = EmptyDatasource.getInstance(searchOptions);
        return datasource;
    }

    // Bindings

    @Override
    protected int getLayout() {
        return R.layout.contact_custom;
    }

    @Override
    @SuppressLint("WrongViewCast")
    public void bindView(final Item item, View view) {
    }

    @Override
    protected void onShow(Item item) {
        // set the title for this fragment
        getActivity().setTitle("Contact");
    }
}

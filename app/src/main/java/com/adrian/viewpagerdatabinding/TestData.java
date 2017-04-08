package com.adrian.viewpagerdatabinding;


import com.adrian.viewpagerdatabinding.model.DataModel;
import com.adrian.viewpagerdatabinding.viewmodel.FirstViewModel;
import com.adrian.viewpagerdatabinding.viewmodel.SecondViewModel;
import com.adrian.viewpagerdatabinding.viewmodel.ThirdViewModel;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by cadri on 2017. 03. 26..
 */

final class TestData {

    public static final List<String> getTitleList() {
        String title1 = "title1";
        String title2 = "title2";
        String title3 = "title3";
        List<String> list = new ArrayList<>();
        list.add(title1);
        list.add(title2);
        list.add(title3);
        return list;
    }

    public static final List<DataModel> getRVDataModelForDifferentLayoutsList() {
        List<DataModel> list = new ArrayList<>();
        DataModel dataModel1 = new DataModel(new FirstViewModel("id1", "text1", R.layout.viewpager_item_layout_1));
        DataModel dataModel2 = new DataModel(new ThirdViewModel("id2", "text2", R.layout.viewpager_item_layout_2));
        DataModel dataModel3 = new DataModel(new SecondViewModel("id3", "text3", R.layout.viewpager_item_layout_3));
        list.add(dataModel1);
        list.add(dataModel2);
        list.add(dataModel3);
        return list; 
    }
}

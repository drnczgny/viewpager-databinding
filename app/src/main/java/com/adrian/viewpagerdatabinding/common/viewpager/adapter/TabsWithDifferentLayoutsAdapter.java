package com.adrian.viewpagerdatabinding.common.viewpager.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adrian.viewpagerdatabinding.common.viewpager.model.DataModel;
import com.adrian.viewpagerdatabinding.databinding.ViewpagerItemCommentsLayoutBinding;

import java.util.List;

/**
 * Created by cadri on 2017. 03. 26..
 */

public class TabsWithDifferentLayoutsAdapter extends PagerAdapter {

    private static final String TAG = TabsWithDifferentLayoutsAdapter.class.getName();

    private Context context;

    private List<String> titleList;

    private List<DataModel> itemList;

    private LayoutInflater layoutInflater;

    public TabsWithDifferentLayoutsAdapter(Context context, List<DataModel> itemList, List<String> titleList) {
        this.context = context;
        this.itemList = itemList;
        this.titleList = titleList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {

        DataModel dataModel = itemList.get(position);
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, dataModel.getRvViewModel().getLayoutId(), collection, false);

        // this is because of the RecyclerView
        if(position == 3)  {
            ViewpagerItemCommentsLayoutBinding viewpagerItemCommentsLayoutBinding = ViewpagerItemCommentsLayoutBinding.inflate(layoutInflater, collection, false);
            viewpagerItemCommentsLayoutBinding.rvComments.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        }

        binding.setVariable(dataModel.getRvViewModel().getVariableId(), dataModel.getRvViewModel());
        collection.addView(binding.getRoot());
        return binding.getRoot();
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }


}

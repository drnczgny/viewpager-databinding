package com.adrian.viewpagerdatabinding.viewmodel.simplelist;

import android.databinding.Bindable;

import com.adrian.viewpagerdatabinding.BR;
import com.adrian.viewpagerdatabinding.viewmodel.base.RVViewModel;

import java.util.List;

/**
 * Created by cadri on 2017. 04. 09..
 */

public class SimpleListViewModel extends RVViewModel {

    public String id;

    public List<String> list;

    public int layoutId;

    public SimpleListViewModel(String id, List<String> list, int layoutId) {
        this.id = id;
        this.list = list;
        this.layoutId = layoutId;
    }

    @Override
    public int getVariableId() {
        return BR.viewModel;
    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public List<String> getText() {
        return list;
    }

    public void setText(List<String> text) {
        this.list = text;
        notifyPropertyChanged(BR.text);
    }

    @Override
    @Bindable
    public int getLayoutId() {
        return layoutId;
    }

    @Override
    public void setLayoutId(int layoutId) {
        this.layoutId = layoutId;
        notifyPropertyChanged(BR.layoutId);
    }


}

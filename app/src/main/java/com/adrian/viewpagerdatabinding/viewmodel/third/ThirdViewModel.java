package com.adrian.viewpagerdatabinding.viewmodel.third;

import android.databinding.Bindable;

import com.adrian.viewpagerdatabinding.BR;
import com.adrian.viewpagerdatabinding.viewmodel.base.RVViewModel;

/**
 * Created by cadri on 2017. 04. 08..
 */

public class ThirdViewModel extends RVViewModel {

    public String id;

    public String text;

    public int layoutId;

    public ThirdViewModel(String id, String text, int layoutId) {
        this.id = id;
        this.text = text;
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
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    @Override
    public String toString() {
        return "ThirdViewModel{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", layoutId=" + layoutId +
                '}';
    }
}

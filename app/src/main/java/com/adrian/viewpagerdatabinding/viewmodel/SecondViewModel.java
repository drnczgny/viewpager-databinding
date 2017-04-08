package com.adrian.viewpagerdatabinding.viewmodel;

import android.databinding.Bindable;

import com.adrian.viewpagerdatabinding.BR;

/**
 * Created by cadri on 2017. 04. 08..
 */

public class SecondViewModel extends RVViewModel {

    public String id;

    public String text;

    public int layoutId;

    public SecondViewModel(String id, String text, int layoutId) {
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
        return "SecondViewModel{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", layoutId=" + layoutId +
                '}';
    }
}

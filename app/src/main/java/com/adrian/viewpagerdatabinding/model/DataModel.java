package com.adrian.viewpagerdatabinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.adrian.viewpagerdatabinding.BR;
import com.adrian.viewpagerdatabinding.viewmodel.RVViewModel;

/**
 * Created by cadri on 2017. 04. 08..
 */

public class DataModel extends BaseObservable {

    private RVViewModel rvViewModel;

    public DataModel(RVViewModel rvViewModel) {
        this.rvViewModel = rvViewModel;
    }

    @Bindable
    public RVViewModel getRvViewModel() {
        return rvViewModel;
    }

    public void setRvViewModel(RVViewModel rvViewModel) {
        this.rvViewModel = rvViewModel;
        notifyPropertyChanged(BR.rvViewModel);
    }
}

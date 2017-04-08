package com.adrian.viewpagerdatabinding.common.viewpager.model;

import com.adrian.viewpagerdatabinding.viewmodel.base.RVViewModel;

/**
 * Created by cadri on 2017. 04. 08..
 */

public class DataModel {

    private RVViewModel rvViewModel;

    public DataModel(RVViewModel rvViewModel) {
        this.rvViewModel = rvViewModel;
    }

    public RVViewModel getRvViewModel() {
        return rvViewModel;
    }

    public void setRvViewModel(RVViewModel rvViewModel) {
        this.rvViewModel = rvViewModel;
    }
}

package com.adrian.viewpagerdatabinding.viewmodel.base;

import android.databinding.BaseObservable;

/**
 * Created by cadri on 2017. 04. 08..
 */

public abstract class RVViewModel extends BaseObservable {

    public abstract int getLayoutId();

    public abstract void setLayoutId(int layoutId);

    public abstract int getVariableId();
}

package com.adrian.viewpagerdatabinding.viewmodel.comment;

import android.app.Activity;
import android.databinding.Bindable;

import com.adrian.viewpagerdatabinding.BR;
import com.adrian.viewpagerdatabinding.R;
import com.adrian.viewpagerdatabinding.viewmodel.base.RVViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cadri on 2017. 04. 08..
 */

public class CommentsViewModel extends RVViewModel {

    private Activity activity;

    private List<CommentItemViewModel> commentItemViewModels = new ArrayList<>();

    private int itemLayoutId = R.layout.item_layout1;

    private int layoutId;

    private int variableId = BR.viewModel;

    private String simpleText = "simpleText";

    public CommentsViewModel(Activity activity, List<CommentItemViewModel> commentItemViewModels, int layoutId) {
        this.activity = activity;
        this.commentItemViewModels = commentItemViewModels;
        this.layoutId = layoutId;
    }

    @Bindable
    public List<CommentItemViewModel> getCommentItemViewModels() {
        return commentItemViewModels;
    }

    public void setCommentItemViewModels(List<CommentItemViewModel> commentItemViewModels) {
        this.commentItemViewModels = commentItemViewModels;
        notifyPropertyChanged(BR.commentItemViewModels);
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
    @Bindable
    public int getVariableId() {
        return variableId;
    }

    public void setVariableId(int variableId) {
        this.variableId = variableId;
        notifyPropertyChanged(BR.variableId);
    }

    @Bindable
    public String getSimpleText() {
        return simpleText;
    }

    public void setSimpleText(String simpleText) {
        this.simpleText = simpleText;
        notifyPropertyChanged(BR.simpleText);
    }

    @Bindable
    public int getItemLayoutId() {
        return itemLayoutId;
    }

    public void setItemLayoutId(int itemLayoutId) {
        this.itemLayoutId = itemLayoutId;
        notifyPropertyChanged(BR.itemLayoutId);
    }
}

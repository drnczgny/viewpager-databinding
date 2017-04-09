package com.adrian.viewpagerdatabinding.viewmodel.comment;

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

    private List<CommentItemViewModel> commentItemViewModels = new ArrayList<>();

    private int itemLayoutId = R.layout.item_comment_layout;

    private int layoutId;

    private int variableId = BR.viewModel;

    public CommentsViewModel(List<CommentItemViewModel> commentItemViewModels, int layoutId) {
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
    public int getItemLayoutId() {
        return itemLayoutId;
    }

    public void setItemLayoutId(int itemLayoutId) {
        this.itemLayoutId = itemLayoutId;
        notifyPropertyChanged(BR.itemLayoutId);
    }
}

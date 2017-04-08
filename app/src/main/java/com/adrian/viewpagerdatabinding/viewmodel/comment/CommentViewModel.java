package com.adrian.viewpagerdatabinding.viewmodel.comment;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.adrian.viewpagerdatabinding.BR;

import java.util.List;

/**
 * Created by cadri on 2017. 04. 08..
 */

public class CommentViewModel extends BaseObservable {

    List<CommentItemViewModel> commentItemViewModels;

    @Bindable
    public List<CommentItemViewModel> getCommentItemViewModels() {
        return commentItemViewModels;
    }

    public void setCommentItemViewModels(List<CommentItemViewModel> commentItemViewModels) {
        this.commentItemViewModels = commentItemViewModels;
        notifyPropertyChanged(BR.commentItemViewModels);
    }
}

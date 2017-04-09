package com.adrian.viewpagerdatabinding.viewmodel.comment;

import android.databinding.Bindable;

import com.adrian.viewpagerdatabinding.BR;
import com.adrian.viewpagerdatabinding.common.recyclerview.ListItemViewModel;
import com.adrian.viewpagerdatabinding.model.Comment;

/**
 * Created by cadri on 2017. 04. 08..
 */

public class CommentItemViewModel extends ListItemViewModel {

    private Comment comment;

    public CommentItemViewModel(Comment comment) {
        this.comment = comment;

    }



    @Bindable
    public Integer getPostId() {
        return comment.getPostId();
    }

    public void setPostId(Integer postId) {
        comment.setPostId(postId);
        notifyPropertyChanged(BR.postId);
    }

    @Bindable
    public Integer getId() {
        return comment.getId();
    }

    public void setId(Integer id) {
        comment.setId(id);
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return comment.getName();
    }

    public void setName(String name) {
        comment.setName(name);
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getEmail() {
        return comment.getEmail();
    }

    public void setEmail(String email) {
        comment.setEmail(email);
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getBody() {
        return comment.getBody();
    }

    public void setBody(String body) {
        comment.setBody(body);
        notifyPropertyChanged(BR.body);
    }

    @Bindable
    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
        notifyPropertyChanged(BR.comment);
    }

    @Override
    public String toString() {
        return "CommentItemViewModel{" +
                "comment=" + comment +
                '}';
    }
}

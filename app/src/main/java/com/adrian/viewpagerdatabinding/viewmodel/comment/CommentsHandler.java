package com.adrian.viewpagerdatabinding.viewmodel.comment;

import android.util.Log;
import android.view.View;

import com.adrian.viewpagerdatabinding.BR;
import com.adrian.viewpagerdatabinding.model.Comment;

/**
 * Created by cadri on 2017. 04. 09..
 */

public class CommentsHandler {

    private static final String TAG = CommentsHandler.class.getName();

    private CommentsViewModel commentsViewModel;

    public CommentsHandler(CommentsViewModel commentsViewModel) {
        this.commentsViewModel = commentsViewModel;
    }

    public void onClickNewComment(View view) {
        Log.i(TAG, "onClickNewComment");
        CommentItemViewModel commentItemViewModel = createNewItem();
        commentsViewModel.getCommentItemViewModels().add(commentItemViewModel);
        commentsViewModel.notifyPropertyChanged(BR.commentItemViewModels);
    }

    private CommentItemViewModel createNewItem() {
        Comment comment = new Comment();
        comment.setId(0);
        comment.setPostId(0);
        comment.setName("name0");
        comment.setEmail("email");
        comment.setBody("body0");
        CommentItemViewModel commentItemViewModel = new CommentItemViewModel(comment);
        return commentItemViewModel;
    }

}

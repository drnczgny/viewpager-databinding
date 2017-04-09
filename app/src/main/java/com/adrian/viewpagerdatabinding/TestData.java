package com.adrian.viewpagerdatabinding;


import android.app.Activity;

import com.adrian.viewpagerdatabinding.common.viewpager.model.DataModel;
import com.adrian.viewpagerdatabinding.model.Comment;
import com.adrian.viewpagerdatabinding.viewmodel.comment.CommentItemViewModel;
import com.adrian.viewpagerdatabinding.viewmodel.comment.CommentsViewModel;
import com.adrian.viewpagerdatabinding.viewmodel.first.FirstViewModel;
import com.adrian.viewpagerdatabinding.viewmodel.second.SecondViewModel;
import com.adrian.viewpagerdatabinding.viewmodel.simplelist.SimpleListViewModel;
import com.adrian.viewpagerdatabinding.viewmodel.third.ThirdViewModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by cadri on 2017. 03. 26..
 */

final public class TestData {

    public static final List<String> getTitleList() {
        String title1 = "title1";
        String title2 = "title2";
        String title3 = "title3";
        String title4 = "title4";
        String title5 = "title5";
        List<String> list = new ArrayList<>();
        list.add(title1);
        list.add(title2);
        list.add(title3);
        list.add(title4);
        list.add(title5);
        return list;
    }

    public static List<CommentItemViewModel> getCommentItemViewModelList() {
        List<CommentItemViewModel> list = new ArrayList<>();
        for(int i=1; i<=6; i++) {
            Comment comment = createTestComment(i);
            CommentItemViewModel commentItemViewModel = new CommentItemViewModel(comment);
            list.add(commentItemViewModel);
        }
        return list;
    }

    public static final List<DataModel> getRVDataModelForDifferentLayoutsList(Activity activity) {
        List<DataModel> list = new ArrayList<>();
        DataModel dataModel1 = new DataModel(new FirstViewModel("id1", "text1", R.layout.viewpager_item_layout_1));
        DataModel dataModel2 = new DataModel(new SecondViewModel("id2", "text2", R.layout.viewpager_item_layout_2));
        DataModel dataModel3 = new DataModel(new ThirdViewModel("id3", "text3", R.layout.viewpager_item_layout_3));
        DataModel dataModel4 = new DataModel(new CommentsViewModel(activity, getCommentItemViewModelList(), R.layout.viewpager_item_comments_layout));
        DataModel dataModel5 = new DataModel(new SimpleListViewModel("id5", Arrays.asList("one", "two", "three"), R.layout.viewpager_item_layout_5_recyclerview));
        list.add(dataModel1);
        list.add(dataModel2);
        list.add(dataModel3);
        list.add(dataModel4);
        list.add(dataModel5);
        return list;
    }

    private static Comment createTestComment(final int id) {
        Comment comment = new Comment();
        comment.setId(id);
        comment.setPostId(id);
        comment.setName("name" + id);
        comment.setEmail("email" + id);
        comment.setBody("body" +id);
        return comment;
    }
}

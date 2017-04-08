package com.adrian.viewpagerdatabinding;


import com.adrian.viewpagerdatabinding.common.viewpager.model.DataModel;
import com.adrian.viewpagerdatabinding.model.Comment;
import com.adrian.viewpagerdatabinding.viewmodel.comment.CommentItemViewModel;
import com.adrian.viewpagerdatabinding.viewmodel.first.FirstViewModel;
import com.adrian.viewpagerdatabinding.viewmodel.second.SecondViewModel;
import com.adrian.viewpagerdatabinding.viewmodel.third.ThirdViewModel;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by cadri on 2017. 03. 26..
 */

final class TestData {

    public static final List<String> getTitleList() {
        String title1 = "title1";
        String title2 = "title2";
        String title3 = "title3";
        List<String> list = new ArrayList<>();
        list.add(title1);
        list.add(title2);
        list.add(title3);
        return list;
    }

    public static final List<DataModel> getRVDataModelForDifferentLayoutsList() {
        List<DataModel> list = new ArrayList<>();
        DataModel dataModel1 = new DataModel(new FirstViewModel("id1", "text1", R.layout.viewpager_item_layout_1));
        DataModel dataModel2 = new DataModel(new SecondViewModel("id2", "text2", R.layout.viewpager_item_layout_2));
        DataModel dataModel3 = new DataModel(new ThirdViewModel("id3", "text3", R.layout.viewpager_item_layout_3));
        list.add(dataModel1);
        list.add(dataModel2);
        list.add(dataModel3);
        return list; 
    }

    public static List<CommentItemViewModel> getCommentItemViewModelList() {
        List<CommentItemViewModel> list = new ArrayList<>();
        Comment comment1 = new Comment();
        comment1.setId(1);
        comment1.setPostId(1);
        comment1.setName("name1");
        comment1.setEmail("email1");
        comment1.setBody("body1");
        Comment comment2 = new Comment();
        comment2.setId(2);
        comment2.setPostId(2);
        comment2.setName("name2");
        comment2.setEmail("email2");
        comment2.setBody("body2");
        Comment comment3 = new Comment();
        comment3.setId(3);
        comment3.setPostId(3);
        comment3.setName("name3");
        comment3.setEmail("email3");
        comment3.setBody("body3");
        CommentItemViewModel commentItemViewModel1 = new CommentItemViewModel(comment1);
        CommentItemViewModel commentItemViewModel2 = new CommentItemViewModel(comment2);
        CommentItemViewModel commentItemViewModel3 = new CommentItemViewModel(comment3);
        list.add(commentItemViewModel1);
        list.add(commentItemViewModel2);
        list.add(commentItemViewModel3);
        return list;
    }
}

package com.example.icbc;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.example.icbc.databinding.ActivityItem1BindingImpl;
import com.example.icbc.databinding.ActivityLoginBindingImpl;
import com.example.icbc.databinding.ItemCmakelineBindingImpl;
import com.example.icbc.databinding.ItemGongyiBindingImpl;
import com.example.icbc.databinding.ItemListBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYITEM1 = 1;

  private static final int LAYOUT_ACTIVITYLOGIN = 2;

  private static final int LAYOUT_ITEMCMAKELINE = 3;

  private static final int LAYOUT_ITEMGONGYI = 4;

  private static final int LAYOUT_ITEMLIST = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.icbc.R.layout.activity_item1, LAYOUT_ACTIVITYITEM1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.icbc.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.icbc.R.layout.item_cmakeline, LAYOUT_ITEMCMAKELINE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.icbc.R.layout.item_gongyi, LAYOUT_ITEMGONGYI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.icbc.R.layout.item_list, LAYOUT_ITEMLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYITEM1: {
          if ("layout/activity_item1_0".equals(tag)) {
            return new ActivityItem1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_item1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCMAKELINE: {
          if ("layout/item_cmakeline_0".equals(tag)) {
            return new ItemCmakelineBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_cmakeline is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGONGYI: {
          if ("layout/item_gongyi_0".equals(tag)) {
            return new ItemGongyiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_gongyi is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLIST: {
          if ("layout/item_list_0".equals(tag)) {
            return new ItemListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "data");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_item1_0", com.example.icbc.R.layout.activity_item1);
      sKeys.put("layout/activity_login_0", com.example.icbc.R.layout.activity_login);
      sKeys.put("layout/item_cmakeline_0", com.example.icbc.R.layout.item_cmakeline);
      sKeys.put("layout/item_gongyi_0", com.example.icbc.R.layout.item_gongyi);
      sKeys.put("layout/item_list_0", com.example.icbc.R.layout.item_list);
    }
  }
}

package com.example.icbc.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityItem1Binding extends ViewDataBinding {
  @NonNull
  public final Button bSubmit;

  @NonNull
  public final EditText etItem8;

  @NonNull
  public final EditText etWarehouse;

  @NonNull
  public final RelativeLayout lBottom;

  @NonNull
  public final LinearLayout llItem1;

  @NonNull
  public final LinearLayout llItem2;

  @NonNull
  public final LinearLayout llItem3;

  @NonNull
  public final LinearLayout llItem4;

  @NonNull
  public final LinearLayout llItem5;

  @NonNull
  public final LinearLayout llItem6;

  @NonNull
  public final TextView tvCount;

  @NonNull
  public final TextView tvItem13;

  @NonNull
  public final TextView tvItem8;

  @NonNull
  public final TextView tvKey1;

  @NonNull
  public final TextView tvKey10;

  @NonNull
  public final TextView tvKey11;

  @NonNull
  public final TextView tvKey12;

  @NonNull
  public final TextView tvKey2;

  @NonNull
  public final TextView tvKey3;

  @NonNull
  public final TextView tvKey4;

  @NonNull
  public final TextView tvKey5;

  @NonNull
  public final TextView tvKey6;

  @NonNull
  public final TextView tvKey7;

  @NonNull
  public final TextView tvKey9;

  @NonNull
  public final TextView tvTitle1;

  @NonNull
  public final TextView tvTotal;

  protected ActivityItem1Binding(Object _bindingComponent, View _root, int _localFieldCount,
      Button bSubmit, EditText etItem8, EditText etWarehouse, RelativeLayout lBottom,
      LinearLayout llItem1, LinearLayout llItem2, LinearLayout llItem3, LinearLayout llItem4,
      LinearLayout llItem5, LinearLayout llItem6, TextView tvCount, TextView tvItem13,
      TextView tvItem8, TextView tvKey1, TextView tvKey10, TextView tvKey11, TextView tvKey12,
      TextView tvKey2, TextView tvKey3, TextView tvKey4, TextView tvKey5, TextView tvKey6,
      TextView tvKey7, TextView tvKey9, TextView tvTitle1, TextView tvTotal) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bSubmit = bSubmit;
    this.etItem8 = etItem8;
    this.etWarehouse = etWarehouse;
    this.lBottom = lBottom;
    this.llItem1 = llItem1;
    this.llItem2 = llItem2;
    this.llItem3 = llItem3;
    this.llItem4 = llItem4;
    this.llItem5 = llItem5;
    this.llItem6 = llItem6;
    this.tvCount = tvCount;
    this.tvItem13 = tvItem13;
    this.tvItem8 = tvItem8;
    this.tvKey1 = tvKey1;
    this.tvKey10 = tvKey10;
    this.tvKey11 = tvKey11;
    this.tvKey12 = tvKey12;
    this.tvKey2 = tvKey2;
    this.tvKey3 = tvKey3;
    this.tvKey4 = tvKey4;
    this.tvKey5 = tvKey5;
    this.tvKey6 = tvKey6;
    this.tvKey7 = tvKey7;
    this.tvKey9 = tvKey9;
    this.tvTitle1 = tvTitle1;
    this.tvTotal = tvTotal;
  }

  @NonNull
  public static ActivityItem1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_item1, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityItem1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityItem1Binding>inflateInternal(inflater, com.example.icbc.R.layout.activity_item1, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityItem1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_item1, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityItem1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityItem1Binding>inflateInternal(inflater, com.example.icbc.R.layout.activity_item1, null, false, component);
  }

  public static ActivityItem1Binding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityItem1Binding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityItem1Binding)bind(component, view, com.example.icbc.R.layout.activity_item1);
  }
}

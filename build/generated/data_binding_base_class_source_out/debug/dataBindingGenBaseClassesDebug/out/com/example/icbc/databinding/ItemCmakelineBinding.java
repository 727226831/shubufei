package com.example.icbc.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.example.icbc.DataBean;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCmakelineBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout llLayout;

  @Bindable
  protected DataBean mData;

  protected ItemCmakelineBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout llLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.llLayout = llLayout;
  }

  public abstract void setData(@Nullable DataBean data);

  @Nullable
  public DataBean getData() {
    return mData;
  }

  @NonNull
  public static ItemCmakelineBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_cmakeline, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCmakelineBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCmakelineBinding>inflateInternal(inflater, com.example.icbc.R.layout.item_cmakeline, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCmakelineBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_cmakeline, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCmakelineBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCmakelineBinding>inflateInternal(inflater, com.example.icbc.R.layout.item_cmakeline, null, false, component);
  }

  public static ItemCmakelineBinding bind(@NonNull View view) {
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
  public static ItemCmakelineBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCmakelineBinding)bind(component, view, com.example.icbc.R.layout.item_cmakeline);
  }
}

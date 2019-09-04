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

public abstract class ItemGongyiBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout llLayout;

  @Bindable
  protected DataBean mData;

  protected ItemGongyiBinding(Object _bindingComponent, View _root, int _localFieldCount,
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
  public static ItemGongyiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_gongyi, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemGongyiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemGongyiBinding>inflateInternal(inflater, com.example.icbc.R.layout.item_gongyi, root, attachToRoot, component);
  }

  @NonNull
  public static ItemGongyiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_gongyi, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemGongyiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemGongyiBinding>inflateInternal(inflater, com.example.icbc.R.layout.item_gongyi, null, false, component);
  }

  public static ItemGongyiBinding bind(@NonNull View view) {
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
  public static ItemGongyiBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemGongyiBinding)bind(component, view, com.example.icbc.R.layout.item_gongyi);
  }
}

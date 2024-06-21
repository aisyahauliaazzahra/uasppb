// Generated by data binding compiler. Do not edit!
package com.example.uasppbprojectkelompok.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.uasppbprojectkelompok.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class VisualPredictBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView2;

  @NonNull
  public final ImageView imageViewVisualPredict;

  @NonNull
  public final Button searchBtnVisualPredict;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final ConstraintLayout visualBottomSheet;

  protected VisualPredictBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardView2, ImageView imageViewVisualPredict, Button searchBtnVisualPredict,
      TextView textView3, ConstraintLayout visualBottomSheet) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView2 = cardView2;
    this.imageViewVisualPredict = imageViewVisualPredict;
    this.searchBtnVisualPredict = searchBtnVisualPredict;
    this.textView3 = textView3;
    this.visualBottomSheet = visualBottomSheet;
  }

  @NonNull
  public static VisualPredictBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.visual_predict, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VisualPredictBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VisualPredictBinding>inflateInternal(inflater, R.layout.visual_predict, root, attachToRoot, component);
  }

  @NonNull
  public static VisualPredictBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.visual_predict, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VisualPredictBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VisualPredictBinding>inflateInternal(inflater, R.layout.visual_predict, null, false, component);
  }

  public static VisualPredictBinding bind(@NonNull View view) {
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
  public static VisualPredictBinding bind(@NonNull View view, @Nullable Object component) {
    return (VisualPredictBinding)bind(component, view, R.layout.visual_predict);
  }
}

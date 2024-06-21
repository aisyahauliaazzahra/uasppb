// Generated by view binder compiler. Do not edit!
package com.example.uasppbprojectkelompok.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.uasppbprojectkelompok.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVisualSearchBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView backIvVisualAc;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final LinearLayout linearLayout9;

  @NonNull
  public final Button takeAPhotoBtnVisualSearch;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final Button uploadAPhotoBtnVisualSearch;

  private ActivityVisualSearchBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView backIvVisualAc, @NonNull ImageView imageView2,
      @NonNull LinearLayout linearLayout9, @NonNull Button takeAPhotoBtnVisualSearch,
      @NonNull TextView textView2, @NonNull Button uploadAPhotoBtnVisualSearch) {
    this.rootView = rootView;
    this.backIvVisualAc = backIvVisualAc;
    this.imageView2 = imageView2;
    this.linearLayout9 = linearLayout9;
    this.takeAPhotoBtnVisualSearch = takeAPhotoBtnVisualSearch;
    this.textView2 = textView2;
    this.uploadAPhotoBtnVisualSearch = uploadAPhotoBtnVisualSearch;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVisualSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVisualSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_visual_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVisualSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backIv_visualAc;
      ImageView backIvVisualAc = ViewBindings.findChildViewById(rootView, id);
      if (backIvVisualAc == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.linearLayout9;
      LinearLayout linearLayout9 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout9 == null) {
        break missingId;
      }

      id = R.id.takeAPhotoBtn_visualSearch;
      Button takeAPhotoBtnVisualSearch = ViewBindings.findChildViewById(rootView, id);
      if (takeAPhotoBtnVisualSearch == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.uploadAPhotoBtn_visualSearch;
      Button uploadAPhotoBtnVisualSearch = ViewBindings.findChildViewById(rootView, id);
      if (uploadAPhotoBtnVisualSearch == null) {
        break missingId;
      }

      return new ActivityVisualSearchBinding((ConstraintLayout) rootView, backIvVisualAc,
          imageView2, linearLayout9, takeAPhotoBtnVisualSearch, textView2,
          uploadAPhotoBtnVisualSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

// Generated by view binder compiler. Do not edit!
package com.example.uasppbprojectkelompok.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.uasppbprojectkelompok.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CategorySingleBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView categoryImageCateSingle;

  @NonNull
  public final TextView categoryNameCateSingle;

  private CategorySingleBinding(@NonNull CardView rootView,
      @NonNull ImageView categoryImageCateSingle, @NonNull TextView categoryNameCateSingle) {
    this.rootView = rootView;
    this.categoryImageCateSingle = categoryImageCateSingle;
    this.categoryNameCateSingle = categoryNameCateSingle;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CategorySingleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CategorySingleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.category_single, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CategorySingleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.categoryImage_CateSingle;
      ImageView categoryImageCateSingle = ViewBindings.findChildViewById(rootView, id);
      if (categoryImageCateSingle == null) {
        break missingId;
      }

      id = R.id.categoryName_CateSingle;
      TextView categoryNameCateSingle = ViewBindings.findChildViewById(rootView, id);
      if (categoryNameCateSingle == null) {
        break missingId;
      }

      return new CategorySingleBinding((CardView) rootView, categoryImageCateSingle,
          categoryNameCateSingle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

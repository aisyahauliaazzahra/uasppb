// Generated by view binder compiler. Do not edit!
package com.example.uasppbprojectkelompok.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.example.uasppbprojectkelompok.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ConstraintLayout MainLayoutHomeFrag;

  @NonNull
  public final ScrollView MainScrollViewHomeFrag;

  @NonNull
  public final LottieAnimationView animationView;

  @NonNull
  public final RecyclerView coverRecView;

  @NonNull
  public final LinearLayout newLayout;

  @NonNull
  public final RecyclerView newRecView;

  @NonNull
  public final TextView productGroupViewAll;

  @NonNull
  public final LinearLayout saleLayout;

  @NonNull
  public final TextView saleProductViewAll;

  @NonNull
  public final RecyclerView saleRecView;

  @NonNull
  public final ImageView visualSearchBtnHomePage;

  private FragmentHomeBinding(@NonNull ScrollView rootView,
      @NonNull ConstraintLayout MainLayoutHomeFrag, @NonNull ScrollView MainScrollViewHomeFrag,
      @NonNull LottieAnimationView animationView, @NonNull RecyclerView coverRecView,
      @NonNull LinearLayout newLayout, @NonNull RecyclerView newRecView,
      @NonNull TextView productGroupViewAll, @NonNull LinearLayout saleLayout,
      @NonNull TextView saleProductViewAll, @NonNull RecyclerView saleRecView,
      @NonNull ImageView visualSearchBtnHomePage) {
    this.rootView = rootView;
    this.MainLayoutHomeFrag = MainLayoutHomeFrag;
    this.MainScrollViewHomeFrag = MainScrollViewHomeFrag;
    this.animationView = animationView;
    this.coverRecView = coverRecView;
    this.newLayout = newLayout;
    this.newRecView = newRecView;
    this.productGroupViewAll = productGroupViewAll;
    this.saleLayout = saleLayout;
    this.saleProductViewAll = saleProductViewAll;
    this.saleRecView = saleRecView;
    this.visualSearchBtnHomePage = visualSearchBtnHomePage;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.MainLayout_homeFrag;
      ConstraintLayout MainLayoutHomeFrag = ViewBindings.findChildViewById(rootView, id);
      if (MainLayoutHomeFrag == null) {
        break missingId;
      }

      ScrollView MainScrollViewHomeFrag = (ScrollView) rootView;

      id = R.id.animationView;
      LottieAnimationView animationView = ViewBindings.findChildViewById(rootView, id);
      if (animationView == null) {
        break missingId;
      }

      id = R.id.coverRecView;
      RecyclerView coverRecView = ViewBindings.findChildViewById(rootView, id);
      if (coverRecView == null) {
        break missingId;
      }

      id = R.id.newLayout;
      LinearLayout newLayout = ViewBindings.findChildViewById(rootView, id);
      if (newLayout == null) {
        break missingId;
      }

      id = R.id.newRecView;
      RecyclerView newRecView = ViewBindings.findChildViewById(rootView, id);
      if (newRecView == null) {
        break missingId;
      }

      id = R.id.product_GroupViewAll;
      TextView productGroupViewAll = ViewBindings.findChildViewById(rootView, id);
      if (productGroupViewAll == null) {
        break missingId;
      }

      id = R.id.saleLayout;
      LinearLayout saleLayout = ViewBindings.findChildViewById(rootView, id);
      if (saleLayout == null) {
        break missingId;
      }

      id = R.id.saleProduct_ViewAll;
      TextView saleProductViewAll = ViewBindings.findChildViewById(rootView, id);
      if (saleProductViewAll == null) {
        break missingId;
      }

      id = R.id.saleRecView;
      RecyclerView saleRecView = ViewBindings.findChildViewById(rootView, id);
      if (saleRecView == null) {
        break missingId;
      }

      id = R.id.visualSearchBtn_homePage;
      ImageView visualSearchBtnHomePage = ViewBindings.findChildViewById(rootView, id);
      if (visualSearchBtnHomePage == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ScrollView) rootView, MainLayoutHomeFrag,
          MainScrollViewHomeFrag, animationView, coverRecView, newLayout, newRecView,
          productGroupViewAll, saleLayout, saleProductViewAll, saleRecView,
          visualSearchBtnHomePage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

// Generated by view binder compiler. Do not edit!
package com.DispositivosMoviles2023.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.DispositivosMoviles2023.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFirstBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout Cons1;

  @NonNull
  public final Flow flow;

  @NonNull
  public final Group group;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final ImageButton imageButton2;

  @NonNull
  public final ImageButton imageButton3;

  @NonNull
  public final ImageButton imageButton4;

  @NonNull
  public final ScrollView scrollView3;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  private FragmentFirstBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout Cons1,
      @NonNull Flow flow, @NonNull Group group, @NonNull Guideline guideline,
      @NonNull Guideline guideline2, @NonNull ImageButton imageButton,
      @NonNull ImageButton imageButton2, @NonNull ImageButton imageButton3,
      @NonNull ImageButton imageButton4, @NonNull ScrollView scrollView3,
      @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3,
      @NonNull TextView textView4) {
    this.rootView = rootView;
    this.Cons1 = Cons1;
    this.flow = flow;
    this.group = group;
    this.guideline = guideline;
    this.guideline2 = guideline2;
    this.imageButton = imageButton;
    this.imageButton2 = imageButton2;
    this.imageButton3 = imageButton3;
    this.imageButton4 = imageButton4;
    this.scrollView3 = scrollView3;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView3 = textView3;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_first, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout Cons1 = (ConstraintLayout) rootView;

      id = R.id.flow;
      Flow flow = ViewBindings.findChildViewById(rootView, id);
      if (flow == null) {
        break missingId;
      }

      id = R.id.group;
      Group group = ViewBindings.findChildViewById(rootView, id);
      if (group == null) {
        break missingId;
      }

      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.imageButton2;
      ImageButton imageButton2 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton2 == null) {
        break missingId;
      }

      id = R.id.imageButton3;
      ImageButton imageButton3 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton3 == null) {
        break missingId;
      }

      id = R.id.imageButton4;
      ImageButton imageButton4 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton4 == null) {
        break missingId;
      }

      id = R.id.scrollView3;
      ScrollView scrollView3 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView3 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new FragmentFirstBinding((ConstraintLayout) rootView, Cons1, flow, group, guideline,
          guideline2, imageButton, imageButton2, imageButton3, imageButton4, scrollView3, textView,
          textView2, textView3, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

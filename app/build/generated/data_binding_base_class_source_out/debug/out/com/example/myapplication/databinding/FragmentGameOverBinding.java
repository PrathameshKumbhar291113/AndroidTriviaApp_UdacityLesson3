// Generated by data binding compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.myapplication.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentGameOverBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout gameOverConstraintLayout;

  @NonNull
  public final ImageView gameOverFragment;

  @NonNull
  public final Button tryAgainButton;

  protected FragmentGameOverBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout gameOverConstraintLayout, ImageView gameOverFragment,
      Button tryAgainButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.gameOverConstraintLayout = gameOverConstraintLayout;
    this.gameOverFragment = gameOverFragment;
    this.tryAgainButton = tryAgainButton;
  }

  @NonNull
  public static FragmentGameOverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_game_over, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGameOverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentGameOverBinding>inflateInternal(inflater, R.layout.fragment_game_over, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentGameOverBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_game_over, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGameOverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentGameOverBinding>inflateInternal(inflater, R.layout.fragment_game_over, null, false, component);
  }

  public static FragmentGameOverBinding bind(@NonNull View view) {
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
  public static FragmentGameOverBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentGameOverBinding)bind(component, view, R.layout.fragment_game_over);
  }
}
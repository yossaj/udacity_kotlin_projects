package com.example.android.devbyteviewer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.devbyteviewer.domain.Video;
import com.example.android.devbyteviewer.ui.VideoClick;

public abstract class DevbyteItemBinding extends ViewDataBinding {
  @NonNull
  public final View clickableOverlay;

  @NonNull
  public final TextView description;

  @NonNull
  public final Guideline leftWell;

  @NonNull
  public final ImageView playIcon;

  @NonNull
  public final Guideline rightWell;

  @NonNull
  public final TextView title;

  @NonNull
  public final ImageView videoThumbnail;

  @Bindable
  protected Video mVideo;

  @Bindable
  protected VideoClick mVideoCallback;

  protected DevbyteItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View clickableOverlay, TextView description, Guideline leftWell,
      ImageView playIcon, Guideline rightWell, TextView title, ImageView videoThumbnail) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clickableOverlay = clickableOverlay;
    this.description = description;
    this.leftWell = leftWell;
    this.playIcon = playIcon;
    this.rightWell = rightWell;
    this.title = title;
    this.videoThumbnail = videoThumbnail;
  }

  public abstract void setVideo(@Nullable Video video);

  @Nullable
  public Video getVideo() {
    return mVideo;
  }

  public abstract void setVideoCallback(@Nullable VideoClick videoCallback);

  @Nullable
  public VideoClick getVideoCallback() {
    return mVideoCallback;
  }

  @NonNull
  public static DevbyteItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DevbyteItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DevbyteItemBinding>inflate(inflater, com.example.android.devbyteviewer.R.layout.devbyte_item, root, attachToRoot, component);
  }

  @NonNull
  public static DevbyteItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DevbyteItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DevbyteItemBinding>inflate(inflater, com.example.android.devbyteviewer.R.layout.devbyte_item, null, false, component);
  }

  public static DevbyteItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static DevbyteItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (DevbyteItemBinding)bind(component, view, com.example.android.devbyteviewer.R.layout.devbyte_item);
  }
}

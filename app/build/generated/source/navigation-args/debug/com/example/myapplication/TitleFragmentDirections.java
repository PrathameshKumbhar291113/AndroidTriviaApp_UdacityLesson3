package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class TitleFragmentDirections {
  private TitleFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionTitleFragmentToGameFragment() {
    return new ActionOnlyNavDirections(R.id.action_titleFragment_to_gameFragment);
  }
}

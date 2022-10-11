package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class GameWonFragmentDirections {
  private GameWonFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGameWonFragmentToGameFragment() {
    return new ActionOnlyNavDirections(R.id.action_gameWonFragment_to_gameFragment);
  }
}

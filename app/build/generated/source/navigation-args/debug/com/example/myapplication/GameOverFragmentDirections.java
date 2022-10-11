package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class GameOverFragmentDirections {
  private GameOverFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGameOverFragment2ToGameFragment() {
    return new ActionOnlyNavDirections(R.id.action_gameOverFragment2_to_gameFragment);
  }
}

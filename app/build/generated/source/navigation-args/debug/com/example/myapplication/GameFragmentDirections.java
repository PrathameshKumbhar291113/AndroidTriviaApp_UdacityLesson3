package com.example.myapplication;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GameFragmentDirections {
  private GameFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGameFragmentToGameOverFragment2() {
    return new ActionOnlyNavDirections(R.id.action_gameFragment_to_gameOverFragment2);
  }

  @NonNull
  public static ActionGameFragmentToGameWonFragment actionGameFragmentToGameWonFragment(
      int numQuestions, int numCorrect) {
    return new ActionGameFragmentToGameWonFragment(numQuestions, numCorrect);
  }

  public static class ActionGameFragmentToGameWonFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionGameFragmentToGameWonFragment(int numQuestions, int numCorrect) {
      this.arguments.put("numQuestions", numQuestions);
      this.arguments.put("numCorrect", numCorrect);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionGameFragmentToGameWonFragment setNumQuestions(int numQuestions) {
      this.arguments.put("numQuestions", numQuestions);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionGameFragmentToGameWonFragment setNumCorrect(int numCorrect) {
      this.arguments.put("numCorrect", numCorrect);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("numQuestions")) {
        int numQuestions = (int) arguments.get("numQuestions");
        __result.putInt("numQuestions", numQuestions);
      }
      if (arguments.containsKey("numCorrect")) {
        int numCorrect = (int) arguments.get("numCorrect");
        __result.putInt("numCorrect", numCorrect);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_gameFragment_to_gameWonFragment;
    }

    @SuppressWarnings("unchecked")
    public int getNumQuestions() {
      return (int) arguments.get("numQuestions");
    }

    @SuppressWarnings("unchecked")
    public int getNumCorrect() {
      return (int) arguments.get("numCorrect");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGameFragmentToGameWonFragment that = (ActionGameFragmentToGameWonFragment) object;
      if (arguments.containsKey("numQuestions") != that.arguments.containsKey("numQuestions")) {
        return false;
      }
      if (getNumQuestions() != that.getNumQuestions()) {
        return false;
      }
      if (arguments.containsKey("numCorrect") != that.arguments.containsKey("numCorrect")) {
        return false;
      }
      if (getNumCorrect() != that.getNumCorrect()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getNumQuestions();
      result = 31 * result + getNumCorrect();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGameFragmentToGameWonFragment(actionId=" + getActionId() + "){"
          + "numQuestions=" + getNumQuestions()
          + ", numCorrect=" + getNumCorrect()
          + "}";
    }
  }
}

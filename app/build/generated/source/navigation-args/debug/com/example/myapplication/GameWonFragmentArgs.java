package com.example.myapplication;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GameWonFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private GameWonFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private GameWonFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static GameWonFragmentArgs fromBundle(@NonNull Bundle bundle) {
    GameWonFragmentArgs __result = new GameWonFragmentArgs();
    bundle.setClassLoader(GameWonFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("numQuestions")) {
      int numQuestions;
      numQuestions = bundle.getInt("numQuestions");
      __result.arguments.put("numQuestions", numQuestions);
    } else {
      throw new IllegalArgumentException("Required argument \"numQuestions\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("numCorrect")) {
      int numCorrect;
      numCorrect = bundle.getInt("numCorrect");
      __result.arguments.put("numCorrect", numCorrect);
    } else {
      throw new IllegalArgumentException("Required argument \"numCorrect\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static GameWonFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    GameWonFragmentArgs __result = new GameWonFragmentArgs();
    if (savedStateHandle.contains("numQuestions")) {
      int numQuestions;
      numQuestions = savedStateHandle.get("numQuestions");
      __result.arguments.put("numQuestions", numQuestions);
    } else {
      throw new IllegalArgumentException("Required argument \"numQuestions\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("numCorrect")) {
      int numCorrect;
      numCorrect = savedStateHandle.get("numCorrect");
      __result.arguments.put("numCorrect", numCorrect);
    } else {
      throw new IllegalArgumentException("Required argument \"numCorrect\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getNumQuestions() {
    return (int) arguments.get("numQuestions");
  }

  @SuppressWarnings("unchecked")
  public int getNumCorrect() {
    return (int) arguments.get("numCorrect");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("numQuestions")) {
      int numQuestions = (int) arguments.get("numQuestions");
      __result.set("numQuestions", numQuestions);
    }
    if (arguments.containsKey("numCorrect")) {
      int numCorrect = (int) arguments.get("numCorrect");
      __result.set("numCorrect", numCorrect);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    GameWonFragmentArgs that = (GameWonFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getNumQuestions();
    result = 31 * result + getNumCorrect();
    return result;
  }

  @Override
  public String toString() {
    return "GameWonFragmentArgs{"
        + "numQuestions=" + getNumQuestions()
        + ", numCorrect=" + getNumCorrect()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull GameWonFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int numQuestions, int numCorrect) {
      this.arguments.put("numQuestions", numQuestions);
      this.arguments.put("numCorrect", numCorrect);
    }

    @NonNull
    public GameWonFragmentArgs build() {
      GameWonFragmentArgs result = new GameWonFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setNumQuestions(int numQuestions) {
      this.arguments.put("numQuestions", numQuestions);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setNumCorrect(int numCorrect) {
      this.arguments.put("numCorrect", numCorrect);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getNumQuestions() {
      return (int) arguments.get("numQuestions");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getNumCorrect() {
      return (int) arguments.get("numCorrect");
    }
  }
}

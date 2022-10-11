package com.example.myapplication.databinding;
import com.example.myapplication.R;
import com.example.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentGameBindingImpl extends FragmentGameBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameLayout, 6);
        sViewsWithIds.put(R.id.questionImage, 7);
        sViewsWithIds.put(R.id.questionRadioGroup, 8);
        sViewsWithIds.put(R.id.submitButton, 9);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentGameBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentGameBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RadioButton) bindings[2]
            , (android.widget.RadioButton) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.RadioGroup) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.Button) bindings[9]
            , (android.widget.RadioButton) bindings[4]
            );
        this.firstAnswerRadioButton.setTag(null);
        this.fourthAnswerRadioButton.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.questionText.setTag(null);
        this.secondAnswerRadioButton.setTag(null);
        this.thirdAnswerRadioButton.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.game == variableId) {
            setGame((com.example.myapplication.GameFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGame(@Nullable com.example.myapplication.GameFragment Game) {
        this.mGame = Game;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.game);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String gameAnswers3 = null;
        java.lang.String gameAnswers0 = null;
        java.lang.String gameAnswers1 = null;
        com.example.myapplication.GameFragment.Question gameCurrentQuestion = null;
        java.lang.String gameAnswers2 = null;
        java.lang.String gameCurrentQuestionText = null;
        java.util.List<java.lang.String> gameAnswers = null;
        com.example.myapplication.GameFragment game = mGame;

        if ((dirtyFlags & 0x3L) != 0) {



                if (game != null) {
                    // read game.currentQuestion
                    gameCurrentQuestion = game.getCurrentQuestion();
                    // read game.answers
                    gameAnswers = game.getAnswers();
                }


                if (gameCurrentQuestion != null) {
                    // read game.currentQuestion.text
                    gameCurrentQuestionText = gameCurrentQuestion.getText();
                }
                if (gameAnswers != null) {
                    // read game.answers[3]
                    gameAnswers3 = getFromList(gameAnswers, 3);
                    // read game.answers[0]
                    gameAnswers0 = getFromList(gameAnswers, 0);
                    // read game.answers[1]
                    gameAnswers1 = getFromList(gameAnswers, 1);
                    // read game.answers[2]
                    gameAnswers2 = getFromList(gameAnswers, 2);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstAnswerRadioButton, gameAnswers0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fourthAnswerRadioButton, gameAnswers3);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.questionText, gameCurrentQuestionText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondAnswerRadioButton, gameAnswers1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.thirdAnswerRadioButton, gameAnswers2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): game
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
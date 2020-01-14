package com.example.barffood;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class FragmentBalancingDietAge extends Fragment {
    private TextView ageTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        setRetainInstance(true);

        View view = inflater.inflate(R.layout.layout_diet_balancing, container, false);

        this.ageTextView = view.findViewById(R.id.dietBalancingAgeTextView);
        SeekBar ageSeekBar = view.findViewById(R.id.dietBalancingAgeSeekBar);
        int currentProgress = SaveLoadValues.loadSettings(getContext(),"age");
        ageSeekBar.setProgress(currentProgress);
        checkProgress(currentProgress);
        ageSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                checkProgress(progress);
                SaveLoadValues.saveSettings(getContext(),"age", progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
    }



    void checkProgress(int progress){
        RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) ageTextView.getLayoutParams();
        switch (progress){
            case 0:
                lp.addRule(RelativeLayout.ALIGN_PARENT_START, RelativeLayout.TRUE);
                lp.addRule(RelativeLayout.ALIGN_PARENT_END, 0);
                lp.addRule(RelativeLayout.CENTER_HORIZONTAL, 0);
                ageTextView.setText(R.string.dietBalancingSzczeniak6miesiecy);
                break;
            case 1:
                lp.addRule(RelativeLayout.ALIGN_PARENT_START, 0);
                lp.addRule(RelativeLayout.ALIGN_PARENT_END, 0);
                lp.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
                ageTextView.setText(R.string.dietBalancingSzczeniak6to12);
                break;
            case 2:
                lp.addRule(RelativeLayout.ALIGN_PARENT_START, 0);
                lp.addRule(RelativeLayout.ALIGN_PARENT_END, RelativeLayout.TRUE);
                lp.addRule(RelativeLayout.CENTER_HORIZONTAL, 0);
                ageTextView.setText(R.string.dietBalancingDoroslyPies);
                break;
        }
        ageTextView.setLayoutParams(lp);
    }
}

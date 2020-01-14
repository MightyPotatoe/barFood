package com.example.barffood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class DietBalancingActivity extends AppCompatActivity {

    private TextView ageTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_balancing);

        this.ageTextView = findViewById(R.id.dietBalancingAgeTextView);
        SeekBar ageSeekBar = findViewById(R.id.dietBalancingAgeSeekBar);

        ageSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) ageTextView.getLayoutParams();
                switch (progress){
                    case 0:
                        lp.addRule(RelativeLayout.ALIGN_PARENT_START, RelativeLayout.TRUE);
                        lp.addRule(RelativeLayout.ALIGN_PARENT_END, 0);
                        lp.addRule(RelativeLayout.CENTER_HORIZONTAL, 0);
                        ageTextView.setText(R.string.dietBalancingSzczeniak6miesiecy);
                        ageTextView.setLayoutParams(lp);
                        break;
                    case 1:
                        lp.addRule(RelativeLayout.ALIGN_PARENT_START, 0);
                        lp.addRule(RelativeLayout.ALIGN_PARENT_END, 0);
                        lp.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
                        ageTextView.setText(R.string.dietBalancingSzczeniak6to12);
                        ageTextView.setLayoutParams(lp);
                        break;
                    case 2:
                        lp.addRule(RelativeLayout.ALIGN_PARENT_START, 0);
                        lp.addRule(RelativeLayout.ALIGN_PARENT_END, RelativeLayout.TRUE);
                        lp.addRule(RelativeLayout.CENTER_HORIZONTAL, 0);
                        ageTextView.setText(R.string.dietBalancingDoroslyPies);
                        ageTextView.setLayoutParams(lp);
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}

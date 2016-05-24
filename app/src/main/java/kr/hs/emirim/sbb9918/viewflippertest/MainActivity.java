package kr.hs.emirim.sbb9918.viewflippertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper viewFlip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but_pre = (Button)findViewById(R.id.but_prev);
        Button but_next = (Button)findViewById(R.id.but_next);
        viewFlip = (ViewFlipper)findViewById(R.id.view_flip);
        but_pre.setOnClickListener(this);
        but_next.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.but_prev :
                viewFlip.showPrevious();
                break;
            case R.id.but_next:
                viewFlip.showNext();
                break;
        }
    }
}

package sqz.mobi.bottomsheetdemo;

import android.content.Intent;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private View mBottomLayout;
    private BottomSheetBehavior mBottomSheetBehavior;
    private Button mParallax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mParallax = findViewById(R.id.mParallax);
        mParallax.setOnClickListener(this);
        //2.把这个底部菜单和一个BottomSheetBehavior关联起来
//        mBottomSheetBehavior = BottomSheetBehavior.from(mBottomLayout);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mParallax:
                startActivity(new Intent(this,ParallaxActivity.class));
        }
    }
}

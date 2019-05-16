package com.demo.openglesdemos.shape;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.demo.openglesdemos.base.BaseFragmentActivity;
import com.demo.openglesdemos.R;

public class ShapeActivity extends BaseFragmentActivity implements View.OnClickListener {

    Button btnColor, btnTriangle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);

        btnColor = findViewById(R.id.btnColor);
        btnColor.setOnClickListener(this);

        btnTriangle = findViewById(R.id.btnTriganle);
        btnTriangle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnColor:
                transformFragment(new SimpleFragment());
                break;
            case R.id.btnTriganle:
                transformFragment(new TriangleFragment());
                break;
        }
    }
}

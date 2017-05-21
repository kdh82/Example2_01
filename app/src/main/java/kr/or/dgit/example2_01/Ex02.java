package kr.or.dgit.example2_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Ex02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex02);

        setTitle(getIntent().getStringExtra("title"));
        findViewById(R.id.tv_marqee).setSelected(true);
    }
}

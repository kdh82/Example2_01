package kr.or.dgit.example2_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn01 = (Button) findViewById(R.id.btnMain01);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ex01.class);
                startActivity(intent);
            }
        });
    }

    public void mOnClicked(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.btnMain02:
                intent = new Intent(this, Ex02.class);
                intent.putExtra("title", "시목록 두번째 예제");
                break;
            case R.id.btnMain03:
                intent = new Intent(this, Ex03.class);
                intent.putExtra("title", "시목록 세번째 예제");
                break;
        }
        startActivity(intent);
    }
}

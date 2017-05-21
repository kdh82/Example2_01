package kr.or.dgit.example2_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Ex03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex03);

        setTitle(getIntent().getStringExtra("title"));

        findViewById(R.id.tv_marqee).setSelected(true);
    }
    public void displayPoem(View view){
        int id = view.getId();
        LinearLayout layout  = (LinearLayout) view.findViewById(id);
        String tag = (String) layout.getTag();

        Intent intent = new Intent(this, Poem.class);
        intent.putExtra("it_tag", tag);
        startActivity(intent);
    }
}

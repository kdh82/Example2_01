package kr.or.dgit.example2_01;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Poem extends AppCompatActivity {
    LinearLayout linpo;
    TextView tv_title;
    TextView tv_author;
    TextView tv_body;
    Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);

        linpo = (LinearLayout) findViewById(R.id.poem);
        tv_title = (TextView) findViewById(R.id.title);
        tv_author = (TextView) findViewById(R.id.author);
        tv_body = (TextView) findViewById(R.id.sub_body);

        res = getResources();

        Intent it = getIntent();
        String tag = it.getStringExtra("it_tag");

        setPoem(tag);
    }

    private void setPoem(String tag) {
        int id_title = res.getIdentifier("title" + tag, "string", getPackageName());
        String title = res.getString(id_title);
        tv_title.setText(title);

        int id_author = res.getIdentifier("author" + tag, "string", getPackageName());
        String author = res.getString(id_author);
        tv_author.setText(author);

        int id_sub_body = res.getIdentifier("sub_body" + tag, "string", getPackageName());
        String sub_body = res.getString(id_sub_body);
        tv_body.setText(sub_body);

        int id_background = res.getIdentifier("background" + tag, "string", getPackageName());
        String background = res.getString(id_background);
        int id_img = res.getIdentifier(background, "drawable", getPackageName());
        linpo.setBackgroundResource(id_img);
    }
}

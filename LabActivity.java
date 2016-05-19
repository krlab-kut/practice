package labmon.app;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LabActivity extends AppCompatActivity {

    private TextView textView, textView2, textView3;
    private ImageView imageView;
    private Lab lab;
    private Lab.Labs labs;
    int data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lab = new Lab();
        labs = lab.new Labs();

        Intent intent = getIntent();
        data = intent.getIntExtra("LabId", -1);

        textView = (TextView)findViewById(R.id.textView2);
        textView2 = (TextView)findViewById(R.id.textView3);
        textView3 = (TextView)findViewById(R.id.textView6);
        imageView = (ImageView)findViewById(R.id.imageView);

        String str = lab.title(data);
        String str2 = labs.anothertitle(data);
        String str3 = labs.dececription(data);

        textView.setText(str);
        textView2.setText(str2);
        textView3.setText(str3);

        TypedArray typedArray = getResources().obtainTypedArray(R.array.rgazou);
        Drawable drawable = typedArray.getDrawable(data);
        imageView.setImageDrawable(drawable);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        Intent intent = getIntent();
        data = intent.getIntExtra("LabId", -1);

        getMenuInflater().inflate(R.menu.menu_main, menu);
        getSupportActionBar().setTitle(lab.title(data));

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

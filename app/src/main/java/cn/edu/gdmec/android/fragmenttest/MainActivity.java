package cn.edu.gdmec.android.fragmenttest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Button button = (Button) findViewById ( R.id.button );
        button.setOnClickListener ( this );
    }
    @Override
    public void onClick(View v){
        switch (v.getId ()){
            case R.id.button:
                AnotherReightFragment fragment = new AnotherReightFragment ();
                FragmentManager fragmentManager = getFragmentManager ();
                FragmentTransaction transaction = fragmentManager.beginTransaction ();
                transaction.replace ( R.id.right_layout, fragment );
                transaction.addToBackStack ( null );
                transaction.commit ();
                break;
            default:
                break;
        }
    }
}

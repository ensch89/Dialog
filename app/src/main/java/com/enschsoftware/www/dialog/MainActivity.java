package com.enschsoftware.www.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton= (Button) findViewById(R.id.button1);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        showDialog(0);
    }


    @Override
    protected Dialog onCreateDialog(int id){

        Dialog dialogo=null;
        if(id==0){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder=builder.setIcon(R.drawable.abc_ic_menu_moreoverflow_mtrl_alpha);
            builder=builder.setTitle("Holis");
            dialogo=builder.create();
        }
        return dialogo;
    }
}
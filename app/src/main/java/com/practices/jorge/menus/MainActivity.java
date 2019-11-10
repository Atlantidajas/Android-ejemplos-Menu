package com.practices.jorge.menus;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String message;
        int id = item.getItemId();
        Toast aviso;

        switch (item.getItemId()) {

            case R.id.menuMainOption1:
                message = "Opcion 1 pulsada!";
                aviso = Toast.makeText(getApplicationContext(), message,
                        Toast.LENGTH_SHORT);
                aviso.show();
                return true;

            case R.id.menuMainOption2:

                message = "Opcion 2 pulsada!";
                aviso = Toast.makeText(getApplicationContext(), message,
                        Toast.LENGTH_SHORT);
                aviso.show();
                return true;

            case R.id.menuMainOption3:

                message = "Opcion 3 pulsada!";
                aviso = Toast.makeText(getApplicationContext(), message,
                        Toast.LENGTH_SHORT);
                aviso.show();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

}

package com.androird.firststeps3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TabHost;

public class Gibbet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gibbet);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab singleplayer
        TabHost.TabSpec spec = host.newTabSpec("Tab One");
        spec.setContent(R.id.iniciante);
        spec.setIndicator("iniciante");
        host.addTab(spec);

        //Tab multiplayer
        spec = host.newTabSpec("Tab Two");
        spec.setContent(R.id.avancado);
        spec.setIndicator("avançado");
        host.addTab(spec);
    }

    public void playGibbet(View view) {
        Intent intentGibbetPlay = new Intent(this, GibbetPlay.class);

        if (intentGibbetPlay.resolveActivity(getPackageManager()) != null) {
            startActivity(intentGibbetPlay);
        }
    }
}

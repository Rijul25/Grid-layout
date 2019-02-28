package com.example.dell.gridlayout;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int resourceId;
    MediaPlayer mplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    final public void buttonclicked (View view){
        int id=view.getId();
        String ourid="";
        if (mplayer!=null){
            mplayer.stop();
        }
        ourid=view.getResources().getResourceEntryName(id);
        Log.i("button tapped" , ourid);
        resourceId=getResources().getIdentifier(ourid,"raw","com.example.dell.gridlayout");
        mplayer= MediaPlayer.create(this,resourceId);
        mplayer.start();
    }
}

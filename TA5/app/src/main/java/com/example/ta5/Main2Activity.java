package com.example.ta5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        VideoView mVideoView =(VideoView)findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.jeje;
        Uri uri = Uri.parse(videoPath);
        mVideoView.setVideoURI(uri);
        MediaController mediaC = new MediaController(this);
        mVideoView.setMediaController(mediaC);
        mediaC.setAnchorView(mVideoView);
        mVideoView.start();

    }

    public void volver(View view) {
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
    }
}

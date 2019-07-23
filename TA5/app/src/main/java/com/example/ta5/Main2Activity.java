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
        //String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.jeje;
        String videoPath = "rtsp://r6---sn-q4fl6nle.googlevideo.com/Cj0LENy73wIaNAlVLiTknYIT-hMYDSANFC18nTddMOCoAUIASARgtN7DxJSlrNFcigELMW1UM2lhTnE3NlkM/D3DE35780F4BBB47C3094806AB566E747686D818.E5774AD80B220D2A7386CCFCF5E4D452027E4468/yt8/1/video.3gp";
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

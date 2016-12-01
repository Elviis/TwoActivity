package butterycontent.twoactivity;

import android.content.Intent;
import android.graphics.Path;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {

    Button playVideoBtn, back;
    VideoView videoView;
    VideoView videoViewPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        playVideoBtn = (Button) findViewById(R.id.btnPlay);
        back = (Button) findViewById(R.id.btnBack);

//        videoViewPlay = (VideoView) findViewById(R.id.videoViewArea);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }


    public void playVideo(View view) {
        videoView = (VideoView) findViewById(R.id.videoViewArea);
       // videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName()
         //       + "/" + R.raw.bunny));
     //   videoView.setVideoPath("android.resource://" + getPackageName()
       //         + "/" + R.raw.bunny);
        //videoView.setVideoPath("/sdcard/bunnyVid.mp4");
        String videoSource = "http://ak9.picdn.net/shutterstock/videos/3930539/preview/stock-footage--s-service-stations-and-gas-stations-are-profiled-as-a-modern-convenience-for-the-s-driver.mp4";
        videoView.setVideoURI(Uri.parse(videoSource));
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.start();

    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }


}

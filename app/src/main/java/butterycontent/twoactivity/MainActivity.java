package butterycontent.twoactivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button audio1, audio2, startVideoActivity;
   MediaPlayer mediaPlayer, mediaPlayer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        audio1 = (Button) findViewById(R.id.btnAudio1);
        audio2 = (Button) findViewById(R.id.btnAudio2);
        startVideoActivity = (Button) findViewById(R.id.btnVideoActivity);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.my);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.audio2);

    }

    public void playAudio1(View view){
        mediaPlayer.start();
    }

    public void playAudio2(View view){
            mediaPlayer2.start();
    }

    public void startVideoActivity(View view){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);

        startActivity(intent);

    }


}

package mas.rocketgame;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import be.tarsos.dsp.AudioDispatcher;
import be.tarsos.dsp.AudioEvent;
import be.tarsos.dsp.AudioProcessor;
import be.tarsos.dsp.io.android.AudioDispatcherFactory;
import android.widget.Chronometer;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
private boolean buttonPressed = false;
private float powerAccum = 0;

private Button startButton;
    Chronometer mChronometer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.RECORD_AUDIO}, 1);
        }
        setTheme(android.R.style.Theme_Material_NoActionBar);
        setContentView(R.layout.activity_main);

        mChronometer = (Chronometer) findViewById(R.id.chronometer);

        mChronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener(){
            @Override
            public void onChronometerTick(Chronometer cArg) {
                long time = SystemClock.elapsedRealtime() - cArg.getBase();
                int h   = (int)(time /3600000);
                int m = (int)(time - h*3600000)/60000;
                int s= (int)(time - h*3600000- m*60000)/1000 ;
                String hh = h < 10 ? "0"+h: h+"";
                String mm = m < 10 ? "0"+m: m+"";
                String ss = s < 10 ? "0"+s: s+"";
                long elapsedMillis = SystemClock.elapsedRealtime() - cArg.getBase();
                String ms;

                ms = String.valueOf(elapsedMillis);
                cArg.setText(mm+":"+ss+":"+ms);
            }
        });



        startButton = (Button) findViewById(R.id.start);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (buttonPressed) {
                    Log.v("total power", "" + powerAccum);
                    if (powerAccum > 5000) {
                        // make rocket go powerAccum * factor
                    }
                    buttonPressed = false;
                    mChronometer.stop();
                    startButton.setText("Start");
                } else {
                    powerAccum = 0;
                    buttonPressed = true;
                    mChronometer.setBase(SystemClock.elapsedRealtime());
                    mChronometer.start();
                    startButton.setText("Stop");
                }
            }
        });

        Button startRocket = (Button) findViewById(R.id.timeToFly);
        startRocket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RocketActivity.class);
                startActivity(intent);
            }
        });


        Button resetButton = (Button) findViewById(R.id.restartButton);
        resetButton.setOnClickListener(mResetListener);


        AudioDispatcher dispatcher = AudioDispatcherFactory.fromDefaultMicrophone(22050, 1024, 0);

        final AudioProcessor powerProcessor = new AudioProcessor() {
            @Override
            public boolean process(AudioEvent audioEvent) {

                float[] audioFlowBuffer = audioEvent.getFloatBuffer();

                float total = 0;
                for (int i = 0; i < audioFlowBuffer.length; i++)
                {
                    total += audioFlowBuffer[i] * audioFlowBuffer[i];
                }
                // Log.v("power:", "" + total);
                powerAccum += total;
                return true;
            }

            @Override
            public void processingFinished() {

            }
        };
        dispatcher.addAudioProcessor(powerProcessor);
        new Thread(dispatcher, "Audio Dispatcher").start();

    }


    View.OnClickListener mResetListener = new View.OnClickListener() {
        public void onClick(View v) {
            mChronometer.setBase(SystemClock.elapsedRealtime());
        }
    };





}

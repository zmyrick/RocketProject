package mas.rocketgame;

import android.Manifest;
import android.content.pm.PackageManager;
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

public class MainActivity extends AppCompatActivity {
private boolean buttonPressed = false;
private float powerAccum = 0;

private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.RECORD_AUDIO}, 1);
        }
        setTheme(android.R.style.Theme_Holo);
        setContentView(R.layout.activity_main);
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
                    startButton.setText("Start");
                } else {
                    powerAccum = 0;
                    buttonPressed = true;
                    startButton.setText("Stop");
                }
            }
        });
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


}

package mas.rocketgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class DashboardActivity extends AppCompatActivity {


    //FloatingActionButton mainFab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Material_NoActionBar);
        setContentView(R.layout.activity_dashboard);


        final EditText nameInput = (EditText) findViewById(R.id.etName);
        final TextView nameDisplay = (TextView) findViewById(R.id.usernameLabel);
//        String finalName = nameInput.getText().toString();
//        nameDisplay.setText(finalName);

        //initialize Measurement button
        Button takeMeasurementButton = (Button) findViewById(R.id.measurement_button);
        takeMeasurementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //initialize Earn Coin button
        Button earnCoinsButton = (Button) findViewById(R.id.earn_coins_button);
        earnCoinsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, CoinsActivity.class);
                startActivity(intent);
            }
        });

        //initialize View Results button
        Button viewResultsButton = (Button) findViewById(R.id.view_results_button);
        viewResultsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, ResultsActivity.class);
                startActivity(intent);
            }
        });

        //initialize Customize Rocket button
        Button customizeRocketButton = (Button) findViewById(R.id.customize_rocket_button);
        customizeRocketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, CustomizeActivity.class);
                startActivity(intent);
            }
        });


    }
}

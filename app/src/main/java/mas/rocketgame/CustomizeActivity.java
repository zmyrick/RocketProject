package mas.rocketgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomizeActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView rocketImage = null;

    Button default_rocket_button = null, classic_rocket_button = null, batmobile_button = null,
            cherry_blossom_button = null, cotton_candy_button = null, endless_river_button = null,
            grapefruit_sunset_button = null, green_peppermint_button = null, iced_tea_button = null,
            la_lakers_button = null, mango_pulp_button = null, orange_fun_button = null, purple_paradise_button = null,
            ramblin_wreck_button = null, relaxing_red_button = null, summer_sunset_button = null,
            tropical_rainforest_button = null, youtube_red_button = null, charcoal_button = null,
            banana_split_button = null, purchase_button = null;

    int coinsNumber = 0;
    int costNumber = 0;

    TextView coinsAvailable = null;
    TextView coinsCost = null;

    String numString = "30";
    String numString2 = "0";
    String costPhrase = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize);

        //set default image
        rocketImage = (ImageView)this.findViewById(R.id.rocketDisplay);

        //initialize buttons
        default_rocket_button = ((Button)this.findViewById(R.id.defaultRocket));
        classic_rocket_button = ((Button)this.findViewById(R.id.classicRocket));
        batmobile_button = ((Button)this.findViewById(R.id.batMobile));
        cherry_blossom_button = ((Button)this.findViewById(R.id.cherryBlossom));
        cotton_candy_button = ((Button)this.findViewById(R.id.cottonCandy));
        endless_river_button = ((Button)this.findViewById(R.id.endlessRiver));
        grapefruit_sunset_button = ((Button)this.findViewById(R.id.grapefruitSunset));
        green_peppermint_button = ((Button)this.findViewById(R.id.greenPeppermint));
        iced_tea_button = ((Button)this.findViewById(R.id.icedTea));
        la_lakers_button = ((Button)this.findViewById(R.id.laLakers));
        mango_pulp_button = ((Button)this.findViewById(R.id.mangoPulp));
        orange_fun_button = ((Button)this.findViewById(R.id.orangeFun));
        purple_paradise_button = ((Button)this.findViewById(R.id.purpleParadise));
        ramblin_wreck_button = ((Button)this.findViewById(R.id.ramblinWreck));
        relaxing_red_button = ((Button)this.findViewById(R.id.relaxingRed));
        summer_sunset_button = ((Button)this.findViewById(R.id.summerSunset));
        tropical_rainforest_button = ((Button)this.findViewById(R.id.tropicalRainforest));
        youtube_red_button = ((Button)this.findViewById(R.id.youtubeRed));
        charcoal_button = ((Button)this.findViewById(R.id.charcoal));
        banana_split_button = ((Button)this.findViewById(R.id.bananaSplit));
        purchase_button = ((Button)this.findViewById(R.id.purchaseButton));

        //initialize coin amounts
        coinsAvailable = ((TextView)this.findViewById(R.id.coinAmount));
        coinsCost = ((TextView)this.findViewById(R.id.costAmount));




         initControl();
}

    private void initControl() {

        default_rocket_button.setOnClickListener(this);
        classic_rocket_button.setOnClickListener(this);
        batmobile_button.setOnClickListener(this);
        cherry_blossom_button.setOnClickListener(this);
        cotton_candy_button.setOnClickListener(this);
        endless_river_button.setOnClickListener(this);
        grapefruit_sunset_button.setOnClickListener(this);
        green_peppermint_button.setOnClickListener(this);
        iced_tea_button.setOnClickListener(this);
        la_lakers_button.setOnClickListener(this);
        mango_pulp_button.setOnClickListener(this);
        orange_fun_button.setOnClickListener(this);
        purple_paradise_button.setOnClickListener(this);
        ramblin_wreck_button.setOnClickListener(this);
        relaxing_red_button.setOnClickListener(this);
        summer_sunset_button.setOnClickListener(this);
        tropical_rainforest_button.setOnClickListener(this);
        youtube_red_button.setOnClickListener(this);
        charcoal_button.setOnClickListener(this);
        banana_split_button.setOnClickListener(this);
        purchase_button.setOnClickListener(this);


        coinsAvailable.setText(numString);
        coinsCost.setText(numString2);

        coinsNumber = Integer.parseInt(coinsAvailable.getText().toString());
        costNumber = Integer.parseInt(coinsCost.getText().toString());
    }

    public void onClick(View v) {

        switch(v.getId()) {

            case R.id.defaultRocket:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.default_rocket));
                coinsCost.setText(costPhrase);
                break;

            case R.id.classicRocket:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.classic_rocket));
                costNumber = 15;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.batMobile:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.bat_mobile));
                costNumber = 20;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.cherryBlossom:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.cherry_blossom));
                costNumber = 25;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.cottonCandy:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.cotton_candy));
                costNumber = 30;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.endlessRiver:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.endless_river));
                costNumber = 35;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.grapefruitSunset:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.grapefruit_sunset));
                costNumber = 40;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.greenPeppermint:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.green_peppermint));
                costNumber = 45;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.icedTea:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.iced_tea));
                costNumber = 50;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.laLakers:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.losangeles_lakers));
                costNumber = 55;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.mangoPulp:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.mango_pulp));
                costNumber = 60;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.orangeFun:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.orange_fun));
                costNumber = 65;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.purpleParadise:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.purple_paradise));
                costNumber = 70;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.ramblinWreck:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.ramblin_wreck));
                costNumber = 75;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.relaxingRed:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.relaxing_red));
                costNumber = 80;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.summerSunset:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.summer_sunset));
                costNumber = 85;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.tropicalRainforest:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.tropical_rainforest));
                costNumber = 90;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.youtubeRed:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.youtube_red));
                costNumber = 95;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.charcoal:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.charcoal));
                costNumber = 95;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.bananaSplit:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.banana_split));
                costNumber = 100;
                coinsCost.setText(String.valueOf(costNumber));
                break;

            case R.id.purchaseButton:
                if(costNumber > coinsNumber)
                {
                    Toast temp = Toast.makeText(CustomizeActivity.this, "Not enough coins available!", Toast.LENGTH_SHORT);
                    temp.show();
                }
                else{
                    final AlertDialog.Builder alert = new AlertDialog.Builder(this);

                    alert.setTitle("Are you sure you want to buy this rocket?").setPositiveButton("Yes",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int whichButton) {
                                    coinsNumber = coinsNumber - costNumber;
                                    numString = String.valueOf(coinsNumber);
                                    coinsAvailable.setText(numString);

                                    Toast temp = Toast.makeText(CustomizeActivity.this, "Rocket purchased!", Toast.LENGTH_SHORT);
                                    temp.show();
                                    dialog.cancel();

                                }
                            }).setNegativeButton("No",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int whichButton) {
                                    return;
                                }
                            });
                    alert.show();
                }
                break;

                default:
                    rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.default_rocket));
        }
    }
}

package mas.rocketgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CustomizeActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView rocketImage = null;

    Button default_rocket_button = null, classic_rocket_button = null, batmobile_button = null,
            cherry_blossom_button = null, cotton_candy_button = null, endless_river_button = null,
            grapefruit_sunset_button = null, green_peppermint_button = null, iced_tea_button = null,
            la_lakers_button = null, mango_pulp_button = null, orange_fun_button = null, purple_paradise_button = null,
            ramblin_wreck_button = null, relaxing_red_button = null, summer_sunset_button = null,
            tropical_rainforest_button = null, youtube_red_button = null, charcoal_button = null,
            banana_split_button = null;



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
    }

    public void onClick(View v) {

        switch(v.getId()) {

            case R.id.defaultRocket:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.default_rocket));
                break;

            case R.id.classicRocket:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.classic_rocket));
                break;

            case R.id.batMobile:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.bat_mobile));
                break;

            case R.id.cherryBlossom:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.cherry_blossom));
                break;

            case R.id.cottonCandy:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.cotton_candy));
                break;

            case R.id.endlessRiver:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.endless_river));
                break;

            case R.id.grapefruitSunset:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.grapefruit_sunset));
                break;

            case R.id.greenPeppermint:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.green_peppermint));
                break;

            case R.id.icedTea:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.iced_tea));
                break;

            case R.id.laLakers:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.losangeles_lakers));
                break;

            case R.id.mangoPulp:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.mango_pulp));
                break;

            case R.id.orangeFun:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.orange_fun));
                break;

            case R.id.purpleParadise:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.purple_paradise));
                break;

            case R.id.ramblinWreck:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.ramblin_wreck));
                break;

            case R.id.relaxingRed:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.relaxing_red));
                break;

            case R.id.summerSunset:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.summer_sunset));
                break;

            case R.id.tropicalRainforest:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.tropical_rainforest));
                break;

            case R.id.youtubeRed:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.youtube_red));
                break;

            case R.id.charcoal:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.charcoal));
                break;

            case R.id.bananaSplit:
                rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.banana_split));
                break;

                default:
                    rocketImage.setImageDrawable(getResources().getDrawable(R.drawable.default_rocket));
        }
    }
}

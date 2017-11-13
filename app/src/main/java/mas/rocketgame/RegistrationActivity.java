package mas.rocketgame;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class RegistrationActivity extends AppCompatActivity {


    private static int RESULT_LOAD_IMAGE = 1;
    ImageView thumbnail = null;
    Bitmap myBitmap = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setTheme(android.R.style.Theme_Material_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        thumbnail = (ImageView) findViewById(R.id.imgView);

        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        Button regButton = (Button) findViewById(R.id.register_button);


        //initialize Upload Image Button
        Button uploadButton = (Button) findViewById(R.id.uploadImageButton);
        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, RESULT_LOAD_IMAGE);
            }
        });

        //initialize Register Button
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "User successfully added!", Toast.LENGTH_SHORT).show();

            }
        });


    }

    @Override
    protected void onActivityResult(int reqCode, int resultCode, Intent data) {
        super.onActivityResult(reqCode, resultCode, data);


        if (resultCode == RESULT_OK) {
            try {
                final Uri imageUri = data.getData();
                final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                thumbnail.setImageBitmap(selectedImage);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
               // Toast.makeText(PostImage.this, "Something went wrong", Toast.LENGTH_LONG).show();
            }

        }else {
            //Toast.makeText(PostImage.this, "You haven't picked Image",Toast.LENGTH_LONG).show();
        }
    }
}

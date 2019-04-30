package com.morteza.kordi.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   public void buttonIsClicked(View buttonView) {

        //int result = 5 * 7;
//        Log.i("OPERATION", result + "");
//
 //      TextView text = findViewById(R.id.txt);
//       Log.i("TAG", text.getText().toString());

 //     EditText edtName = findViewById(R.id.edtName);
//       Log.i("NAME", edtName.getText().toString());


//       EditText edtPhoneNumber = findViewById(R.id.edtPhoneNumber);
//       Log.i("PHONENUMBER", edtPhoneNumber.getText().toString());

//       Toast.makeText(MainActivity.this,
//               text.getText().toString(),
//               Toast.LENGTH_LONG).show();

//       Toast.makeText(MainActivity.this,
//               "Your name is: " +
//                       edtName.getText().toString() +
//                       "\n" + "Your phone number is: " +
//                       edtPhoneNumber.getText().toString(),
//               Toast.LENGTH_LONG).show();

       ImageView myImage = findViewById(R.id.img);
       myImage.setImageResource(R.drawable.hintersee);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }


}

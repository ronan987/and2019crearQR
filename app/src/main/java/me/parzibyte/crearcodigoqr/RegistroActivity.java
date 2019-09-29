package me.parzibyte.crearcodigoqr;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroActivity extends AppCompatActivity {

   // Button btnsesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
      //btnsesion= (Button)findViewById(R.id.btnregistro);
      //  final Vibrator vibrator= (Vibrator)this.getSystemService(Context.VIBRATOR_SERVICE);


      /*  btnsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(600);

            }
        });*/
    }
}

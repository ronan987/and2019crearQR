package me.parzibyte.crearcodigoqr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplahActivity extends AppCompatActivity {

    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);

        imagen= (ImageView)findViewById(R.id.ImageV1);

        final Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);

                }catch (InterruptedException e){
                    e.printStackTrace();

                }
                Intent i = new Intent(SplahActivity.this,LoginActivity.class);
                startActivity(i);
                //tran();
                desaparecer();
                //aparecer();
                finish();

            }

        });
        thread.start();
    }

    public void desaparecer() {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.desaparecer);
        animation.setFillAfter(true);
        imagen.startAnimation(animation);
    }
    public void aparecer(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.aparecer);
        animation.setFillAfter(true);
        imagen.startAnimation(animation);

    }
}

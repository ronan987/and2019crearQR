package me.parzibyte.crearcodigoqr;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import net.glxn.qrgen.android.QRCode;

public class LoginActivity extends AppCompatActivity {

  private boolean tienePermisoParaEscribir = false; // Para los permisos en tiempo de ejecución

    private String obtenerTextoParaCodigo() {
        etTextoParaCodigo.setError(null);
        String posibleTexto = etTextoParaCodigo.getText().toString();
        if (posibleTexto.isEmpty()) {
            etTextoParaCodigo.setError("Debe ingresar su numero de identificación");
            etTextoParaCodigo.requestFocus();
        }
        return posibleTexto;
    }

    private String Textogenerado() {
        etTextoParaCodigo.setError(null);
        String Texto = etTextoparagenerar.getText().toString();
        if (Texto.isEmpty()) {
            etTextoparagenerar.setError("Debe ingresar su contraseña");
            etTextoparagenerar.requestFocus();
        }
        return Texto;
    }
    private EditText etTextoParaCodigo,etTextoparagenerar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etTextoParaCodigo = findViewById(R.id.edtidentificacion);
        etTextoparagenerar=findViewById(R.id.edtcontraseña);

        Button btnenviar = findViewById(R.id.btnenviar),
                btnregistro = findViewById(R.id.btnregistro);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = obtenerTextoParaCodigo();
                if (texto.isEmpty()) return;
                String posibleTexto= Textogenerado();
                if (texto.isEmpty())return;
                if (!tienePermisoParaEscribir) {
                    Intent i = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(i);
                    return;
                }



            }
        });

        btnregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(LoginActivity.this,RegistroActivity.class);
                startActivity(i);
            }
        });
    }
}

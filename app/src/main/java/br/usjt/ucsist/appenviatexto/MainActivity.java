package br.usjt.ucsist.appenviatexto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarMensagem(View view) {
        EditText mensagemEnvio = findViewById(R.id.mensagemEditText);
        String mensagem = mensagemEnvio.getText().toString();
        Intent intent = new Intent(this, MensagemEnviada.class);
        intent.putExtra("msg", mensagem);
        startActivity(intent);
        Toast.makeText(this,mensagem, Toast.LENGTH_SHORT).show();


    }
}
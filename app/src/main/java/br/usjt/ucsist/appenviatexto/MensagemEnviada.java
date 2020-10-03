package br.usjt.ucsist.appenviatexto;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MensagemEnviada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_mensagem);
        TextView mensagemTextView = findViewById(R.id.mensagemEditText);
        Intent origemIntent = getIntent();
        String mensagem = origemIntent.getStringExtra("msg");
        mensagemTextView.setText(mensagem);
    }
}

package marcela.julia.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {//representa a tela principal.

    @Override
    protected void onCreate(Bundle savedInstanceState) {//cria uma activity.
        super.onCreate(savedInstanceState);//possibilita que a Activity seja inicializada.
        setContentView(R.layout.activity_next);//constrói a interface do aplicativo.

        Intent i = getIntent();//obtem o intent.

        String textoDigitado = i.getStringExtra("texto");//pega o texto criado na primeira tela.

        TextView tvTexto = findViewById(R.id.tv_texto);//pegar o texto para exibir exibir.
        tvTexto.setText(textoDigitado);//exibi o texto digitado na primeira pagina.
    }
}
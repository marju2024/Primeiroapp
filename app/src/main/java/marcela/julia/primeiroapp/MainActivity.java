package marcela.julia.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {//representa a tela principal.

    @Override
    protected void onCreate(Bundle savedInstanceState) {//cria uma activity.
        super.onCreate(savedInstanceState);//possibilita que a Activity seja inicializada
        // corretamente e que seu estado possa ser restaurado se necessário.
        setContentView(R.layout.activity_main);//constrói a interface do aplicativo.

        Button btnEnviar = findViewById(R.id.btn_enviar); //obtem botao de enviar.
        btnEnviar.setOnClickListener(new View.OnClickListener() {//configura o botão btnEnviar para
            // que ele execute o código dentro do bloco quando for clicado.
            @Override
            public void onClick(View v) {//variável que guarda um objeto do tipo view, como um botão.

                EditText etDigiteAqui = findViewById(R.id.et_digite_aqui);//concede a caixa de texto.
                String textoDigitado = etDigiteAqui.getText().toString();//obtem o texto digitado na caixa de texto.

                Intent i =  new Intent(MainActivity.this, NextActivity.class);//faz passar para outro pagina.
                i.putExtra("texto",textoDigitado);

                startActivity(i);//executa a intenção entregue para ele, no caso mudar da pag principal para a próxima;
            }
        });
    }
}
package bruno.rolaodado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class ResultadoActivity extends Activity {

    private TextView numero;
    private Button rolarNovamente;
    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        numero = findViewById(R.id.numeroId);
        rolarNovamente = findViewById(R.id.rolarNovamenteId);
        voltar = findViewById(R.id.voltarId);

        Bundle extra = getIntent().getExtras();
        final int num = extra.getInt("numero");

        Random random = new Random();
        int numeroRandomico = random.nextInt(num) + 1;
        String resultado = String.valueOf(numeroRandomico);
        numero.setText(resultado);

        rolarNovamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int numeroRandomico = random.nextInt(num) + 1;
                String resultado = String.valueOf(numeroRandomico);

                numero.setText(resultado);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultadoActivity.this, MenuActivity.class));
            }
        });

    }
}

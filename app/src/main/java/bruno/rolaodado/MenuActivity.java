package bruno.rolaodado;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MenuActivity extends Activity {

    private Button d2;
    private Button d4;
    private Button d6;
    private Button d8;
    private Button d10;
    private Button d12;
    private Button d20;
    private Button d100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        d2 = findViewById(R.id.d2);
        d4 = findViewById(R.id.d4);
        d6 = findViewById(R.id.d6);
        d8 = findViewById(R.id.d8);
        d10 = findViewById(R.id.d10);
        d12 = findViewById(R.id.d12);
        d20 = findViewById(R.id.d20);
        d100 = findViewById(R.id.d100);

        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, ResultadoActivity.class);
                intent.putExtra("numero", 2);

                startActivity(intent);
            }
        });

        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, ResultadoActivity.class);
                intent.putExtra("numero", 4);

                startActivity(intent);
            }
        });

        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, ResultadoActivity.class);
                intent.putExtra("numero", 6);

                startActivity(intent);
            }
        });

        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, ResultadoActivity.class);
                intent.putExtra("numero", 8);

                startActivity(intent);
            }
        });

        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, ResultadoActivity.class);
                intent.putExtra("numero", 10);

                startActivity(intent);
            }
        });

        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, ResultadoActivity.class);
                intent.putExtra("numero", 12);

                startActivity(intent);
            }
        });

        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, ResultadoActivity.class);
                intent.putExtra("numero", 20);

                startActivity(intent);
            }
        });

        d100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, ResultadoActivity.class);
                intent.putExtra("numero", 100);

                startActivity(intent);
            }
        });

    }
}

package ifpr.br.logincadastroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ExibeInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_info);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String email = bundle.getString("email");
        String nome = bundle.getString("nome");
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        textViewEmail.setText(email);
        TextView textViewNome = findViewById(R.id.textViewNome);
        textViewNome.setText(nome);
    }
}

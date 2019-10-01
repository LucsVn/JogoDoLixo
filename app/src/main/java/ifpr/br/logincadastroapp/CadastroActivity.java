package ifpr.br.logincadastroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void cadastrarUsuario(View v) throws IOException {
        EditText campoEmail = findViewById(R.id.editTextEmailCadastro);
        String email = campoEmail.getText().toString();
        EditText campoNome = findViewById(R.id.editTextNomeCadastro);
        String nome = campoNome.getText().toString();
        EditText campoSenha = findViewById(R.id.editTextSenhaCadastro);
        String senha = campoSenha.getText().toString();
        int resposta = DBHelper.insertIntoUsuario(nome, email, senha);
        if (resposta == 1) {
            Toast.makeText(this, "Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Erro! Cadastro não realizado!", Toast.LENGTH_LONG).show();
        }
    }
}

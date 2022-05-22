package alura.com.br;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
/
        //Simulando um acesso a banco de dados para pegar estes nomes
      List<String> alunos = new ArrayList<>(Arrays.asList("Alex","Fran","Jose", "Carlos","Amanda","Ana"));

        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);

        listaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));

        //Aqui estou dinzendo que o objeto primeiroAluno é uma textview que veio do layout, fiz uma busca da view pelo ID dele
        //TextView primeiroAluno = findViewById(R.id.);
        //TextView segundoAluno = findViewById(R.id.textView2);
        //TextView terceiroAluno = findViewById(R.id.textView3);

        //depois de fazer o objeto receber o que tem dentro da view eu fiz a busca dentro da array e setei para que ele receba o texto
        //primeiroAluno.setText(alunos.get(0));
        //segundoAluno.setText(alunos.get(1));
        //terceiroAluno.setText(alunos.get(2));


    }
}

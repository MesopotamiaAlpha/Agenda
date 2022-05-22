package alura.com.br.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import alura.com.br.DAO.AlunoDAO;
import alura.com.br.R;

public class ListaAlunosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_lista_alunos);

        AlunoDAO dao = new AlunoDAO();

        //Simulando um acesso a banco de dados para pegar estes nomes
     // List<String> alunos = new ArrayList<>(Arrays.asList("Alex","Fran","Jose", "Carlos","Amanda","Ana"));

        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);

        listaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todos()));


        setTitle("Lista de alunos");

        /*Aqui estou dinzendo que o objeto primeiroAluno é uma textview que veio do layout, fiz uma busca da view pelo ID dele
        TextView primeiroAluno = findViewById(R.id.);
        TextView segundoAluno = findViewById(R.id.textView2);
        TextView terceiroAluno = findViewById(R.id.textView3);

        depois de fazer o objeto receber o que tem dentro da view eu fiz a busca dentro da array e setei para que ele receba o texto
        primeiroAluno.setText(alunos.get(0));
        segundoAluno.setText(alunos.get(1));
        terceiroAluno.setText(alunos.get(2));
        */

    }
}

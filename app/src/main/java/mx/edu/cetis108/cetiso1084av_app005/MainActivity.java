package mx.edu.cetis108.cetiso1084av_app005;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button btnSiguiente;
    ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     btnSiguiente=(Button)findViewById(R.id.btnNuevo);
     lista=(ListView)findViewById(R.id.lstCategorias);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int posicion=position;
                String ItemaValue=(String)lista.getItemAtPosition(position);
                Intent siguiente= new Intent(getApplicationContext(),tema_lista_activity.class);
                startActivity(siguiente);
            }
        });


        btnSiguiente.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent Suiguiente= new Intent(MainActivity.this,categoria_tipo_activity.class);
             startActivity(Suiguiente);

         }
     });

    }
}

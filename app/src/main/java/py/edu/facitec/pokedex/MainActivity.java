package py.edu.facitec.pokedex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity implements Callback<List<Pokemon>>{
    ProgressBar progressBar;
    ListView pokemonsListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar =(ProgressBar)findViewById(R.id.progressBar);
        pokemonsListView = (ListView)findViewById(R.id.pokemonListView);

        recuperarDatos();
    }
    private void recuperarDatos() {

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://simple-pokemon.herokuapp.com")
                .build();

        PokemonServicio servicio = restAdapter.create(PokemonServicio.class);
        servicio.obtenerDatos(this);
    }

    @Override
    public void success(final List<Pokemon> pokemons, Response response) {
        progressBar.setVisibility(View.GONE);
        PokemonAdapter adapter = new PokemonAdapter(pokemons,MainActivity.this);
        pokemonsListView.setAdapter(adapter);
        pokemonsListView.setVisibility(View.VISIBLE);

        pokemonsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               /* Toast
                        .makeText(MainActivity.this,
                                pokemons.get(position).getName(),
                                Toast.LENGTH_LONG)
                        .show();*/
                Intent i = new Intent(MainActivity.this, DetalleActivity.class);
                i.putExtra("pokemon",pokemons.get(position));
                startActivity(i);
            }
        });
    }

    @Override
    public void failure(RetrofitError error) {
        progressBar.setVisibility(View.GONE);
    }
}

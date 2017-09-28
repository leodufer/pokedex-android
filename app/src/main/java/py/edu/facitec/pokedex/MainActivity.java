package py.edu.facitec.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar =(ProgressBar)findViewById(R.id.progressBar);

        RestAdapter restAdapter = new RestAdapter.Builder()
                                .setEndpoint("https://simple-pokemon.herokuapp.com")
                                .build();

        PokemonServicio servicio = restAdapter.create(PokemonServicio.class);
        servicio.obtenerDatos(new Callback<List<Pokemon>>() {
            @Override
            public void success(List<Pokemon> pokemons, Response response) {
                Log.i("RESULTADO",pokemons.toString());

                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("RESULTADO", error.getLocalizedMessage());
                progressBar.setVisibility(View.GONE);
            }

        });
    }
}

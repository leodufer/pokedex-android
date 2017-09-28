package py.edu.facitec.pokedex;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by virux on 27/09/17.
 */

public interface PokemonServicio {
    @GET("/pokemon")
    void obtenerDatos(Callback<List<Pokemon>> callback);
}

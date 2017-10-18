package py.edu.facitec.pokedex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by virux on 04/10/17.
 */

public class PokemonAdapter extends BaseAdapter {

    private List<Pokemon> pokemons;
    private Context context;

    public PokemonAdapter(List<Pokemon> pokemons, Context context) {
        this.pokemons = pokemons;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.pokemons.size();
    }

    @Override
    public Object getItem(int position) {
        return this.pokemons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.pokemons.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
        if(convertView==null){
           /* LayoutInflater inflater = (LayoutInflater.from(context));
            view = inflater.inflate(R.layout.item_pokemon,null);*/
           view = LayoutInflater.from(context).inflate(R.layout.item_pokemon,null);
        }

        ImageView fotoImageView = (ImageView)view.findViewById(R.id.imageViewFoto);
        TextView nameTextView = (TextView)view.findViewById(R.id.textViewName);
        TextView speciesTextView = (TextView)view.findViewById(R.id.textViewSpecies);

        Pokemon p = pokemons.get(position);
        Picasso.with(context)
                .load("http://simple-pokemon.herokuapp.com/images/pokemons/"+p.getName().toLowerCase()+".jpg")
                .into(fotoImageView);

        nameTextView.setText(p.getName());
        speciesTextView.setText(p.getSpecies());

        return view;
    }
}

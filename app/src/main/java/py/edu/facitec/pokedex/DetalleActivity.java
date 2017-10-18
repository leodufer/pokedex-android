package py.edu.facitec.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class DetalleActivity extends AppCompatActivity {

    Pokemon pokemon;
    ImageView fotoImageView;
    TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        fotoImageView = (ImageView)findViewById(R.id.imageViewFoto);
        nameTextView = (TextView)findViewById(R.id.textViewName);

        pokemon = (Pokemon) getIntent().getSerializableExtra("pokemon");


        Picasso.with(this)
                .load("http://simple-pokemon.herokuapp.com/images/pokemons/"+pokemon.getName().toLowerCase()+".jpg")
                .into(fotoImageView);

        nameTextView.setText(pokemon.getName());


    }
}

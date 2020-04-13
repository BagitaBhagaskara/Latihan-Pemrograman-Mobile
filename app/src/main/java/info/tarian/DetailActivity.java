package info.tarian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFotoTarian;
    TextView textViewNamaTarian, textViewInfoTarian;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoTarian= findViewById(R.id.imageViewFotoTarian);
        textViewNamaTarian= findViewById(R.id.textViewNamaTarian);
        textViewInfoTarian=findViewById(R.id.textViewInfoTarian);

        getincomingExtra();
    }

    private void getincomingExtra(){
        if(getIntent().hasExtra("foto_tarian")&& getIntent().hasExtra("nama_tarian")&&getIntent().hasExtra("info_tarian")) {

            String fotoTarian = getIntent().getStringExtra("foto_tarian");
            String namaTarian = getIntent().getStringExtra("nama_tarian");
            String infoTarian = getIntent().getStringExtra("info_tarian");

            setDataActivity(fotoTarian,namaTarian,infoTarian);
        }
        }

        private void setDataActivity(String fotoTarian, String namaTarian, String infoTarian ){

            Glide.with(this).asBitmap().load(fotoTarian).into(imageViewFotoTarian);
            textViewNamaTarian.setText(namaTarian);
            textViewInfoTarian.setText(infoTarian);

    }
}

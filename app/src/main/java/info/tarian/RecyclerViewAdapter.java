package info.tarian;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.lang.reflect.Array;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder>{

    private ArrayList<String> fotoTarian = new ArrayList<>();
    private ArrayList<String> namaTarian = new ArrayList<>();
    private ArrayList<String> infoTarian = new ArrayList<>();

    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotoTarian, ArrayList<String> namaTarian,ArrayList<String> infoTarian, Context context) {
        this.fotoTarian = fotoTarian;
        this.namaTarian = namaTarian;
        this.infoTarian = infoTarian;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        viewHolder holder = new viewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(fotoTarian.get(position)).into(holder.imageViewFotoTarian);

        holder.textViewNamaTarian.setText(namaTarian.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Toast.makeText(context, namaTarian.get(position), Toast.LENGTH_LONG).show();

              Intent intent = new Intent(context, DetailActivity.class);

              intent.putExtra("foto_tarian", fotoTarian.get(position));
              intent.putExtra("nama_tarian", namaTarian.get(position));
              intent.putExtra("info_tarian", infoTarian.get(position));

              context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namaTarian.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageViewFotoTarian;
        TextView textViewNamaTarian;
        ConstraintLayout constraintLayout;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoTarian = itemView.findViewById(R.id.imageViewFotoTarian);
            textViewNamaTarian = itemView.findViewById(R.id.textViewNamaTarian);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}

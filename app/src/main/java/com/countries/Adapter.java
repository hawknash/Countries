package com.countries;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou;
import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    List<Countries> countries;
    Adapter(Context context, List<Countries> countries){
        this.context=  context;
        this.countries=countries;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Countries art=countries.get(position);

        holder.name.setText("Name: "+art.getName());
        //  holder.newsDate.setText(art.getPublishedAt());
        String flag=art.getFlag();
        holder.capital.setText("Capital: "+art.getCapital());
        holder.region.setText("Region: "+art.getRegion());
        holder.subregion.setText("Subregion: "+art.getSubregion());
        holder.population.setText("Population: "+art.getPopulation());




        String s="";
        for(int i=0;i<art.getLanguages().size();i++) {
            s=s+" "+art.getLanguages().get(i).getName();

        }
        holder.languages.setText("Languages: "+s);
        if(art.getBorders().size()>0) {
            String s1="";
            for(int i=0;i<art.getBorders().size();i++) {
                s1=s1+" "+art.getBorders().get(i);

            }
            holder.borders.setText("Borders: " +s1);
        }

        //Picasso.get().load(flag).into(holder.flag);

       /* Glide
                .with(context)
                .load(flag)
                .centerCrop()

                .into(holder.flag); */

        GlideToVectorYou.justLoadImage((Activity) context,
                Uri.parse(flag),
                holder.flag);

    }

    @Override
    public int getItemCount() {


        return countries.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder {
        TextView name,region,subregion,population,languages,borders,capital;
        ImageView flag;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.name);
            capital=itemView.findViewById(R.id.capital);
            region=itemView.findViewById(R.id.region);
           subregion=itemView.findViewById(R.id.subregion);
            population=itemView.findViewById(R.id.population);
            languages=itemView.findViewById(R.id.language);;
            borders=itemView.findViewById(R.id.borders);
            flag=itemView.findViewById(R.id.flag);
        }
    }

}
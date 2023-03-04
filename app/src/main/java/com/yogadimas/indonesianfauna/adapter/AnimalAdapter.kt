package com.yogadimas.indonesianfauna.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target.*
import com.yogadimas.indonesianfauna.R
import com.yogadimas.indonesianfauna.model.AnimalModel
import com.yogadimas.indonesianfauna.view.DetailActivity

class AnimalAdapter(private val listAnimals: ArrayList<AnimalModel>) :

    RecyclerView.Adapter<AnimalAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cardview_animal, parent, false)
        return CardViewViewHolder(view)
    }

    @SuppressLint("CheckResult")
    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val animal = listAnimals[position]
        val context = holder.itemView.context


        Glide.with(context)
            .load(animal.image)
            .transform(RoundedCorners(50))
            .apply(RequestOptions().override(SIZE_ORIGINAL))
            .into(holder.ivImage)
        holder.tvName.text = animal.name
        holder.tvOverview.text = animal.overview
        holder.itemView.setOnClickListener {
            val goToDetail = Intent(context, DetailActivity::class.java)
            goToDetail.putExtra(DetailActivity.ANIMAL_NAME, animal.name)
            goToDetail.putExtra(DetailActivity.ANIMAL_S_NAME, animal.scientificName)
            goToDetail.putExtra(DetailActivity.ANIMAL_IMAGE, animal.image)
            goToDetail.putExtra(DetailActivity.ANIMAL_KINGDOM, animal.kingdom)
            goToDetail.putExtra(DetailActivity.ANIMAL_PHYLUM, animal.phylum)
            goToDetail.putExtra(DetailActivity.ANIMAL_CLASS, animal.animalClass)
            goToDetail.putExtra(DetailActivity.ANIMAL_ORDER, animal.order)
            goToDetail.putExtra(DetailActivity.ANIMAL_FAMILY, animal.family)
            goToDetail.putExtra(DetailActivity.ANIMAL_GENUS, animal.genus)
            goToDetail.putExtra(DetailActivity.ANIMAL_SPECIES, animal.species)
            goToDetail.putExtra(DetailActivity.ANIMAL_OVERVIEW, animal.overview)
            context.startActivity(goToDetail,
                ActivityOptionsCompat.makeSceneTransitionAnimation(context as Activity).toBundle())
        }

    }

    override fun getItemCount(): Int = listAnimals.size

    class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivImage: ImageView = itemView.findViewById(R.id.item_image)
        val tvName: TextView = itemView.findViewById(R.id.item_name)
        val tvOverview: TextView = itemView.findViewById(R.id.item_overview)
    }

}
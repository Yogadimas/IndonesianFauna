package com.yogadimas.indonesianfauna.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.yogadimas.indonesianfauna.R
import com.yogadimas.indonesianfauna.utility.Utility

class DetailActivity : AppCompatActivity() {

    companion object {
        const val ANIMAL_NAME = "animal_name"
        const val ANIMAL_S_NAME = "animal_s_name"
        const val ANIMAL_IMAGE = "extra_image"
        const val ANIMAL_KINGDOM = "animal_kingdom"
        const val ANIMAL_PHYLUM = "animal_phylum"
        const val ANIMAL_CLASS = "animal_class"
        const val ANIMAL_ORDER = "animal_order"
        const val ANIMAL_FAMILY = "animal_family"
        const val ANIMAL_GENUS = "animal_genus"
        const val ANIMAL_SPECIES = "animal_species"
        const val ANIMAL_OVERVIEW = "animal_overview"
    }


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.title = getString(R.string.title_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val utility = Utility(this)

        val tvName: TextView = findViewById(R.id.tv_detail_name)
        val tvSName: TextView = findViewById(R.id.tv_detail_scientific_name)
        val ivImage: ImageView = findViewById(R.id.iv_detail_image)
        val tvKingdom: TextView = findViewById(R.id.tv_detail_kingdom)
        val tvPhylum: TextView = findViewById(R.id.tv_detail_phylum)
        val tvClass: TextView = findViewById(R.id.tv_detail_class)
        val tvOrder: TextView = findViewById(R.id.tv_detail_order)
        val tvFamily: TextView = findViewById(R.id.tv_detail_family)
        val tvGenus: TextView = findViewById(R.id.tv_detail_genus)
        val tvSpecies: TextView = findViewById(R.id.tv_detail_species)
        val tvOverview: TextView = findViewById(R.id.tv_detail_overview)

        val nameValue = intent.getStringExtra(ANIMAL_NAME)
        val sNameValue = intent.getStringExtra(ANIMAL_S_NAME)
        val orderValue = intent.getStringExtra(ANIMAL_ORDER)



        tvName.text = nameValue
        tvSName.text = sNameValue
        Glide.with(this)
            .load(intent.getIntExtra(ANIMAL_IMAGE, 0))
            .apply(RequestOptions().override(Target.SIZE_ORIGINAL))
            .into(ivImage)
        tvKingdom.text = utility.formatData(intent.getStringExtra(ANIMAL_KINGDOM))
        tvPhylum.text = utility.formatData(intent.getStringExtra(ANIMAL_PHYLUM))
        tvClass.text = utility.formatData(intent.getStringExtra(ANIMAL_CLASS))
        tvOrder.text = utility.formatData(orderValue)
        tvFamily.text = utility.formatData(intent.getStringExtra(ANIMAL_FAMILY))
        tvGenus.text = utility.formatData(intent.getStringExtra(ANIMAL_GENUS))
        tvSpecies.text = utility.formatData(intent.getStringExtra(ANIMAL_SPECIES))
        tvOverview.text = intent.getStringExtra(ANIMAL_OVERVIEW)


        val btnShare: Button = findViewById(R.id.action_share)
        btnShare.setOnClickListener {
            Log.d("TAG", "onCreate: setOnClickListener")
            val shareIntent = Intent(Intent.ACTION_VIEW)
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.putExtra(Intent.EXTRA_TEXT,
                String.format(resources.getString(R.string.msg_share),
                    nameValue?.uppercase(),
                    sNameValue?.uppercase(),
                    orderValue?.uppercase()))
            shareIntent.type = "text/plain"
            startActivity(Intent.createChooser(shareIntent, getString(R.string.share_with)))
        }

            
    }




}
package com.yogadimas.indonesianfauna.view

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yogadimas.indonesianfauna.R
import com.yogadimas.indonesianfauna.adapter.AnimalAdapter
import com.yogadimas.indonesianfauna.data.AnimalsData
import com.yogadimas.indonesianfauna.model.AnimalModel

class MainActivity : AppCompatActivity() {

    private var list: ArrayList<AnimalModel> = arrayListOf()
    private lateinit var rvAnimals: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAnimals = findViewById(R.id.rv_animals)
        rvAnimals.setHasFixedSize(true)
        rvAnimals.layoutManager = LinearLayoutManager(this)
        showData()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_page) {
            startActivity(Intent(this, AboutActivity::class.java),
                ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle())
        }
        return super.onOptionsItemSelected(item)
    }


    private fun showData() {
        list = AnimalsData.listData
        val animalAdapter = AnimalAdapter(list)
        rvAnimals.adapter = animalAdapter
    }


    override fun onDestroy() {
        super.onDestroy()
        list.clear()
    }
}
package com.mountain.mountainapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMountains: RecyclerView
    private var list: ArrayList<Mountain> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "Mountain"

        rvMountains = findViewById(R.id.rv_mountains)
        rvMountains.setHasFixedSize(true)

        list.addAll(MountainData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
//        TODO("Not yet implemented")
        rvMountains.layoutManager = LinearLayoutManager(this)
        val listMountainAdapter = ListMountainAdapter(list)
        rvMountains.adapter = listMountainAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}
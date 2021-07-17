package br.igorsantos.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.igorsantos.affirmations.adapter.ItemAdapter
import br.igorsantos.affirmations.data.DataSource
import br.igorsantos.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataSet = DataSource().loadAffirmations()

        binding.recyclerView.adapter = ItemAdapter(this, myDataSet)
        binding.recyclerView.setHasFixedSize(true)
    }
}
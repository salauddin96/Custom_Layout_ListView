package org.techtales.customlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtales.customlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var contryList:ArrayList<ModelCountry> = ArrayList<ModelCountry>()

        contryList.add(ModelCountry(R.drawable.bd, "Bangladesh", "Rank-7"))
        contryList.add(ModelCountry(R.drawable.india, "India", "Rank-2"))
        contryList.add(ModelCountry(R.drawable.australia, "Australia", "Rank-3"))
        contryList.add(ModelCountry(R.drawable.pakistan, "Pakistan", "Rank-6"))
        contryList.add(ModelCountry(R.drawable.england, "England", "Rank-1"))
        contryList.add(ModelCountry(R.drawable.southafrica, "South Africa", "Rank-4"))
        contryList.add(ModelCountry(R.drawable.newzealand, "New Zealand", "Rank-5"))

        val adapter = CountryAdapter(this, contryList)
        binding.listview.adapter = adapter
    }
}
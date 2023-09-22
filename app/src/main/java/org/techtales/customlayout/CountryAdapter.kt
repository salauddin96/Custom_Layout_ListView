package org.techtales.customlayout

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class CountryAdapter(context: Context, countryList:ArrayList<ModelCountry>):ArrayAdapter<ModelCountry>(context, 0,countryList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var countryListView:View? = convertView
        if(countryListView==null){
            countryListView = LayoutInflater.from(context).inflate(R.layout.country_items, parent, false)
        }
        val courseModel:ModelCountry? = getItem(position)
        val countryImage = countryListView!!.findViewById<CircleImageView>(R.id.countryImg)
        val countryName = countryListView!!.findViewById<TextView>(R.id.countryName)
        val countryDetail = countryListView!!.findViewById<TextView>(R.id.countryDetails)

        countryName.setText(courseModel!!.countryName)
        countryDetail.setText(courseModel!!.countryDetails)
        countryImage.setImageResource(courseModel!!.contryImage)
        return countryListView

    }

}
package com.example.myhomeworkone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myhomeworkone.adapters.ChooseCountryAdapter
import com.example.myhomeworkone.adapters.LatestArrivalAdapter
import com.example.myhomeworkone.adapters.MainitemAdapter
import com.example.myhomeworkone.adapters.PopoularProductAdapter
import com.example.myhomeworkone.model.Countrylist
import com.example.myhomeworkone.model.Latestarrival
import com.example.myhomeworkone.model.Mainitem
import com.example.myhomeworkone.model.Popularproduct

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainitemView()
        latestArrivalView()
        CountryView()
        PopularView()



    }

    fun mainitemView() {
        var mainitemRecyclerView: RecyclerView = findViewById(R.id.recycler_main)
        var mainitemList = ArrayList<Mainitem>()
        mainitemList.add(Mainitem(R.drawable.cameraone, "Camera", "New Product from Leice Brand"))
        var maintemAdapter = MainitemAdapter(mainitemList)
        mainitemRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mainitemRecyclerView.adapter = maintemAdapter
    }

    fun latestArrivalView() {
        var arrivalRecyclerView: RecyclerView = findViewById(R.id.recycler_arrival)
        var arrivalList = ArrayList<Latestarrival>()
        arrivalList.add(
            Latestarrival(
                R.drawable.shirt,
                "Hyde Park",
                "N4561",
                "LOQUS VUITION",
                4,
                9999
            )
        )
        arrivalList.add(
            Latestarrival(R.drawable.shoe,
                "Hyde Park",
                "N4561",
                "LOQUS VUITION",
                3,
                9555
            )
        )
        arrivalList.add(
            Latestarrival(R.drawable.bag,
                "Hyde Park",
                "N4561",
                "LOQUS VUITION",
                3,
                9555
            )
        )
        var arrivalAdapter = LatestArrivalAdapter(arrivalList)
        arrivalRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        arrivalRecyclerView.adapter = arrivalAdapter
    }

    fun CountryView() {
        var countryRecyclerView: RecyclerView = findViewById(R.id.recycler_choose)
        var countryList = ArrayList<Countrylist>()
        countryList.add(Countrylist(R.drawable.japan,"Japan"))
        countryList.add(Countrylist(R.drawable.korea,"Korea"))
        countryList.add(Countrylist(R.drawable.chinese,"Chinese"))
        countryList.add(Countrylist(R.drawable.myanmar,"Myanmar"))
        var countryAdapter = ChooseCountryAdapter(countryList)
        countryRecyclerView.layoutManager =
            GridLayoutManager(this, 2)
        countryRecyclerView.adapter = countryAdapter
    }
    fun PopularView() {
        var popularRecyclerView: RecyclerView = findViewById(R.id.recycler_popular)
        var popoularlist=ArrayList<Popularproduct>()
        popoularlist.add(
            Popularproduct("New",30,"Iphone 8 Plus","Apple",3.0,
            98000,100000,R.drawable.shoe)
        )
        popoularlist.add(
            Popularproduct("New",50,"Iphone 10 Plus","Apple",3.0,
                98000,100000,R.drawable.shoe)
        )
        var popularAdapter=PopoularProductAdapter(popoularlist)
        popularRecyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

         popularRecyclerView.adapter = popularAdapter

    }
}


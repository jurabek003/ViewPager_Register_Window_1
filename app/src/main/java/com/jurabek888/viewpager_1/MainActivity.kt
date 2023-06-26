package com.jurabek888.viewpager_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.tabs.TabLayout
import com.jurabek888.viewpager_1.adapter.Adapter
import com.jurabek888.viewpager_1.databinding.ActivityMainBinding
import com.jurabek888.viewpager_1.databinding.TabItemBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var list: ArrayList<USer>
    private lateinit var myadapter:Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        loadData()

        binding.btnNext.setOnClickListener {
            val currentItem = binding.myViewPager.currentItem
            if (currentItem < myadapter.count - 1) {
                binding.myViewPager.currentItem = currentItem + 1
            }
        }

        myadapter = Adapter(this, list)
        binding.myViewPager.adapter = myadapter
        binding.dotInsayder.setViewPager(binding.myViewPager)


    }

    private fun loadData() {
        list= ArrayList()
        list.add(USer(R.drawable.rasm1,"Xush kelibsiz","Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘, \n" +
                "Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘"))
        list.add(USer(R.drawable.rasm2,"Hikoyalar dunyosi","Gar zamonni nayf qilsam ayb qilma, ey rafiq, \n" +
                "Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ ! " ))
        list.add(USer(R.drawable.rasm3,"Kitob ortidan..","Dilrabolardin yomonliq keldi mahzun ko‘ngluma,\n" +
                " Kelmadi jonimg'a hech oromi jondin yaxshilig'."))
        list.add(USer(R.drawable.rasm4,"Bizga qo`shiling","Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p,\n" +
                " Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?" ))
    }
}

//
//
//
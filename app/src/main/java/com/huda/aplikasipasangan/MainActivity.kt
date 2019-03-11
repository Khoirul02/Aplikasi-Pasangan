package com.huda.aplikasipasangan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_cari.setOnClickListener { cari() }
    }
    private fun cari(){
        val randomPria = Random().nextInt(5)+1
        val randomWanita = Random().nextInt(5)+1
        val drawableResPria = when (randomPria){
            1-> R.drawable.huda_mobile
            2-> R.drawable.filipus_mobile
            3-> R.drawable.edi_mobile
            4-> R.drawable.pria_1
            5-> R.drawable.pria_2
            else -> R.drawable.pasangan
        }
        val drawableResWanita = when (randomWanita){
            1-> R.drawable.fuji_mobile
            2-> R.drawable.hanum_mobile
            3-> R.drawable.wanita_1
            4-> R.drawable.wanita_2
            5-> R.drawable.wanita_3
            else-> R.drawable.pasangan
        }
        foto_pria.setImageResource(drawableResPria)
        foto_wanita.setImageResource(drawableResWanita)
    }
}

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
            4-> R.drawable.iav
            5-> R.drawable.harris
            else -> R.drawable.pasangan
        }
        val drawableResWanita = when (randomWanita){
            1-> R.drawable.fuji_mobile
            2-> R.drawable.hanum_mobile
            3-> R.drawable.ayulest
            4-> R.drawable.mela
            5-> R.drawable.umikhotimatuss
            else-> R.drawable.pasangan
        }
        foto_pria.setImageResource(drawableResPria)
        foto_wanita.setImageResource(drawableResWanita)
    }
}

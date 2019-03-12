package com.huda.aplikasipasangan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_cari.setOnClickListener { cari() }
    }
    private fun cari(){
        val randomPria = Random().nextInt(13)+1
        val randomWanita = Random().nextInt(5)+1
        val drawableResPria = when (randomPria){
            1-> R.drawable.huda_mobile
            2-> R.drawable.filipus_mobile
            3-> R.drawable.edi_mobile
            4-> R.drawable.iav
            5-> R.drawable.harris
            6-> R.drawable.yusron_afanji
            7-> R.drawable.deni
            8-> R.drawable.eggy
            9-> R.drawable.luhur
            10-> R.drawable.falih
            11-> R.drawable.diba
            12-> R.drawable.didik
            13-> R.drawable.riki
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
        Glide.with(this).load(drawableResPria).override(512,512).centerCrop().placeholder(R.drawable.pasangan).into(foto_pria)
        Glide.with(this).load(drawableResWanita).override(512,512).centerCrop().placeholder(R.drawable.pasangan).into(foto_wanita)

//        foto_pria.setImageResource(drawableResPria)
//        foto_wanita.setImageResource(drawableResWanita)
    }
}

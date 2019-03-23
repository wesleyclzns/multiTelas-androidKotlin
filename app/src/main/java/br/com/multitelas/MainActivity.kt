package br.com.multitelas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnProxima.setOnClickListener {
            val intentParaTela2 = Intent(this, Tela2::class.java)

            startActivity(intentParaTela2)
        }
    }
}

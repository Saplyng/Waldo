package com.example.waldo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lolnope.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bad_guess.*
import kotlinx.android.synthetic.main.close.*
import kotlinx.android.synthetic.main.trees.*
import kotlinx.android.synthetic.main.winner.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idBadGuess.setOnClickListener {
            setContentView(R.layout.bad_guess)
        }
        idBadGuess2.setOnClickListener {
            setContentView(R.layout.bad_guess)
        }
        idTrees1.setOnClickListener {
            setContentView(R.layout.trees)
        }
        idTrees2.setOnClickListener {
            setContentView(R.layout.trees)
        }
        idTrees3.setOnClickListener {
            setContentView(R.layout.trees)
        }
        idWinner.setOnClickListener {
            setContentView(R.layout.winner)
        }
        idNope.setOnClickListener {
            setContentView(R.layout.activity_lolnope)
        }
        idClose.setOnClickListener {
            setContentView(R.layout.close)
        }
//        idBack.setOnClickListener {
//            setContentView(R.layout.activity_main)
//        }
//        idBack2.setOnClickListener {
//            setContentView(R.layout.activity_main)
//        }
//        idBack3.setOnClickListener {
//            setContentView(R.layout.activity_main)
//        }
//        idBack4.setOnClickListener {
//            setContentView(R.layout.activity_main)
//        }
//        idBack5.setOnClickListener {
//            setContentView(R.layout.activity_main)
//        }
    }
}

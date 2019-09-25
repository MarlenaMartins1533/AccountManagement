package com.example.payment00.scenes.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.payment00.R
import com.example.payment00.scenes.addPayment.AddPaymentActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        add_paymentBTN.setOnClickListener {
            goToAddPaymentActivity()
        }
    }
    private fun goToAddPaymentActivity(){
        val intent = Intent(this, AddPaymentActivity::class.java)
        startActivity(intent)
    }
}

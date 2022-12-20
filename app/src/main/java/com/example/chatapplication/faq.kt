package com.example.chatapplication

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class faq : AppCompatActivity() {

//    private lateinit var edtEmail : EditText
//    private lateinit var edtPassword : EditText
//    private lateinit var btnMeeting : Button
//    private lateinit var btnSignup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

// Set Home selected
        bottomNavigationView.selectedItemId = R.id.home

// Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.circle -> {
                    startActivity(Intent(applicationContext, MeetingMD::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.home -> return@OnNavigationItemSelectedListener true
//                R.id.metro -> {
//                    startActivity(Intent(applicationContext, MetroSceen::class.java))
//                    overridePendingTransition(0, 0)
//                    return@OnNavigationItemSelectedListener true
//                }
//                R.id.map -> {
//                    startActivity(Intent(applicationContext, MapActivity::class.java))
//                    overridePendingTransition(0, 0)
//                    return@OnNavigationItemSelectedListener true
//                }
//                R.id.user -> {
//                    startActivity(Intent(applicationContext, UserActivity::class.java))
//                    overridePendingTransition(0, 0)
//                    return@OnNavigationItemSelectedListener true
//                }

            }
            false
        })

//        btnMeeting = findViewById(R.id.circle)
////
//        btnMeeting.setOnClickListener {
//            val intent = Intent(this, MeetingMD::class.java)
//            startActivity(intent)
//        }


//        btnLogin.setOnClickListener {
//            val inten = Intent(this, faq::class.java)
//            startActivity(inten)
//        }

    }
}
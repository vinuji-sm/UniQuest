package com.example.uniquest

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val addqbtn = findViewById<FloatingActionButton>(R.id.addqbtn)
        val navHome = findViewById<LinearLayout>(R.id.navHome)
        val navQuests = findViewById<LinearLayout>(R.id.navQuests)
        val navAchievements = findViewById<LinearLayout>(R.id.navAchievements)
        val navProfile = findViewById<LinearLayout>(R.id.navProfile)

        addqbtn.setOnClickListener {
            val intent = Intent(this, AddQuestsActivity::class.java)
            startActivity(intent)
        }

        navHome.setOnClickListener {
            // Stay on Dashboard (no navigation)
        }

        navQuests.setOnClickListener {
            val intent = Intent(this, DailyTipsActivity::class.java) // Mapped to Tips
            startActivity(intent)
        }

        navAchievements.setOnClickListener {
            val intent = Intent(this, GoalsActivity::class.java) // Mapped to Goals
            startActivity(intent)
        }

        navProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
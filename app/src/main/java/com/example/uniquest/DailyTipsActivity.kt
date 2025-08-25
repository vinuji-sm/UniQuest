package com.example.uniquest

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class DailyTipsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_tips)

        val navHome = findViewById<LinearLayout>(R.id.navHome)
        val navQuests = findViewById<LinearLayout>(R.id.navQuests)
        val navAchievements = findViewById<LinearLayout>(R.id.navAchievements)
        val navProfile = findViewById<LinearLayout>(R.id.navProfile)

        navHome.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        navQuests.setOnClickListener {
            // Stay on DailyTips (no navigation)
        }

        navAchievements.setOnClickListener {
            val intent = Intent(this, GoalsActivity::class.java)
            startActivity(intent)
        }

        navProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
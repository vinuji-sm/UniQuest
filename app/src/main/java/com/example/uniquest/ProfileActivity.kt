package com.example.uniquest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val viewall = findViewById<TextView>(R.id.viewall)
        val btnEditProfile = findViewById<Button>(R.id.btnEditProfile)
        val btnSetting = findViewById<Button>(R.id.btnSettings)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val navHome = findViewById<LinearLayout>(R.id.navHome)
        val navQuests = findViewById<LinearLayout>(R.id.navQuests)
        val navAchievements = findViewById<LinearLayout>(R.id.navAchievements)
        val navProfile = findViewById<LinearLayout>(R.id.navProfile)

        viewall.setOnClickListener {
            val intent = Intent(this, AchievementsActivity::class.java)
            startActivity(intent)
        }

        btnEditProfile.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

        btnSetting.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }

        btnLogout.setOnClickListener {
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
            finish()
        }

        navHome.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        navQuests.setOnClickListener {
            val intent = Intent(this, DailyTipsActivity::class.java)
            startActivity(intent)
        }

        navAchievements.setOnClickListener {
            val intent = Intent(this, GoalsActivity::class.java)
            startActivity(intent)
        }

        navProfile.setOnClickListener {
            // Stay on Profile (no navigation)
        }
    }
}
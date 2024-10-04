package com.example.kotlin2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Начальный фрагмент
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentOne())
                .commit()
        }

        // Управление кнопками для навигации
        findViewById<Button>(R.id.buttonFragment1).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentOne())
                .addToBackStack(null)  // Позволяет вернуться назад
                .commit()
        }

        findViewById<Button>(R.id.buttonFragment2).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentTwo())
                .addToBackStack(null)
                .commit()
        }

        findViewById<Button>(R.id.buttonFragment3).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentThree())
                .addToBackStack(null)
                .commit()
        }
    }
}

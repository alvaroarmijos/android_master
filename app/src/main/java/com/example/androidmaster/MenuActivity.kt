package com.example.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidmaster.firstapp.FirstAppActivity
import com.example.androidmaster.imccalculator.ImcCalculatorActivity
import com.example.androidmaster.superheroapp.SuperHeroListActivity
import com.example.androidmaster.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludApp = findViewById<Button>(R.id.btnSaludapp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTodoApp = findViewById<Button>(R.id.btnTodoApp)
        val btnSuperheroApp = findViewById<Button>(R.id.btnSuperhero)
        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnIMCApp.setOnClickListener { navigateToIMCApp() }
        btnTodoApp.setOnClickListener { navigateToTodoApp() }
        btnSuperheroApp.setOnClickListener { navigateToSuperheroApp() }
    }

    private fun navigateToSuperheroApp() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}
package com.example.saludar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
                btnShoeName.setOnClickListener{checkValue()}
    }
    fun checkValue(){
        if(etName.text.isEmpty()){
            //vamos a la nueva pantalla
        }else{
            showErrorName()
        }
    }
    fun showErrorName(){
            Toast.makeText(this, "El nombre no puede estar vacío", Toast.LENGTH_SHORT).show()

    }


}
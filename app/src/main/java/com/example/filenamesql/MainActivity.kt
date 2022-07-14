package com.example.filenamesql

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.filenamesql.sql.Db_Helper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn)


        btn.setOnClickListener {

            var db=Db_Helper(this)
                db.readdata()

        }
    }


}
package com.example.tictoctae

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tictoctae.databinding.ActivityAddUserBinding

class AddUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityAddUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartGame.setOnClickListener {

            var getPlayerOneName = binding.playerOne.text.toString()
            var getPlayerTwoName = binding.playerTwo.text.toString()

            if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()) {
                Toast.makeText(this, "Please enter players name", Toast.LENGTH_SHORT).show()
            } else {
                var intent = Intent(this, MainActivity::class.java)
                intent.putExtra("playerOne", getPlayerOneName)
                intent.putExtra("playerTwo", getPlayerTwoName)
                startActivity(intent)
            }

        }


    }
}
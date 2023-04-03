package com.example.tictoctae

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.tictoctae.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var boxPositions = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
//    private final List<int[]> combinationList = New combinationList<>();

    var playerTurn = 1

    lateinit var imageView: ImageView

    var totalSelectedBoxes = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        combinationList.add(0,1,2)
//        combinationList.add(3,4,5)
//        combinationList.add(6,7,8)
//        combinationList.add(0,3,6)
//        combinationList.add(1,4,7)
//        combinationList.add(2,5,8)
//        combinationList.add(2,4,6)
//        combinationList.add(0,4,8)

        var getPlayerOneName = intent.getStringExtra("playerOne")
        var getPlayerTwoName = intent.getStringExtra("playerTwo")

        binding.playerOneName.text = getPlayerOneName
        binding.playerTwoName.text = getPlayerTwoName

        binding.playerOneLayout.setOnClickListener {

        }

        binding.playerTwoLayoout.setOnClickListener {

        }

        binding.img1.setOnClickListener {
            if (isBoxSelectable(0)) {

            }
        }

        binding.img2.setOnClickListener {

        }
        binding.img3.setOnClickListener {

        }

        binding.img4.setOnClickListener {

        }

        binding.img5.setOnClickListener {

        }
        binding.img6.setOnClickListener {

        }
        binding.img7.setOnClickListener {

        }

        binding.img8.setOnClickListener {

        }
        binding.img9.setOnClickListener {

        }
    }

    private fun performAction(view: ImageView, selectedBoxPosition: Int) {
        boxPositions[selectedBoxPosition] = playerTurn

        if(playerTurn == 1){
            imageView.setImageResource(R.drawable.cross)
        }
    }

    private fun isBoxSelectable(boxPosition: Int): Boolean {
        var response = false

        if (boxPositions[boxPosition] == 0) {
            response = true
        }
        return response
    }
}
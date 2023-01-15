package pers.xiaoyan.constraintlayouttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pers.xiaoyan.constraintlayouttest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.layerButton.setOnClickListener {
            binding.layer.visibility = View.VISIBLE
        }
        binding.motionButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MotionActivity::class.java)
            startActivity(intent)
        }
    }
}
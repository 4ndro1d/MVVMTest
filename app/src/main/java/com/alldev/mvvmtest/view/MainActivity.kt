package com.alldev.mvvmtest.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alldev.mvvmtest.R
import com.alldev.mvvmtest.domain.HelloViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val helloViewModel: HelloViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloText.text = helloViewModel.giveHello()
    }
}

package com.alldev.mvvmtest.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alldev.mvvmtest.R
import com.alldev.mvvmtest.domain.QuoteViewModel
import com.alldev.mvvmtest.presentation.QuotePresenter
import com.alldev.mvvmtest.presentation.QuoteView
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class QuoteActivity : AppCompatActivity(), QuoteView {

    private val quoteViewModel: QuoteViewModel by inject()
    private val presenter: QuotePresenter by inject { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        helloText.text = quoteViewModel.getQuote()

        quoteButton.setOnClickListener {
            presenter.getQuote()
        }
    }

    override fun setQuote(quote: String) {
        quoteText.text = quote
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onViewDestroyed()
    }
}

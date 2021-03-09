package com.joaodanieljr.nybooks.presentation.books

import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.joaodanieljr.nybooks.R
import com.joaodanieljr.nybooks.databinding.ActivityBooksBinding


class BooksActivity : AppCompatActivity() {

    private lateinit var activityBooksBinding: ActivityBooksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBooksBinding = ActivityBooksBinding.inflate(layoutInflater)
        setContentView(activityBooksBinding.root)



        activityBooksBinding.toolBarPrincipal.title = "Books"
        setSupportActionBar(activityBooksBinding.toolBarPrincipal)

    }
}
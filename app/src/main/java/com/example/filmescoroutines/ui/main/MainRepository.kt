package com.example.filmescoroutines.ui.main

import com.example.filmescoroutines.ui.main.model.Movies
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import javax.security.auth.callback.Callback

class MainRepository {


    suspend fun getMovies() : List<Movies>{
       return withContext(Dispatchers.Default){
            delay(3000)
            listOf(
                Movies(1, "Titulo 01"),
                Movies(2, "Titulo 02"),
                Movies(3, "Titulo 03"),
                Movies(4, "Titulo 04"),
                Movies(5, "Titulo 05"),
                Movies(6, "Titulo 06"),
                Movies(7, "Titulo 07")
            )
        }
    }
}
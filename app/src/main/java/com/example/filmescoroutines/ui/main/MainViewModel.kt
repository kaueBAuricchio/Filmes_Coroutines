package com.example.filmescoroutines.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import com.example.filmescoroutines.ui.main.model.Movies
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(
    private val repository: MainRepository,
    private val navController: NavController) : ViewModel() {

     val moviesLiveData = MutableLiveData<List<Movies>>()


        fun getViewModelMovies(){
            CoroutineScope(Dispatchers.Main).launch {
                val movies = withContext(Dispatchers.Default) {
                        repository.getMovies()
                    }
                moviesLiveData.value = movies
            }
        }

    }



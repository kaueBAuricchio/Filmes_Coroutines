package com.example.filmescoroutines.ui.main.di

import androidx.navigation.NavController
import com.example.filmescoroutines.ui.main.MainRepository
import com.example.filmescoroutines.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    factory {
        MainRepository()

    }

    viewModel {(navController : NavController) ->
        MainViewModel(
            repository = get(),
            navController = navController
        )
    }
}
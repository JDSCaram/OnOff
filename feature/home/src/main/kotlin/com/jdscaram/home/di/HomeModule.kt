package com.jdscaram.home.di

import com.jdscaram.home.presentation.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeViewModelModule = module {
    viewModel { HomeViewModel() }
}

val homeKoinModules = listOf(homeViewModelModule)

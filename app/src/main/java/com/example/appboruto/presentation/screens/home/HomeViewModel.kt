package com.example.appboruto.presentation.screens.home

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.example.appboruto.domain.use_cases.UseCases
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    useCases: UseCases
) : ViewModel() {
    val getAllHeroes = useCases.getAllHeroesUseCase()
}
package com.example.appboruto.domain.use_cases

import com.example.appboruto.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import com.example.appboruto.domain.use_cases.get_selected_hero.GetSelectedHeroUseCase
import com.example.appboruto.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.example.appboruto.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import com.example.appboruto.domain.use_cases.search_heroes.SearchHeroesUseCase

data class UseCases(
    val saveOnBoardingUserCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase,
    val searchHeroesUseCase: SearchHeroesUseCase,
    val getSelectedHeroUseCase: GetSelectedHeroUseCase
)

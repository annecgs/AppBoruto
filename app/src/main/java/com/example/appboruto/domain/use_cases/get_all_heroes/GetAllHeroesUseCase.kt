package com.example.appboruto.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import com.example.appboruto.data.repository.Repository
import com.example.appboruto.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>> =
        repository.getAllHeroes()
}

package com.example.appboruto.domain.use_cases.get_selected_hero

import com.example.appboruto.data.repository.Repository
import com.example.appboruto.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero =
        repository.getSelectedHero(heroId = heroId)
}

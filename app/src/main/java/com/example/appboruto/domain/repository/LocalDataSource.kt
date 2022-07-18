package com.example.appboruto.domain.repository

import com.example.appboruto.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}

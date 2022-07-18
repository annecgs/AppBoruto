package com.example.appboruto.data.repository

import com.example.appboruto.data.local.BorutoDatabase
import com.example.appboruto.domain.model.Hero
import com.example.appboruto.domain.repository.LocalDataSource


class LocalDataSourceImpl(borutoDatabase: BorutoDatabase) : LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero =
        heroDao.getSelectedHero(heroId = heroId)
}
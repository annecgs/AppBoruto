package com.example.appboruto.di

import android.content.Context
import androidx.room.Room
import com.example.appboruto.data.local.BorutoDatabase
import com.example.appboruto.data.repository.LocalDataSourceImpl
import com.example.appboruto.domain.repository.LocalDataSource
import com.example.appboruto.util.Constants.BORUTO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): BorutoDatabase =
        Room.databaseBuilder(
            context,
            BorutoDatabase::class.java,
            BORUTO_DATABASE
        ).build()

    @Provides
    @Singleton
    fun provideLocalDataSource(
        database: BorutoDatabase
    ): LocalDataSource =
        LocalDataSourceImpl(borutoDatabase = database)
}

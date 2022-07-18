package com.example.appboruto.domain.use_cases.read_onboarding

import com.example.appboruto.data.repository.Repository
import kotlinx.coroutines.flow.Flow

class ReadOnBoardingUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<Boolean> =
        repository.readOnBoardingState()
}

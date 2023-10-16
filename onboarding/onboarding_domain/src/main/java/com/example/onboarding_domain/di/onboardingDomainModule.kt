package com.example.onboarding_domain.di

import com.example.onboarding_domain.use_case.ValidateNutrients
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent

@Module // each module have some dependencies to provide should contain dagger hilt module, so we create it in this module
@InstallIn(ViewModelComponent::class)  // ViewModelComponent to use provides in just viewModels
object onboardingDomainModule {

    @Provides
    @ViewModelScoped
    fun provideValidateNutrientsUseCase(): ValidateNutrients{
        return ValidateNutrients()
    }
}
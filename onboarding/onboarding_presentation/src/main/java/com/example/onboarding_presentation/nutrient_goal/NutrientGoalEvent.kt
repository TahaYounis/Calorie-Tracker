package com.example.onboarding_presentation.nutrient_goal

sealed class NutrientGoalEvent {
    // if you have more than two events in the screen you should create single screen
    data class OnCarbRatioEnter(val ratio: String): NutrientGoalEvent()
    data class OnProteinRatioEnter(val ratio: String): NutrientGoalEvent()
    data class OnFatRatioEnter(val ratio: String): NutrientGoalEvent()
    object OnNextClick: NutrientGoalEvent()
}
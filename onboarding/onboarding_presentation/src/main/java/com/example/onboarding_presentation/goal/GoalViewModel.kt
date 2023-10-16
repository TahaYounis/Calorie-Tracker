package com.example.onboarding_presentation.goal

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.domain.model.GoalType
import com.example.core.domain.preferences.Preferences
import com.example.core.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GoalViewModel @Inject constructor(
    private val preferences: Preferences
): ViewModel() {

    var selectedGoal by mutableStateOf<GoalType>(GoalType.KeepWeight)
        private set

    // channel used for send one time event to our UI
    // to send UiEvent from viewModel to our composable for example if you want to navigate or show snackBar or show validation
    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    fun onGoalTypeSelect(goalType: GoalType){
        selectedGoal = goalType
    }

    // navigate and send selectedGender into Preferences for save
    fun onNextClick(){
        viewModelScope.launch {
            preferences.saveGoalType(selectedGoal)
            _uiEvent.send(UiEvent.Success)
        }
    }
}
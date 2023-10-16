package com.example.tracker_presentation.search

import com.example.tracker_domain.model.TrackableFood

/* we didn't use class TrackableFood is a model in domain layer that is used to cross our whole application, and there is some
 views or states only relevant for our UI which is our isExpanded boolean or text for amount this views will only used single
 food that is why we created TrackableFoodUiState */
data class TrackableFoodUiState(
    val food: TrackableFood,
    val isExpanded: Boolean = false,
    val amount: String = ""
)
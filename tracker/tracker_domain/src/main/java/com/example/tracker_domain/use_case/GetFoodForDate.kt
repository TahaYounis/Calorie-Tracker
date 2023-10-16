package com.example.tracker_domain.use_case

import com.example.tracker_domain.model.TrackedFood
import com.example.tracker_domain.repository.TrackerRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

class GetFoodForDate(
    private val repository: TrackerRepository
) {
    operator fun invoke(data: LocalDate): Flow<List<TrackedFood>> {
        return repository.getFoodsForDate(data)
    }
}
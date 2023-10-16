package com.example.core_ui

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimensions(
    val default: Dp = 0.dp,
    val spaceExtraSmall: Dp = 4.dp,
    val spaceSmall: Dp = 8.dp,
    val spaceMedium: Dp = 16.dp,
    val spaceLarge: Dp = 32.dp,
    val spaceExtraLarge: Dp = 64.dp
)

// compositionLocalOf: allows you to define a local composition value that can be accessed by child Composables within the same
// composition hierarchy, without explicitly passing it as a parameter. Once you have defined a composition local using
// compositionLocalOf, you can access it using the LocalValue.current
val LocalSpacing = compositionLocalOf { Dimensions() }
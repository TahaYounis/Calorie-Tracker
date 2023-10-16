package com.example.calorietracker.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import com.example.core_ui.BrightBink
import com.example.core_ui.DarkBink
import com.example.core_ui.DarkGray
import com.example.core_ui.Dimensions
import com.example.core_ui.LocalSpacing
import com.example.core_ui.MediumGray
import com.example.core_ui.Orange
import com.example.core_ui.TextWhite

private val DarkColorScheme = darkColors(
    primary = BrightBink,
    primaryVariant = DarkBink,
    secondary = Orange,
    background = MediumGray,
    onBackground = TextWhite,
    surface = LightGray,
    onSurface = TextWhite,
    onPrimary = Color.White,
    onSecondary = Color.White,
)


private val LightColorScheme = lightColors(
    primary = BrightBink,
    primaryVariant = DarkBink,
    secondary = Orange,
    background = Color.White,
    onBackground = DarkGray,
    surface = Color.White,
    onSurface = DarkGray,
    onPrimary = Color.White,
    onSecondary = Color.White,
)


@Composable
fun CalorieTrackerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }
    CompositionLocalProvider(LocalSpacing provides Dimensions()) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}
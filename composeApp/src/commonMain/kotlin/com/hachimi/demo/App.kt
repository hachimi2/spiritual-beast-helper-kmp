package com.hachimi.demo

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview

// commonMain/src/commonMain/kotlin/ResourceLoader.kt

//expect fun loadPainterResource(resId: Int): Painter

@Composable
@Preview
fun App() {
    MaterialTheme {
        ImageSwitcherWithAnimation()
    }
}
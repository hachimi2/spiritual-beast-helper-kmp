package com.hachimi.demo

// commonMain/src/commonMain/kotlin/ImageSwitcherWithAnimation3.kt

import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.toDp
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
//import com.hachimi.demo.ResourceLoader.loadPainterResource


@Composable
actual fun getScreenHeightDp(): Dp {
    val configuration = LocalConfiguration.current
    return with(LocalDensity.current) { configuration.screenHeightDp.dp }
}
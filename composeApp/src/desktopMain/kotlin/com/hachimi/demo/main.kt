package com.hachimi.demo

import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import org.jetbrains.compose.resources.imageResource
import org.jetbrains.compose.resources.painterResource
import spiritanimal.composeapp.generated.resources.Res
import spiritanimal.composeapp.generated.resources.avatar

fun main() = application {
    val icon = painterResource(Res.drawable.avatar)
    Window(
        onCloseRequest = ::exitApplication,
        title = "spiritualBeastHelper",
        state = rememberWindowState(width = 400.dp, height = 820.dp), // 设置窗口的初始大小
        icon = icon

    ) {
        App()
    }
}
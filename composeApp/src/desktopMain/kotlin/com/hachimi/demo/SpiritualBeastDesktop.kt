package com.hachimi.demo

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import java.awt.Toolkit

@Composable
actual fun getScreenHeightDp(): Dp {
    val toolkit = Toolkit.getDefaultToolkit()
    val screenSize = toolkit.screenSize
    val dpi = toolkit.screenResolution
//    val standardDensity = 160.0 // 标准的屏幕密度为160dpi
    val standardDensity = 120.0 // 标准的屏幕密度为160dpi

    // 计算屏幕密度
    val screenDensity = dpi.toDouble() / standardDensity

    // 获取屏幕高度（以像素为单位）
    val screenHeightPx = screenSize.height

    // 将像素转换为 DP
    val screenHeightDp = (screenHeightPx / screenDensity).dp

    return screenHeightDp
}
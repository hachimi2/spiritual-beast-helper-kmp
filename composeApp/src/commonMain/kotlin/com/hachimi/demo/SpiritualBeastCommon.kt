package com.hachimi.demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import org.jetbrains.compose.resources.painterResource
import spiritanimal.composeapp.generated.resources.Res
import spiritanimal.composeapp.generated.resources.image1
import spiritanimal.composeapp.generated.resources.image10
import spiritanimal.composeapp.generated.resources.image2
import spiritanimal.composeapp.generated.resources.image3
import spiritanimal.composeapp.generated.resources.image4
import spiritanimal.composeapp.generated.resources.image5
import spiritanimal.composeapp.generated.resources.image6
import spiritanimal.composeapp.generated.resources.image7
import spiritanimal.composeapp.generated.resources.image8
import spiritanimal.composeapp.generated.resources.image9


expect @Composable fun getScreenHeightDp(): Dp

val imageList = listOf(
    Res.drawable.image1,
    Res.drawable.image2,
    Res.drawable.image3,
    Res.drawable.image4,
    Res.drawable.image5,
    Res.drawable.image6,
    Res.drawable.image7,
    Res.drawable.image8,
    Res.drawable.image9,
    Res.drawable.image10,
)

@Composable
fun ImageSwitcherWithAnimation() {
    val screenHeightDp  = getScreenHeightDp()
    val itemCount = imageList.size
    val topPadding = screenHeightDp * 0.06f
    val grayScaleMatrix = remember { ColorMatrix().apply { setToSaturation(0f) } }

    LazyColumn(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = topPadding)
            .fillMaxSize()
    ) {
        itemsIndexed(imageList) { index, image ->
            var isGrayScale by remember { mutableStateOf(false) }
            val imageHeight = remember((screenHeightDp - topPadding), itemCount) {
                if (itemCount > 0) {
                    ((screenHeightDp - topPadding) / itemCount).coerceAtLeast(40.dp)
                } else {
                    0.dp
                }
            }
            Box(
                modifier = Modifier
                    .height(imageHeight)
                    .clickable { isGrayScale = !isGrayScale }
                    .alpha(1f) // 保持 alpha 为 1f
            ) {
                Image(
                    painterResource(image),
                    contentDescription = "Image $index",
                    modifier = Modifier.height(imageHeight).aspectRatio(4.137f),
                    contentScale = ContentScale.Crop,
                    colorFilter = if (isGrayScale) {
                        ColorFilter.colorMatrix(grayScaleMatrix)
                    } else {
                        null
                    }
                )
            }
        }
    }
}
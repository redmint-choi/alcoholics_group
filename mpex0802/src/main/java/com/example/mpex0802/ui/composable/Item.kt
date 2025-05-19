package com.example.mpex0802.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.mpex0802.model.ItemModel

@Composable
fun Item(item: ItemModel) {
    // TODO:mpex0802:LazyColumn 항목 만들기
    Column(modifier = Modifier.padding(10.dp)) {
        Text(item.title ?: "", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text("${item.author} - ${item.publishedAt}", fontStyle = FontStyle.Italic)
        Text(item.description ?: "")
        AsyncImage(model = item.urlToImage, contentDescription = "news image")
    }
}
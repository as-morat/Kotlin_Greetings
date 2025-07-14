package com.example.first_app

import androidx.annotation.Px
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExample(modifier: Modifier = Modifier) {

    LazyColumn{
        items(count = 100){
            index ->
            Text("Item $index",
                modifier = modifier.padding(5.dp))
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun LazyColumnPrev(modifier: Modifier = Modifier) {
    LazyColumnExample()
}
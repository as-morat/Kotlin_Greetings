package com.example.first_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColumnExample() {

    Column (
        modifier = Modifier.background(color = Color.White).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Hello Ash !!",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 50.sp,
            color = colorResource(R.color.purple_700)
        )
        Text("Welcome to the app world",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            color = colorResource(R.color.deep_purple_500)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.purple_200)),
            shape = RoundedCornerShape(20.dp)) {
            Text("Do Something",
                color = colorResource(R.color.white))
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun ColumnLayoutPrev() {
    ColumnExample()
}
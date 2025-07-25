package com.example.first_app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Toggle(modifier: Modifier = Modifier) {

    var isChecked by remember { mutableStateOf(false) }

    Row (horizontalArrangement = Arrangement.Center, modifier = modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically){
        Checkbox(
            checked = isChecked,
            onCheckedChange = { isChecked = it }
        )
        Text(
            if (isChecked) "Checked"
            else "Unchecked"
        )
    }

}
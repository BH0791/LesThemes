package fr.hamtec.lesthemes.composables

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fr.hamtec.lesthemes.ui.theme.fira_code
import fr.hamtec.lesthemes.ui.theme.Lobster_Two

@Composable
fun MyCompFont(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Je suis Fira Code",
            fontFamily = fira_code,
            fontSize = 30.sp,
            fontWeight = FontWeight.Light,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = MaterialTheme.shapes.extraLarge)
        )
        Text(
            fontFamily = Lobster_Two,
            text = "Je suis Lobster Two",
            fontSize = 30.sp
        )
        Text(
            text = "Test",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyCompFontPreview() {
    MyCompFont()
}
package fr.hamtec.lesthemes.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import fr.hamtec.lesthemes.ui.theme.fira_code
import fr.hamtec.lesthemes.ui.theme.fontFamily

@Composable
fun MyCompFont(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Je suis Fira Code",
            fontFamily = fira_code,
            fontSize = 30.sp,
            fontWeight = FontWeight.Light,
            fontStyle = FontStyle.Italic
        )
        Text(
            fontFamily = fontFamily,
            text = "Hello World!",
            fontSize = 30.sp
        )
        Text(
            text = "Test",
            style = MaterialTheme.typography.titleLarge
        )
    }
}
@Preview(showBackground = true)
@Composable
fun MyCompFontPreview() {
    MyCompFont()
}
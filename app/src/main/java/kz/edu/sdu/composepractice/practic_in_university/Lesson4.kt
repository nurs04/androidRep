package kz.edu.sdu.composepractice.practic_in_university

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kz.edu.sdu.composepractice.R
import kz.edu.sdu.composepractice.ui.theme.ComposePracticeTheme

class Lesson4 : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ComposePracticeTheme {
                Surface (modifier = Modifier){

                }
            }
        }
    }
}


@Composable
fun ListGrid() {
    Card (modifier = Modifier.fillMaxWidth(0.5f)){
        Row {
            Image(
                painter = painterResource(id = R.drawable.pict1),
                contentDescription = "Grid Images",
                modifier = Modifier
            )

            Column (modifier = Modifier.padding(16.dp)){
                Text(text = "Photopraphy")
                Row {
                    Text(text = "321")
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun viewList(){
    ListGrid()
}
package kz.edu.sdu.composepractice.course_codelab.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kz.edu.sdu.composepractice.R
import kz.edu.sdu.composepractice.ui.theme.ComposePracticeTheme

class DiceRoller : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ComposePracticeTheme {
                Surface(modifier = Modifier) {
                    DiceButtonImage()
                }
            }
        }
    }
}

@Composable
fun DiceButtonImage(modifier : Modifier = Modifier){
    var result by remember {
        mutableStateOf(1)
    }
    val imageRes = when(result){
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()

    ){
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = result.toString(),
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { result = (1..6).random()}) {
            Text(text = stringResource(id = R.string.dice))
        }
    }
}



@Preview
@Composable
fun PreViewDice(){
    ComposePracticeTheme {
            DiceButtonImage()
    }
}
package kz.edu.sdu.composepractice.course_codelab.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kz.edu.sdu.composepractice.R
import kz.edu.sdu.composepractice.course_codelab.model.LemonData
import kz.edu.sdu.composepractice.ui.theme.ComposePracticeTheme

class ClickBehavior : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ComposePracticeTheme {
                Surface(modifier = Modifier) {
                    LemonadeApp()                }
            }
        }
    }
}



@Composable
fun AppBar(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color.Yellow)
            .fillMaxWidth()
            .height(50.dp)) {
        Text(
            text = "Lemonade",
            fontSize = 18.sp,
        )
    }
}

@Composable
fun ImageText(){
    var position by remember {
        mutableStateOf(0)
    }
    val imgRes = listOf(
        LemonData(R.drawable.lemon_tree, R.string.lemon_1),
        LemonData(R.drawable.lemon_squeeze, R.string.lemon_2),
        LemonData(R.drawable.lemon_drink, R.string.lemon_3),
        LemonData(R.drawable.lemon_restart, R.string.lemon_4)
            )
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = imgRes[position].image),
            contentDescription = position.toString(),
            modifier = Modifier.clickable {
                position = (position + 1 + imgRes.size) % imgRes.size
            }
        )

        Text(text = stringResource(id = imgRes[position].text),
            modifier = Modifier.padding(top=10.dp)
            )
    }
}


@Composable
fun LemonadeApp(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        AppBar()
        Spacer(modifier = Modifier.padding(100.dp))
        ImageText()
    }
}




@Preview(showSystemUi = true)
@Composable
fun PreViewLemonade(){
//    AppBar()
    LemonadeApp()
}
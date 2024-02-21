package kz.edu.sdu.composepractice.practic_in_university

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kz.edu.sdu.composepractice.R
import kz.edu.sdu.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeWork()
                }
            }
        }
    }
}

//@Composable
//fun SetImage(){
//    val image = painterResource(id = R.drawable.bg_compose_background)
//    Image(painter = image,
//          contentDescription = "Top image",
//        Modifier
//            .fillMaxWidth()
//        )
//}
//
//@Composable
//fun SetText(first : String, second : String, third : String){
//    Text(
//        text = first,
//        fontSize = 24.sp,
//        modifier = Modifier.padding(16.dp)
//    )
//
//    Text(
//        text = second,
//        textAlign = TextAlign.Justify,
//        modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 0.dp)
//        )
//
//    Text(
//        text = third,
//        textAlign = TextAlign.Justify,
//        modifier = Modifier.padding(16.dp)
//        )
//
//}


//@Composable
//fun TaskManager(t1 : String, t2 : String){
//    val img = painterResource(id = R.drawable.ic_task_completed)
//
//    Column(modifier = Modifier
//           .fillMaxSize()
//           .padding(16.dp),
//           verticalArrangement = Arrangement.Center,
//           horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//
//
//        Image(painter = img, contentDescription = "Done img")
//
//        Text(
//            text = t1,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier.padding(0.dp, 24.dp, 0.dp, 8.dp),
//        )
//
//        Text(
//            text = t2,
//            fontSize = 16.sp,
//        )
//    }
//}




//@Composable
//fun ComposeQuadrant() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .weight(1f)
//        ) {
//            Box(
//                modifier = Modifier
//                    .background(Color(0xFFEADDFF))
//                    .fillMaxHeight()
//                    .weight(1f)
//                    .padding(16.dp)
//                    .wrapContentSize(Alignment.Center)
//
//            ) {
//                Column {
//                    Text(
//                        text = "Text composable",
//                        modifier = Modifier.padding(16.dp),
//                        fontWeight = FontWeight.Bold
//                    )
//
//                    Text(
//                        textAlign = TextAlign.Justify,
//                        text = "Displays text and follows the recommended Material Design guidelines."
//                    )
//                }
//            }
//
//            Box(
//                modifier = Modifier
//                    .background(Color(0xFFD0BCFF))
//                    .fillMaxHeight()
//                    .weight(1f)
//                    .padding(16.dp)
//                    .wrapContentSize(Alignment.Center)
//            ) {
//                Column {
//
//                    Text(
//                        fontSize = 13.sp,
//                        text = "Image composable",
//                        modifier = Modifier.padding(16.dp),
//                        fontWeight = FontWeight.Bold
//                    )
//                    Text(
//                        textAlign = TextAlign.Justify,
//                        text = "Creates a composable that lays out and draws a given Painter class object.",
//                    )
//                }
//            }
//        }
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .weight(1f)
//        ) {
//            Box(
//                modifier = Modifier
//                    .background(Color(0xFFB69DF8))
//                    .fillMaxHeight()
//                    .weight(1f)
//                    .padding(16.dp)
//                    .wrapContentSize(Alignment.Center)
//            ) {
//                Column {
//
//                    Text(
//                        text = "Row composable",
//                        modifier = Modifier.padding(16.dp),
//                        fontWeight = FontWeight.Bold
//
//                    )
//                    Text(
//                        textAlign = TextAlign.Justify,
//                        text = "A layout composable that places its children in a horizontal sequence.",
//                    )
//                }
//            }
//            Box(
//                modifier = Modifier
//                    .background(Color(0xFFF6EDFF))
//                    .fillMaxHeight()
//                    .weight(1f)
//                    .padding(16.dp)
//                    .wrapContentSize(Alignment.Center)
//
//            ) {
//                Column {
//
//                    Text(
//                        fontSize = 13.sp,
//                        text = "Column composable",
//                        modifier = Modifier.padding(16.dp),
//                        fontWeight = FontWeight.Bold
//                    )
//                    Text(
//                        textAlign = TextAlign.Justify,
//                        text = "A layout composable that places its children in a vertical sequence.",
//                    )
//                }
//            }
//        }
//    }
//}




@Composable
fun HomeWork() {
    var count = remember {
        mutableStateOf(0)
    }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(),
            contentAlignment = Alignment.Center

        ) {
            Column {
                Card(
                    shape = RoundedCornerShape(10),
                    modifier = Modifier
                        .width(180.dp)
                        .height(200.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "Profile Photo",
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxSize()
                    )
                }

                Text(
                    text = "Nursultan Orynbasarov",
                    modifier = Modifier.padding(top = 30.dp),
                    fontSize = 14.sp,
                    fontFamily = FontFamily.Monospace
                )

                Text(
                    text = "15.04.2004",
                    modifier = Modifier.padding(top = 10.dp, start = 50.dp),
                    fontFamily = FontFamily.Monospace
                )

                Text(
                    text = "Computer Science",
                    modifier = Modifier.padding(top = 10.dp, start = 20.dp),
                    fontFamily = FontFamily.Monospace)

                Card (
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .width(180.dp)
                        .height(40.dp)
                ){
                    Text(
                        text = "Click me!",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(top = 11.dp)
                            .clickable { count.value++ }
                        )
                }

                Text(
                    modifier = Modifier.padding(top = 100.dp, start = 75.dp),
                    text = count.value.toString(),
                    fontSize = 60.sp,
                    fontFamily = FontFamily.Serif
                )
            }
        }
}
@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
//        Column {
//            SetImage()
//            SetText(first = stringResource(id = R.string.first), second = stringResource(id = R.string.second), third = stringResource(id = R.string.third))
//            TaskManager("All tasks completed", "Nice work!")

//            ComposeQuadrant()
              HomeWork()
        }
//    }
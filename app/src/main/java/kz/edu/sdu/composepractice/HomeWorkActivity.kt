package kz.edu.sdu.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kz.edu.sdu.composepractice.ui.theme.ComposePracticeTheme

class HomeWorkActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ComposePracticeTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    ArtWork()
                }
            }
        }
    }
}

@Composable
fun ArtWork() {
    val imageList = listOf(R.drawable.pict1, R.drawable.pict2, R.drawable.pict3, R.drawable.pict4, R.drawable.pict5, R.drawable.pict6, R.drawable.pict7, R.drawable.pict8, R.drawable.pict9, R.drawable.pict10,)
    val title = listOf("Flower umbrella","Crystal Apple","Mountain and river","Tanos and Moon","Santa Kid","Firework","Tiger in mirror","Valentine","Bird","Christmas Tree",)
    val year = listOf("1900 year","2024 year","2013 year","2019 year","2004 year","2023 year","2000 year","14 February","100 year","2024 year",)
    var currentImage by remember { mutableStateOf(0) }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier.fillMaxHeight()) {
            Card(
                modifier = Modifier
                    .padding(top = 50.dp, bottom = 0.dp, start = 35.dp),
                elevation = CardDefaults.cardElevation(12.dp),
            ) {
                Image(
                    painter = painterResource(id = imageList[currentImage]),
                    contentDescription = "Image",
                    Modifier
                        .width(320.dp)
                        .height(400.dp)
                        .padding(22.dp)
                        .background(Color.White),
                    contentScale = ContentScale.Crop
                )
            }

            Column (modifier = Modifier.padding(top = 50.dp)){
                Text(
                    text = title[currentImage], modifier = Modifier.fillMaxWidth(), fontSize = 36.sp, fontFamily = FontFamily.Monospace, textAlign = TextAlign.Center
                )
                Text(text = year[currentImage],fontSize = 26.sp, fontFamily = FontFamily.Monospace, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 100.dp)
            ) {
                Button(
                    onClick = {currentImage = (currentImage - 1 + imageList.size) % imageList.size},
                    modifier = Modifier
                        .weight(1f)
                        .height(50.dp)
                        .padding(start = 10.dp, end = 10.dp)
                        .background(MaterialTheme.colorScheme.primary, RoundedCornerShape(10.dp))
                ) {
                    Text(text = "Previous")
                }
                Button(
                    onClick = {currentImage = (currentImage + 1 + imageList.size) % imageList.size},
                    modifier = Modifier
                        .weight(1f)
                        .height(50.dp)
                        .padding(start = 10.dp, end = 10.dp)
                        .background(MaterialTheme.colorScheme.primary, RoundedCornerShape(10.dp))
                ) {
                    Text(text = "Next")
                }
            }
        }
    }
}





@Preview(showBackground = true,
         showSystemUi = true)
@Composable
fun PreviewArt(){
    ArtWork()
}
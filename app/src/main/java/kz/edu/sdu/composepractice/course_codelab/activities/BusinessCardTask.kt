package kz.edu.sdu.composepractice.course_codelab.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kz.edu.sdu.composepractice.R

class BusinessCardTask : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Surface {
                BusinessCard()
            }
        }
    }
}




@Composable
fun BusinessCard(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 140.dp)
    ){
        Card (
            modifier = Modifier
                .width(140.dp)
                .height(200.dp)){
            Image(
                painter = painterResource(id = R.drawable.pict4),
                contentDescription = "Profile",
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxSize()
                    .padding(8.dp),
            )
        }

        Text(
            text = stringResource(id = R.string.fullname),
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = stringResource(id = R.string.major),
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 16.dp)
        )


        Column (
            modifier = Modifier
                .padding(top = 100.dp)){

            Row(modifier = Modifier.padding(top = 16.dp)){
                Image(
                    painter = painterResource(id = R.drawable.user_octagon),
                    contentDescription = "phone icon",
                )
                Text(
                    text = stringResource(id = R.string.number),
                    modifier = Modifier.padding(start = 8.dp),
                )
            }

            Row(modifier = Modifier.padding(top = 16.dp)){
                Image(
                    painter = painterResource(id = R.drawable.sms),
                    contentDescription = "phone icon",
                )
                Text(
                    text = stringResource(id = R.string.email),
                    modifier = Modifier.padding(start = 8.dp),

                )
            }

            Row(modifier = Modifier.padding(top = 16.dp)){
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = "phone icon",
                )
                Text(
                    text = stringResource(id = R.string.socialhandle),
                    modifier = Modifier.padding(start = 8.dp),
                )
            }

        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreView(){
    BusinessCard()
}
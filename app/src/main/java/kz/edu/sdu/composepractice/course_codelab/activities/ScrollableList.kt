package kz.edu.sdu.composepractice.course_codelab.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kz.edu.sdu.composepractice.R
import kz.edu.sdu.composepractice.course_codelab.data.DataCourse
import kz.edu.sdu.composepractice.course_codelab.model.Affirmation
import kz.edu.sdu.composepractice.ui.theme.ComposePracticeTheme

class ScrollableList : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ComposePracticeTheme {
                Surface {
                    AffirmationApp()
                }
            }
        }
    }
}


@Composable
fun AffirmationApp(){
    AffirmationList(affirmationList = DataCourse().loadInformation())
}


@Composable
fun AffirmationList(affirmationList : List<Affirmation>, modifier : Modifier = Modifier){
    LazyColumn(modifier = Modifier){
         items(affirmationList) { affirmation ->
            AffirmationCard(
                affirmation = affirmation,
                modifier = Modifier.padding(8.dp)
            )
         }
    }
}

@Composable
fun AffirmationCard(affirmation: Affirmation, modifier: Modifier = Modifier){
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(id = affirmation.imageResId),
                contentDescription = affirmation.imageResId.toString(),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = LocalContext.current.getString(affirmation.stringResId),
                modifier = Modifier
                )
        }
    }
}



@Preview
@Composable
fun PreviewAffirmationCard(){
    AffirmationCard(affirmation = Affirmation(R.string.affirmation1, R.drawable.image1))
}
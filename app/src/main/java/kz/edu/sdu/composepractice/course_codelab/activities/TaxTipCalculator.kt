package kz.edu.sdu.composepractice.course_codelab.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kz.edu.sdu.composepractice.ui.theme.ComposePracticeTheme
import java.text.NumberFormat

class TaxTipCalculator : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ComposePracticeTheme {
                Surface {
                    
                }
            }
        }
    }
}


@Composable
fun TaxTip(){
    var amountInput by remember { mutableStateOf("") }
    var taxInput by remember { mutableStateOf("")}
    var roundUp by remember { mutableStateOf(false)}

    val amount = amountInput.toDouble() ?: 0.0
    val taxPercent = amountInput.toDouble() ?: 0.0
    val tax = calculateTax(amount, taxPercent, roundUp)


    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {
        Text(text = "Calculate Tax")

    }
}



private fun calculateTax(amount : Double, taxPercent : Double, roundUp : Boolean) : String{
    var tax = taxPercent / 100 * amount
    if(roundUp){
        tax = kotlin.math.ceil(tax)
    }
    return NumberFormat.getCurrencyInstance().format(tax)
}

@Preview
@Composable
fun PreViewApp(){
    TaxTip()
}
package com.davit.bustimetable

import android.health.connect.datatypes.units.Percentage
import android.os.Bundle
import android.text.Layout.Directions
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.neverEqualPolicy
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.davit.bustimetable.ui.theme.BusTimetableTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusTimetableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}



/*
@Preview(showBackground = true)
@Composable
fun MyApp(modifier: Modifier = Modifier) {

    ConstraintLayout(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(0.3f)) {

        val (number, dir1, dir2, express) = createRefs()



        // MADRID




        // PEDREZUELA
        Card(
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .padding(end = 16.dp, bottom = 16.dp)
                .constrainAs(dir2) {
                    start.linkTo(number.end)
                    end.linkTo(parent.end)
                    top.linkTo(dir1.bottom)
                },
            colors = CardDefaults.cardColors(colorResource(id = R.color.background_color))
        ) {
            Text(
                text = stringResource(id = R.string.pedre),
                modifier = Modifier
                    .padding(horizontal = 14.dp, vertical = 3.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold
                ),

                )
        }

        // EXPRESS
        Card (
            modifier = Modifier
                .fillMaxWidth(0.4f)
                .constrainAs(express) {
                    top.linkTo(dir2.bottom)
                    start.linkTo(number.end)
                    bottom.linkTo(bar1)
                }
                .padding(bottom = 16.dp, end = 16.dp)
                .fillMaxSize()

        ){
            Text(text = "Express")
        }

    }
}





@Composable
fun Title() {
    // 193


}

@Preview(showBackground = true)
@Composable
private fun prevTitle() {
    Title()
}*/

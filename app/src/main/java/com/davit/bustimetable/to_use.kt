package com.davit.bustimetable

import android.health.connect.datatypes.units.Percentage
import android.os.Bundle
import android.text.Layout.Directions
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Icon
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
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
            App()
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun App() {

    ConstraintLayout(Modifier.fillMaxSize()) {

        val (mainCard, dirs, opts) = createRefs()

        val mainBarrier = createBottomBarrier(mainCard)

        MainCard(modifier = Modifier
            .constrainAs(mainCard) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
            .fillMaxWidth(0.4f)
            .fillMaxHeight(0.3f))

        Directions(
            modifier = Modifier
                .constrainAs(dirs) {
                    top.linkTo(mainCard.top)
                    end.linkTo(parent.end)
                    start.linkTo(mainCard.end)
                }
                .fillMaxWidth(0.6f)
                .fillMaxHeight(0.11f)
        )

        Options(
            modifier = Modifier
                .constrainAs(opts) {
                    top.linkTo(dirs.bottom)
                    start.linkTo(mainCard.end)
                    end.linkTo(parent.end)
                }
                .fillMaxWidth(0.6f)
                .fillMaxHeight(0.19f)
        )

    } // end of constraint
}

@Composable
fun MainCard(modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            border = BorderStroke(1.dp, color = Color(86, 179, 89, 255)),
            colors = CardDefaults.cardColors(colorResource(id = R.color.main_color))
        ) {

            Text(
                text = stringResource(id = R.string.bus_lane),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 5.dp),
                style = TextStyle(
                    fontSize = 60.sp,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold
                )
            )

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth(0.82f)
                        .fillMaxHeight(0.82f),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(Color(R.color.background_color))
                ) {
                    Image(
                        modifier = Modifier
                            .fillMaxSize(),
                        painter = painterResource(id = R.drawable.info),
                        contentDescription = null
                    )
                }
            }
        }
    }
}


@Composable
fun Directions(modifier: Modifier) {

    Column(modifier.padding(top = 16.dp)) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.background_color))
        ) {
            Text(
                text = stringResource(id = R.string.madrid),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            )
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, end = 16.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.main_color))
        ) {
            Text(
                text = stringResource(id = R.string.pedre),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            )
        }
    }

}

@Composable
fun Options(modifier: Modifier) {

    Row(
        modifier = modifier.padding(top = 10.dp, end = 16.dp, bottom = 16.dp)
    ) {

        Card(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.6f),
            colors = CardDefaults.cardColors(Color(84, 160, 159, 255)),
            shape = RoundedCornerShape(10.dp)
        ) {

            Column(
                Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "EXPRESS",
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.29f)
                        .padding(top = 5.dp),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = FontFamily.Serif,
                        color = Color(255, 255, 255, 255)
                    )
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.fillMaxSize(0.82f),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(Color(R.color.background_color))
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.acute),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                        )

                    }
                }


            }

        }

        Card(
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 16.dp)
                .fillMaxWidth(1f),
            colors = CardDefaults.cardColors(Color(144, 136, 173, 255)),
            shape = RoundedCornerShape(10.dp)
        ) {


            OutlinedButton(
                onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp),
            ) {

                Icon(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    painter = painterResource(id = R.drawable.north), contentDescription = null
                )
            }


        }

    }

}

@Composable
fun getScreenDimensions(cords: String): Int {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp

    if (cords == "x") {
        return (screenWidth.toString().split("."))[0].toInt()
    } else if (cords == "y") {
        return (screenHeight.toString().split("."))[0].toInt()
    }

    return 0
}



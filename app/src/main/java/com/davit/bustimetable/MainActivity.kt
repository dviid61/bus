package com.davit.bustimetable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout


@Preview(showSystemUi = true)
@Composable
fun App(){

    ConstraintLayout {
        MainCard(modifier = Modifier)
    }


}

@Composable
fun MainCard(modifier: Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth(0.4f)
            .fillMaxHeight(0.3f),
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

@Composable
fun getScreenDimensions(cords: String): Int {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp

    if (cords == "x"){
        return (screenWidth.toString().split("."))[0].toInt()
    } else if (cords == "y"){
        return (screenHeight.toString().split("."))[0].toInt()
    }

    return 0
}

package com.example.shoesapp.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.example.shoesapp.R

class HomeScreen : Screen {
    @Composable
    override fun Content() {
        homescreen()
    }


    @Composable
    fun homescreen(){

        Box {
            Row {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.cart),
                        contentDescription = null,
                        modifier = Modifier.size(50.dp),
                    )
                }
            }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Store Location",
                       fontFamily = FontFamily(Font(resId = R.font.airbnbcereal_w_bk)),
                       fontSize = 12.sp,
                       color = Color(0xff707B81),
                   )
           
            Spacer(modifier = Modifier.height(2.dp))
            Row{
                Icon(painter = painterResource(id = R.drawable.location),
                    contentDescription =null,
                    modifier = Modifier.size(18.dp).
                    clickable {
                        
                    },
                    tint = Color(0xffF87265)
                )
                   Text(text = "Mondolibug, Sylhet",
                       fontFamily = FontFamily(Font(resId = R.font.airbnbcereal_w_md)),
                       fontSize = 14.sp,
                       color = Color(0xff1A2530),
                   )
            }
        }
            
        }
    }
}
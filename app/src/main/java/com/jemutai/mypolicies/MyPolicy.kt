package com.jemutai.mypolicies

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jemutai.mypolicies.data.PolicyCard

val myPolicy = listOf(
    PolicyCard(
        title = "HEALTH COVER",
        policyNumber = "EQI/0001/2024",
        status = "ACTIVE",
        expDate = "34FGF",
        premium = 56009,
        icon = Icons.Outlined.AddCircle

    ),
    PolicyCard(
        title = "THIRD PARTY COVER",
        policyNumber = "EQI/000123/2024",
        status = "ACTIVE",
        expDate = "34FGF",
        premium = 9834,
        icon = Icons.Rounded.Person

    ),
    PolicyCard(
        title = "DOMESTIC COVER",
        policyNumber = "EQI/00341/2024",
        status = "LAPSED",
        expDate = "34FGF",
        premium = 6743,
        icon = Icons.Rounded.Home

    ),
)
@Composable
fun MyPolicy() {

    Column {
        Text(
            text = "My Policies",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(16.dp)
        )

        LazyColumn {
items(myPolicy.size){index ->

MyPolicyCard(index = index )
}

        }
    }
}

@Composable
fun  MyPolicyCard(index:Int) {

    val plcy = myPolicy[index]
    var lastItemPaddingEnd = 0.dp
    if (index == myPolicy.size - 1) {
        lastItemPaddingEnd = 16.dp
    }


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Button with a background color and text inside it
            Button(
                onClick = {}, // Empty onClick makes the button not clickable
                modifier = Modifier.padding(end = 16.dp),
                // colors = Color.Blue// Set the background color
            ) {
                Text(text = plcy.status, style = MaterialTheme.typography.headlineSmall, color = Color.White) // Text inside the button
            }


        }

        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
//                .background(plcy.color)
                .width(250.dp)
                .height(160.dp)
                .padding(vertical = 12.dp, horizontal = 16.dp),

            verticalArrangement = Arrangement.Center

        ) {
//            Text(text = plcy.icon, style = MaterialTheme.typography.headlineSmall, color = Color.White)
//
//            Spacer(modifier = Modifier.height(8.dp))
            Text(text = plcy.title, style = MaterialTheme.typography.headlineSmall, color = Color.White)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = plcy.policyNumber, style = MaterialTheme.typography.headlineSmall, color = Color.White)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = plcy.expDate, style = MaterialTheme.typography.headlineSmall, color = Color.White)
//
        }
    }
}



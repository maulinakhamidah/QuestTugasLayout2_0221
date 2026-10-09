package com.example.questtugaslayout_0221

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = bgColorRes)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.desc_logo_umy),
                modifier = Modifier.size(50.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = namaRes),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = if (isItalicNama) FontStyle.Italic else FontStyle.Normal,
                    color = colorResource(id = namaColorRes)
                )
                Text(
                    text = stringResource(id = noRes),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = detailColorRes)
                )
                Text(
                    text = stringResource(id = alamatRes),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = detailColorRes)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.desc_logo_umy),
                modifier = Modifier.size(50.dp)
            )
        }
    }
}
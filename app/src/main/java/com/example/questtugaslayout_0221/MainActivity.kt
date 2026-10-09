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



        Spacer(modifier = Modifier.height(12.dp))

        ItemCard(
            namaRes = R.string.nama_rania,
            noRes = R.string.no_rania,
            alamatRes = R.string.alamat_rania,
            bgColorRes = R.color.card_blue,
            namaColorRes = R.color.white,
            detailColorRes = R.color.cyan_text
        )

        Spacer(modifier = Modifier.height(12.dp))

        ItemCard(
            namaRes = R.string.nama_ahmad,
            noRes = R.string.no_ahmad,
            alamatRes = R.string.alamat_ahmad,
            bgColorRes = R.color.card_green,
            namaColorRes = R.color.white,
            detailColorRes = R.color.cyan_text
        )


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



        Spacer(modifier = Modifier.height(24.dp))

        ItemCard(
            namaRes = R.string.nama_maulina,
            noRes = R.string.no_maulina,
            alamatRes = R.string.alamat_maulina,
            bgColorRes = R.color.card_grey,
            namaColorRes = R.color.white,
            detailColorRes = R.color.yellow_text,
            isItalicNama = true
        )

        Spacer(modifier = Modifier.height(12.dp))

        ItemCard(
            namaRes = R.string.nama_rahma,
            noRes = R.string.no_rahma,
            alamatRes = R.string.alamat_rahma,
            bgColorRes = R.color.card_purple,
            namaColorRes = R.color.white,
            detailColorRes = R.color.cyan_text
        )

     
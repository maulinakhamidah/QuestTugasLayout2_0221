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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                MainLayout()
            }
        }
    }
}

@Composable
fun MainLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = stringResource(id = R.string.txt_header_title),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = stringResource(id = R.string.txt_header_subtitle),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

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

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(id = R.string.txt_footer_copyright),
            fontSize = 12.sp,
            color = Color.Gray,
            modifier = Modifier.padding(bottom = 12.dp)
        )
    }
}

@Composable
fun ItemCard(
    namaRes: Int,
    noRes: Int,
    alamatRes: Int,
    bgColorRes: Int,
    namaColorRes: Int,
    detailColorRes: Int,
    isItalicNama: Boolean = false
) {
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
package com.solijon.portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.solijon.portfolio.ui.MainScreen
import com.solijon.portfolio.ui.theme.SolijonPortfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SolijonPortfolioTheme {
                MainScreen()
            }
        }
    }
}

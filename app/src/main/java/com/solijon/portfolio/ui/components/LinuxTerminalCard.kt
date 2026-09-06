package com.solijon.portfolio.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.solijon.portfolio.data.PortfolioRepository

@Composable
fun LinuxTerminalCard(
    modifier: Modifier = Modifier
) {
    var outputHistory by remember {
        mutableStateOf(
            listOf(
                "$ whoami",
                "solijon (Freelancer & Frontend Developer)",
                "$ uname -r",
                "Linux 6.8.0-generic (Ubuntu / Zorin OS)",
                "$ cat motto.txt",
                PortfolioRepository.motto
            )
        )
    }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .testTag("linux_terminal_card"),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF0D1117)
        ),
        border = CardDefaults.outlinedCardBorder()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
        ) {
            // Window control buttons
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(modifier = Modifier.size(10.dp).clip(CircleShape).background(Color(0xFFFF5F56)))
                Spacer(modifier = Modifier.width(6.dp))
                Box(modifier = Modifier.size(10.dp).clip(CircleShape).background(Color(0xFFFFBD2E)))
                Spacer(modifier = Modifier.width(6.dp))
                Box(modifier = Modifier.size(10.dp).clip(CircleShape).background(Color(0xFF27C93F)))

                Spacer(modifier = Modifier.width(12.dp))

                Text(
                    text = "solijon@linux-desktop:~",
                    color = Color(0xFF8B949E),
                    fontFamily = FontFamily.Monospace,
                    fontSize = 12.sp
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Terminal output area
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 140.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                outputHistory.forEach { line ->
                    val color = when {
                        line.startsWith("$") -> Color(0xFF58A6FF)
                        line.startsWith("“") || line.contains("Bilim") -> Color(0xFFE3B341)
                        else -> Color(0xFFC9D1D9)
                    }
                    Text(
                        text = line,
                        color = color,
                        fontFamily = FontFamily.Monospace,
                        fontSize = 12.sp,
                        lineHeight = 16.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Interactive quick command chips
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                TerminalCommandChip("whoami") {
                    outputHistory = outputHistory + listOf("$ whoami", "solijon - Frontend amaliyotchisi & Linux ixlosmandi")
                }
                TerminalCommandChip("skills") {
                    outputHistory = outputHistory + listOf("$ skills", "React, JS, HTML, CSS, Telegram Bot API, Linux Terminal, Office")
                }
                TerminalCommandChip("cat quote") {
                    outputHistory = outputHistory + listOf("$ cat quote", PortfolioRepository.footerQuote)
                }
                TerminalCommandChip("clear") {
                    outputHistory = listOf("$ clear")
                }
            }
        }
    }
}

@Composable
private fun TerminalCommandChip(command: String, onClick: () -> Unit) {
    Surface(
        onClick = onClick,
        shape = RoundedCornerShape(6.dp),
        color = Color(0xFF21262D)
    ) {
        Text(
            text = "$ $command",
            color = Color(0xFF7EE787),
            fontFamily = FontFamily.Monospace,
            fontSize = 11.sp,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        )
    }
}

package com.solijon.portfolio.data

data class SkillItem(
    val id: String,
    val title: String,
    val description: String,
    val details: String,
    val tags: List<String>,
    val iconType: String
)

data class ProjectItem(
    val id: String,
    val title: String,
    val platform: String,
    val description: String,
    val url: String,
    val badge: String
)

data class SocialLink(
    val platform: String,
    val handleOrTitle: String,
    val url: String,
    val iconName: String,
    val isPrimary: Boolean = false
)

data class HighlightItem(
    val title: String,
    val description: String,
    val category: String
)

object PortfolioRepository {
    val name = "Solijon Solayev"
    val headline = "Freelancer | Frontend amaliyotchisi | Linux & Telegram bot ixlosmandi"
    val motto = "“Men haqimda odamlar ko'proq bilishlarini, tarixdan shunchaki izsiz o'tib ketmaslikni xohlayman.”"
    val footerQuote = "“Bilim — bu kuch, lekin amal — uning isboti.” ⚡"
    val email = "solijonsolayev2003@gmail.com"
    val year = "2025"

    val bioParagraphs = listOf(
        "Assalomu alaykum! Men Solijon Solayev — mustaqil ishlab chiquvchi, Linux foydalanuvchisi va Telegram botlar bilan ishlashni yoqtiruvchi freelancer.",
        "Hozirda Frontend yo‘nalishida amaliyotchi sifatida o‘sib borayapman.",
        "Office dasturlarini chuqur bilaman (Word, Excel, PowerPoint, Canva va boshqalar).",
        "Texnologiyalar, avtomatlashtirish va samarali ish tizimlariga qiziqaman."
    )

    val skills = listOf(
        SkillItem(
            id = "frontend",
            title = "Frontend dasturlash",
            description = "HTML, CSS, JavaScript, React bilan zamonaviy veb interfeyslar",
            details = "Minimalistik, tezkor va foydalanuvchiga qulay veb sahifalar hamda komponentlar yaratish. Responsive dizayn va toza kod arxitekturasi.",
            tags = listOf("HTML5", "CSS3", "JavaScript", "React", "Responsive UI"),
            iconType = "code"
        ),
        SkillItem(
            id = "telegram_bots",
            title = "Telegram Bot ishlab chiqish",
            description = "Avtomatlashtirilgan javoblar va ma'lumot tahlili",
            details = "Mijozlar bilan tezkor muloqot, ma'lumot to'plash va jarayonlarni avtomatlashtiruvchi Telegram bot tizimlari.",
            tags = listOf("Telegram API", "BotFather", "Avtomatlashtirish", "Webhooks"),
            iconType = "robot"
        ),
        SkillItem(
            id = "linux",
            title = "Linux ekotizimi",
            description = "Ubuntu, Zorin OS, Arch Linux (qisman), terminal boshqaruvi",
            details = "Terminal buyruqlari bilan samarali ishlash, tizim sozlamalari, dasturlash muhitini to'g'ri tashkil qilish va avtomatlashtirish skriptlari.",
            tags = listOf("Ubuntu", "Zorin OS", "Arch Linux", "Bash", "Terminal"),
            iconType = "terminal"
        ),
        SkillItem(
            id = "office",
            title = "Office & Hujjatlar",
            description = "Word, Excel, PowerPoint, Docs, Canva bilan professional ish",
            details = "Elektron jadvallarni tahlil qilish, murakkab hisob-kitoblar, prezentatsiyalar tayyorlash va chop etishga mo'ljallangan hujjat formatlash.",
            tags = listOf("Word", "Excel", "PowerPoint", "Google Docs", "Canva"),
            iconType = "document"
        )
    )

    val projects = listOf(
        ProjectItem(
            id = "soff",
            title = "Soff.uz do'konim",
            platform = "Soff.uz",
            description = "Soff.uz platformasidagi rasmiy sotuvchi do'koni va raqamli xizmatlar taklifi.",
            url = "https://soff.uz/seller/728",
            badge = "E-Tijorat"
        ),
        ProjectItem(
            id = "hujjat24",
            title = "Hujjat24.uz do'konim",
            platform = "Hujjat24.uz",
            description = "Tayyor hujjatlar, andozalar va yuridik/amaliy hujjat shablonlari do'koni.",
            url = "https://hujjat24.uz/sotuvchi/87",
            badge = "Hujjatlar"
        )
    )

    val highlights = listOf(
        HighlightItem(
            title = "Telegram botlar",
            description = "Avtomatik javoblar, ma’lumot yig‘uvchi va tahlil qiluvchi botlar yaratishga qiziqaman.",
            category = "Avtomatlashtirish"
        ),
        HighlightItem(
            title = "Frontend ishlanmalar",
            description = "Minimalistik, foydalanuvchiga qulay va zamonaviy interfeyslar ustida ishlayman.",
            category = "Veb Dizayn"
        ),
        HighlightItem(
            title = "Linux ekotizimi",
            description = "Ubuntu, Zorin OS, hamda terminal asosida kichik avtomatlashtirish jarayonlari.",
            category = "Tizim Boshqaruvi"
        )
    )

    val socialLinks = listOf(
        SocialLink(
            platform = "GitHub",
            handleOrTitle = "SolijonSolayev",
            url = "https://github.com/SolijonSolayev",
            iconName = "github",
            isPrimary = true
        ),
        SocialLink(
            platform = "Telegram / Taplink",
            handleOrTitle = "@solijon_solayev",
            url = "https://taplink.cc/solijon_solayev",
            iconName = "taplink",
            isPrimary = true
        ),
        SocialLink(
            platform = "YouTube",
            handleOrTitle = "Solijon Solayev",
            url = "https://www.youtube.com/@Solijon_Solayev",
            iconName = "youtube",
            isPrimary = true
        ),
        SocialLink(
            platform = "Instagram",
            handleOrTitle = "@solijon.solayev",
            url = "https://instagram.com/solijon.solayev",
            iconName = "instagram",
            isPrimary = true
        ),
        SocialLink(
            platform = "LinkedIn",
            handleOrTitle = "Solijon Solayev",
            url = "https://uz.linkedin.com/in/solijon-solayev",
            iconName = "linkedin"
        ),
        SocialLink(
            platform = "Facebook",
            handleOrTitle = "Solijon Solayev",
            url = "https://www.facebook.com/profile.php?id=61576838015891",
            iconName = "facebook"
        ),
        SocialLink(
            platform = "Wikipedia profili",
            handleOrTitle = "Foydalanuvchi:Solijon_Solayev",
            url = "https://uz.wikipedia.org/wiki/Foydalanuvchi:Solijon_Solayev",
            iconName = "wikipedia"
        ),
        SocialLink(
            platform = "Wikimedia Commons",
            handleOrTitle = "User:Solijon_Solayev",
            url = "https://commons.wikimedia.org/wiki/User:Solijon_Solayev",
            iconName = "wikimedia"
        )
    )
}

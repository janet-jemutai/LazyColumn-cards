package com.jemutai.mypolicies.data

import android.icu.text.CaseMap.Title
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector


data class PolicyCard(
     val  title: String,
    val policyNumber : String,
    val  status: String,
    val  expDate: String,
    val  icon : ImageVector,
    val  premium : Int,

)

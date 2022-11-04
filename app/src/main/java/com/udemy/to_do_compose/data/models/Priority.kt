package com.udemy.to_do_compose.data.models

import androidx.compose.ui.graphics.Color
import com.udemy.to_do_compose.ui.theme.HighPriorityColor
import com.udemy.to_do_compose.ui.theme.LowPriorityColor
import com.udemy.to_do_compose.ui.theme.MediumPriorityColor
import com.udemy.to_do_compose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}
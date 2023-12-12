package com.example.cpw253todolist

import android.content.Context
import androidx.core.content.ContextCompat
import java.time.LocalDate
import java.time.LocalTime
import java.util.UUID

class TaskItem (
    var name: String,
    var desc: String,
    var dueTime: LocalTime?,
    var completedDate: LocalDate?,
    var id: UUID = UUID.randomUUID()


)
{
    fun isCompleted() = completedDate != null
    fun imageResource(): Int = if(isCompleted()) R.drawable.checked_24 else R.drawable.baseline_data_saver_off_24
    fun imageColor(context: Context): Int = if(isCompleted()) light(context) else dark(context)

    private fun light(context: Context) = ContextCompat.getColor(context, androidx.appcompat.R.color.primary_dark_material_light)
    private fun dark(context: Context) = ContextCompat.getColor(context, androidx.appcompat.R.color.primary_dark_material_dark)
}
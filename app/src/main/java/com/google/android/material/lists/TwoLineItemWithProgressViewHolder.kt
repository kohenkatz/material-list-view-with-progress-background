/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.material.lists

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.Guideline
import androidx.recyclerview.widget.RecyclerView
import tech.torah.aldis.listviewprogressbartest.R

/** A simple two line list item.  */
class TwoLineItemWithProgressViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val icon: ImageView = itemView.findViewById(R.id.mtrl_list_item_icon)
    val text: TextView = itemView.findViewById(R.id.mtrl_list_item_text)
    val secondary: TextView = itemView.findViewById(R.id.mtrl_list_item_secondary_text)
    val progressGuideline: Guideline = itemView.findViewById(R.id.progress_right_guideline)

    companion object {
        fun create(parent: ViewGroup): TwoLineItemWithProgressViewHolder {
            return TwoLineItemWithProgressViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.material_list_item_two_line_with_progress, parent, false)
            )
        }
    }

}
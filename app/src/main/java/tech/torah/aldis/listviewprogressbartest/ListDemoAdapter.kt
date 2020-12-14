package tech.torah.aldis.listviewprogressbartest

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.lists.TwoLineItemWithProgressViewHolder
import kotlin.random.Random

class ListDemoAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return TwoLineItemWithProgressViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val vh = holder as TwoLineItemWithProgressViewHolder
        vh.text.setText(R.string.mtrl_list_item_two_line);
        vh.secondary.setText(R.string.mtrl_list_item_secondary_text);
        vh.icon.setImageResource(R.drawable.logo_avatar_anonymous_40dp);
        vh.progressGuideline.setGuidelinePercent(Random.Default.nextFloat())
    }

    override fun getItemCount(): Int {
        return 1000
    }
}
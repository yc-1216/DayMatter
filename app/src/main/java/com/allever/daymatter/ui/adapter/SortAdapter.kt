package com.allever.daymatter.ui.adapter

import com.allever.daymatter.data.Event
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.allever.daymatter.R

class SortAdapter(data: List<Event.Sort>)
    : BaseQuickAdapter<Event.Sort, BaseViewHolder>(R.layout.item_sort, data) {

    override fun convert(holder: BaseViewHolder?, item: Event.Sort?) {
        holder?.setText(R.id.id_item_slid_sort_tv_name, item?.name)
        holder?.addOnClickListener(R.id.id_item_slid_sort_iv_type)
        holder?.setVisible(R.id.id_item_slid_sort_tv_count, false)
    }
}
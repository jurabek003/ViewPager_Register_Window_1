package com.jurabek888.viewpager_1.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.jurabek888.viewpager_1.R
import com.jurabek888.viewpager_1.USer
import com.jurabek888.viewpager_1.databinding.ItemViewpagerBinding

class Adapter(val context: Context, val list: List<USer>) : PagerAdapter() {

    override fun getCount(): Int=list.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

      return view ==`object`

    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val itemViewpagerBinding=ItemViewpagerBinding.inflate(LayoutInflater.from(container.context),container,false)
        var count=0

        itemViewpagerBinding.myText1.text=list[position].text
        itemViewpagerBinding.myText2.text=list[position].text2
        itemViewpagerBinding.itemImage.setImageResource(list[position].image)
        container.addView(itemViewpagerBinding.root)

        return itemViewpagerBinding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        container.removeView(`object` as View )

    }
}

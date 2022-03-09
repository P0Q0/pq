package pkg.what.a_0.data.model

import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textview.MaterialTextView
import pkg.what.a_0.R

/** @desc shorten alias with a meaningful representation */
typealias CardHolder = CardAdapter.ViewHolder

class CardAdapter(private val users: List<DataModel.UserModel>
                    , private val images: List<Bitmap>) : RecyclerView.Adapter<CardHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val card = view.findViewById<MaterialCardView>(pkg.what.pq.R.id.card_view_root_a0)
        private val textView = view.findViewById<MaterialTextView>(pkg.what.pq.R.id.card_tv_a0)
        private val imgView = view.findViewById<ImageView>(pkg.what.pq.R.id.card_img_a0)

        init {
            setupListeners()
        }

        private fun setupListeners() {
            card.setOnClickListener {
                Snackbar.make(it," id:${it.id}", Snackbar.LENGTH_SHORT)
                    .setTextColor(it.resources.getColor(pkg.what.pq.R.color.colorDark,null)).show()
            }
        }

        fun bind(data: DataModel.UserModel) {
            textView.text = data.name
            imgView.setImageBitmap(images[IMAGE_INDEX])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(pkg.what.pq.R.layout.card_item_a0, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int {
        return users.size
    }

    companion object {
        const val IMAGE_INDEX = 0
    }
}
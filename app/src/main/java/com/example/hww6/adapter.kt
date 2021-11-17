package com.example.hww6

class adapter {
}
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.twq.hwapi.Model.Post
import com.twq.hwapi.R

class PostAdapter (var data:List<Post>): RecyclerView.Adapter<PostHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.list_post_row,parent,false)
        return PostHolder(v)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {


        holder.name.text=data[position].name
        Picasso.get().load(data[position].avatar).into(holder.avatars)
        holder.postBody.text=data[position].postBody
        holder.likes.text= data[position].likes.toString()



    }

    override fun getItemCount(): Int {
        return data.size
    }
}

class PostHolder(v: View): RecyclerView.ViewHolder(v){
    var name =v.findViewById<TextView>(R.id.textViewName)
    var avatars =v.findViewById<ImageView>(R.id.imageViewAvatars)
    var postBody=v.findViewById<TextView>(R.id.textViewPostBody)
    var likes=v.findViewById<TextView>(R.id.textViewLikes)

}
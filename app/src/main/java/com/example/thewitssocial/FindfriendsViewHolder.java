package com.example.thewitssocial;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FindfriendsViewHolder extends RecyclerView.ViewHolder {

    TextView username;
    public FindfriendsViewHolder(@NonNull View itemView) {
        super(itemView);

        username = itemView.findViewById(R.id.username_p);
    }
}

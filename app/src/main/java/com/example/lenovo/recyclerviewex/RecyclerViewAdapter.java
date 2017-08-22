package com.example.lenovo.recyclerviewex;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MemberViewHolder> {

    private List<Member> members;
    private Context context;

    public RecyclerViewAdapter(List<Member> members, Context context) {
        this.members = members;
        this.context = context;
    }

    public class MemberViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private TextView name_tv;
        private TextView discription_tv;
        private ImageView img_iv;

        public MemberViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cv);
            name_tv = (TextView) itemView.findViewById(R.id.flower_name);
            discription_tv = (TextView) itemView.findViewById(R.id.flower_discri);
            img_iv = (ImageView) itemView.findViewById(R.id.flower_img);
        }
    }

    @Override
    public void onBindViewHolder(MemberViewHolder memberViewHolder, int i) {
        memberViewHolder.name_tv.setText(members.get(i).getName());
        memberViewHolder.discription_tv.setText(members.get(i).getDiscription());
        memberViewHolder.img_iv.setImageResource(members.get(i).getImgID());
    }

    @Override
    public MemberViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_row_item, viewGroup, false);
        MemberViewHolder memberViewHolder = new MemberViewHolder(view);
        return memberViewHolder;
    }

    @Override
    public int getItemCount() {
        return members.size();
    }
}


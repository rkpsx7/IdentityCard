package com.example.identitycard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

public class viewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvPic;
    private TextView mTvCompanyName,mTvAge,mTvProfession;
    public viewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvPic = itemView.findViewById(R.id.img_pic);
        mTvAge = itemView.findViewById(R.id.tv_age);
        mTvCompanyName = itemView.findViewById(R.id.tv_company);
        mTvProfession = itemView.findViewById(R.id.tv_profession);
    }
    public void setData(Model model){
        mIvPic.setImageResource(model.getImageID());
        mTvAge.setText(model.getAge());
        mTvCompanyName.setText(model.getCompany());
        mTvProfession.setText(model.getBusiness());
    }
}

package com.creativedevelopers.buildingmanagement.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.creativedevelopers.buildingmanagement.Model.DataBase;
import com.creativedevelopers.buildingmanagement.R;

import javax.annotation.Resource;

/**
 * Created by Mahdi on 3/19/18.
 */

public class UnitManagement_Adapter extends RecyclerView.Adapter<UnitManagement_Adapter.OwnerHolder>
{
    private Context context;

    public UnitManagement_Adapter(Context context)
    {
        this.context = context;
    }

    @Override
    public OwnerHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view;
        view=LayoutInflater.from(context).inflate(R.layout.unit_management_adapter,null);
        OwnerHolder ownerHolder=new OwnerHolder(view);
        return ownerHolder;
    }

    @Override
    public void onBindViewHolder(OwnerHolder holder, int position)
    {

        holder.setData();
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class OwnerHolder extends RecyclerView.ViewHolder
    {
        private TextView fullName_textView;
        private TextView unitNumber_textView;
        private ImageView unitManagement_adapter_imageView;
        private ImageView monthlyCharge_imageView;
        private ImageView waterBill_imageView;
        private ImageView electricityBill_imageView;
        private ImageView gasBill_imageView;

        public OwnerHolder(View itemView)
        {
            super(itemView);
            this.fullName_textView=itemView.findViewById(R.id.fullName_textView);
            this.unitNumber_textView=itemView.findViewById(R.id.unitNumber_textView);
            this.monthlyCharge_imageView=itemView.findViewById(R.id.monthlyCharge_imageView);
            this.waterBill_imageView=itemView.findViewById(R.id.waterBill_imageView);
            this.electricityBill_imageView=itemView.findViewById(R.id.electricityBill_imageView);
            this.gasBill_imageView=itemView.findViewById(R.id.gasBill_imageView);
        }

        @SuppressLint("ResourceType")
        public void setData()
        {
            DataBase dataBase=new DataBase(context);
            dataBase.getReadableDatabase();

            dataBase.getOwnerInformaiton();

            fullName_textView.setText("Mahdi keshavarz");
            unitNumber_textView.setText("5");
            monthlyCharge_imageView.setBackgroundResource(R.drawable.ok);
            waterBill_imageView.setBackgroundResource(R.drawable.ok);
            electricityBill_imageView.setBackgroundResource(R.drawable.delete);
            gasBill_imageView.setBackgroundResource(R.drawable.ok);

        }
    }
}

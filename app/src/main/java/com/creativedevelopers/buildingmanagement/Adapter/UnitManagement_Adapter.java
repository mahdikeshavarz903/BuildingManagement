package com.creativedevelopers.buildingmanagement.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.creativedevelopers.buildingmanagement.Model.Apartment;
import com.creativedevelopers.buildingmanagement.Model.DataBase;
import com.creativedevelopers.buildingmanagement.R;

import java.util.ArrayList;

import javax.annotation.Resource;

/**
 * Created by Mahdi on 3/19/18.
 */

public class UnitManagement_Adapter extends RecyclerView.Adapter<UnitManagement_Adapter.OwnerHolder>
{
    private Context context;
    private ArrayList<Apartment> arrayList;
    private DataBase dataBase;

    public UnitManagement_Adapter(Context context)
    {
        this.context = context;
        dataBase=new DataBase(context);
        dataBase.getReadableDatabase();
    arrayList=dataBase.getOwnerInformaiton();
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
        holder.setData(position);
    }

    @Override
    public int getItemCount() {
        return 5;
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
        public void setData(int position)
        {
            fullName_textView.setText(arrayList.get(position).getOwner().getName().toString());
            unitNumber_textView.setText(""+arrayList.get(position).getApartmentNumber());

            if(arrayList.get(position).getGasStatus()==1) {
                gasBill_imageView.setImageResource(R.drawable.ok);
                gasBill_imageView.setBackgroundColor(Color.rgb(215,250,215));
            }else{
                gasBill_imageView.setImageResource(R.drawable.delete);
                gasBill_imageView.setBackgroundColor(Color.rgb(250,215,215));
            }

            if(arrayList.get(position).getWaterStatus()==1){
                waterBill_imageView.setImageResource(R.drawable.ok);
                waterBill_imageView.setBackgroundColor(Color.rgb(215,250,215));
            } else{
                waterBill_imageView.setImageResource(R.drawable.delete);
                waterBill_imageView.setBackgroundColor(Color.rgb(250,215,215));
            }

            if(arrayList.get(position).getElectricityStatus()==1) {
                electricityBill_imageView.setImageResource(R.drawable.ok);
                electricityBill_imageView.setBackgroundColor(Color.rgb(215,250,215));
            } else{
                electricityBill_imageView.setImageResource(R.drawable.delete);
                electricityBill_imageView.setBackgroundColor(Color.rgb(250,215,215));
            }

            if(arrayList.get(position).is_monthlyCharge_payed()==true){
                monthlyCharge_imageView.setImageResource(R.drawable.ok);
                monthlyCharge_imageView.setBackgroundColor(Color.rgb(215,250,215));
            } else {
                monthlyCharge_imageView.setImageResource(R.drawable.delete);
                monthlyCharge_imageView.setBackgroundColor(Color.rgb(250,215,215));
            }
        }
    }
}

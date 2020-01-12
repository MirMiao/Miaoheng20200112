package com.bw.miaoheng20200112;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bw.miaoheng20200112.entity.OrderListEntity;

import java.util.List;

/**
 * 时间 :2020/1/12  8:50
 * 作者 :苗恒
 * 功能 :
 */
class OrderListAdapter  extends RecyclerView.Adapter<OrderListAdapter.MyViewHolder> {
    public Context context;
    public List<OrderListEntity.OrderListBean> list;
    private String commodityPic;

    public OrderListAdapter(Context context, List<OrderListEntity.OrderListBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(View.inflate(context, R.layout.item, null));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      holder.tv_orderId.setText("订单编号 :"+list.get(position).getOrderId());
      holder.tv_transform.setText("运输方式 :"+list.get(position).getExpressCompName());
        List<OrderListEntity.OrderListBean.DetailListBean> detailList = list.get(position).getDetailList();
        if(detailList.size()>0&&detailList!=null){
            for (int i = 0; i < detailList.size(); i++) {
                commodityPic = detailList.get(i).getCommodityPic();
                String commodityName = detailList.get(i).getCommodityName();
                int commodityPrice = detailList.get(i).getCommodityPrice();
                holder.tv_name.setText(commodityName);
                holder.tv_price.setText("￥"+commodityPrice);
            }
            String[] split = commodityPic.split(",");
            Glide.with(context).load(split[1]).into(holder.imageView);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private final ImageView imageView;
        private final TextView tv_transform;
        private final TextView tv_price;
        private final TextView tv_name;
        private final TextView tv_orderId;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_orderId = itemView.findViewById(R.id.tv_orderId);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_price = itemView.findViewById(R.id.tv_price);
            tv_transform = itemView.findViewById(R.id.tv_transform);
            imageView = itemView.findViewById(R.id.iv);
        }
    }
}

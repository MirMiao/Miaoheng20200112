package com.bw.miaoheng20200112.entity;

import java.util.List;

/**
 * 时间 :2020/1/12  8:41
 * 作者 :苗恒
 * 功能 :
 */
public class OrderListEntity {

    /**
     * orderList : [{"detailList":[{"commentStatus":1,"commodityCount":1,"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","commodityPic":"http://172.17.8.100/images/small/commodity/nx/bx/4/1.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/2.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/3.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/4.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/5.jpg","commodityPrice":189,"orderDetailId":22868}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020011009060885213387","orderStatus":1,"orderTime":1578618369000,"payAmount":189,"payMethod":1,"userId":13387},{"detailList":[{"commentStatus":1,"commodityCount":1,"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","commodityPic":"http://172.17.8.100/images/small/commodity/nx/bx/4/1.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/2.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/3.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/4.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/5.jpg","commodityPrice":189,"orderDetailId":22863}],"expressCompName":"京东快递","expressSn":"1001","orderId":"2020011009020936613387","orderStatus":1,"orderTime":1578618129000,"payAmount":189,"payMethod":1,"userId":13387}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<OrderListBean> orderList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderListBean> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderListBean> orderList) {
        this.orderList = orderList;
    }

    public static class OrderListBean {
        /**
         * detailList : [{"commentStatus":1,"commodityCount":1,"commodityId":21,"commodityName":"【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋","commodityPic":"http://172.17.8.100/images/small/commodity/nx/bx/4/1.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/2.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/3.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/4.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/5.jpg","commodityPrice":189,"orderDetailId":22868}]
         * expressCompName : 京东快递
         * expressSn : 1001
         * orderId : 2020011009060885213387
         * orderStatus : 1
         * orderTime : 1578618369000
         * payAmount : 189
         * payMethod : 1
         * userId : 13387
         */

        private String expressCompName;
        private String expressSn;
        private String orderId;
        private int orderStatus;
        private long orderTime;
        private int payAmount;
        private int payMethod;
        private int userId;
        private List<DetailListBean> detailList;

        public String getExpressCompName() {
            return expressCompName;
        }

        public void setExpressCompName(String expressCompName) {
            this.expressCompName = expressCompName;
        }

        public String getExpressSn() {
            return expressSn;
        }

        public void setExpressSn(String expressSn) {
            this.expressSn = expressSn;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public int getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(int orderStatus) {
            this.orderStatus = orderStatus;
        }

        public long getOrderTime() {
            return orderTime;
        }

        public void setOrderTime(long orderTime) {
            this.orderTime = orderTime;
        }

        public int getPayAmount() {
            return payAmount;
        }

        public void setPayAmount(int payAmount) {
            this.payAmount = payAmount;
        }

        public int getPayMethod() {
            return payMethod;
        }

        public void setPayMethod(int payMethod) {
            this.payMethod = payMethod;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public List<DetailListBean> getDetailList() {
            return detailList;
        }

        public void setDetailList(List<DetailListBean> detailList) {
            this.detailList = detailList;
        }

        public static class DetailListBean {
            /**
             * commentStatus : 1
             * commodityCount : 1
             * commodityId : 21
             * commodityName : 【加绒休闲 舒适轻便】秋冬增高休闲鞋厚底棉鞋运动户外通勤简约韩版女鞋
             * commodityPic : http://172.17.8.100/images/small/commodity/nx/bx/4/1.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/2.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/3.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/4.jpg,http://172.17.8.100/images/small/commodity/nx/bx/4/5.jpg
             * commodityPrice : 189
             * orderDetailId : 22868
             */

            private int commentStatus;
            private int commodityCount;
            private int commodityId;
            private String commodityName;
            private String commodityPic;
            private int commodityPrice;
            private int orderDetailId;

            public int getCommentStatus() {
                return commentStatus;
            }

            public void setCommentStatus(int commentStatus) {
                this.commentStatus = commentStatus;
            }

            public int getCommodityCount() {
                return commodityCount;
            }

            public void setCommodityCount(int commodityCount) {
                this.commodityCount = commodityCount;
            }

            public int getCommodityId() {
                return commodityId;
            }

            public void setCommodityId(int commodityId) {
                this.commodityId = commodityId;
            }

            public String getCommodityName() {
                return commodityName;
            }

            public void setCommodityName(String commodityName) {
                this.commodityName = commodityName;
            }

            public String getCommodityPic() {
                return commodityPic;
            }

            public void setCommodityPic(String commodityPic) {
                this.commodityPic = commodityPic;
            }

            public int getCommodityPrice() {
                return commodityPrice;
            }

            public void setCommodityPrice(int commodityPrice) {
                this.commodityPrice = commodityPrice;
            }

            public int getOrderDetailId() {
                return orderDetailId;
            }

            public void setOrderDetailId(int orderDetailId) {
                this.orderDetailId = orderDetailId;
            }
        }
    }
}

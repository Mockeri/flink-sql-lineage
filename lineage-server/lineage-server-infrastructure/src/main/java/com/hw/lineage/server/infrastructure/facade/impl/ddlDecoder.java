package com.hw.lineage.server.infrastructure.facade.impl;

import com.hw.lineage.common.util.Base64Utils;

public class ddlDecoder {
    public static void main(String[] args) {
        String ddl = "CREATE TABLE IF NOT EXISTS paimon_catalog.dwm.ue_new_car_order_wide (\n" +
                "    ncar_order_no string COMMENT '订单号',\n" +
                "    ncar_order_status string COMMENT '新车订单状态',\n" +
                "    curr_ur_fl_ad_account string COMMENT '新车订单下单人当前UR FL域账号',\n" +
                "    curr_uo_fl_ad_account string COMMENT '新车订单下单人当前UO FL域账号',\n" +
                "    curr_intention_fl_ad_account string COMMENT '订单关联意向单跟进人域账号',\n" +
                "    curr_intention_fl_cn_name string COMMENT '订单关联意向单跟进人中文名',\n" +
                "    curr_intention_fl_nh_code string COMMENT '订单关联意向单跟进人所属门店code',\n" +
                "    ncar_first_sys_sales_confirmed_time timestamp COMMENT '销售确认时间（系统，首次）',\n" +
                "    ncar_first_lock_time timestamp COMMENT '待排产/锁单时间（首次）',\n" +
                "    ncar_first_downpayment_time timestamp COMMENT '定金已支付时间/大定时间（首次）',\n" +
                "    ncar_first_intention_paid_time timestamp COMMENT '意向金时间',\n" +
                "    ncar_cancel_time timestamp COMMENT '退单时间',\n" +
                "    ncar_order_create_time timestamp COMMENT '新车订单创建时间',\n" +
                "    ncar_order_update_time timestamp COMMENT '新车订单更新时间',\n" +
                "    etl_time timestamp COMMENT '标记数据更新时间，用来校准数据',\n" +
                "    PRIMARY KEY (ncar_order_no) NOT ENFORCED\n" +
                ") with (\n" +
                "  'hostname' = '127.0.0.1',\n" +
                "  'password' = 'xxx',\n" +
                "  'connector' = 'mysql-cdc',\n" +
                "  'port' = '3306',\n" +
                "  'database-name' = 'demo',\n" +
                "  'server-time-zone' = 'Asia/Shanghai',\n" +
                "  'table-name' = 'users',\n" +
                "  'username' = 'root'\n" +
                ");";
        String singleDDL = Base64Utils.encode(ddl);
        System.out.println(singleDDL);
    }
}

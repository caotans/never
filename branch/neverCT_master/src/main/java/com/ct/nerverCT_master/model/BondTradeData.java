package com.ct.nerverCT_master.model;

import java.io.Serializable;
import java.util.Date;

public class BondTradeData implements Serializable{
	private String id;//pk
	private String dep_name;//管理平台名称
	private String inv_sname;//投资主体简称
	private String pro_id;//标的id
	private String group_code;//项目编码
	private String trader;//交易对手
    private String	trade_date;//交易日期
    private String settlement_date;//结算日
	private String trade_id;//交易序号
	private String code_type;//代码类型
	private String code_orig;//未转换代码
	private String bond_code;// 代码
    private String	bond_name;//代码名称
	private String  trade;//交易类型
	private double bond_count;//数量
	private String trade_money;//交易货币
	private double net_price;//净价
	private double full_price;//全价
	private double l_ytm;//到期收益率
	private double net_total;//净价金额
	private double full_total;//全价金额
	private String trade_market;//交易市场
	private String remark;//备注
	private String maturity_date;//到期日
	private double coupon;//票息
	private String coupon_date;//下次付息日
	private double frequency;//年付息次数
	private String upload_group;//上传群组
	private String   version_date;//版本日期
	private String  author;//上传者
	private Date ent_time;//记录进表时间
	private Date upd_time;//记录修改时间
    private String dt_status;//数据状态标志：0：新增；1：修改；2：删除
	private String ct_status;//统计状态标志：0：未统计；1：已统计
	private String sm_status;//0,未汇总;1,已汇总
	private String log;//
	private String iscomment;
	private String upload_log_id;

    private String s_net_price;
    private String s_full_price;
    private String s_net_total;
    private String s_full_total;
    private String upload_group_name;
    private String upload_type;//类别

    public String getSettlement_date() {
        return settlement_date;
    }

    public void setSettlement_date(String settlement_date) {
        this.settlement_date = settlement_date;
    }

    public void setMaturity_date(String maturity_date) {
		this.maturity_date = maturity_date;
	}
	public void setCoupon_date(String coupon_date) {
		this.coupon_date = coupon_date;
	}
	public String getUpload_group() {
		return upload_group;
	}
	public void setUpload_group(String upload_group) {
		this.upload_group = upload_group;
	}
    
	public String getVersion_date() {
		return version_date;
	}
	public void setVersion_date(String version_date) {
		this.version_date = version_date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getInv_sname() {
		return inv_sname;
	}
	public void setInv_sname(String inv_sname) {
		this.inv_sname = inv_sname;
	}
	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}
	public String getGroup_code() {
		return group_code;
	}
	public void setGroup_code(String group_code) {
		this.group_code = group_code;
	}
	public String getTrader() {
		return trader;
	}
	public void setTrader(String trader) {
		this.trader = trader;
	}
	

	public String getTrade_date() {
		return trade_date;
	}
	public void setTrade_date(String trade_date) {
		this.trade_date = trade_date;
	}
	public String getTrade_id() {
		return trade_id;
	}
	public void setTrade_id(String trade_id) {
		this.trade_id = trade_id;
	}
	public String getCode_type() {
		return code_type;
	}
	public void setCode_type(String code_type) {
		this.code_type = code_type;
	}
	public String getCode_orig() {
		return code_orig;
	}
	public void setCode_orig(String code_orig) {
		this.code_orig = code_orig;
	}
	public String getBond_code() {
		return bond_code;
	}
	public void setBond_code(String bond_code) {
		this.bond_code = bond_code;
	}
	public String getBond_name() {
		return bond_name;
	}
	public void setBond_name(String bond_name) {
		this.bond_name = bond_name;
	}
	public String getTrade() {
		return trade;
	}
	public void setTrade(String trade) {
		this.trade = trade;
	}
	public double getBond_count() {
		return bond_count;
	}
	public void setBond_count(double bond_count) {
		this.bond_count = bond_count;
	}
	public String getTrade_money() {
		return trade_money;
	}
	public void setTrade_money(String trade_money) {
		this.trade_money = trade_money;
	}
	public double getNet_price() {
		return net_price;
	}
	public void setNet_price(double net_price) {
		this.net_price = net_price;
	}
	public double getFull_price() {
		return full_price;
	}
	public void setFull_price(double full_price) {
		this.full_price = full_price;
	}
	public double getL_ytm() {
		return l_ytm;
	}
	public void setL_ytm(double l_ytm) {
		this.l_ytm = l_ytm;
	}
	public double getNet_total() {
		return net_total;
	}
	public void setNet_total(double net_total) {
		this.net_total = net_total;
	}
	public double getFull_total() {
		return full_total;
	}
	public void setFull_total(double full_total) {
		this.full_total = full_total;
	}
	public String getTrade_market() {
		return trade_market;
	}
	public void setTrade_market(String trade_market) {
		this.trade_market = trade_market;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public double getCoupon() {
		return coupon;
	}
	public void setCoupon(double coupon) {
		this.coupon = coupon;
	}
	
	public String getMaturity_date() {
		return maturity_date;
	}
	public String getCoupon_date() {
		return coupon_date;
	}
	public double getFrequency() {
		return frequency;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	public Date getEnt_time() {
		return ent_time;
	}
	public void setEnt_time(Date ent_time) {
		this.ent_time = ent_time;
	}
	public Date getUpd_time() {
		return upd_time;
	}
	public void setUpd_time(Date upd_time) {
		this.upd_time = upd_time;
	}
	public String getDt_status() {
		return dt_status;
	}
	public void setDt_status(String dt_status) {
		this.dt_status = dt_status;
	}
	public String getCt_status() {
		return ct_status;
	}
	public void setCt_status(String ct_status) {
		this.ct_status = ct_status;
	}

    public String getSm_status() {
        return sm_status;
    }

    public void setSm_status(String sm_status) {
        this.sm_status = sm_status;
    }

    public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getIscomment() {
		return iscomment;
	}
	public void setIscomment(String iscomment) {
		this.iscomment = iscomment;
	}
	public String getUpload_log_id() {
		return upload_log_id;
	}
	public void setUpload_log_id(String upload_log_id) {
		this.upload_log_id = upload_log_id;
	}

    public String getS_net_price() {
        return s_net_price;
    }

    public void setS_net_price(String s_net_price) {
        this.s_net_price = s_net_price;
    }

    public String getS_full_price() {
        return s_full_price;
    }

    public void setS_full_price(String s_full_price) {
        this.s_full_price = s_full_price;
    }

    public String getS_net_total() {
        return s_net_total;
    }

    public void setS_net_total(String s_net_total) {
        this.s_net_total = s_net_total;
    }

    public String getS_full_total() {
        return s_full_total;
    }

    public void setS_full_total(String s_full_total) {
        this.s_full_total = s_full_total;
    }

    public String getUpload_group_name() {
        return upload_group_name;
    }

    public void setUpload_group_name(String upload_group_name) {
        this.upload_group_name = upload_group_name;
    }

    public String getUpload_type() {
        return upload_type;
    }

    public void setUpload_type(String upload_type) {
        this.upload_type = upload_type;
    }

    @Override
    public String toString() {
        return "BondTradeData{" +
                "id='" + id + '\'' +
                ", dep_name='" + dep_name + '\'' +
                ", inv_sname='" + inv_sname + '\'' +
                ", pro_id='" + pro_id + '\'' +
                ", group_code='" + group_code + '\'' +
                ", trader='" + trader + '\'' +
                ", trade_date='" + trade_date + '\'' +
                ", settlement_date='" + settlement_date + '\'' +
                ", trade_id='" + trade_id + '\'' +
                ", code_type='" + code_type + '\'' +
                ", code_orig='" + code_orig + '\'' +
                ", bond_code='" + bond_code + '\'' +
                ", bond_name='" + bond_name + '\'' +
                ", trade='" + trade + '\'' +
                ", bond_count=" + bond_count +
                ", trade_money='" + trade_money + '\'' +
                ", net_price=" + net_price +
                ", full_price=" + full_price +
                ", l_ytm=" + l_ytm +
                ", net_total=" + net_total +
                ", full_total=" + full_total +
                ", trade_market='" + trade_market + '\'' +
                ", remark='" + remark + '\'' +
                ", maturity_date='" + maturity_date + '\'' +
                ", coupon=" + coupon +
                ", coupon_date='" + coupon_date + '\'' +
                ", frequency=" + frequency +
                ", upload_group='" + upload_group + '\'' +
                ", version_date='" + version_date + '\'' +
                ", author='" + author + '\'' +
                ", ent_time=" + ent_time +
                ", upd_time=" + upd_time +
                ", dt_status='" + dt_status + '\'' +
                ", ct_status='" + ct_status + '\'' +
                ", log='" + log + '\'' +
                ", iscomment='" + iscomment + '\'' +
                ", upload_log_id='" + upload_log_id + '\'' +
                '}';
    }
}

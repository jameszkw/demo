package com.zkw.java.justtest;

public class WithDraw {

	private String sn;// 序号
	private String uniquesn;// 唯一请求流水号
	private String orderno;// 订单号
	private String servicecode;// 服务码
	private String mersn;// 商户序号
	private String accountid;// 账户ID
	private String balanceamount;// 账户余额
	private String productsn;// 产品序号
	private String withdrawamount;// 提现金额
	private String withdrawaccountno;// 提现账号
	private String status;// 0、 待处理 1、 待审核 2、 处理中 3、 处理成功 4、 处理失败
	private String applyname;// 申请人
	private String applytime;// 申请时间
	private String checkname;// 审核人
	private String checktime;// 审核时间
	private String lastmodifytime;// 最后修改时间
	private String remark;// 审核备注
	private Integer source;// 提现申请单来源

	private String beginamt;//
	private String endamt;//

	private String begintime;//
	private String endtime;//

	private String mername;//
	private int operate;//操作
	private String username; //当前登录用户

	/**
	 * @return the sn
	 */
	public String getSn() {
		return sn;
	}

	/**
	 * @param sn
	 *            the sn to set
	 */
	public void setSn(String sn) {
		this.sn = sn;
	}

	public int getOperate() {
		return operate;
	}

	public void setOperate(int operate) {
		this.operate = operate;
	}

	public String getProductsn() {
		return productsn;
	}

	public void setProductsn(String productsn) {
		this.productsn = productsn;
	}

	public String getWithdrawaccountno() {
		return withdrawaccountno;
	}

	public void setWithdrawaccountno(String withdrawaccountno) {
		this.withdrawaccountno = withdrawaccountno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the uniquesn
	 */
	public String getUniquesn() {
		return uniquesn;
	}

	/**
	 * @param uniquesn
	 *            the uniquesn to set
	 */
	public void setUniquesn(String uniquesn) {
		this.uniquesn = uniquesn;
	}

	/**
	 * @return the orderno
	 */
	public String getOrderno() {
		return orderno;
	}

	/**
	 * @param orderno
	 *            the orderno to set
	 */
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	/**
	 * @return the servicecode
	 */
	public String getServicecode() {
		return servicecode;
	}

	/**
	 * @param servicecode
	 *            the servicecode to set
	 */
	public void setServicecode(String servicecode) {
		this.servicecode = servicecode;
	}

	/**
	 * @return the mersn
	 */
	public String getMersn() {
		return mersn;
	}

	/**
	 * @param mersn
	 *            the mersn to set
	 */
	public void setMersn(String mersn) {
		this.mersn = mersn;
	}

	/**
	 * @return the accountid
	 */
	public String getAccountid() {
		return accountid;
	}

	/**
	 * @param accountid
	 *            the accountid to set
	 */
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	/**
	 * @return the balanceamount
	 */
	public String getBalanceamount() {
		return balanceamount;
	}

	/**
	 * @param balanceamount
	 *            the balanceamount to set
	 */
	public void setBalanceamount(String balanceamount) {
		this.balanceamount = balanceamount;
	}

	/**
	 * @return the withdrawamount
	 */
	public String getWithdrawamount() {
		return withdrawamount;
	}

	/**
	 * @param withdrawamount
	 *            the withdrawamount to set
	 */
	public void setWithdrawamount(String withdrawamount) {
		this.withdrawamount = withdrawamount;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the applyname
	 */
	public String getApplyname() {
		return applyname;
	}

	/**
	 * @param applyname
	 *            the applyname to set
	 */
	public void setApplyname(String applyname) {
		this.applyname = applyname;
	}

	/**
	 * @return the applytime
	 */
	public String getApplytime() {
		return applytime;
	}

	/**
	 * @param applytime
	 *            the applytime to set
	 */
	public void setApplytime(String applytime) {
		this.applytime = applytime;
	}

	/**
	 * @return the checkname
	 */
	public String getCheckname() {
		return checkname;
	}

	/**
	 * @param checkname
	 *            the checkname to set
	 */
	public void setCheckname(String checkname) {
		this.checkname = checkname;
	}

	/**
	 * @return the checktime
	 */
	public String getChecktime() {
		return checktime;
	}

	/**
	 * @param checktime
	 *            the checktime to set
	 */
	public void setChecktime(String checktime) {
		this.checktime = checktime;
	}

	/**
	 * @return the lastmodifytime
	 */
	public String getLastmodifytime() {
		return lastmodifytime;
	}

	/**
	 * @param lastmodifytime
	 *            the lastmodifytime to set
	 */
	public void setLastmodifytime(String lastmodifytime) {
		this.lastmodifytime = lastmodifytime;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the beginamt
	 */
	public String getBeginamt() {
		return beginamt;
	}

	/**
	 * @param beginamt
	 *            the beginamt to set
	 */
	public void setBeginamt(String beginamt) {
		this.beginamt = beginamt;
	}

	/**
	 * @return the endamt
	 */
	public String getEndamt() {
		return endamt;
	}

	/**
	 * @param endamt
	 *            the endamt to set
	 */
	public void setEndamt(String endamt) {
		this.endamt = endamt;
	}

	/**
	 * @return the begintime
	 */
	public String getBegintime() {
		return begintime;
	}

	/**
	 * @param begintime
	 *            the begintime to set
	 */
	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}

	/**
	 * @return the endtime
	 */
	public String getEndtime() {
		return endtime;
	}

	/**
	 * @param endtime
	 *            the endtime to set
	 */
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	/**
	 * @return the mername
	 */
	public String getMername() {
		return mername;
	}

	/**
	 * @param mername
	 *            the mername to set
	 */
	public void setMername(String mername) {
		this.mername = mername;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

}

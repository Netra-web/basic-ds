package lambda_expression;

import java.util.*;
import java.util.stream.Collectors;
class order{
	int orderprice;
	String ordername;
	String orderStatus;
	public order(int orderprice, String ordername,String orderStatus) {
		this.orderprice = orderprice;
		this.ordername = ordername;
		this.orderStatus=orderStatus;
	}
	public int getOrderprice() {
		return orderprice;
	}
	public String getOrdername() {
		return ordername;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	@Override
	public String toString() {
		return "Order [orderprice=" + orderprice + ", ordername=" + ordername + ", orderStatus=" + orderStatus + "]";
	}
}

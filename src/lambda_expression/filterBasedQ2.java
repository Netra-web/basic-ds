package lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filterBasedQ2 {
	public static void main(String[] args) {
		List<order> orders=new ArrayList<>();
		orders.add(new order(7000,"Burger","Accepted"));
		orders.add(new order(12000,"Pizzas","Completed"));
		orders.add(new order(13000,"Coke","Processing"));
		orders.add(new order(12000,"Ice-Cream","Accepted"));
		orders.add(new order(2000,"Frankie","Completed"));
		
		List <order> Orderbyname=orders.stream()
		                //.filter(p->p.orderprice>10000)
		               .filter(q->q.orderprice>10000)
		               .filter(x->x.getOrderStatus().equals("Accepted")||x.getOrderStatus().equals("Completed"))
		               .collect(Collectors.toList());
	   System.out.println(Orderbyname);
	}
}



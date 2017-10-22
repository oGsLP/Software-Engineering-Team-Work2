package vo;

public class SaleProblemInformationVO {
	Income income;
	Expense expense;
	double profit;
	SaleProblemInformationVO(Income income,Expense expense,double profit){
		this.income=income;
		this.expense=expense;
		this.profit=profit;
	}
	Income getIncome(){
		return income;
	}
	Expense getExpense(){
		return expense;
	}

}
class Income{
	double saleIncome;
	double goodsIncome_more;
	double goodsIncome_price;
	double goodsIncome_stock;
	double goodsIncome_voucher;
	double sum;
	Income(double saleIncome,double goodsIncome_more,double goodsIncome_price,double goodsIncome_stock,double goodsIncome_voucher,double sum){
		this.saleIncome=saleIncome;
		this.goodsIncome_more=goodsIncome_more;
		this.goodsIncome_price=goodsIncome_price;
		this.goodsIncome_stock=goodsIncome_stock;
		this.goodsIncome_voucher=goodsIncome_voucher;
		this.sum=sum;
	}
	
}

class Expense{
	double saleCost;
	double goodsCost_less;
	double goodsCost_gift;
	Expense(double saleCost,double goodsCost_less,double goodsCost_gift){
		this.saleCost=saleCost;
		this.goodsCost_less=goodsCost_less;
		this.goodsCost_gift=goodsCost_gift;
	}
}

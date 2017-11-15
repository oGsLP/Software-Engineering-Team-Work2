### 1.managebl模块
#####  （1）模块概述
managebl模块承担的需求参见需求规格说明文档及相关功能需求。

managebl模块的职责及接口参见软件体系结构描述文档。
#####   （2）整体结构
根据体系结构的设计，采用分层风格，将系统分为展示层，业务逻辑层，数据层。每一层之间为了灵活性，添加了接口，以实现针对接口编程，隔离数据传输的职责，降低层与层之间耦合，添加的接口包括manageblservice , managedataservice两个接口。为了隔离业务逻辑职责和逻辑控制职责，我们添加ManageController，这样ManageController将会将经营相关的业务逻辑职责和逻辑控制委托给managebl 对象。managePO是做为管理信息的持久化对象被添加到设计模型中的。

managebl模块的设计如图 所示.
#        ** 缺图**



类 | 职责
---|---
manageController | 负责实现所有与经营有关的界面所需的服务
SaleDetailRecordVO| 包含了销售明细中所有的参考项，可供用户选择查看
SaleDetailRequirementVO|包含查看销售明细过程中用户所要输入的不同筛选条件
SaleProblemInformationVO|查看经营状况中所有的参考项，包括收入类、支出类和利润

##### （3）模块内部类的接口规范

ManageController类的接口规范


<table>
	<tr>
		<th colspan="3">提供的服务（供接口）</th>
	</tr>
	<tr>
		<th rowspan="3">ManageController.seeSaleDetail</th>
		<th>语法</th>
		<th>public ArrayList&lt;SaleDetailRequirementVO> seeDetail(boolean x); </th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>财务人员或总经理选择查看销售明细</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>财务人员或总经理选择查看销售明细后，系统给出筛选条件</th>	
		</tr>	
<tr>
		<th rowspan="3">ManageController.addSaleDetailRequirement</th>
		<th>语法</th>
		<th>public ArrayList&lt;SaleDetailRecordVO> addSaleDetailRequirement(ArrayList&lt;SaleDetailRequirementVO> saleDetailRequirementList);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>财务人员或总经理添加筛选条件，且条件全部填写、合法填写以及找得到匹配结果</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回符合条件的商品记录列表</th>
</tr>	
<tr>
		<th rowspan="3">ManageController.seeSaleProcess</th>
		<th>语法</th>
		<th>public ArrayList&lt;SaleProcessRequirementVO> seeSaleProcess(boolean x);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>财务人员或总经理选择查看经营历程</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>财务人员或总经理选择查看经营历程后，返回筛选条件</th>
</tr>
<tr>
		<th rowspan="3">ManageController.addSaleProcess</th>
		<th>语法</th>
		<th>public ArrayList&lt;SaleProcessRecordVO> addSaleProcess(ArrayList&lt;SaleProcessRequirementVO> saleProcessRequirementList);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>财务人员或总经理添加筛选条件，且条件全部填写、合法填写以及找得到匹配结果</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回符合条件的经营情况记录列表</th>
</tr>	
<tr>
		<th rowspan="3">ManageController.operate</th>
		<th>语法</th>
		<th>public boolean operate(boolean x);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>财务人员选择进行红冲或红冲并复制操作</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>系统自动生成红冲的单子，返回是否生成成功</th>
</tr>
<tr>
		<th rowspan="3">ManageController.confirm</th>
		<th>语法</th>
		<th>public boolean confirm(boolean x);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>财务人员确认红冲</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>系统修改单据记录，返回是否修改成功</th>
</tr>
<tr>
		<th rowspan="3">ManageController.writeAndCopy</th>
		<th>语法</th>
		<th>public boolean writeAndCopy(ReceiptVO receipt );</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>财务人员填写红冲并复制单子</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>系统修改单据记录，返回是否修改成功</th>
</tr>
<tr>
		<th rowspan="3">ManageController.cancel</th>
		<th>语法</th>
		<th>public boolean cancel(boolean x);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>财务人员放弃填写红冲单据</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>系统取消此次红冲或复制操作，返回是否取消成功。</th>
</tr>
<tr>
		<th rowspan="3">ManageController.seeSaleProblem</th>
		<th>语法</th>
		<th>public ArrayList&lt;SaleProblemInformationVO> seeSaleProblem(boolean x);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>财务人员或总经理选择查看经营状况</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回收入类，支出类和利润</th>
</tr>	


<tr><th colspan="4">需要的服务（需接口);</th></tr>
<tr><th>服务名</th><th colspan="2">服务</th>
<tr><th>manageDataService.addSaleDetail(ArrayList&lt;SaleDetailRequirementPO> saleDetailRequirementList);</th>
<th colspan="2">添加相应的筛选条件，以便在数据层里面根据所添加的条件进行搜索得到相应的销售明细</th> </tr>
<tr><th>manageDataService.addSaleProcess(ArrayList&lt;SaleProcessRequirementPO> saleProcessRequirementList);</th>
<th colspan="2">添加相应的筛选条件，以便在数据层里面根据所添加的条件进行搜索得到相应的经营历程</th> </tr>
<tr><th>manageDataService.operation(boolean x);</th>
<th colspan="2">根据传入的布尔类型的参数选择是否进行红冲或红冲并复制操作，若是则自动生成相应的红冲单子</th> </th></tr>
<tr><th>manageDataService.confirmation(boolean x);</th>
<th colspan="2">根据传入的布尔类型的参数选择是否确认红冲，若是则修改系统单据</th> </th></tr>
<tr><th>manageDataService.writeIn(ReceiptPO receipt);</th>
<th colspan="2">财务人员填写红冲并复制单子后系统修改单据记录</th> </th></tr>
<tr><th>manageDataService.getSaleProblem(boolean x);</th>
<th colspan="2">根据传入的布尔类型的参数选择是否查看经营情况，若是则返回收入类，支出类和利润</th> </th></tr>

</table>

SaleDetailRecordVO类的接口规范

<table>
	<tr>
		<th colspan="3">提供的服务（供接口）</th>
	</tr>
	<tr>
		<th rowspan="3">SaleDetailRecordVO.getSoldList</th>
		<th>语法</th>
		<th>public ArrayList&lt;GoodsVO> getSoldList(); </th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>财务人员或总经理选择查看销售列表</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>财务人员或总经理选择查看销售列表后，系统显示销售列表</th>	
		</tr>	
<tr>
		<th rowspan="3">SaleDetailRecordVO.getSum</th>
		<th>语法</th>
		<th>public double getSum();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>财务人员或总经理选择查看经营总和</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>在财务人员或总经理选择查看经营总和这个选项后，返回经营总和这个数值</th>
</tr>	
<tr><th colspan="4">需要的服务（需接口);</th></tr>
<tr><th>服务名</th><th colspan="2">服务</th>
<tr><th>manageDataService.addSaleDetail(ArrayList&lt;SaleDetailRequirementPO> saleDetailRequirementList);</th>
<th colspan="2">添加相应的筛选条件，以便在数据层里面根据所添加的条件进行搜索得到相应的销售明细</th> </tr>

</table>


SaleDetailRequirementVO类的接口规范
<table>
	<tr>
		<th colspan="3">提供的服务（供接口）</th>
	</tr>
	<tr>
		<th rowspan="3">SaleDetailRequirementVO.getStart</th>
		<th>语法</th>
		<th>public Date getStart(); </th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户选择开始输入起始日期</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回各个可能的起始日期供用户选择</th>	
		</tr>	
<tr>
		<th rowspan="3">SaleDetailRequirementVO.getEnd</th>
		<th>语法</th>
		<th>public Date getEnd();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户开始输入结束日期</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回各个可能的结束日期供用户选择</th>
</tr>	
<tr>
		<th rowspan="3">SaleDetailRequirementVO.getName</th>
		<th>语法</th>
		<th>public String getName();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户开始输入商品名</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回各个可能的商品的名称供用户选择</th>
</tr>	
<tr>
		<th rowspan="3">SaleDetailRequirementVO.getMember</th>
		<th>语法</th>
		<th>public MemberVO getMember();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户开始输入客户信息</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回各个可能的客户相关信息供用户选择</th>
</tr>
<tr>
		<th rowspan="3">SaleDetailRequirementVO.getSalesMan</th>
		<th>语法</th>
		<th>public String getSalesMan();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户开始输入业务员信息</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回各个可能的相关业务员的信息供用户选择</th>
</tr>
<tr>
		<th rowspan="3">SaleDetailRequirementVO.getStorage</th>
		<th>语法</th>
		<th>public String getStorage();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户开始输入仓库信息</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回各个可能的仓库相关信息供用户选择</th>
</tr>

</table>

SaleProblemInformationVO类的接口规范
<table>
	<tr>
		<th colspan="3">提供的服务（供接口）</th>
	</tr>
	<tr>
		<th rowspan="3">SaleProblemInformationVO.getIncome</th>
		<th>语法</th>
		<th>public Income getIncome(); </th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户选择查看收入类</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回相应的收入类</th>	
		</tr>	
<tr>
		<th rowspan="3">SaleProblemInformationVO.getExpense</th>
		<th>语法</th>
		<th>public Expense getExpense();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户选择查看支出类</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回相应的支出类</th>
</tr>	
<tr><th colspan="4">需要的服务（需接口);</th></tr>
<tr><th>服务名</th><th colspan="2">服务</th>
<tr><th>manageDataService.getSaleProblem(boolean x);</th>
<th colspan="2">根据传入的布尔类型的参数选择是否查看经营情况，若是则返回收入类，支出类和利润</th> </th></tr>
</table>


SaleProcessRecordVO类的接口规范
<table>
	<tr>
		<th colspan="3">提供的服务（供接口）</th>
	</tr>
	<tr>
		<th rowspan="3">SaleProcessRecordVO.getSaleList</th>
		<th>语法</th>
		<th>public ArrayList&lt;SaleVO> getSaleList(); </th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户选择查看销售列表</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回相应的销售列表</th>	
		</tr>	
<tr>
		<th rowspan="3">SaleProcessRecordVO.getStockList</th>
		<th>语法</th>
		<th>public ArrayList&lt;StockVO> getStockList();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户选择查看库存列表</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回相应的库存列表</th>
</tr>	
<tr>
		<th rowspan="3">SaleProcessRecordVO.getCollectList</th>
		<th>语法</th>
		<th>public ArrayList&lt;CollectVO> getCollectList();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户选择查看收款单</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回相应的收款单</th>
</tr>
<tr>
		<th rowspan="3">SaleProcessRecordVO.getPayList</th>
		<th>语法</th>
		<th>public ArrayList&lt;PayVO> getPayList();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户选择查看付款单列表</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回相应的付款单列表</th>
</tr>
<tr>
		<th rowspan="3">SaleProcessRecordVO.getCommodityList</th>
		<th>语法</th>
		<th>public ArrayList&lt;CommodityVO> getCommodityList();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户选择查看商品列表</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回相应的商品列表</th>
</tr>

<tr><th colspan="4">需要的服务（需接口);</th></tr>
<tr><th>manageDataService.addSaleProcess(ArrayList&lt;SaleProcessRequirementPO> saleProcessRequirementList);</th>
<th colspan="2">添加相应的筛选条件，以便在数据层里面根据所添加的条件进行搜索得到相应的经营历程</th> </tr>
</table>

SaleProcessRequirementVO类的接口规范
<table>
	<tr>
		<th colspan="3">提供的服务（供接口）</th>
	</tr>
	<tr>
		<th rowspan="3">SaleProcessRequirementVO.getStart</th>
		<th>语法</th>
		<th>public Date getStart(); </th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户选择开始输入起始日期</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回各个可能的起始日期供用户选择</th>	
		</tr>	
<tr>
		<th rowspan="3">SaleProcessRequirementVO.getEnd</th>
		<th>语法</th>
		<th>public Date getEnd();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户开始输入结束日期</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回各个可能的结束日期供用户选择</th>
</tr>	
<tr>
		<th rowspan="3">SaleProcessRequirementVO.getType</th>
		<th>语法</th>
		<th>public String getType();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户开始输入商品类型</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回各个可能的商品的类型供用户选择</th>
</tr>	
<tr>
		<th rowspan="3">SaleProcessRequirementVO.getMember</th>
		<th>语法</th>
		<th>public MemberVO getMember();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户开始输入客户信息</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回各个可能的客户相关信息供用户选择</th>
</tr>
<tr>
		<th rowspan="3">SaleProcessRequirementVO.getSalesMan</th>
		<th>语法</th>
		<th>public String getSalesMan();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户开始输入业务员信息</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回各个可能的相关业务员的信息供用户选择</th>
</tr>
<tr>
		<th rowspan="3">SaleProcessRequirementVO.getStorage</th>
		<th>语法</th>
		<th>public String getStorage();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户开始输入仓库信息</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回各个可能的仓库相关信息供用户选择</th>
</tr>

</table>

##### （4）业务逻辑层的动态模型
# **** 缺图及说明 ****






### 2.promotionbl模块
##### （1）模块概述
promotionbl模块承担的需求参见需求规格说明文档及相关功能需求。

promotionbl模块的职责及接口参见软件体系结构描述文档。
#####   （2）整体结构
根据体系结构的设计，采用分层风格，将系统分为展示层，业务逻辑层，数据层。每一层之间为了灵活性，添加了接口，以实现针对接口编程，隔离数据传输的职责，降低层与层之间耦合，添加的接口包括promotionblservice , promotiondataservice两个接口。为了隔离业务逻辑职责和逻辑控制职责，我们添加PromotionController，这样PromotionController将会将促销相关的业务逻辑职责和逻辑控制委托给promotionbl 对象。promotionPO是做为管理信息的持久化对象被添加到设计模型中的。

promotionbl模块的设计如图 所示.
#        ** 缺图**


类| 职责
---|---
PromotionController | 负责实现促销界面所需服务
PromotionVO | 包含促销这个行为的相关信息，有促销列表，促销商品等


#####   （3）模块内部类的接口规范
PromotionController类的接口说明
<table>
	<tr>
		<th colspan="3">提供的服务（供接口）</th>
	</tr>
	<tr>
		<th rowspan="3">PromotionController.returnGoodsInformation</th>
		<th>语法</th>
		<th>public ArrayList&lt;GoodsVO> returnGoodsInformation(String brand); </th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>总经理输入了商品标识，且输入的商品标识合法</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回相应商品的信息</th>	
		</tr>	
<tr>
		<th rowspan="3">PromotionController.returnPromotionList</th>
		<th>语法</th>
		<th>public ArrayList&lt;GoodsVO> returnPromotionList(ArrayList&lt;PromotionVO> promotionList);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>总经理输入了促销信息，且输入的促销信息合法</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回相应促销商品列表。</th>
</tr>	
<tr>
		<th rowspan="3">PromotionController.removeInformation</th>
		<th>语法</th>
		<th>public boolean removeInformation(String brand);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>总经理输入要移除的商品的标识</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>系统移除相应商品的促销信息，返回是否操作成功</th>
</tr>
<tr>
		<th rowspan="3">PromotionController.end</th>
		<th>语法</th>
		<th>public boolean end(PromotionVO promotion);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>总经理结束输入</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>系统记录销售策略，返回是否记录成功</th>
</tr>	


<tr><th colspan="4">需要的服务（需接口);</th></tr>
<tr><th>服务名</th><th colspan="2">服务</th>
<tr><th>promotionDataService.getGoodsInformation(GoodsPO goods);</th>
<th colspan="2">返回相应的商品信息</th> </tr>
<tr><th>promotionDataService.getPromotionGoods(ArrayList&lt;PromotionPO> promotionList);</th>
<th colspan="2">返回促销商品列表</th> </tr>
<tr><th>promotionDataService.deleteInformation(String brand);</th>
<th colspan="2">删除相应标识所对应的促销信息</th> </th></tr>
<tr><th>promotionDataService.endInput(PromotionPO promotion);</th>
<th colspan="2">记录销售策略，返回是否记录成功</th> </th></tr>


</table>
PromotionVO类的接口说明
<table>
	<tr>
		<th colspan="3">提供的服务（供接口）</th>
	</tr>
	<tr>
		<th rowspan="3">PromotiionVO.getVipGift</th>
		<th>语法</th>
		<th>public ArrayList&lt;VipGift> getVipGift(); </th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户查看并选择供高级用户领取的礼品</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回高级用户礼品列表</th>	
		</tr>	
<tr>
		<th rowspan="3">PromotionVO.getPublicGift</th>
		<th>语法</th>
		<th>public ArrayList&lt;Bargain> getPublicGift();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户查看并选择供普通用户领取的特价商品（用作礼品）</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回相应的特价商品列表</th>
</tr>	
<tr>
		<th rowspan="3">PromotionVO.getRichGift</th>
		<th>语法</th>
		<th>public ArrayList&lt;RichGift> getRichGift();</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>用户查看并选择供高消费用户领取的高价商品（作为礼品）</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回相应的高消费商品（礼品）列表</th>
</tr>	
<tr><th colspan="4">需要的服务（需接口);</th></tr>
<tr><th>服务名</th><th colspan="2">服务</th>
<tr><th>promotionDataService.getGoodsInformation(GoodsPO goods);</th>
<th colspan="2">返回相应的商品信息</th> </tr>
<tr><th>promotionDataService.getPromotionGoods(ArrayList&lt;PromotionPO> promotionList);</th>
<th colspan="2">返回促销商品列表</th> </tr>

</table>

##### （4）业务逻辑层的动态模型
# **** 缺图及说明 ****

### 3.checkbl模块
#####  （1）模块概述
checkbl模块承担的需求参见需求规格说明文档及相关功能需求。

checkbl模块的职责及接口参见软件体系结构描述文档。
#####   （2）整体结构
根据体系结构的设计，采用分层风格，将系统分为展示层，业务逻辑层，数据层。每一层之间为了灵活性，添加了接口，以实现针对接口编程，隔离数据传输的职责，降低层与层之间耦合，添加的接口包括checkblservice , checkdataservice两个接口。为了隔离业务逻辑职责和逻辑控制职责，我们添加CheckController，这样CheckController将会将审阅相关的业务逻辑职责和逻辑控制委托给checkbl 对象。checkPO是做为管理信息的持久化对象被添加到设计模型中的。

checkbl模块的设计如图 所示.
#        ** 缺图**

类 | 职责
---|---
CheckController | 负责实现审阅界面所需业务

##### （3）模块内部类的接口规范

CheckController类的接口规范
<table>
	<tr>
		<th colspan="3">提供的服务（供接口）</th>
	</tr>
	<tr>
		<th rowspan="3">CheckController.submitReceipt</th>
		<th>语法</th>
		<th>public boolean submit(ReceiptVO receipt); </th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>单据被提交</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回是否提交成功</th>	
		</tr>	
<tr>
		<th rowspan="3">CheckController.sendReceipt</th>
		<th>语法</th>
		<th>public boolean send(ReceiptVO receipt);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>单据被提交</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>将单据发送给总经理，返回是否发送成功</th>
</tr>	
<tr>
		<th rowspan="3">CheckController.seeRecipt</th>
		<th>语法</th>
		<th>public ReciptVO seeReceipt(boolean x);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>总经理选择查看单据</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回单据信息</th>
</tr>
<tr>
		<th rowspan="3">CheckController.reviseRecipt</th>
		<th>语法</th>
		<th>public boolean reviseReceipt(ReceiptVO recipt);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>总经理修改单据信息</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>系统修改相应的单据信息，返回是否修改成功</th>
</tr>
<tr>
		<th rowspan="3">CheckController.checkRecipt</th>
		<th>语法</th>
		<th>public boolean checkReceipt(boolean x);</th>
		</tr>
		<tr>
			<th>前置条件</th>
			<th>总经理审阅单据信息</th>
		</tr>
		<tr>
			<th>后置条件</th>
			<th>返回是否审阅通过</th>
</tr>	


<tr><th colspan="4">需要的服务（需接口);</th></tr>
<tr><th>服务名</th><th colspan="2">服务</th>
<tr><th>checkDataService.submit(ReceiptPO receipt);</th>
<th colspan="2">提交相应单据到数据库中，返回是否提交成功</th> </tr>
<tr><th>checkDataService.send(ReceiptPO receipt);</th>
<th colspan="2">从数据库中发送相应单据，返回是否发送成功</th> </tr>
<tr><th>checkDataService.revise(ReceiptPO receipt);</th>
<th colspan="2">修改相应的单据并存入数据库中，返回是否修改成功</th> </th></tr>


</table>

##### （4）业务逻辑层的动态模型
# **** 缺图及说明 ****
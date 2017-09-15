
#**企业进存销系统**  


​      

# **SSASS(Stocking Selling and                               	Storing System)**

# **用例文档**

# **V1.0草稿版**

## **南京大学软工二怎么都搞得好组**



###**2017-09-12**

##**更新历史**
<table >
	<tr> 
		<th>修改人员</th>
		<th>日期</th>
		<th>变更原因</th>
		<th>版本号</th>
	</tr>
	<tr>
		<th>潘羽</th>
		<th>2017-09-13</th>
		<th>最初草稿</th>
		<th>V1.0草稿版</th>
	</tr>
	<tr>
		<th></th>
		<th></th>
		<th></th>
		<th></th>
	</tr>
	<tr>
		<th></th>
		<th></th>
		<th></th>
		<th></th>
	</tr>    
</table>    

##1.1 目的
 **本文档描述了企业进销存系统的用户需求**


##1.2阅读说明


​     
##1.3 参考文献  

#2 用例列表
<table>
	<tr>
		<th>**参与者**</th>
		<th>**用例**</th>
	</tr>
	<tr>
		<th align="left">库存管理人员</th>
		<th align="left">​<ol>
				<li>商品分类管理</li>	
				<li>库存处理</li>
			</ol>
		</th>
	</tr>
	<tr>
		<th align="left">进货销售人员</th>
		<th align="left">
			<ol start="3">
				<li>管理客户</li>
				<li>制定进货单</li>
				<li>制定进货退货单</li>
				<li>制定销售单</li>
				<li>制定销售退货单</li>
				</ol>
			</th>
	</tr>
	<tr>
		<th align="left">财务人员</th>
		<th align="left">
			<ol start="8">
				<li> 管理银行账户</li>
				<li>制定收款单</li>
				<li>制定付款单</li>
				<li>查看销售明细</li>
				<li>查看经营历程</li>
				<li>查看经营情况</li>
				<li>期初建账</li>
				</ol>
			</th>
	</tr>
	<tr>
		<th align="left">总经理</th>
		<th align="left">
			<ol start="15">
				<li>审批单据</li>
				<li>查看销售明细</li>
				<li>制定付款单</li>
				<li>查看经营历程</li>
				<li>查看经营情况</li>
				<li>制定销售策略</li>
				</ol>
			</th>
	</tr>
</table>



  
#3. 详细用例描述

  
##用例1.商品分类管理
	
		
		

<table>
	<tr align="left">
		<th>**ID**</th>
		<th>1</th>
		<th>**名称**</th>
		<th>商品分类管理</th>
	</tr>
	<tr align="left">
		<th>**创建者**</th>
		<th>潘羽</th>
		<th>**最后一次更新者**</th>
		<th>`name`</th>
	</tr>
	<tr align="left">
		<th>**创建日期**</th>
		<th>2017-09-09</th>
		<th>**最后更新日期**</th>
		<th>`date`</th>
	</tr>
	<tr align="left">
		<th>**参与者**</th>
		<th colspan="3">库存管理人员，目标是精准操作分类，自动生成分类编号并能增删改查商品属性</th>
	<tr align="left">
		<th>**触发条件**</th>
		<th colspan="3">库存人员修改分类或商品属性，查询商品</th>
	</tr>
	<tr align="left">
		<th>**前置条件**</th>
		<th colspan="3">库存管理人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>**后置条件**</th>
		<th colspan="3">自动生成商品分类编号；保存修改后的商品属性；提供商品查询后的结果</th>
	</tr>
	<tr align="left">
		<th>**优先级**</th>
		<th colspan="3">中</th>
	</tr>
	<tr align="left">
		<th>**正常流程**</th>
		<th colspan="3">
			<ol>
				<li>库存管理人员对商品进行分类操作</li>
				<li>如果是添加商品分类，系统判断
				能否添加分类并对分类自动生成编号</li>
				<li>库存管理人员点击某个商品叶节点分类</li>
				<li>系统显示添加的商品分类及其编号，重复1~2步直到库存管理人员完				成对商品分类的操作</li>
				<li>系统显示商品的属性包括编号，名称，型号，库存数量，进价，零售				价，最近进价，最近零售价。</li>
				<li>如果库存管理人员对商品进行增删改操作</li>
				<li>系统自动保存修改内容并根据操作分类以及操作次序
					自动生成编号</li>
				<li>如果库存管理人员对商品进行查询操作</li>
				<li>系统显示被查询商品属性</li>
				库存管理人员重复4~10步，直到完成对所有商品属性的增删查改。
		</th>
	</tr>
	<tr align="left">
		<th>**扩展流程**</th>
		<th colspan="3">2a. 非法添加子类：
					<br>1.系统提示错误并拒绝添加
					<br>6a. 操作失误：
					<br>1.系统提供撤销操作方法并恢复操作前数据
					<br>6b. 非法操作商品属性：
					<br>1.系统提示错误并拒绝操作
					<br>9a. 查询失败：
					<br>1.系统提示查询关键词不匹配返回无结果
		</th>
	</tr>
	<tr align="left">
		<th>**特殊需求**</th>
		<th colspan="3">
			<ol>
				<li>系统要能判断是否能添加商品分类</li>
				<li>系统自动生成商品编号并随操作更新</li>
				<li>查询商品支持模糊查询，可通
				过输入关键字，商品编号等进行模糊查询</li>
				<li>系统规定一开始的进价和售价的默认值，保存
				一个最近的售价和进价属性</li>
		</th>
	</tr>
	
	
<br>
<br>
<br>
<table>
	<tr align="left">
		<th>ID</th>
		<th>2</th>
		<th>名称</th>
		<th>库存处理</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>`name`</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>`date`</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">库存管理人员，目标是查看并盘点库存，不用出现库存问题而出现业务损失</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">当天盘点查看库存或者实际库存与系统数据不符</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">库存管理人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">提供库存出入数据；提供当天各种商品的属性包括名称，型号，库存数量，库存均价，批次，批号，出厂日期，显示行号；库存减去赠送商品；报溢报损报警</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">高</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
				<li>库存管理员查看预设时间段的出入库数量，金额
				和销售进货数量，金额。</li>
				<li>系统显示库存信息</li>
				<li>库存管理员盘点当天的库存</li>
				<li>系统给出当天商品的各种属性</li>
				<li>库存管理员提交库存赠送单</li>
				<li>系统从库存减去这些商品</li>
				<li>库存管理员盘点实际商品数量</li>
				<li>系统中数量与实际数量比较，报损报溢</li>
				<li>库存低于警戒数量系统发送消息给库存管理员</li>
				<li>库存管理员增加库存</li>
				<li>系统通过审批自动更改数据</li>
				<li>库存管理员根据消息进出货</li>
		</th>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">1a. 查询日期早于预设时间段：
					<br>1.系统给出前一次记录并提示未到预设时间
					<br>11a. 未通过审批：
					<br>1.系统显示未通过审批的错误信息		</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>库存数量要有合计</li>
				<li>库存盘点要求可以导出Excel</li>
				<li>查询商品支持模糊查询，可通过输入关
				键字，商品编号等进行模糊查询</li>
		</th>
	</tr>




<br>
<br>
<br>
<table>
	<tr align="left">
		<th>**ID**</th>
		<th>2</th>
		<th>**名称**</th>
		<th>库存处理</th>
	</tr>
	<tr align="left">
		<th>**创建者**</th>
		<th>潘羽</th>
		<th>**最后一次更新者**</th>
		<th>`name`</th>
	</tr>
	<tr align="left">
		<th>**创建日期**</th>
		<th>2017-09-09</th>
		<th>**最后更新日期**</th>
		<th>`date`</th>
	</tr>
	<tr align="left">
		<th>**参与者**</th>
		<th colspan="3">库存管理人员，目标是查看并盘点库存，不用出现库存问题而出现业务损失</th>
	<tr align="left">
		<th>**触发条件**</th>
		<th colspan="3">当天盘点查看库存或者实际库存与系统数据不符</th>
	</tr>
	<tr align="left">
		<th>**前置条件**</th>
		<th colspan="3">库存管理人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>**后置条件**</th>
		<th colspan="3">提供库存出入数据；提供当天各种商品的属性包括名称，型号，库存数量，库存均价，批次，批号，出厂日期，显示行号；库存减去赠送商品；报溢报损报警</th>
	</tr>
	<tr align="left">
		<th>**优先级**</th>
		<th colspan="3">高</th>
	</tr>
	<tr align="left">
		<th>**正常流程**</th>
		<th colspan="3">
			<ol>
				<li>库存管理员查看预设时间段的出入库数量，金额
				和销售进货数量，金额。</li>
				<li>系统显示库存信息</li>
				<li>库存管理员盘点当天的库存</li>
				<li>系统给出当天商品的各种属性</li>
				<li>库存管理员提交库存赠送单</li>
				<li>系统从库存减去这些商品</li>
				<li>库存管理员盘点实际商品数量</li>
				<li>系统中数量与实际数量比较，报损报溢</li>
				<li>库存低于警戒数量系统发送消息给库存管理员</li>
				<li>库存管理员增加库存</li>
				<li>系统通过审批自动更改数据</li>
				<li>库存管理员根据消息进出货</li>
		</th>
	</tr>
	<tr align="left">
		<th>**扩展流程**</th>
		<th colspan="3">1a. 查询日期早于预设时间段：
					<br>1.系统给出前一次记录并提示未到预设时间
					<br>11a. 未通过审批：
					<br>1.系统显示未通过审批的错误信息		</th>
	</tr>
	<tr align="left">
		<th>**特殊需求**</th>
		<th colspan="3">
			<ol>
				<li>库存数量要有合计</li>
				<li>库存盘点要求可以导出Excel</li>
				<li>查询商品支持模糊查询，可通过输入关
				键字，商品编号等进行模糊查询</li>
		</th>
	</tr>
</table>



<br>
<br>
<br>
<table>
	<tr align="left">
		<th>**ID**</th>
		<th>3</th>
		<th>**名称**</th>
		<th>管理客户</th>
	</tr>
	<tr align="left">
		<th>**创建者**</th>
		<th>潘羽</th>
		<th>**最后一次更新者**</th>
		<th>`name`</th>
	</tr>
	<tr align="left">
		<th>**创建日期**</th>
		<th>2017-09-09</th>
		<th>**最后更新日期**</th>
		<th>`date`</th>
	</tr>
	<tr align="left">
		<th>**参与者**</th>
		<th colspan="3">库存管理人员，目标是查看并盘点库存，不用出现库存问题而出现业务损失</th>
	<tr align="left">
		<th>**触发条件**</th>
		<th colspan="3">当天盘点查看库存或者实际库存与系统数据不符</th>
	</tr>
	<tr align="left">
		<th>**前置条件**</th>
		<th colspan="3">库存管理人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>**后置条件**</th>
		<th colspan="3">提供库存出入数据；提供当天各种商品的属性包括名称，型号，库存数量，库存均价，批次，批号，出厂日期，显示行号；库存减去赠送商品；报溢报损报警</th>
	</tr>
	<tr align="left">
		<th>**优先级**</th>
		<th colspan="3">高</th>
	</tr>
	<tr align="left">
		<th>**正常流程**</th>
		<th colspan="3">
			<ol>
				<li>库存管理员查看预设时间段的出入库数量，金额
				和销售进货数量，金额。</li>
				<li>系统显示库存信息</li>
				<li>库存管理员盘点当天的库存</li>
				<li>系统给出当天商品的各种属性</li>
				<li>库存管理员提交库存赠送单</li>
				<li>系统从库存减去这些商品</li>
				<li>库存管理员盘点实际商品数量</li>
				<li>系统中数量与实际数量比较，报损报溢</li>
				<li>库存低于警戒数量系统发送消息给库存管理员</li>
				<li>库存管理员增加库存</li>
				<li>系统通过审批自动更改数据</li>
				<li>库存管理员根据消息进出货</li>
		</th>
	</tr>
	<tr align="left">
		<th>**扩展流程**</th>
		<th colspan="3">1a. 查询日期早于预设时间段：
					<br>1.系统给出前一次记录并提示未到预设时间
					<br>11a. 未通过审批：
					<br>1.系统显示未通过审批的错误信息		</th>
	</tr>
	<tr align="left">
		<th>**特殊需求**</th>
		<th colspan="3">
			<ol>
				<li>库存数量要有合计</li>
				<li>库存盘点要求可以导出Excel</li>
				<li>查询商品支持模糊查询，可通过输入关
				键字，商品编号等进行模糊查询</li>
		</th>
	</tr>
</table>






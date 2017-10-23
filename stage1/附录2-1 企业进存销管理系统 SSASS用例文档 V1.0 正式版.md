
#**企业进存销系统**  


​      

# **SSASS(Stocking Selling and                               	Storing System)**

# **用例文档**

# **V1.0正式版**

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
		<th>2017-9-19</th>
		<th>正式版</th>
		<th>V1.0正式版</th>
	</tr>
	<tr>
		<th></th>
		<th></th>
		<th></th>
		<th></th>
	</tr>    
</table>

##目录  

<br>目的 ******************************************************1
<br>阅读说明  *************************************************2
<br>参考文献  *************************************************3
<br>用例列表  *************************************************4
<br>详细用例描述 ********************************************5
<br>用例1.商品分类 ******************************************7
<br>用例2.商品管理 ******************************************8
<br>用例3. 库存查看盘点 ************************************9
<br>用例4.生成库存单据 ************************************10
<br>用例5.管理客户 *****************************************11
<br>用例6.制定进货单 **************************************12
<br>用例7.制定进货退货单 *********************************13
<br>用例8.制定销售单 **************************************14
<br>用例9.制定销售退货单 *********************************15
<br>用例10. 管理银行账户 *********************************16
<br>用例11.制定收款单 *************************************17
<br>用例12.制定付款单 *************************************18
<br>用例13.查看销售明细 **********************************19
<br>用例14.查看经营历程 **********************************20
<br>用例15.查看经营情况 **********************************21
<br>用例16.期初建账 ***************************************22
<br>用例17.审批单据 ***************************************23
<br>用例18.制定销售策略 **********************************24
##1.1 目的
 **本文档描述了企业进销存系统的用户需求**


##1.2阅读说明


​     
##1.3 参考文献  

#2 用例列表
<table>
	<tr>
		<th>参与者</th>
		<th>用例</th>
	</tr>
	<tr>
		<th align="left">库存管理人员</th>
		<th align="left">​<ol>
				<li>商品分类</li>	
				<li>商品管理</li>
				<li>库存查看盘点</li>
				<li>生成库存单据</li>
			</ol>
		</th>
	</tr>
	<tr>
		<th align="left">进货销售人员</th>
		<th align="left">
			<ol start="5">
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
			<ol start="10">
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
			<ol start="17">
				<li>审批单据</li>
				<li>查看销售明细</li>
				<li>查看经营历程</li>
				<li>查看经营情况</li>
				<li>制定销售策略</li>
				</ol>
			</th>
	</tr>
</table>



  
#3. 详细用例描述

  
##用例1.商品分类
	
		
		

<table>
	<tr align="left">
		<th>ID</th>
		<th>1</th>
		<th>名称</th>
		<th>商品分类</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>潘羽</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>`2017-09-17</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">库存管理人员，目标是精准操作分类，自动生成分类编号并能增删改查商品分类</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">库存人员增删改商品分类</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">库存管理人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">自动生成商品分类编号；保存修改后的商品分类</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">中</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
				<li>库存管理人员对商品进行分类操作，包括对商品分类的增删改</li>
				<li>如果是添加商品分类，系统判断能否添加分类并对分类自动生成编号</li>
				<li>重复1~2步直到库存管理人员完成对所有商品分类的操作</li>
		</th>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">2a. 非法添加子类：
					<br>1.系统提示错误并拒绝添加
					<br>2b. 操作失误：
					<br>1.系统提供撤销操作方法并恢复操作前数据
					<br>2c. 非法操作商品分类：
					<br>1.系统提示错误并拒绝操作
			</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>系统要能判断是否能添加商品分类</li>
				<li>系统自动生成商品编号并随操作更新</li>
		</th>
	</tr>
</table>

<br>
<br>
<br>




##用例2.商品管理
<table>
	<tr align="left">
		<th>ID</th>
		<th>2</th>
		<th>名称</th>
		<th>商品管理</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>潘羽</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">库存管理人员，目标是能增删改查商品属性</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">库存人员增删改商品属性</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">库存管理人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">保存修改后的商品属性；提供商品查询后的结果</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">中</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
				<li>库存管理人员点击某个叶节点分类</li>
				<li>系统显示该分类下所有商品</li>
				<li>库存管理人员对商品属性进行增删改操作</li>
				<li>系统更改商品属性并保存</li>
				<li>重复1~4步直到库存管理人员完成对所有商品属性			的增删改操作</li>
				<li>库存管理人员输入查询商品属性</li>
				<li>系统显示被查询商品属性</li>
				<li>重复6~7步直到库存管理人员完成对所有商品属				性的查询</li>
						</th>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3"
					<br>3a. 操作失误：
					<br>1.系统提供撤销操作方法并恢复操作前数据
					<br>3b. 非法操作商品属性：
					<br>1.系统提示错误并拒绝操作
					<br>7a. 查询失败：
					<br>1.系统提示查询关键词不匹配返回无结果
		</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>查询商品支持模糊查询，可通
				过输入关键字，商品编号等进行模糊查询</li>
				<li>系统规定一开始的进价和售价的默认值，保存
				一个最近的售价和进价属性</li>
		</th>
	</tr>
</table>

<br>
<br>
<br>



##用例3.库存查看盘点
<table>
	<tr align="left">
		<th>ID</th>
		<th>3</th>
		<th>名称</th>
		<th>库存查看盘点</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>潘羽</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-22</th>
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
		<th colspan="3">提供库存出入数据；提供当天各种商品的属性包括名称，型		号，库存数量，库存均价，批次，批号，出厂日期，显示行号；
		</th>
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
						</th>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">1a. 查询日期早于预设时间段：
					<br>1.系统给出前一次记录并提示未到预设时间
					</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>库存数量要有合计</li>
				<li>库存盘点要求可以导出Excel</li>
			</th>
	</tr>
</table>




<br>
<br>
<br>


##用例4.生成库存单据
<table>
	<tr align="left">
		<th>ID</th>
		<th>3</th>
		<th>名称</th>
		<th>生成库存单据</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>潘羽</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-22</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">库存管理人员，目标是生成库存赠送单，库存报溢单，库存报损单，库存报警单</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">库存管理人员选择库存商品赠送或库存或者实际库存与系统数据不符或库存数量低于警戒值</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">库存管理人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">	库存减去赠送商品，生成库存赠送单，库存报溢单，库存报损单，库存报警单</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">高</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
				<li>库存管理员选择库存中的商品赠送</li>
				<li>系统生成库存赠送单</li>
				<li>系统从库存减去这些商品</li>
				<li>库存管理员提交库存赠送单</li>
				<li>库存管理员盘点实际商品数量</li>
				<li>系统中数量与实际数量比较，报损报溢</li>
				<li>库存低于警戒数量系统发
				送消息给库存管理员</li>
				<li>库存管理员增加库存</li>
				<li>系统通过审批自动更改数据</li>
				<li>库存管理员根据消息进出货</li>
		</th>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">11a. 未通过审批：
					<br>1.系统显示未通过审批的错误信息		</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
			<li>库存设置警戒数量</li>
				</tr>
</table>




<br>
<br>
<br>


##用例5.管理客户
<table>
	<tr align="left">
		<th>ID</th>
		<th>5</th>
		<th>名称</th>
		<th>管理客户</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>肖云帆</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">进货销售人员，目标是进销售人员能在权限下增删查改顾客属性</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">顾客数据变动；进货销售人员查询顾客属性</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">销售人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">系统根据进货单，销售单，收款单和付款单更改顾客属性数据		并保存，提供查询后的顾客属性，吸引顾客提高业务量</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">高</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
				<li>进货销售人员更改权限下可改的顾客属性包括编号，分类，级别，姓			名，电话，地址，邮编，电子邮箱，应收额度，默认业务员。</li>
				<li>系统更改顾客属性数据并保存</li>
				重复1~2步直到进货销售人员完成对顾客属性所有的更改
				<li>进货销售人员查找顾客属性</li>
				<li>系统提供符合查找关键词的顾客属性并显示</li>
				重复3~4步直到进货销售人员完成所有的查找工作		</th>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">1a. 非法权限修改数据:
					<br> 1.系统提示权限不够拒绝修改并给出警告信息
					<br> 1b. 进货销售人员撤销更改操作
					<br>1.系统恢复修改前的数据
					<br>4a. 查找关键词无匹配项
					<br>1. 系统提示没有匹配项并显示无结果
		</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>顾客属性的应收应付取决于进
				货单和销售单，收款单和付款单，不可更改</li>
				<li>应收额度仅最高权限可修改</li>
				<li>客户的查询可通过模糊查找查找到客户所有属性</li>
		</th>
	</tr>
</table>



<br>
<br>
<br>



##用例6.制定进货单
<table>
	<tr align="left">
		<th>ID</th>
		<th>6</th>
		<th>名称</th>
		<th>制定进货单</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>肖云帆</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">进货销售人员，目标是记录下进货数据，修改保存，生成单据，不要因为货源不匹配造成业务损失</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">进货销售人员进货</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">销售人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">系统根据进货状况给
		出进货单属性，包括单据编号，供应商，仓库
		，操作员，入库商品列表，备注，总额合
		计通过审批后系统更改库存数据和客户应收应付数据
		</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">中</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
				<li>进货销售人员进货</li>
				<li>系统给出一个新建的货单，给出属性</li>
				<li>进货销售人员手动输入选择入库商品列
				表的名称，手动输入数量，单价和备注</li>
				<li>系统自动计算生成未手动输入部分</li>
				重复1~4步直到进货销售人员完成所有的进货工作并更				改数据
				<li>进货单通过审批后系统更改保存库存数据
				和客户应收应付数据		
			</th>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">2a. 单据编号超出最大编号:
					<br> 1. 系统给出提示信息并按额外另行编号
					<br>3a. 非法输入
					<br>1. 系统提示输入错误信息并拒绝更
					改保存信息
					<br>3b. 数据输入错误
					<br>1. 系统恢复输入前的数据
					<br>3c. 缺少必要的选择和数据输入
					<br> 1. 系统提示数据缺少并要求输入
					<br>4a.  不合理数据生成
					<br>1.系统提示数据非法并提示进
					货销售人员核查输入数据
      				<br>2. 返回正常流程第3步
		</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>进货单据编号格式为 JHD-yyyyMMdd-xxxxx，
				后5位从1开始编号，最大为99999</li>
		</th>
	</tr>
</table>

<br>
<br>
<br>


##用例7.制定进货退货单
<table>
	<tr align="left">
		<th>ID</th>
		<th>7</th>
		<th>名称</th>
		<th>制定进货退货单</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>肖云帆</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">进货销售人员，目标是记录下退货数据，修改保存，生成单据，不要因为货源不匹配造成业务损失</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">进货销售人员
		向供货商退货</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">销售人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">系统根据退货状况给出退货单属性，包括单据编号，供应商，仓库，操作员，入库商品列表，备注，总额合计通过审批后系统更改库存数据和供应商应收应付数据
		</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">中</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
				<li>进货销售人员退货</li>
				<li>系统给出一个新建的货单，给出属性</li>
				<li>进货销售人员手动输入选择入库商品列
				表的名称，手动输入数量，单价和备注</li>
				<li>系统自动计算生成未手动输入部分</li>
				重复1~4步直到进货销售人员完成所有的退货工作并更				改数据
				<li>退货单通过审批后系统更改保存库存数据
				和客户应收应付数据		
			</th>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">2a. 单据编号超出最大编号:
					<br> 1. 系统给出提示信息并按额外另行编号
					<br>3a. 非法输入
					<br>1. 系统提示输入错误信息并拒绝更
					改保存信息
					<br>3b. 数据输入错误
					<br>1. 系统恢复输入前的数据
					<br>3c. 缺少必要的选择和数据输入
					<br> 1. 系统提示数据缺少并要求输入
					<br>4a.  不合理数据生成
					<br>1.系统提示数据非法并提示进
					货销售人员核查输入数据
      				<br>2. 返回正常流程第3步
		</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
					<li>进货退货单据编号为 JHTHD-yyyyMMdd-			xxxxx，后5位从1开始编号，最大为99999
		</th>
	</tr>
</table>

<br>
<br>
<br>

##用例8.制定销售单
<table>
	<tr align="left">
		<th>ID</th>
		<th>8</th>
		<th>名称</th>
		<th>制定销售单</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>肖云帆</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">进货销售人员，目标是记录下销售数据	，生成单据，修改保存，不要因为销售货源不匹配造成业务损失</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">销售人员向客户销售商品</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">销售人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">销售系统给出销售单属性信息，包括单据编号，客户，业务员，操作员，仓库，出货商品清单，折让前总金额，折让，使用代金券金额，折让后总金额，备注；销售单通过审批后更改库存数据和客户的应收应付数据
	</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">中</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
				<li>系统判断不同销售人员给出相应折让金额</li>
				<li>销售人员销售商品</li>
				<li>系统给出新建的销售单，包括各种属性</li>
				<li>销售员手动选择商品名称，输入数量，给商品备注</li>
				<li>系统自动计算生成未手动输入部分</li>
			重复1~5步直到销售人员完成所有销售单	
			<li>销售单通过审批后系统更改数据并保存</li>
		</th>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">1a. 折让金额超出限额
   	   <br>1. 系统提出错误信息并要求销售人员重新折让
		<br>3a.  单据编号超出最大编号
   		<br>1. 系统给出提示信息并按额外另行编号
		<br>4a. 非法输入
   		<br> 1. 系统提示输入错误信息并拒绝更改保存信息
		<br>4b. 数据输入错误
      	<br>1. 系统恢复输入前的数据
		<br>4c. 缺少必要的选择和数据输入
      	<br> 1. 系统提示数据缺少并要求输入
		<br>5a.  不合理数据生成
   	  	<br>  1.系统提示数据非法并提示进货销售人员核查输入数据
      	<br> 2. 返回正常流程第4步
		</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>销售单据编号格式为XSD-yyyyMMdd-xxxxx
				<li>单价默认为商品信息的销售价，可修改</li>
		</th>
	</tr>
</table>


<br>
<br>
<br>

##用例9.制定销售退货单
<table>
	<tr align="left">
		<th>ID</th>
		<th>9</th>
		<th>名称</th>
		<th>制定销售退货单</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>肖云帆</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">进货销售人员，目标是记录下销售退货数据	，生成单据，修改保存，不要因为销售货源不匹配造成业务损失</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">客户向销售人员退货</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">销售人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">销售系统给出销售退货单属性信息，包括单据编号，客户，业务员，操作员，仓库，出货商品清单，折让前总金额，折让，使用代金券金额，折让后总金额，备注；销售单通过审批后更改库存数据和客户的应收应付数据
	</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">中</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
				<li>销售人员销售商品</li>
				<li>系统给出新建的销售单，包括各种属性</li>
				<li>销售员手动选择商品名称，输入数量，给商品备注</li>
				<li>系统自动计算生成未手动输入部分</li>
			重复1~5步直到销售人员完成所有销售单	
			<li>销售单通过审批后系统更改数据并保存</li>
		</th>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">1a. 折让金额超出限额
   	   <br>1. 系统提出错误信息并要求销售人员重新折让
		<br>3a.  单据编号超出最大编号
   		
   		
   		<br>1. 系统给出提示信息并按额外另行编号
		<br>4a. 非法输入
   		<br> 1. 系统提示输入错误信息并拒绝更改保存信息
		<br>4b. 数据输入错误
      	<br>1. 系统恢复输入前的数据
		<br>4c. 缺少必要的选择和数据输入
      	<br> 1. 系统提示数据缺少并要求输入
		<br>5a.  不合理数据生成
   	  	<br>  1.系统提示数据非法并提示进货销售人员核查输入数据
      	<br> 2. 返回正常流程第4步
		</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>销售退货单据编号格式为XSTHD-yyyyMMdd-xxxxx
				<li>单价默认为商品信息的销售价，可修改</li>
		</th>
	</tr>
</table>


<br>
<br>
<br>





##用例10.银行账户管理
<table>
	<tr align="left">
		<th>ID</th>
		<th>10</th>
		<th>名称</th>
		<th>银行账户管理</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>谢寅鹏</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">财务人员，目标是准确对银
		行账户进行操作，包括增删改查</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">财务人员对银行账户进行操作</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">财务人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">系统给出账户属性，包括名称和金额</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">高</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
			<li>财务人员查看账户信息</li>
			<li>系统给出账户的属性信息</li>
			<li>财务人员对账户信息进行操作，包括增删改</li>
			<li>系统保存修改后的数据</li>
			重复3~4步直到财务人员完成所有的增删改工作
			<li>财务人员输入关键词查找账户信息</li>
			<li>系统给出账户属性信息</li>
			重复5~6步直到财务人员获得所有的账户信息		</th>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">
		1a.  非法权限
     	<br> 1. 系统给出警告信息并拒绝显示账户信息
		<br>3a. 非法输入
      	<br>1. 系统提示输入错误信息并拒绝更改保存信息
		<br>3b. 数据输入错误
      	<br>1. 系统恢复输入前的数据
		<br>3c. 非法修改
      	<br>1. 系统给出警告信息拒绝修改
		<br>3d. 非法权限
      	<br>1.  系统给出警告信息并拒绝操作
		<br>6a. 非法权限
      	<br>1.  系统给出警告信息并拒绝操作
		<br>6b. 非法输入
      	<br>1. 系统提示输入错误信息并拒绝查询
		<br>7a. 无匹配结果
      	<br>1.系统提示无匹配结果并返回正常流程第5步		</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>账户余额不可修改</li>
		</th>
	</tr>
</table>





<br>
<br>
<br>
##用例11.制定收款单
<table>
	<tr align="left">
		<th>ID</th>
		<th>11</th>
		<th>名称</th>
		<th>制定收款单</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>谢寅鹏</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">财务人员，目标是
		显示收款属性，更改数据并保存</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">财务人员收款并填
		写属性信息，包括操作员，转账列表，总额汇总
		</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">财务人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">a.系统给出新建的收款单并保存数据
		<br>b.系统给出新建的付款单并保存数据</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">高</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
			<li>财务人员收款</li>
			<li>系统新建收款单并显示收款单</li>
			<li>财务人员填写相关属性和备注并提交</li>
			<li>总经理审批收款单</li>
			<li>审批系统发送信息给财务人员</li>
			<li>如果通过审批财务人员根据信息完成收款操作</li>
			如果不通过审批重复1~4步直到通过审批，重复1~6步直到财务人员完成所有的收款工作
		</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">
		2a.单据编号超出最大编号
      	<br>1. 系统给出提示信息并按额外另行编号
		<br>3a. 非法填写
      	<br>1. 系统提示填写错误并要求重新填写提交
		<br>4a. 审批不通过
      	<br>1. 系统提示不通过并给出警告信息
      	<br>2. 返回正常流程第3步		</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>收款单据编号格式SKD-yyyyMMdd-xxxxx</li>
			</th>
	</tr>
</table>





<br>
<br>
<br>

##用例12.制定付款单
<table>
	<tr align="left">
		<th>ID</th>
		<th>12</th>
		<th>名称</th>
		<th>制定付款单</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>谢寅鹏</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">财务人员，目标是
		显示付款属性，更改数据并保存</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">财务人员付款并填
		写属性信息，包括操作员，转账列表，总额汇总
		</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">财务人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">系统给出新建的付款单并保存数据</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">高</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
			<li>财务人员付款</li>
			<li>系统新建付款单并显示收款单</li>
			<li>财务人员填写相关属性和备注并提交</li>
			<li>总经理审批付款单</li>
			<li>审批系统发送信息给财务人员</li>
			<li>如果通过审批财务人员根据信息完成付款操作</li>
			如果不通过审批重复1~4步直到通过审批，重复1~6步直到财务人员完成所有的收款工作
		</th>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">
		2a.单据编号超出最大编号
      	<br>1. 系统给出提示信息并按额外另行编号
		<br>3a. 非法填写
      	<br>1. 系统提示填写错误并要求重新填写提交
		<br>4a. 审批不通过
      	<br>1. 系统提示不通过并给出警告信息
      	<br>2. 返回正常流程第3步		</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>付款单据编号格式XJFYD-yyyyMMdd-xxxx</li>
		</th>
	</tr>
</table>





<br>
<br>
<br>



##用例13.查看销售明细
<table>
	<tr align="left">
		<th>ID</th>
		<th>13</th>
		<th>名称</th>
		<th>查看销售明细</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>谢寅鹏</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">财务人员、总经理，目标
		是准确快速统计一段时间内商品销售情况</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">财务人员或总经理查看商品销售明细</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">财务人员或总经理已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">系统显示一段时间内的商品销售记录，包
		括时间（精确到天）、商品名、型号、数量、单价、总额</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">高</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
			<li>财务人员或总经理查看销售明细</li>
			<li>系统给出筛选条件</li>
			<li>财务人员或总经理添加筛选条件，包括时间区间、商品名、
			客户、业务员、仓库</li>
			系统显示符合条件的商品销售记录列表，重复1~3步直到财
			务人员或总经理查看所有的销售明细
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">
		3a.筛选条件未全部填写
      	<br>1. 系统给出提示信息并要求重新填写
		<br>3b. 非法填写
      	<br>1. 系统提示填写错误并要求重新填写提交
		<br>4a. 未找到匹配筛选条件的销售明细
      	<br>1. 系统提示无匹配结果并给出警告信息
      	<br>2. 返回正常流程第3步</th>
	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>以列表形式显示商品销售记录</li>
				<li>列表中时间精确到天</li>
				<li>需要支持导出数据</li>
		</th>
	</tr>
</table>




<br>
<br>
<br>
##用例14.查看经营历程
<table>
	<tr align="left">
		<th>ID</th>
		<th>14
		
		</th>
		<th>名称</th>
		<th>查看经营历程</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>谢寅鹏</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">财务人员，目标是准确快速查
			看一段时间内所有单据，并可能进行红冲操作；
			<br>总经理，目标是准确查看一段时间内所有单据</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">财务人员或总经理查看经营历程</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">财务人员或总经理已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">系统显示一段时间内的所有单据；如果进行红
		冲操作，则之前的某个单子被删除或修改</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">高</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
			<li>财务人员或总经理查看经营历程</li> 
			<li>系统给出筛选条件，包括时间区间、单据类型、客户、
			业务员、仓库</li>
			<li>财务人员或总经理添加筛选条件</li>
			<li>系统显示符合条件的经营情况记录列表</li>
			<li>财务人员选择进行红冲或红冲并复制操作</li>
			<li>系统自动生成红冲的单子</li>
			<li>财务人员确认红冲或填写红冲并复制的单子</li>
			<li>系统修改单据记录</li>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">
		3a.筛选条件未全部填写
      	<br>1. 系统给出提示信息并要求重新填写
		<br>3b. 非法填写
      	<br>1. 系统提示填写错误并要求重新填写提交
		<br>4a. 未找到匹配筛选条件的销售明细
      	<br>1. 系统提示无匹配结果并给出警告信息
      	<br>2. 返回正常流程第3步
		<br>6a.财务人员没有选择具体的某一个单据
      	<br>1.系统给出提示信息并要求选择
		<br>8a.财务人员放弃填写红冲单据
      	<br>1.系统取消此次红冲并复制操作	</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>单据分为销售类单据、进货类单据、财务类单据和库存类单据</li>
				<li>红冲生成一个一模一样但是把数量取负数的单子</li>
				<li>报表能够导出</li>
		</th>
	</tr>
</table>





<br>
<br>
<br>
##用例15.查看经营情况
<table>
	<tr align="left">
		<th>ID</th>
		<th>15</th>
		<th>名称</th>
		<th>查看经营情况</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>谢寅鹏</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">财务人员、总经理，目标是统计显示
		一段时间内的经营收支状况和利润</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">财务人员或总经理查看经营情况</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">财务人员或总经理已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">系统统计显示一段时间内经营收支状况和利润，经营收入
		显示为折让后和折让额度，显示信息包括收入类，支出类，利润</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">高</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
			<li>财务人员或总经理查看经营情况</li>
			<li>系统显示收入类，支出类和利润的信息</li>
	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">
			</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>报表能导出</li>
				<li>收入类包括销售收入，商品类收入（商品报溢收入，成
				本调价收入，进退货差价，代金券和实际收款差额收入）</li>
				<li>支出类包括销售成本，商品类支出（商品报损，商品赠出）
				显示总支出</li>
				<li>利润 = 折让后总收入 - 总支出</li>		</th>
	</tr>
</table>






<br>
<br>
<br>
##用例16.期初建账
<table>
	<tr align="left">
		<th>ID</th>
		<th>16</th>
		<th>名称</th>
		<th>期初建账</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>谢寅鹏</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">财务人员，目标是新建一套帐</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">财务人员进行期初建账</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">财务人员已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">系统新建一套账并记录期初信息</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">中</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
			<li>财务人员期初建账</li>
			<li>系统提供需要添加的信息，包括商品信息（包括商品分类、名
			称、型号、进价/售价）、客户信息（分类、名称、联系方式
			等）与银行账户信息（名称、余额）</li>
			<li>财务人员填写信息</li>
			<li>系统初始化一套账并将此信息作为系统的初始启动状态</li>	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">
				3a.需要添加的信息未全部填写
      			<br>1. 系统给出提示信息并要求继续填写
				<br>3b. 非法填写
      			<br>1. 系统提示填写错误并要求重新填写提交
			</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>商品信息中最近进价/售价留白</li>
				<li>期初的信息会被单独存储，并随时可查</li>		</th>
	</tr>
</table>








<br>
<br>
<br>
##用例17.审批单据
<table>
	<tr align="left">
		<th>ID</th>
		<th>17</th>
		<th>名称</th>
		<th>审批单据</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>熊以恒</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">总经理，目标是查看
		所有申请单据，修改单据数据，审批单据，可以批量审阅</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">单据提交给总经理</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">总经理已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">单据被审批，系统发送审批后状态</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">高</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
			<li>单据被提交</li>
			<li>系统将单据发送给总经理</li>
			<li>总经理查看，修改，审阅单据</li>
			<li>系统将审阅后信息发回</li>	</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">
				1a.缺少单据提交
      			<br>1. 系统给出提示信息并要求提交单据
				<br>3a. 非法填写
      			<br>1. 系统提示填写错误并要求重新填写提交
				<br>4a. 审阅不通过
      			<br>1. 系统提示审阅不通过，返回正常流程第1步重新提交单据			</tr>
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>总经理可以批量审批单据</li>
		</th>
	</tr>
</table>






<br>
<br>
<br>
##用例18.制定销售策略
<table>
	<tr align="left">
		<th>ID</th>
		<th>18</th>
		<th>名称</th>
		<th>制定销售策略</th>
	</tr>
	<tr align="left">
		<th>创建者</th>
		<th>潘羽</th>
		<th>最后一次更新者</th>
		<th>熊以恒</th>
	</tr>
	<tr align="left">
		<th>创建日期</th>
		<th>2017-09-09</th>
		<th>最后更新日期</th>
		<th>2017-09-18</th>
	</tr>
	<tr align="left">
		<th>参与者</th>
		<th colspan="3">总经理，目标是根据最新的时常状况调整销售商品</th>
	<tr align="left">
		<th>触发条件</th>
		<th colspan="3">商品厂家提出自己商品的促销要求；节假日或者竞争促销；
		提前处理有可能会报废的商品；去除现有的销售策略</th>
	</tr>
	<tr align="left">
		<th>前置条件</th>
		<th colspan="3">总经理已经被识别和授权</th>
	</tr>
	<tr align="left">
		<th>后置条件</th>
		<th colspan="3">系统记录销售策略信息</th>
	</tr>
	<tr align="left">
		<th>优先级</th>
		<th colspan="3">中</th>
	</tr>
	<tr align="left">
		<th>正常流程</th>
		<th colspan="3">
			<ol>
			1.0 针对不同级别用户制定销售策略
			<li>总经理输入商品标识</li>
			<li>系统显示商品信息</li>
			<li>总经理输入促销信息，包括赠品，价格转让，赠送代
			金券，赠送日期</li>
			<li>系统显示促销商品列表</li>
		总经理重复1~4步直到完成所有的促销策略
			<li> 总经理结束输入</li>
			<li> 系统记录销售策略并反应记录成功</li>	
			</tr>
	<tr align="left">
		<th>扩展流程</th>
		<th colspan="3">
				1a.非法标识
     	<br> &nbsp&nbsp1. 系统提示错误并拒绝输入
		<br>3a. 非法填写
      	<br>&nbsp&nbsp1. 系统提示填写错误并要求重新填写提交
		<br>3b. 在此期间内商品已有促销信息
      	<br>&nbsp&nbsp1. 系统提示已有促销拒绝输入
		<br>4a. 总经理移除已输入的商品促销信息
      <br>&nbsp&nbsp1. 总经理输入商品标识
      <br>&nbsp&nbsp2. 系统移除该商品的促销信息
		<br>
		
		<br>1.1 特价包促销
		<br>1.总经理输入组合特价商品标识
   		<br>&nbsp&nbsp1a. 非法标识
       <br>&nbsp&nbsp&nbsp&nbsp1. 系统提示错误并拒绝输入
  		<br>&nbsp&nbsp1b. 在期间内有相同额度的特价包促销
       <br>&nbsp&nbsp&nbsp&nbsp1. 系统提示已有特价包并拒绝输入
		<br>2. 系统显示特价包商品列表
    	<br>&nbsp&nbsp2a. 总经理移除已输入的特价包信息
       <br>&nbsp&nbsp&nbsp&nbsp1. 总经理输入额度
        <br> &nbsp&nbsp&nbsp&nbsp2. 系统移除该额度的特价信息
		<br>总经理重复1~2步，直到输入所有特价包策略
		<br>3. 总经理结束输入
		<br>4. 系统记录特价包信息
		<br>
		<br>1.2 商品赠送促销
		<br>1.总经理输入商品标识
  		<br>&nbsp&nbsp1a. 非法标识
       <br>&nbsp&nbsp&nbsp&nbsp1. 系统提示错误并拒绝输入
		<br>2. 系统显示商品信息
		<br>3. 总经理输入赠送商品标识
    	<br>&nbsp&nbsp3a. 非法标识
        <br> &nbsp&nbsp&nbsp&nbsp1. 系统提示错误并拒绝输入
			<br>4. 系统显示赠送商品的标识，描述和价格
		<br>5. 总经理输入赠送数量，开始日期和结束日期
    	<br>&nbsp&nbsp5a. 在期间内已有相同的（额度，赠送商品标识）总额赠送信息
        <br>&nbsp&nbsp&nbsp&nbsp1. 系统提示已有商品赠送信息并拒绝输入
		<br>6. 系统显示商品赠送信息列表
   		<br>&nbsp&nbsp6a. 总经理要移除已输入的商品赠送信息
        <br>&nbsp&nbsp&nbsp&nbsp1. 总经理输入商品标识
         <br>&nbsp&nbsp&nbsp&nbsp2. 系统移除该商品的赠送信息
		<br>总经理重复1~6步，直到输入所有的商品赠送策略
	<tr align="left">
		<th>特殊需求</th>
		<th colspan="3">
			<ol>
				<li>总经理可以批量审批单据</li>
		</th>
	</tr>
</table>



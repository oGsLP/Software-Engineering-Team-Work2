##4.1业务逻辑层的分解
&nbsp;&nbsp;&nbsp;&nbsp;   业务逻辑层的开发包图参见软件体系结构说明文档图4.1<br>
##4.1.1 Accountbl模块
&nbsp;&nbsp;&nbsp;&nbsp;(1)模块概述
Accountbl模块承担的需求参见需求规格说明文档功能需求及相关功能需求。
<br>
&nbsp;&nbsp;&nbsp;&nbsp;orderbl模块的职责及接口参见软件体系结构描述文档。
<br>&nbsp;&nbsp;&nbsp;&nbsp;(2)整体结构<br>
    根据体系结构的设计，采用分层风格，将系统分为展示层，业务逻辑层，数据层。每一层之间为了灵活性，添加了接口，以实现针对接口编程，隔离数据传输的职责，降低层与层之间耦合，添加的接口包括Accountdataservice 。为了隔离业务逻辑职责和逻辑控制职责，我们添加AccountController，这样AccountController 将会将订单相关的业务逻辑职责和逻辑控制委托给Accountbl对象。AccountPO是做为管理信息的持久化对象被添加到设计模型中的。<br>
 &nbsp;&nbsp;&nbsp;&nbsp; Accountbl的模块设计见图4.1.1-1。
 <br>



accountbl模块的设计如图所示：

 <table>
 	<tr>
 		<th>类</th>
 		<th>职责</th>
 	</tr>
 	<tr>
 		<th>AccountData</th>
		<th>商品分类的领域模型对象，拥有商品分类信息，可以帮助完成与商品分类操作有关的活动，包括对商品分类的增加，商品分类的修改，商品分类的删除。</th>
</table>



表5.3.2-12 AccountData模块的接口规范
<table>
    <tr>
        <th colspan="3">提供的服务（供接口）</th>
    </tr>
    <tr>
        <th rowspan="3">AccountData.add</th>
        <th>语法</th>
        <th>public ResultMessage add (AccountPO account);</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>添加一个账本</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>添加账本信息并返回保存结果</th>
        </tr>   
        <tr>
        <th rowspan="3">AccountData.get</th>
        <th>语法</th>
        <th>public ArrayList&lt;AccountPO> get ();</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>得到所有帐本</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>返回所有帐本</th>
</tr>   

<tr>
        <th rowspan="3">AccountData.remove</th>
        <th>语法</th>
        <th>public ResultMessage delete (AccountPO Account);</th>
        </tr><tr>
            <th>前置条件</th>
            <th>删除一个账本，已知删除的账本</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>删除账本并返回保存结果</th>
</tr>   

</table>

##4.1.2 Bankbl模块
&nbsp;&nbsp;&nbsp;&nbsp;(1)模块概述
Bankbl模块承担的需求参见需求规格说明文档功能需求及相关功能需求。
<br>
&nbsp;&nbsp;&nbsp;&nbsp;orderbl模块的职责及接口参见软件体系结构描述文档。
<br>&nbsp;&nbsp;&nbsp;&nbsp;(2)整体结构<br>
&nbsp;&nbsp;&nbsp;&nbsp;根据体系结构的设计，采用分层风格，将系统分为展示层，业务逻辑层，数据层。每一层之间为了灵活性，添加了接口，以实现针对接口编程，隔离数据传输的职责，降低层与层之间耦合，添加的接口包括Bankdataservice 。为了隔离业务逻辑职责和逻辑控制职责，我们添加BankController，这样BankController 将会将订单相关的业务逻辑职责和逻辑控制委托给Bankbl对象。BankPO是做为管理信息的持久化对象被添加到设计模型中的。<br>
 &nbsp;&nbsp;&nbsp;&nbsp; Bankbl的模块设计见图4.1.1-1。
 <br>

 <table>
 	<tr>
 		<th>类</th>
 		<th>职责</th>
 	</tr>
 	<tr>
 		<th>BankData</th>
		<th>商品分类的领域模型对象，拥有商品分类信息，可以帮助完成与商品分类操作有关的活动，包括对商品分类的增加，商品分类的修改，商品分类的删除。</th>
</table>



表5.3.2-7 BankData模块的接口规范
<table>
    <tr>
        <th colspan="3">提供的服务（供接口）</th>
    </tr>
    <tr>
        <th rowspan="3">BankData.add</th>
        <th>语法</th>
        <th>public ResultMessage add (BankPO bank);</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>数据库不存在同样ID的账户</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>在数据库中增加一条银行账户，并且把序列化文件保存到本地</th>
        </tr>   
        <tr>
        <th rowspan="3">BankData.update </th>
        <th>语法</th>
        <th>public ResultMessage update(BankPO bank);</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>修改账户信息</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>在数据库中修改一条银行账户信息，并且把序列化文件保存到本地</th>
</tr>   

<tr>
        <th rowspan="3">BankData.deleteBank</th>
        <th>语法</th>
        <th>public ResultMessage deleteBank (BankPO bank);</th>
        </tr><tr>
            <th>前置条件</th>
            <th>数据库存在此ID的银行账户</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>在数据库中删除一条银行账户信息，并且把序列化文件保存到本地</th>
</tr>   
<tr>
        <th rowspan="3">BankData.get</th>
        <th>语法</th>
        <th>public BankPO get(String Number);</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>数据库存在此ID的银行账户</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>在数据库中调出该账户信息</th>
</tr>   
<tr>
        <th rowspan="3">BankData.getList</th>
        <th>语法</th>
        <th> public ArrayList&lt;BankPO> getList();</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>数据库存在银行账户信息</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>显示银行账户信息列表</th>
</tr>   
</table>



##4.1.3 Paybl模块
&nbsp;&nbsp;&nbsp;&nbsp;(1)模块概述
Paybl模块承担的需求参见需求规格说明文档功能需求及相关功能需求。
<br>
&nbsp;&nbsp;&nbsp;&nbsp;orderbl模块的职责及接口参见软件体系结构描述文档。
<br>&nbsp;&nbsp;&nbsp;&nbsp;(2)整体结构<br>
&nbsp;&nbsp;&nbsp;&nbsp;根据体系结构的设计，采用分层风格，将系统分为展示层，业务逻辑层，数据层。每一层之间为了灵活性，添加了接口，以实现针对接口编程，隔离数据传输的职责，降低层与层之间耦合，添加的接口包括Paydataservice 。为了隔离业务逻辑职责和逻辑控制职责，我们添加PayController，这样PayController 将会将订单相关的业务逻辑职责和逻辑控制委托给Paybl对象。PayPO是做为管理信息的持久化对象被添加到设计模型中的。<br>
 &nbsp;&nbsp;&nbsp;&nbsp; Paybl的模块设计见图4.1.1-1。
 <br>

 <table>
 	<tr>
 		<th>类</th>
 		<th>职责</th>
 	</tr>
 	<tr>
 		<th>PayData</th>
		<th>商品分类的领域模型对象，拥有商品分类信息，可以帮助完成与商品分类操作有关的活动，包括对商品分类的增加，商品分类的修改，商品分类的删除。</th>
</table>



表5.3.2-10 PayData模块的接口规范
<table>
    <tr>
        <th colspan="3">提供的服务（供接口）</th>
    </tr>
    <tr>
        <th rowspan="3">PayData.add (payPO pay)</th>
        <th>语法</th>
        <th>public ResultMessage add (PayPO Pay);</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>增加一个付款单信息，已知新增的付款单信息</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>新增付款单信息并返回保存结果</th>
        </tr>        
</table>


##4.1.2 Collectbl模块
&nbsp;&nbsp;&nbsp;&nbsp;(1)模块概述
Collectbl模块承担的需求参见需求规格说明文档功能需求及相关功能需求。
<br>
&nbsp;&nbsp;&nbsp;&nbsp;orderbl模块的职责及接口参见软件体系结构描述文档。
<br>&nbsp;&nbsp;&nbsp;&nbsp;(2)整体结构<br>
&nbsp;&nbsp;&nbsp;&nbsp;根据体系结构的设计，采用分层风格，将系统分为展示层，业务逻辑层，数据层。每一层之间为了灵活性，添加了接口，以实现针对接口编程，隔离数据传输的职责，降低层与层之间耦合，添加的接口包括Collectdataservice 。为了隔离业务逻辑职责和逻辑控制职责，我们添加CollectController，这样CollectController 将会将订单相关的业务逻辑职责和逻辑控制委托给Collectbl对象。CollectPO是做为管理信息的持久化对象被添加到设计模型中的。<br>
 &nbsp;&nbsp;&nbsp;&nbsp; Collectbl的模块设计见图4.1.1-1。
 <br>

 <table>
 	<tr>
 		<th>类</th>
 		<th>职责</th>
 	</tr>
 	<tr>
 		<th>CollectData</th>
		<th>商品分类的领域模型对象，拥有商品分类信息，可以帮助完成与商品分类操作有关的活动，包括对商品分类的增加，商品分类的修改，商品分类的删除。</th>
</table>


表5.3.2-9 CollectData模块的接口规范
<table>
    <tr>
        <th colspan="3">提供的服务（供接口）</th>
    </tr>
    <tr>
        <th rowspan="3">CollectData.add (collectPO collect)</th>
        <th>语法</th>
        <th>public ResultMessage add (CollectPO collect);</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>增加一个收款单信息，已知新增的收款单信息</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>新增收款单信息并返回保存结果</th>
        </tr>   
</table>




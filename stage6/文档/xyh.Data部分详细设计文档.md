### 1.manageData模块
#####  （1）模块概述
manageData模块承担的需求参见需求规格说明文档及相关功能需求。

manageData模块的职责及接口参见软件体系结构描述文档。
#####   （2）整体结构
根据体系结构的设计，采用分层风格，将系统分为展示层，业务逻辑层，数据层。每一层之间为了灵活性，添加了接口，以实现针对接口编程，隔离数据传输的职责，降低层与层之间耦合，添加了managedataservice接口。为了隔离业务逻辑职责和逻辑控制职责ManagePO是作为管理信息的持久化对象被添加到设计模型中的。

manageData模块的设计如图 所示.
#        ** 缺图**

类| 职责
---|---
manageData | 经营管理数据层的对象模型，拥有对数据层中不同的经营信息进行访问、修改和储存的方法

#####   （3）模块内部类的接口规范
manageData模块的接口规范
<table>
    <tr>
        <th colspan="3">提供的服务（供接口）</th>
    </tr>
    <tr>
        <th rowspan="3">manageData.addSaleDetail</th>
        <th>语法</th>
        <th>public ArrayList&lt;DetailPO> addSaleDetail(ArrayList&lt;SaleDetailRequirementPO> saleDetailRequirementList);</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>总经理或财务人员添加相应的筛选条件</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>在数据库中找到符合条件的销售明细，返回相应的销售明细</th>
        </tr>   
        <tr>
        <th rowspan="3">manageData.addSaleProcess</th>
        <th>语法</th>
        <th>public ArrayList&lt;ProcessPO> addSaleProcess(ArrayList&lt;SaleProcessRequirementPO> saleProcessRequirementList);</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>总经理或财务人员添加相应的筛选条件</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>在数据库找到符合条件的经营历程，返回相应的经营历程</th>
</tr>   

<tr>
        <th rowspan="3">manageData.operation</th>
        <th>语法</th>
        <th>public ReceiptPO operation(boolean x);</th>
        </tr><tr>
            <th>前置条件</th>
            <th>财务人员进行红冲或红冲并复制操作</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>若进行红冲或红冲并复制操作，则系统自动生成红冲单子存入数据库当中</th>
</tr>   
<tr>
        <th rowspan="3">manageData.confirmation</th>
        <th>语法</th>
        <th>public ReceiptPO confirmation(boolean x);</th>
        </tr><tr>
            <th>前置条件</th>
            <th>财务人员确认红冲</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>若确认红冲，系统修改单据并存入数据库当中</th>
</tr>   
<tr>
        <th rowspan="3">manageData.writeIn</th>
        <th>语法</th>
        <th>public boolean writeIn(ReceiptPO receipt);</th>
        </tr><tr>
            <th>前置条件</th>
            <th>财务人员填写红冲并复制单子</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>系统在数据库中修改单据记录，返回是否修改成功</th>
</tr>   
<tr>
        <th rowspan="3">manageData.getSaleProblem</th>
        <th>语法</th>
        <th>public ArrayList&lt;SaleProblemPO> getSaleProblem(boolean x);</th>
        </tr><tr>
            <th>前置条件</th>
            <th>财务人员选择查看经营情况</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>在数据库中找到符合条件的经营情况，并返回相应的经营情况表</th>
</tr>   

</table>

### 2.promotionData模块
#####  （1）模块概述
promotionData模块承担的需求参见需求规格说明文档及相关功能需求。

promotionData模块的职责及接口参见软件体系结构描述文档。
#####   （2）整体结构
根据体系结构的设计，采用分层风格，将系统分为展示层，业务逻辑层，数据层。每一层之间为了灵活性，添加了接口，以实现针对接口编程，隔离数据传输的职责，降低层与层之间耦合，添加了promotiondataservice接口。为了隔离业务逻辑职责和逻辑控制职责PromotionPO是作为管理信息的持久化对象被添加到设计模型中的。

promotionData模块的设计如图 所示.
#        ** 缺图**

类| 职责
---|---
promotionData | 促销管理数据层的对象模型，拥有对数据层中不同的经营信息进行访问、修改和储存的方法

#####   （3）模块内部类的接口规范
promotionData模块的接口规范
<table>
    <tr>
        <th colspan="3">提供的服务（供接口）</th>
    </tr>
    <tr>
        <th rowspan="3">promotionData.getGoodsInformation</th>
        <th>语法</th>
        <th>public GoodsPO getGoodsInformation(GoodsPO goods);</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>总经理输入商品标识</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>从数据库中获取相应商品信息并显示</th>
        </tr>   
        <tr>
        <th rowspan="3">promotionData.getPromotionGoods</th>
        <th>语法</th>
        <th>public ArrayList&lt;GoodsPO> getPromotionGoods(ArrayList&lt;PromotionPO> promotionList);</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>总经理输入促销信息</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>从数据库中获取相应的促销商品列表并显示</th>
</tr>   

<tr>
        <th rowspan="3">promotionData.deleteInformation</th>
        <th>语法</th>
        <th>public boolean deleteInformation(String brand);</th>
        </tr><tr>
            <th>前置条件</th>
            <th>总经理输入商品标识</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>在数据库中删除对应商品标识所拥有的促销信息，返回是否删除成功</th>
</tr>   

<tr>
        <th rowspan="3">promotionData.endInput</th>
        <th>语法</th>
        <th>public boolean endInput(PromotionPO promotion);</th>
        </tr><tr>
            <th>前置条件</th>
            <th>总经理结束输入</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>系统记录销售策略，返回是否记录成功</th>
</tr>   

</table>

### 3.checkData模块
#####  （1）模块概述
checkData模块承担的需求参见需求规格说明文档及相关功能需求。

checkData模块的职责及接口参见软件体系结构描述文档。
#####   （2）整体结构
根据体系结构的设计，采用分层风格，将系统分为展示层，业务逻辑层，数据层。每一层之间为了灵活性，添加了接口，以实现针对接口编程，隔离数据传输的职责，降低层与层之间耦合，添加了checkdataservice接口。为了隔离业务逻辑职责和逻辑控制职责CheckPO是作为管理信息的持久化对象被添加到设计模型中的。

checkData模块的设计如图 所示.
#        ** 缺图**

类| 职责
---|---
checkData | 审阅数据层的对象模型，拥有对数据层中不同的经营信息进行访问、修改和储存的方法

#####   （3）模块内部类的接口规范
checkData模块的接口规范
<table>
    <tr>
        <th colspan="3">提供的服务（供接口）</th>
    </tr>
    <tr>
        <th rowspan="3">checkData.submit</th>
        <th>语法</th>
        <th>public boolean submit(ReceiptPO receipt);</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>单据提交者提交单据到数据库中</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>返回提交是否成功</th>
        </tr>   
        <tr>
        <th rowspan="3">checkData.send</th>
        <th>语法</th>
        <th>public boolean send(ReceiptPO receipt);</th>
        </tr>
        <tr>
            <th>前置条件</th>
            <th>从数据库中将相应单据发送给总经理</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>返回是否发送成功</th>
</tr>   

<tr>
        <th rowspan="3">checkData.revise</th>
        <th>语法</th>
        <th>public boolean revise(Receipt receipt);</th>
        </tr><tr>
            <th>前置条件</th>
            <th>修改相应的单据存入数据库中</th>
        </tr>
        <tr>
            <th>后置条件</th>
            <th>返回是否修改储存成功</th>
</tr>   



</table>
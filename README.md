## 项目介绍
此系统基于SpringBoot框架设计并实现一个仓储平台。平台以Jdk8作为开发环境，后端采用SpringBoot、Shiro安全框架、MyBatisPlus等技术，前端利用HTML/CSS/JS结合Layui以及Thymeleaf模板引擎进行开发，数据管理则采取关系型数据库MySQL。系统基于RBAC角色权限管理添加了超级管理员和仓库管理员两种角色，开发功能包含用户登录、客户管理、供应商管理、食品管理、食品出库、食品入库、出入库统计可视化、用户管理、角色管理、权限管理等模块。

下面以超级管理员和普通管理员两种身份展开（可以自定义角色赋予权限）：

(1)超级管理员对功能的需求 

①登录模块： 登录是一个系统的唯一入口，用户想操作系统的功能的前提条件就是完成登录操作，填写正确的用户名和密码即可进入系统内部。

②管理员信息管理模块： 管理员的操作权限较低，超级管理员是系统中权限最高的，因此管理员的信息由超级管理员进行管理，包括了对管理员信息的增删改查功能。

③食品信息管理模块： 系统中需要记录仓库中的食品信息，食品信息的创建、删除、修改都由超级管理员负责管理。

④食品出库管理模块： 食品出库是此系统中的主要功能，当有客户有食品需求时，超级管理员需要在出库模块中添加出库信息，包括客户、食品名称、数量、价格、出库时间等信息。添加有误可以修改信息，也可删除。

⑤食品入库管理模块：当仓库中食品数量不足，需要补充食品时，需要用到食品入库功能模块，此模块添加的食品入库信息需包括供销商、食品名称、数量、价格、入库等信息。添加有误可以修改信息，也可删除。

⑥供销商信息管理模块：仓库食品来源于供销商，所以系统需要一个模块来记录与公司合作的供销商信息，同样也是对供销商信息的增删改查操作。

⑦客户信息管理模块：仓库食品的出库需要指定客户，所以系统需要一个模块来记录与公司合作的客户信息，同样也是对客户信息的增删改查操作。

⑧出入库统计图模块：当管理员需要了解近期的出入库情况时，查看出入库列表信息不是很直观，这时候将出入库情况通过可视化图形可以直观的、优雅的展示出来。

⑨食品数据导出模块：食品数据量会随着时间越来越多，此时提供数据导出功能，方便公司对数据做报表和统计分析等操作。

⑩公告管理模块：公司人数较多，当超级管理员有重要事件需要告知到各个管理员时，采用公告的形式通知较为方便，所以该模块需要实现公告的增删改查。

(2)管理员对功能的需求

①用户登录模块：登录时可以通过用户名和密码进行身份验证。由于本系统用户都为公司内部人员，所以不提供注册，由超级管理员统一添加公司人员信息。

②食品信息模块：管理员负责对食品的出入库操作，所以也可了解仓库中的食品信息，但不可使用增删改功能。

③食品出库、入库管理模块：超级管理员更多是检查出出入库信息以及操作重要的出入库信息，而管理员的主要任务就是通过出入库操作来完成每天的食品管理。

## 技术介绍

- SpringBoot
- Mybatis-Plus（MP）
- Shiro
- Thymeleaf、Layui（前端框架）


## 案例展示

登录展示：

![登录展示](https://raw.githubusercontent.com/ShiDuoBeiLi/warehouse/master/warehouseImg/login.png)

首页展示：

![首页展示](https://raw.githubusercontent.com/ShiDuoBeiLi/warehouse/master/warehouseImg/index.png)

客户信息：

![客户信息](https://raw.githubusercontent.com/ShiDuoBeiLi/warehouse/master/warehouseImg/comsumer.png)

用户管理：

![用户管理](https://raw.githubusercontent.com/ShiDuoBeiLi/warehouse/master/warehouseImg/user.png)

进货页面：

![进货页面](https://raw.githubusercontent.com/ShiDuoBeiLi/warehouse/master/warehouseImg/inport.png)

可视化：

![可视化](https://raw.githubusercontent.com/ShiDuoBeiLi/warehouse/master/warehouseImg/ksh.png)

用户中心：
![用户中心](https://raw.githubusercontent.com/ShiDuoBeiLi/warehouse/master/warehouseImg/center.png)

论文目录：
![论文目录](https://raw.githubusercontent.com/ShiDuoBeiLi/warehouse/master/warehouseImg/lwml.png)

## 一些说明

- 系统和论文都可便宜出售（v:zhou135431）

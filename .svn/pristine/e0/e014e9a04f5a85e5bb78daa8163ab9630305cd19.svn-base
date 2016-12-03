DROP DATABASE IF EXISTS mldn ;
-- 二、创建数据库
CREATE DATABASE mldn CHARACTER SET UTF8 ;
-- 三、使用数据库
USE mldn ;
-- 四、创建数据表

-- 1、银行代码表
CREATE TABLE BankCoTal (
  ID                     varchar(32)     NOT NULL ,
  bankName               varchar(50)     NOT NULL COMMENT '银行名称',
  bankCode               varchar(10)     NOT NULL COMMENT '银行代码',
  remark                 varchar(100)    NOT NULL COMMENT '备注',
  createdatetime         datetime        NOT NULL COMMENT '创建时间',
  updatetime             datetime        NOT NULL COMMENT '更新时间',
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='银行代码表' ;

-- 2、支付渠道
create table PaymentChannel (
  ID                varchar(50),   -- 支付渠道ID
  channelName          varchar(50),  -- 支付渠道名称
  channelCode         varchar(50),  -- 渠道代码
  channelDescription   varchar(50), -- 渠道描述
  createdatetime      datetime, -- 创建时间
  updatetime          datetime, -- 更新时间
  paymentMode          varchar(50), -- 支付方式
  channelState          varchar(50), -- 渠道状态，标准数据12012
  channelIndex          varchar(50), -- 渠道参数，JSON格式数据
  constraint pk_ID primary key(ID) -- 主键
) engine = innodb ;-- 允许事务控制; 

-- 3、管理渠道映射表
CREATE TABLE BankChannelMapping (
  ID			  varchar(32)    NOT NULL COMMENT '主键',
  bankCodeID              varchar(32)    NOT NULL COMMENT '银行代码ID',
  paymentChannel	  varchar(10)    COMMENT '支付渠道',
  channelBankCode         varchar(50)    COMMENT '渠道银行代码',
  remark                  varchar(100)   NOT NULL COMMENT '备注',
  createdatetime          datetime       NOT NULL COMMENT '创建时间',
  updatetime		  datetime       NOT NULL COMMENT '更新时间',
  bankMapping             varchar(10)    COMMENT '属于银行代码',
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理渠道映射表' ;

-- 4、合作商户
CREATE TABLE CooperatingCustomer(
  ID           	          varchar(32)    COMMENT '主键',
  companyName             varchar(32)    COMMENT '公司名称',
  customerType            varchar(50)    COMMENT '商户类型',
  customerNum             varchar(16)    COMMENT '商户编号',
  customerKey             varchar(32)    COMMENT '商户私钥',
  customerAccount         varchar(32)    COMMENT '商户账号,银行',
  customerAccountID       varchar(16)    COMMENT '商户账号ID',
  paymentSynchronousURl   varchar(50)    COMMENT '支付同步通知URL',
  paymentAsynchronousURL  varchar(50)    COMMENT '支付异步URL',
  refundSynchronousURL    varchar(50)    COMMENT '退款同步通知URL',
  refundAsynchronousURL   varchar(50)    COMMENT '退款异步通知URL',
  createdatetime          date           COMMENT '创建时间',
  updatetime              date           COMMENT '更新时间',
  notifyMail              varchar(50)    COMMENT '通知邮箱',
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='合作商户表' ;


-- 5、商户支付渠道
CREATE TABLE CustomerPaymentChannel(
  ID                      VARCHAR(32)    NOT NULL COMMENT '主键',
  platFormCuID            VARCHAR(32)    COMMENT '平台商户ID',
  cutomeridNum            VARCHAR(16)    COMMENT '商户身份编码',
  paymentChannelid        VARCHAR(32)    COMMENT '支付渠道ID',
  paymentChannelCode      VARCHAR(32)    COMMENT '支付渠道代码',
  paymentMode            VARCHAR(50)    COMMENT '支付方式',
  ratio                   int         COMMENT '权重,30表示30%' ,
  createdatetime          DATE           COMMENT '创建时间',
  updatetime              DATE           COMMENT '更新时间',
  PRIMARY KEY(ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商户支付渠道表' ;

-- 6、支付渠道详细
CREATE TABLE PaymentChannelDetail(
  ID                      VARCHAR(32)    NOT NULL COMMENT '主键',                        
  cutomerID               VARCHAR(32)    COMMENT '商户ID',                        
  customerNum             VARCHAR(32)    COMMENT '商户编号',                        
  tallydate               date           COMMENT '记账日期',                        
  paymentChannelID        VARCHAR(32)    COMMENT '支付渠道ID',                        
  paymentChannel          VARCHAR(32)    COMMENT '支付渠道',                        
  paymentSuccessAmount    int            COMMENT '支付成功笔数',                        
  paymentPrice            int            COMMENT '支付金额',                        
  refundSuccessAmount     int            COMMENT '退款成功笔数',                        
  refundPrice             int            COMMENT '退款金额',                        
  calculatetime           date           COMMENT '统计时间',                        
  paymentTotalAmount      int            COMMENT '支付总笔数',                        
  refundTotalAmount       int            COMMENT '退款总笔数',                        
  PRIMARY KEY(ID)                        
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商户支付渠道表';

-- 7、支付账号表
create table PaymentAccount (
   ID               varchar(50), -- 支付账号ID
   account          varchar(50), -- 账号
   accountType         varchar(50), -- 账号类型
   name            varchar(50), -- 姓名
   cellphone         varchar(50), -- 手机号
   mail            varchar(50), -- 邮箱
   loginPassword       varchar(50), -- 登录密码
   paymentPassword      varchar(50), -- 支付密码
   IDNum            varchar(50), -- 身份证号
   accountState         varchar(50), -- 账号状态（标准数据12007）
   createdatetime      datetime, -- 创建时间
   updatetime         datetime, -- 更新时间
   constraint pk_ID primary key(ID)
) engine = innodb ;


-- 8、订单信息
CREATE TABLE OrderInfo (
  ID                      VARCHAR(32)    NOT NULL COMMENT '主键',
  paymentPFOrderNum       VARCHAR(20)    COMMENT '支付平台订单号',
  customerOrderNum        VARCHAR(32)    COMMENT '商户订单号',
  platFormCuNum           VARCHAR(20)    COMMENT '平台商户编号',
  entrCuNum               VARCHAR(20)    COMMENT '企业商户编号',
  orderPrice              int            COMMENT '订单金额',
  orderScore              int            COMMENT '订单积分',
  serviceType             VARCHAR(10)    COMMENT '业务类型',
  APIVersion              VARCHAR(10)    COMMENT '接口版本号',
  privateAccount          VARCHAR(50)    COMMENT '买家个人账号',
  productName             VARCHAR(100)   COMMENT '商品名称',
  productPrice            int            COMMENT '商品单价',
  productQuantity         int            COMMENT '商品数量',
  productNote             VARCHAR(1000)  COMMENT '商品描述',
  productShowURL          VARCHAR(400)   COMMENT '商品展示URL',
  createdatetime          datetime       COMMENT '创建时间',
  updatetime              datetime       COMMENT '更新时间',
  remark                  VARCHAR(500)   COMMENT '备注',
  expireTime              int            COMMENT '交易超时时间',
  paymentBatch            VARCHAR(32)    COMMENT '支付批次',
  PRIMARY KEY(ID)   
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单信息';


-- 9、支付信息
create table PaymentInfo(
   ID               varchar(50),  -- 支付信息ID
   paymentPFOrderNum   varchar(50), -- 支付平台订单号(关联ordersinfo表poid字段)
   customerOrderNum   varchar(50), -- 商户订单号
   paymentPrice      varchar(50), -- 支付金额
   paymentState      decimal(50), -- 支付状态0,未支付  1,已支付
   paymentTimes      int(50), -- 支付次数
   paymentScore      decimal(50), -- 支付积分
   onboardTime         datetime, -- 入库时间
   updatetime         datetime, -- 更新时间
   constraint pk_ID primary key(ID)
) engine = innodb ;

-- 10、支付交易流水号
create table PaymentSN (
   paymentTransactionNum varchar(50), -- 支付交易流水号
   paymentPFOrderNum   varchar(50) not null, -- 支付平台订单号,外键 订单单咨询单(关联ordersinfo表poid字段)
   customerOrderNum   varchar(50), -- 商户订单号
   signature         varchar(50) not null, -- 签名方式
   signatureData      varchar(50) not null, -- 签名数据（避免数据被修改）
   paymentChannel      varchar(50), -- 支付渠道（关联支付渠道表）
   paymentMode         varchar(50), -- 支付方式
   paymentPrice      decimal(50), -- 支付金额
   submitTime         datetime, -- 提交时间(系统也可创建)
   fee               decimal(50) not null, -- 手续费
   paymentServer      varchar(50), -- 支付服务商
   paymentType         varchar(50), -- 支付类型（在线支付的子类型）
   buyerAccount      varchar(50), -- 买家支付账号
   thirdpartyTransactionNum   varchar(50) not null, -- 第三方交易流水号
   transactionState   varchar(50), -- 交易状态(等待付款、交易成功、交易失败,交易关闭,时间超时关闭,全额退款关闭)
   onboardTime         datetime, -- 入库时间
   paymentTime         datetime, -- 付款时间
   endTime            datetime, -- 结束时间
   customerAttr      varchar(50), -- 商户扩展属性
   IVRnum            varchar(50), -- IVR号码
   remark            varchar(50), -- 备注
   asynchronousURL      varchar(50), -- 异步通知URL
   synchronousURL       varchar(50), -- 同步通知URL
   paymentMinus      decimal(50), -- 支付金额减去退款金额，手续费
   platformCustomerID   varchar(50), -- 平台商户号
   customerPaymentChannelID   varchar(50), -- 商户支付渠道ID（关联支付渠道表）
   cellphone         varchar(50), -- 手机号码
   username         varchar(50), -- 用户姓名
   transactionExpireTime   datetime, -- 交易超时时间
   transactionSource      varchar(50), -- 交易来源
   constraint pk_paymentTransactionNum primary key(paymentTransactionNum)
) engine = innodb ;



-- 11、退款信息表
CREATE TABLE refundInfo(
   refundNum   VARCHAR(30), -- 退款申请号
   paymentPFOrderNum   VARCHAR(30), -- 支付平台订单号
   customerOrderNum   VARCHAR(50), -- 商户订单号(关联订单信息表poid字段)
   refundPrice   INT, -- 退款金额
   refundTimes   INT, -- 退款次数
   refundFee   INT, -- 退款手续费
   refundState   VARCHAR(10), -- 退款状态
   createdatetime   DATETIME, -- 创建时间
   updatetime   DATETIME, -- 更新时间
   PRIMARY KEY (refundNum)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='退款信息表' ;

-- 12、退款交易流水
CREATE   TABLE refundTransaction(
   refundtransactionNum   VARCHAR(40) not null, -- 退款流水号
   transactionSource   VARCHAR(32) not null, -- 交易来源
   paymentPlatFormOrder   VARCHAR(32) not null, -- 支付平台订单(关联订单信息表poid字段)
   customerOrderNum   VARCHAR(32) not null, -- 商户订单号
   paymentTransactionNum   VARCHAR(32) , -- 支付交易流水号（关联支付交易流水号表）
   refundBatchID   VARCHAR(40), -- 退款批次号
   singnaturetype   VARCHAR(10), -- 签名方式DSA、RSA、MD5
   singnatureData   VARCHAR(200), -- 签名数据（避免数据被修改）
   refundChannel   VARCHAR(10), -- 退款渠道
   refundPrice   INT, -- 退款金额
   refundState   VARCHAR(10), -- 退款状态
   fee      INT, -- 手续费
   onboardTime   DATETIME, -- 入库时间
   refundTime   DATETIME, -- 退款时间
   refundCuz   VARCHAR(100), -- 退款原因
   remark      VARCHAR(500), -- 备注
   customerAttr   VARCHAR(500), -- 商户扩展属性
   thirdpartyTransactionSN   VARCHAR(50), -- 第三方退款流水号
   asynchronousURL   VARCHAR(200), -- 异步通知URL
   synchronousURL   VARCHAR(200), -- 同步通知URL
   platformCustomerID   VARCHAR(20) -- 平台商户号
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='退款交易流水表';


-- 13、交易日志
CREATE TABLE transactionLog(
   ID         VARCHAR(50), -- 交易日志ID
   transactionSN      VARCHAR(50), -- 交易流水号（关联支付交易流水号表）
   paymentPFOrderNum   VARCHAR(100), -- 支付平台订单号(关联订单信息表poid字段)
   customerOrderNum      VARCHAR(10),-- 商户订单号
   transactionType      VARCHAR(10),-- 交易类型
   paymentChannel      VARCHAR(100), -- 支付渠道（关联支付渠道表）
   paymentMode      VARCHAR(50),-- 支付方式（关联支付渠道表）
   remark         VARCHAR(500),-- 备注
   expandInfo      VARCHAR(500), -- 扩展信息
   actionTime      DATETIME, -- 操作时间
   platformCunstomerID   VARCHAR(100),-- 平台商户号
   PRIMARY KEY (ID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交易日志表';

-- 14、回调异常
CREATE TABLE ReplyException (
   ID			 varchar(50)   NOT NULL,
   paymentPFOrderNum     varchar(50)   COMMENT '支付平台订单号',
   platFormCuNum         varchar(50)   COMMENT '平台商户编号',
   customerOrderNum      varchar(50)   COMMENT '商户订单号',
   transactionSN         varchar(50)   COMMENT '交易流水号',
   paymentChannel	 varchar(50)   COMMENT '支付渠道',
   replyType		 varchar(50)   COMMENT '回调类型',
   replyURL		 varchar(50)   COMMENT '回调URL',
   replyIndex            varchar(50)   COMMENT '回调参数',
   replyResult           varchar(50)   COMMENT '回调结果',
   replyTims             int           COMMENT '回调次数',
   remark                varchar(50)   COMMENT '备注',
   nextReplyTime         datetime      COMMENT '下次回调时间',
   createdatetime        datetime      COMMENT '创建时间', 
   verifyID              varchar(50)   COMMENT '通知校验ID',
   PRIMARY KEY (ID) 
) ENGINE=InnoDB COLLATE=utf8_bin COMMENT='回调异常' ;


-- 15、回调日志
CREATE TABLE  ReplyLog (
  ID			varchar(32),	
  paymentPFOrderNum     varchar(32)        NOT NULL COMMENT '支付平台订单号',
  PlatFormCuID          varchar(500)       NOT NULL COMMENT '平台商户ID',
  customerOrderNum      varchar(32)        NOT NULL COMMENT '商户订单号',
  transactionSN         varchar(500)       NOT NULL COMMENT '交易流水号',
  paymentChannel        varchar(500)       COMMENT '支付渠道',
  replyType	        varchar(10)        COMMENT '回调类型',
  replyURL              varchar(200)       COMMENT '回调URL',
  replyIndex            varchar(10)        COMMENT '回调参数',
  replyResult           varchar(10)        COMMENT '回调结果',
  remark                varchar(1000)      COMMENT '备注',
  replyTime             datetime           COMMENT '回调时间',
  verifyID              varchar(40)        COMMENT '通知校验ID',
  nofityType            varchar(10)        COMMENT '通知类型',
  verifyResult          varchar(10)        COMMENT '校验结果',
  verifyVersion		varchar(10)        COMMENT '验证版本号',
  serviceReplyIP	varchar(10)        COMMENT '服务回调IP',
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='回调日志';

-- 16、账号
CREATE TABLE sys_account (
  sys_account_id          bigint(20)     NOT NULL AUTO_INCREMENT COMMENT '主键',
  phone                   varchar(12)    NOT NULL COMMENT '手机，作为登陆账号',
  login_password          varchar(32)    NOT NULL COMMENT '密码',
  name                    varchar(50)    NOT NULL COMMENT '姓名',
  sex                     tinyint(4)     COMMENT '性别,1:男,0女',
  account_type            tinyint(4)     NOT NULL COMMENT '1：超级管理员，2：管理员',
  create_time             datetime       NOT NULL COMMENT '创建时间',
  update_time             datetime       NOT NULL COMMENT '修改时间',
  state                   tinyint(4)     NOT NULL DEFAULT '3' COMMENT '删除标记，0删除,1正常,2禁用,3审核中',
  PRIMARY KEY (sys_account_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员表' ;

-- 17、角色数据表
CREATE TABLE role (
	rid					INT 	AUTO_INCREMENT ,
	title				VARCHAR(50),
	flag				VARCHAR(50),
	CONSTRAINT pk_rid PRIMARY KEY (rid)
) ENGINE = innodb;

-- 18、用户-角色关系表
CREATE TABLE account_role (
	sys_account_id		bigint(20),
	rid 				INT 
) ENGINE = innodb;

-- 19、权限表
CREATE TABLE action (
	actid 				INT 	AUTO_INCREMENT ,
	title 				VARCHAR(50),
	flag 				VARCHAR(50),
	CONSTRAINT pk_actid PRIMARY KEY (actid) 
) ENGINE = innodb;

-- 20、角色-权限关系表
CREATE TABLE role_action (
	rid 				INT,
	actid 				INT
) ENGINE = innodb;

-- 五、测试数据

-- 9、增加支付渠道信息
insert into PaymentChannel (ID,channelName,channelCode,channelDescription,createdatetime,updatetime,paymentMode,channelState,channelIndex)
values('PaymentChannel2016111403','渠道名称1','渠道代号1','渠道描述1','2016-11-14','2016-11-14','手机支付','渠道状态1','渠道参数1') ;
insert into PaymentChannel (ID,channelName,channelCode,channelDescription,createdatetime,updatetime,paymentMode,channelState,channelIndex)
values('PaymentChannel2016111402','渠道名称2','渠道代号2','渠道描述2','2016-11-14','2016-11-14','在线支付','渠道状态2','渠道参数2') ;
insert into PaymentChannel (ID,channelName,channelCode,channelDescription,createdatetime,updatetime,paymentMode,channelState,channelIndex)
values('PaymentChannel2016111404','渠道名称1','渠道代号1','渠道描述1','2016-11-14','2016-11-14','手机支付','渠道状态1','渠道参数1') ;
insert into PaymentChannel (ID,channelName,channelCode,channelDescription,createdatetime,updatetime,paymentMode,channelState,channelIndex)
values('PaymentChannel2016111405','渠道名称2','渠道代号2','渠道描述2','2016-11-14','2016-11-14','在线支付','渠道状态2','渠道参数2') ;

-- 10、增加支付信息
insert into PaymentInfo(ID,paymentPFOrderNum,customerOrderNum,paymentState,paymentPrice,paymentTimes,paymentScore,onboardTime,updatetime)
values('PaymentInfo2016111401','paymentPF20161114194901','customer20161114192901','支付成功','100.00','1','1','2016-11-14','2016-11-14') ;
insert into PaymentInfo(ID,paymentPFOrderNum,customerOrderNum,paymentState,paymentPrice,paymentTimes,paymentScore,onboardTime,updatetime)
values('PaymentInfo2016111402','paymentPF20161114194902','customer20161114192902','支付失败','100.00','1','1','2016-11-14','2016-11-14') ;
insert into PaymentInfo(ID,paymentPFOrderNum,customerOrderNum,paymentState,paymentPrice,paymentTimes,paymentScore,onboardTime,updatetime)
values('PaymentInfo2016111403','paymentPF20161114194903','customer20161114192903','支付成功','100.00','1','1','2016-11-14','2016-11-14') ;
insert into PaymentInfo(ID,paymentPFOrderNum,customerOrderNum,paymentState,paymentPrice,paymentTimes,paymentScore,onboardTime,updatetime)
values('PaymentInfo2016111404','paymentPF20161114194904','customer20161114192904','支付失败','100.00','1','1','2016-11-14','2016-11-14') ;


-- 11、增加支付交易流水号
insert into PaymentSN(paymentTransactionNum,paymentPFOrderNum,customerOrderNum,signature,signatureData,paymentChannel,
paymentMode,paymentPrice,submitTime,fee,paymentServer,paymentType,buyerAccount,thirdpartyTransactionNum,transactionState,
onboardTime,paymentTime	,endTime,customerAttr,IVRnum,remark,asynchronousURL,synchronousURL,paymentMinus,
platformCustomerID,customerPaymentChannelID,cellphone,username,transactionExpireTime,transactionSource)
values('paymentTransactionNum001','paymentPFOrderNum001','customer20161114192901','DSA','DSAInfo','','在线支付','11.00','2016-11-14',
'1.00','服务商01','支付宝','buyerAccount001','thirdpartyTransactionNum001','','2016-11-14','2016-11-14','2016-11-14','','','','','','1.00','','','','','2016-11-14','');
insert into PaymentSN(paymentTransactionNum,paymentPFOrderNum,customerOrderNum,signature,signatureData,paymentChannel,
paymentMode,paymentPrice,submitTime,fee,paymentServer,paymentType,buyerAccount,thirdpartyTransactionNum,transactionState,
onboardTime,paymentTime	,endTime,customerAttr,IVRnum,remark,asynchronousURL,synchronousURL,paymentMinus,
platformCustomerID,customerPaymentChannelID,cellphone,username,transactionExpireTime,transactionSource)
values('paymentTransactionNum002','paymentPFOrderNum002','customer20161114192902','RSA','RSAInfo','','在线支付','11.00','2016-11-14',
'1.00','服务商02','支付宝','buyerAccount002','thirdpartyTransactionNum002','','2016-11-14','2016-11-14','2016-11-14','','','','','','1.00','','','','','2016-11-14','');
insert into PaymentSN(paymentTransactionNum,paymentPFOrderNum,customerOrderNum,signature,signatureData,paymentChannel,
paymentMode,paymentPrice,submitTime,fee,paymentServer,paymentType,buyerAccount,thirdpartyTransactionNum,transactionState,
onboardTime,paymentTime	,endTime,customerAttr,IVRnum,remark,asynchronousURL,synchronousURL,paymentMinus,
platformCustomerID,customerPaymentChannelID,cellphone,username,transactionExpireTime,transactionSource)
values('paymentTransactionNum003','paymentPFOrderNum003','customer20161114192903','MD5','MD5Info','','在线支付','11.00','2016-11-14',
'1.00','服务商01','支付宝','buyerAccount003','thirdpartyTransactionNum003','','2016-11-14','2016-11-14','2016-11-14','','','','','','1.00','','','','','2016-11-14','');
insert into PaymentSN(paymentTransactionNum,paymentPFOrderNum,customerOrderNum,signature,signatureData,paymentChannel,
paymentMode,paymentPrice,submitTime,fee,paymentServer,paymentType,buyerAccount,thirdpartyTransactionNum,transactionState,
onboardTime,paymentTime	,endTime,customerAttr,IVRnum,remark,asynchronousURL,synchronousURL,paymentMinus,
platformCustomerID,customerPaymentChannelID,cellphone,username,transactionExpireTime,transactionSource)
values('paymentTransactionNum004','paymentPFOrderNum004','customer20161114192904','DSA','DSAInfo','','在线支付','11.00','2016-11-14',
'1.00','服务商04','支付宝','buyerAccount004','thirdpartyTransactionNum004','','2016-11-14','2016-11-14','2016-11-14','','','','','','1.00','','','','','2016-11-14','');

-- 12、增加支付账号表
insert into PaymentAccount(ID,account,accountType,name,cellphone,mail,loginPassword,paymentPassword,IDNum,accountState,createdatetime,updatetime)
values('PaymentAccountID001','account001','accountType001','张三','18310912094','zhangsan@gmail.com','zhangsan','zhangsanpassword','370827199500001111','状态1','1995-11-11','2016-11-15') ;
insert into PaymentAccount(ID,account,accountType,name,cellphone,mail,loginPassword,paymentPassword,IDNum,accountState,createdatetime,updatetime)
values('PaymentAccountID002','account002','accountType002','李四','18310912094','lisi@gmail.com','lisi','lisipassword','370827199500001111','状态1','1995-11-11','2016-11-15') ;
insert into PaymentAccount(ID,account,accountType,name,cellphone,mail,loginPassword,paymentPassword,IDNum,accountState,createdatetime,updatetime)
values('PaymentAccountID003','account003','accountType003','王五','18310912094','wangwu@gmail.com','wangwu','wangwupassword','370827199500001111','状态1','1995-11-11','2016-11-15') ;

insert into PaymentChannelDetail(id,cutomerID,customerNum,tallydate,paymentChannelID,paymentChannel,paymentSuccessAmount,paymentPrice,refundSuccessAmount,refundPrice,calculatetime,paymentTotalAmount,refundTotalAmount)
values ('c_pc_d_UUID','c_UUID','1200','2014-06-26 09:11:11','pc_UUID','团购支付宝',1,1,0,0,'2014-06-26 09:11:11',1,0) ;

insert into OrderInfo(ID,paymentPFOrderNum,customerOrderNum,platFormCuNum,entrCuNum,orderPrice,orderScore,serviceType,APIVersion,privateAccount,productName,productPrice,productQuantity,productNote,productShowURL,createdatetime,updatetime,remark,expireTime,paymentBatch)
values ('oi_UUID','支付平台订单号','商户订单号','c_UUID','c_UUID',1,1,'机票','接口版本号','卖家个人账号','飞机票',1,1,'坐飞机的凭证','mldn.com','2014-06-26 09:11:11','2014-06-26 09:11:11','备注',1000,'支付批次') ;

insert into CooperatingCustomer (ID,companyName,customerType,customerNum,customerKey,customerAccount,customerAccountID,paymentSynchronousUrl,paymentAsynchronousURL,refundSynchronousURL,refundAsynchronousURL,Createdatetime,updatetime,notifyMail)
values('c_UUID','测试','平台商户','1200','123','农行','UUID','4','22','1','1','2014-05-20 09:11:11','2014-06-26 09:11:11','mldn@163.com') ;

insert into CustomerPaymentChannel(ID,platFormCuID,cutomeridNum,paymentChannelid,paymentChannelCode,paymentMode,ratio,createdatetime,updatetime) 
values ('c_pc_UUID','c_UUID','1200','pc_UUID','支付宝','在线支付',20,'2014-05-20 09:11:11','2014-06-26 09:11:11') ;


-- 1、增加用户信息
insert into sys_account (phone,login_password,name,sex,account_type,create_time,update_time,state)
values ('18888888888','hello','admin',1,1,'1997-08-15','1997-08-15',1) ;
insert into sys_account (phone,login_password,name,sex,account_type,create_time,update_time,state)
values ('13888888888','hello','代竭',1,1,'1997-08-15','1997-08-15',1) ;
insert into sys_account (phone,login_password,name,sex,account_type,create_time,update_time,state)
values ('13666666666','hello','hxf',1,1,'1997-08-15','1997-08-15',1) ;

-- 17、增加角色信息
INSERT INTO role(title,flag) VALUES ('系统用户管理','account') ;
INSERT INTO role(title,flag) VALUES ('会员管理','member') ;
-- 18、增加权限信息
INSERT INTO action(title,flag) VALUES ('增加管理员','account:add') ;
INSERT INTO action(title,flag) VALUES ('管理员列表','account:list') ;
INSERT INTO action(title,flag) VALUES ('编辑管理员','account:edit') ;
INSERT INTO action(title,flag) VALUES ('删除管理员','account:remove') ;

INSERT INTO action(title,flag) VALUES ('增加会员','member:add') ;
INSERT INTO action(title,flag) VALUES ('会员列表','member:list') ;
INSERT INTO action(title,flag) VALUES ('编辑会员','member:edit') ;
-- 19、增加角色与权限关系
INSERT INTO role_action(rid,actid) VALUES (1,1) ;
INSERT INTO role_action(rid,actid) VALUES (1,2) ;
INSERT INTO role_action(rid,actid) VALUES (1,3) ;
INSERT INTO role_action(rid,actid) VALUES (1,4) ;
INSERT INTO role_action(rid,actid) VALUES (1,5) ;
INSERT INTO role_action(rid,actid) VALUES (1,6) ;
INSERT INTO role_action(rid,actid) VALUES (1,7) ;

INSERT INTO role_action(rid,actid) VALUES (2,5) ;
INSERT INTO role_action(rid,actid) VALUES (2,6) ;
INSERT INTO role_action(rid,actid) VALUES (2,7) ;

-- 20、管理员与角色权限
INSERT INTO account_role(sys_account_id,rid) VALUES (1,1) ;
INSERT INTO account_role(sys_account_id,rid) VALUES (1,2) ;
INSERT INTO account_role(sys_account_id,rid) VALUES (2,2) ;

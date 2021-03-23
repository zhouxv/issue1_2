# Api Documentation

<a name="overview"></a>

## 概览

Api Documentation

### 版本信息

*版本* : 1.0

### 许可信息

*许可证* : Apache 2.0  
*许可网址* : http://www.apache.org/licenses/LICENSE-2.0  
*服务条款* : urn:tos

### URI scheme

*域名* : localhost:10080  
*基础路径* : /issue1

### 标签

* basic-error-controller : Basic Error Controller
* group-level-controller : Group Level Controller
* index-controller : Index Controller
* sag-level-controller : Sag Level Controller
* service-controller : Service Controller
* service-detail-controller : Service Detail Controller
* test-result-controller : Test Result Controller

<a name="paths"></a>

## 资源

<a name="basic-error-controller_resource"></a>

### Basic-error-controller

Basic Error Controller

<a name="errorhtmlusingpost"></a>

#### errorHtml

```
POST /error
```

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 消耗

* `application/json`

##### 生成

* `text/html`

##### HTTP请求示例

###### 请求 path

```
/error
```

##### HTTP响应示例

###### 响应 200

```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```

<a name="errorhtmlusingget"></a>

#### errorHtml

```
GET /error
```

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 生成

* `text/html`

##### HTTP请求示例

###### 请求 path

```
/error
```

##### HTTP响应示例

###### 响应 200

```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```

<a name="errorhtmlusingput"></a>

#### errorHtml

```
PUT /error
```

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 消耗

* `application/json`

##### 生成

* `text/html`

##### HTTP请求示例

###### 请求 path

```
/error
```

##### HTTP响应示例

###### 响应 200

```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```

<a name="errorhtmlusingdelete"></a>

#### errorHtml

```
DELETE /error
```

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|

##### 生成

* `text/html`

##### HTTP请求示例

###### 请求 path

```
/error
```

##### HTTP响应示例

###### 响应 200

```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```

<a name="errorhtmlusingpatch"></a>

#### errorHtml

```
PATCH /error
```

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|

##### 消耗

* `application/json`

##### 生成

* `text/html`

##### HTTP请求示例

###### 请求 path

```
/error
```

##### HTTP响应示例

###### 响应 200

```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```

<a name="errorhtmlusinghead"></a>

#### errorHtml

```
HEAD /error
```

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|

##### 消耗

* `application/json`

##### 生成

* `text/html`

##### HTTP请求示例

###### 请求 path

```
/error
```

##### HTTP响应示例

###### 响应 200

```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```

<a name="errorhtmlusingoptions"></a>

#### errorHtml

```
OPTIONS /error
```

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|

##### 消耗

* `application/json`

##### 生成

* `text/html`

##### HTTP请求示例

###### 请求 path

```
/error
```

##### HTTP响应示例

###### 响应 200

```
json :
{
  "empty" : true,
  "model" : "object",
  "modelMap" : {
    "string" : "object"
  },
  "reference" : true,
  "status" : "string",
  "view" : {
    "contentType" : "string"
  },
  "viewName" : "string"
}
```

<a name="group-level-controller_resource"></a>

### Group-level-controller

Group Level Controller

<a name="getallgrouplevelsusingget"></a>

#### getAllGroupLevels

```
GET /groupLevel/getAll
```

##### 参数

|类型|名称|类型|
|---|---|---|
|**Query**|**accesscontrol**  <br>*可选*|string|
|**Query**|**backuprecovery**  <br>*可选*|string|
|**Query**|**cryptographicsupport**  <br>*可选*|string|
|**Query**|**dataavailability**  <br>*可选*|string|
|**Query**|**dataconfidentiality**  <br>*可选*|string|
|**Query**|**datadestruction**  <br>*可选*|string|
|**Query**|**dataintegrity**  <br>*可选*|string|
|**Query**|**dataprivacy**  <br>*可选*|string|
|**Query**|**deletestate**  <br>*可选*|integer (int32)|
|**Query**|**electroniccontract**  <br>*可选*|string|
|**Query**|**eventalert**  <br>*可选*|string|
|**Query**|**grouplevelid**  <br>*可选*|integer (int32)|
|**Query**|**identityauthentication**  <br>*可选*|string|
|**Query**|**intrusionprevention**  <br>*可选*|string|
|**Query**|**maliciouscoderesistance**  <br>*可选*|string|
|**Query**|**monitordetect**  <br>*可选*|string|
|**Query**|**organizationalmanagement**  <br>*可选*|string|
|**Query**|**perimetersecurity**  <br>*可选*|string|
|**Query**|**processmanagement**  <br>*可选*|string|
|**Query**|**redundancycleanup**  <br>*可选*|string|
|**Query**|**securitylog**  <br>*可选*|string|
|**Query**|**securitypolicy**  <br>*可选*|string|
|**Query**|**securityvalidation**  <br>*可选*|string|
|**Query**|**serviceagreement**  <br>*可选*|string|
|**Query**|**serviceid**  <br>*可选*|integer (int32)|
|**Query**|**systemmanagement**  <br>*可选*|string|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/groupLevel/getAll
```

###### 请求 query

```
json :
{
  "accesscontrol" : "string",
  "backuprecovery" : "string",
  "cryptographicsupport" : "string",
  "dataavailability" : "string",
  "dataconfidentiality" : "string",
  "datadestruction" : "string",
  "dataintegrity" : "string",
  "dataprivacy" : "string",
  "deletestate" : 0,
  "electroniccontract" : "string",
  "eventalert" : "string",
  "grouplevelid" : 0,
  "identityauthentication" : "string",
  "intrusionprevention" : "string",
  "maliciouscoderesistance" : "string",
  "monitordetect" : "string",
  "organizationalmanagement" : "string",
  "perimetersecurity" : "string",
  "processmanagement" : "string",
  "redundancycleanup" : "string",
  "securitylog" : "string",
  "securitypolicy" : "string",
  "securityvalidation" : "string",
  "serviceagreement" : "string",
  "serviceid" : 0,
  "systemmanagement" : "string"
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="getallgrouplevelsdtousingget"></a>

#### getAllGroupLevelsDto

```
GET /groupLevel/getAllDto
```

##### 参数

|类型|名称|类型|
|---|---|---|
|**Query**|**accesscontrol**  <br>*可选*|string|
|**Query**|**backuprecovery**  <br>*可选*|string|
|**Query**|**cryptographicsupport**  <br>*可选*|string|
|**Query**|**dataavailability**  <br>*可选*|string|
|**Query**|**dataconfidentiality**  <br>*可选*|string|
|**Query**|**datadestruction**  <br>*可选*|string|
|**Query**|**dataintegrity**  <br>*可选*|string|
|**Query**|**dataprivacy**  <br>*可选*|string|
|**Query**|**deletestate**  <br>*可选*|integer (int32)|
|**Query**|**electroniccontract**  <br>*可选*|string|
|**Query**|**eventalert**  <br>*可选*|string|
|**Query**|**grouplevelid**  <br>*可选*|integer (int32)|
|**Query**|**identityauthentication**  <br>*可选*|string|
|**Query**|**intrusionprevention**  <br>*可选*|string|
|**Query**|**maliciouscoderesistance**  <br>*可选*|string|
|**Query**|**monitordetect**  <br>*可选*|string|
|**Query**|**organizationalmanagement**  <br>*可选*|string|
|**Query**|**perimetersecurity**  <br>*可选*|string|
|**Query**|**processmanagement**  <br>*可选*|string|
|**Query**|**redundancycleanup**  <br>*可选*|string|
|**Query**|**securitylog**  <br>*可选*|string|
|**Query**|**securitypolicy**  <br>*可选*|string|
|**Query**|**securityvalidation**  <br>*可选*|string|
|**Query**|**serviceagreement**  <br>*可选*|string|
|**Query**|**serviceid**  <br>*可选*|integer (int32)|
|**Query**|**systemmanagement**  <br>*可选*|string|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/groupLevel/getAllDto
```

###### 请求 query

```
json :
{
  "accesscontrol" : "string",
  "backuprecovery" : "string",
  "cryptographicsupport" : "string",
  "dataavailability" : "string",
  "dataconfidentiality" : "string",
  "datadestruction" : "string",
  "dataintegrity" : "string",
  "dataprivacy" : "string",
  "deletestate" : 0,
  "electroniccontract" : "string",
  "eventalert" : "string",
  "grouplevelid" : 0,
  "identityauthentication" : "string",
  "intrusionprevention" : "string",
  "maliciouscoderesistance" : "string",
  "monitordetect" : "string",
  "organizationalmanagement" : "string",
  "perimetersecurity" : "string",
  "processmanagement" : "string",
  "redundancycleanup" : "string",
  "securitylog" : "string",
  "securitypolicy" : "string",
  "securityvalidation" : "string",
  "serviceagreement" : "string",
  "serviceid" : 0,
  "systemmanagement" : "string"
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="index-controller_resource"></a>

### Index-controller

Index Controller

<a name="getallindexsusingget"></a>

#### getAllIndexs

```
GET /index/getAll
```

##### 参数

|类型|名称|类型|
|---|---|---|
|**Query**|**indexdescription**  <br>*可选*|string|
|**Query**|**indexid**  <br>*可选*|integer (int32)|
|**Query**|**indexname**  <br>*可选*|string|
|**Query**|**securitygroup**  <br>*可选*|string|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/index/getAll
```

###### 请求 query

```
json :
{
  "indexdescription" : "string",
  "indexid" : 0,
  "indexname" : "string",
  "securitygroup" : "string"
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="sag-level-controller_resource"></a>

### Sag-level-controller

Sag Level Controller

<a name="getallsaglevelsusingget"></a>

#### getAllSagLevels

```
GET /sagLevel/getAll
```

##### 参数

|类型|名称|类型|
|---|---|---|
|**Query**|**aresult**  <br>*可选*|string|
|**Query**|**deletestate**  <br>*可选*|integer (int32)|
|**Query**|**gresult**  <br>*可选*|string|
|**Query**|**level**  <br>*可选*|string|
|**Query**|**saglevelid**  <br>*可选*|integer (int32)|
|**Query**|**serviceid**  <br>*可选*|integer (int32)|
|**Query**|**sresult**  <br>*可选*|string|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/sagLevel/getAll
```

###### 请求 query

```
json :
{
  "aresult" : "string",
  "deletestate" : 0,
  "gresult" : "string",
  "level" : "string",
  "saglevelid" : 0,
  "serviceid" : 0,
  "sresult" : "string"
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="getallsaglevelsdtousingget"></a>

#### getAllSagLevelsDto

```
GET /sagLevel/getAllDto
```

##### 参数

|类型|名称|类型|
|---|---|---|
|**Query**|**aresult**  <br>*可选*|string|
|**Query**|**deletestate**  <br>*可选*|integer (int32)|
|**Query**|**gresult**  <br>*可选*|string|
|**Query**|**level**  <br>*可选*|string|
|**Query**|**saglevelid**  <br>*可选*|integer (int32)|
|**Query**|**serviceid**  <br>*可选*|integer (int32)|
|**Query**|**sresult**  <br>*可选*|string|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/sagLevel/getAllDto
```

###### 请求 query

```
json :
{
  "aresult" : "string",
  "deletestate" : 0,
  "gresult" : "string",
  "level" : "string",
  "saglevelid" : 0,
  "serviceid" : 0,
  "sresult" : "string"
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="updatesaglevelbyserviceidusingpost"></a>

#### updateSagLevelByServiceId

```
POST /sagLevel/update
```

##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**sagLevel**  <br>*必填*|sagLevel|[SagLevel](#saglevel)|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 消耗

* `application/json`

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/sagLevel/update
```

###### 请求 body

```
json :
{
  "aresult" : "string",
  "deletestate" : 0,
  "gresult" : "string",
  "level" : "string",
  "saglevelid" : 0,
  "serviceid" : 0,
  "sresult" : "string"
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="service-controller_resource"></a>

### Service-controller

Service Controller

<a name="addserviceusingpost"></a>

#### addService

```
POST /service/add
```

##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**service**  <br>*必填*|service|[Service](#service)|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 消耗

* `application/json`

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/service/add
```

###### 请求 body

```
json :
{
  "deletestate" : 0,
  "issue2resultid" : 0,
  "servicecompany" : "string",
  "serviceid" : 0,
  "servicelevel" : "string",
  "servicename" : "string",
  "servicetype" : "string",
  "state" : 0,
  "testorganization" : "string"
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="deleteserviceusingdelete"></a>

#### deleteService

```
DELETE /service/delete
```

##### 参数

|类型|名称|类型|
|---|---|---|
|**Query**|**deletestate**  <br>*可选*|integer (int32)|
|**Query**|**issue2resultid**  <br>*可选*|integer (int32)|
|**Query**|**servicecompany**  <br>*可选*|string|
|**Query**|**serviceid**  <br>*可选*|integer (int32)|
|**Query**|**servicelevel**  <br>*可选*|string|
|**Query**|**servicename**  <br>*可选*|string|
|**Query**|**servicetype**  <br>*可选*|string|
|**Query**|**state**  <br>*可选*|integer (int32)|
|**Query**|**testorganization**  <br>*可选*|string|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/service/delete
```

###### 请求 query

```
json :
{
  "deletestate" : 0,
  "issue2resultid" : 0,
  "servicecompany" : "string",
  "serviceid" : 0,
  "servicelevel" : "string",
  "servicename" : "string",
  "servicetype" : "string",
  "state" : 0,
  "testorganization" : "string"
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="getallservicesusingget"></a>

#### getAllServices

```
GET /service/getAll
```

##### 参数

|类型|名称|类型|
|---|---|---|
|**Query**|**deletestate**  <br>*可选*|integer (int32)|
|**Query**|**issue2resultid**  <br>*可选*|integer (int32)|
|**Query**|**servicecompany**  <br>*可选*|string|
|**Query**|**serviceid**  <br>*可选*|integer (int32)|
|**Query**|**servicelevel**  <br>*可选*|string|
|**Query**|**servicename**  <br>*可选*|string|
|**Query**|**servicetype**  <br>*可选*|string|
|**Query**|**state**  <br>*可选*|integer (int32)|
|**Query**|**testorganization**  <br>*可选*|string|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/service/getAll
```

###### 请求 query

```
json :
{
  "deletestate" : 0,
  "issue2resultid" : 0,
  "servicecompany" : "string",
  "serviceid" : 0,
  "servicelevel" : "string",
  "servicename" : "string",
  "servicetype" : "string",
  "state" : 0,
  "testorganization" : "string"
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="service-detail-controller_resource"></a>

### Service-detail-controller

Service Detail Controller

<a name="addservicedetailusingpost"></a>

#### addServiceDetail

```
POST /serviceDetail/add
```

##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**serviceDetail**  <br>*必填*|serviceDetail|[ServiceDetail](#servicedetail)|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 消耗

* `application/json`

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/serviceDetail/add
```

###### 请求 body

```
json :
{
  "businessscope" : "string",
  "companyname" : "string",
  "companytype" : "string",
  "deletestate" : 0,
  "ip" : "string",
  "legalperson" : "string",
  "linkman" : "string",
  "linkmantel" : "string",
  "password" : "string",
  "port" : "string",
  "protocol" : "string",
  "regaddress" : "string",
  "regcapital" : "string",
  "regdate" : "string",
  "servicedetailid" : 0,
  "serviceid" : 0,
  "serviceintro" : "string",
  "servicelocation" : "string",
  "servicename" : "string",
  "serviceobject" : "string",
  "serviceterm" : "string",
  "servicetype" : "string",
  "serviceurl" : "string",
  "signupemail" : "string",
  "signuppass" : "string",
  "suic" : "string",
  "term" : "string",
  "username" : "string"
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="getallservicedetailsusingget"></a>

#### getAllServiceDetails

```
GET /serviceDetail/getAll
```

##### 参数

|类型|名称|类型|
|---|---|---|
|**Query**|**businessscope**  <br>*可选*|string|
|**Query**|**companyname**  <br>*可选*|string|
|**Query**|**companytype**  <br>*可选*|string|
|**Query**|**deletestate**  <br>*可选*|integer (int32)|
|**Query**|**ip**  <br>*可选*|string|
|**Query**|**legalperson**  <br>*可选*|string|
|**Query**|**linkman**  <br>*可选*|string|
|**Query**|**linkmantel**  <br>*可选*|string|
|**Query**|**password**  <br>*可选*|string|
|**Query**|**port**  <br>*可选*|string|
|**Query**|**protocol**  <br>*可选*|string|
|**Query**|**regaddress**  <br>*可选*|string|
|**Query**|**regcapital**  <br>*可选*|string|
|**Query**|**regdate**  <br>*可选*|string|
|**Query**|**servicedetailid**  <br>*可选*|integer (int32)|
|**Query**|**serviceid**  <br>*可选*|integer (int32)|
|**Query**|**serviceintro**  <br>*可选*|string|
|**Query**|**servicelocation**  <br>*可选*|string|
|**Query**|**servicename**  <br>*可选*|string|
|**Query**|**serviceobject**  <br>*可选*|string|
|**Query**|**serviceterm**  <br>*可选*|string|
|**Query**|**servicetype**  <br>*可选*|string|
|**Query**|**serviceurl**  <br>*可选*|string|
|**Query**|**signupemail**  <br>*可选*|string|
|**Query**|**signuppass**  <br>*可选*|string|
|**Query**|**suic**  <br>*可选*|string|
|**Query**|**term**  <br>*可选*|string|
|**Query**|**username**  <br>*可选*|string|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/serviceDetail/getAll
```

###### 请求 query

```
json :
{
  "businessscope" : "string",
  "companyname" : "string",
  "companytype" : "string",
  "deletestate" : 0,
  "ip" : "string",
  "legalperson" : "string",
  "linkman" : "string",
  "linkmantel" : "string",
  "password" : "string",
  "port" : "string",
  "protocol" : "string",
  "regaddress" : "string",
  "regcapital" : "string",
  "regdate" : "string",
  "servicedetailid" : 0,
  "serviceid" : 0,
  "serviceintro" : "string",
  "servicelocation" : "string",
  "servicename" : "string",
  "serviceobject" : "string",
  "serviceterm" : "string",
  "servicetype" : "string",
  "serviceurl" : "string",
  "signupemail" : "string",
  "signuppass" : "string",
  "suic" : "string",
  "term" : "string",
  "username" : "string"
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="test-result-controller_resource"></a>

### Test-result-controller

Test Result Controller

<a name="addtestresultusingpost"></a>

#### addTestResult

```
POST /testResult/add
```

##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**testResult**  <br>*必填*|testResult|[TestResult](#testresult)|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 消耗

* `application/json`

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/testResult/add
```

###### 请求 body

```
json :
{
  "deletestate" : 0,
  "result1" : "string",
  "result10" : "string",
  "result100" : "string",
  "result101" : "string",
  "result102" : "string",
  "result103" : "string",
  "result104" : "string",
  "result105" : "string",
  "result106" : "string",
  "result107" : "string",
  "result108" : "string",
  "result109" : "string",
  "result11" : "string",
  "result110" : "string",
  "result111" : "string",
  "result112" : "string",
  "result113" : "string",
  "result114" : "string",
  "result115" : "string",
  "result116" : "string",
  "result117" : "string",
  "result118" : "string",
  "result119" : "string",
  "result12" : "string",
  "result120" : "string",
  "result121" : "string",
  "result122" : "string",
  "result123" : "string",
  "result124" : "string",
  "result125" : "string",
  "result126" : "string",
  "result127" : "string",
  "result128" : "string",
  "result129" : "string",
  "result13" : "string",
  "result130" : "string",
  "result14" : "string",
  "result15" : "string",
  "result16" : "string",
  "result17" : "string",
  "result18" : "string",
  "result19" : "string",
  "result2" : "string",
  "result20" : "string",
  "result21" : "string",
  "result22" : "string",
  "result23" : "string",
  "result24" : "string",
  "result25" : "string",
  "result26" : "string",
  "result27" : "string",
  "result28" : "string",
  "result29" : "string",
  "result3" : "string",
  "result30" : "string",
  "result31" : "string",
  "result32" : "string",
  "result33" : "string",
  "result34" : "string",
  "result35" : "string",
  "result36" : "string",
  "result37" : "string",
  "result38" : "string",
  "result39" : "string",
  "result4" : "string",
  "result40" : "string",
  "result41" : "string",
  "result42" : "string",
  "result43" : "string",
  "result44" : "string",
  "result45" : "string",
  "result46" : "string",
  "result47" : "string",
  "result48" : "string",
  "result49" : "string",
  "result5" : "string",
  "result50" : "string",
  "result51" : "string",
  "result52" : "string",
  "result53" : "string",
  "result54" : "string",
  "result55" : "string",
  "result56" : "string",
  "result57" : "string",
  "result58" : "string",
  "result59" : "string",
  "result6" : "string",
  "result60" : "string",
  "result61" : "string",
  "result62" : "string",
  "result63" : "string",
  "result64" : "string",
  "result65" : "string",
  "result66" : "string",
  "result67" : "string",
  "result68" : "string",
  "result69" : "string",
  "result7" : "string",
  "result70" : "string",
  "result71" : "string",
  "result72" : "string",
  "result73" : "string",
  "result74" : "string",
  "result75" : "string",
  "result76" : "string",
  "result77" : "string",
  "result78" : "string",
  "result79" : "string",
  "result8" : "string",
  "result80" : "string",
  "result81" : "string",
  "result82" : "string",
  "result83" : "string",
  "result84" : "string",
  "result85" : "string",
  "result86" : "string",
  "result87" : "string",
  "result88" : "string",
  "result89" : "string",
  "result9" : "string",
  "result90" : "string",
  "result91" : "string",
  "result92" : "string",
  "result93" : "string",
  "result94" : "string",
  "result95" : "string",
  "result96" : "string",
  "result97" : "string",
  "result98" : "string",
  "result99" : "string",
  "serviceid" : 0,
  "testresultid" : 0
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="getalltestresultsusingget"></a>

#### getAllTestResults

```
GET /testResult/getAll
```

##### 参数

|类型|名称|类型|
|---|---|---|
|**Query**|**deletestate**  <br>*可选*|integer (int32)|
|**Query**|**result1**  <br>*可选*|string|
|**Query**|**result10**  <br>*可选*|string|
|**Query**|**result100**  <br>*可选*|string|
|**Query**|**result101**  <br>*可选*|string|
|**Query**|**result102**  <br>*可选*|string|
|**Query**|**result103**  <br>*可选*|string|
|**Query**|**result104**  <br>*可选*|string|
|**Query**|**result105**  <br>*可选*|string|
|**Query**|**result106**  <br>*可选*|string|
|**Query**|**result107**  <br>*可选*|string|
|**Query**|**result108**  <br>*可选*|string|
|**Query**|**result109**  <br>*可选*|string|
|**Query**|**result11**  <br>*可选*|string|
|**Query**|**result110**  <br>*可选*|string|
|**Query**|**result111**  <br>*可选*|string|
|**Query**|**result112**  <br>*可选*|string|
|**Query**|**result113**  <br>*可选*|string|
|**Query**|**result114**  <br>*可选*|string|
|**Query**|**result115**  <br>*可选*|string|
|**Query**|**result116**  <br>*可选*|string|
|**Query**|**result117**  <br>*可选*|string|
|**Query**|**result118**  <br>*可选*|string|
|**Query**|**result119**  <br>*可选*|string|
|**Query**|**result12**  <br>*可选*|string|
|**Query**|**result120**  <br>*可选*|string|
|**Query**|**result121**  <br>*可选*|string|
|**Query**|**result122**  <br>*可选*|string|
|**Query**|**result123**  <br>*可选*|string|
|**Query**|**result124**  <br>*可选*|string|
|**Query**|**result125**  <br>*可选*|string|
|**Query**|**result126**  <br>*可选*|string|
|**Query**|**result127**  <br>*可选*|string|
|**Query**|**result128**  <br>*可选*|string|
|**Query**|**result129**  <br>*可选*|string|
|**Query**|**result13**  <br>*可选*|string|
|**Query**|**result130**  <br>*可选*|string|
|**Query**|**result14**  <br>*可选*|string|
|**Query**|**result15**  <br>*可选*|string|
|**Query**|**result16**  <br>*可选*|string|
|**Query**|**result17**  <br>*可选*|string|
|**Query**|**result18**  <br>*可选*|string|
|**Query**|**result19**  <br>*可选*|string|
|**Query**|**result2**  <br>*可选*|string|
|**Query**|**result20**  <br>*可选*|string|
|**Query**|**result21**  <br>*可选*|string|
|**Query**|**result22**  <br>*可选*|string|
|**Query**|**result23**  <br>*可选*|string|
|**Query**|**result24**  <br>*可选*|string|
|**Query**|**result25**  <br>*可选*|string|
|**Query**|**result26**  <br>*可选*|string|
|**Query**|**result27**  <br>*可选*|string|
|**Query**|**result28**  <br>*可选*|string|
|**Query**|**result29**  <br>*可选*|string|
|**Query**|**result3**  <br>*可选*|string|
|**Query**|**result30**  <br>*可选*|string|
|**Query**|**result31**  <br>*可选*|string|
|**Query**|**result32**  <br>*可选*|string|
|**Query**|**result33**  <br>*可选*|string|
|**Query**|**result34**  <br>*可选*|string|
|**Query**|**result35**  <br>*可选*|string|
|**Query**|**result36**  <br>*可选*|string|
|**Query**|**result37**  <br>*可选*|string|
|**Query**|**result38**  <br>*可选*|string|
|**Query**|**result39**  <br>*可选*|string|
|**Query**|**result4**  <br>*可选*|string|
|**Query**|**result40**  <br>*可选*|string|
|**Query**|**result41**  <br>*可选*|string|
|**Query**|**result42**  <br>*可选*|string|
|**Query**|**result43**  <br>*可选*|string|
|**Query**|**result44**  <br>*可选*|string|
|**Query**|**result45**  <br>*可选*|string|
|**Query**|**result46**  <br>*可选*|string|
|**Query**|**result47**  <br>*可选*|string|
|**Query**|**result48**  <br>*可选*|string|
|**Query**|**result49**  <br>*可选*|string|
|**Query**|**result5**  <br>*可选*|string|
|**Query**|**result50**  <br>*可选*|string|
|**Query**|**result51**  <br>*可选*|string|
|**Query**|**result52**  <br>*可选*|string|
|**Query**|**result53**  <br>*可选*|string|
|**Query**|**result54**  <br>*可选*|string|
|**Query**|**result55**  <br>*可选*|string|
|**Query**|**result56**  <br>*可选*|string|
|**Query**|**result57**  <br>*可选*|string|
|**Query**|**result58**  <br>*可选*|string|
|**Query**|**result59**  <br>*可选*|string|
|**Query**|**result6**  <br>*可选*|string|
|**Query**|**result60**  <br>*可选*|string|
|**Query**|**result61**  <br>*可选*|string|
|**Query**|**result62**  <br>*可选*|string|
|**Query**|**result63**  <br>*可选*|string|
|**Query**|**result64**  <br>*可选*|string|
|**Query**|**result65**  <br>*可选*|string|
|**Query**|**result66**  <br>*可选*|string|
|**Query**|**result67**  <br>*可选*|string|
|**Query**|**result68**  <br>*可选*|string|
|**Query**|**result69**  <br>*可选*|string|
|**Query**|**result7**  <br>*可选*|string|
|**Query**|**result70**  <br>*可选*|string|
|**Query**|**result71**  <br>*可选*|string|
|**Query**|**result72**  <br>*可选*|string|
|**Query**|**result73**  <br>*可选*|string|
|**Query**|**result74**  <br>*可选*|string|
|**Query**|**result75**  <br>*可选*|string|
|**Query**|**result76**  <br>*可选*|string|
|**Query**|**result77**  <br>*可选*|string|
|**Query**|**result78**  <br>*可选*|string|
|**Query**|**result79**  <br>*可选*|string|
|**Query**|**result8**  <br>*可选*|string|
|**Query**|**result80**  <br>*可选*|string|
|**Query**|**result81**  <br>*可选*|string|
|**Query**|**result82**  <br>*可选*|string|
|**Query**|**result83**  <br>*可选*|string|
|**Query**|**result84**  <br>*可选*|string|
|**Query**|**result85**  <br>*可选*|string|
|**Query**|**result86**  <br>*可选*|string|
|**Query**|**result87**  <br>*可选*|string|
|**Query**|**result88**  <br>*可选*|string|
|**Query**|**result89**  <br>*可选*|string|
|**Query**|**result9**  <br>*可选*|string|
|**Query**|**result90**  <br>*可选*|string|
|**Query**|**result91**  <br>*可选*|string|
|**Query**|**result92**  <br>*可选*|string|
|**Query**|**result93**  <br>*可选*|string|
|**Query**|**result94**  <br>*可选*|string|
|**Query**|**result95**  <br>*可选*|string|
|**Query**|**result96**  <br>*可选*|string|
|**Query**|**result97**  <br>*可选*|string|
|**Query**|**result98**  <br>*可选*|string|
|**Query**|**result99**  <br>*可选*|string|
|**Query**|**serviceid**  <br>*可选*|integer (int32)|
|**Query**|**testresultid**  <br>*可选*|integer (int32)|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/testResult/getAll
```

###### 请求 query

```
json :
{
  "deletestate" : 0,
  "result1" : "string",
  "result10" : "string",
  "result100" : "string",
  "result101" : "string",
  "result102" : "string",
  "result103" : "string",
  "result104" : "string",
  "result105" : "string",
  "result106" : "string",
  "result107" : "string",
  "result108" : "string",
  "result109" : "string",
  "result11" : "string",
  "result110" : "string",
  "result111" : "string",
  "result112" : "string",
  "result113" : "string",
  "result114" : "string",
  "result115" : "string",
  "result116" : "string",
  "result117" : "string",
  "result118" : "string",
  "result119" : "string",
  "result12" : "string",
  "result120" : "string",
  "result121" : "string",
  "result122" : "string",
  "result123" : "string",
  "result124" : "string",
  "result125" : "string",
  "result126" : "string",
  "result127" : "string",
  "result128" : "string",
  "result129" : "string",
  "result13" : "string",
  "result130" : "string",
  "result14" : "string",
  "result15" : "string",
  "result16" : "string",
  "result17" : "string",
  "result18" : "string",
  "result19" : "string",
  "result2" : "string",
  "result20" : "string",
  "result21" : "string",
  "result22" : "string",
  "result23" : "string",
  "result24" : "string",
  "result25" : "string",
  "result26" : "string",
  "result27" : "string",
  "result28" : "string",
  "result29" : "string",
  "result3" : "string",
  "result30" : "string",
  "result31" : "string",
  "result32" : "string",
  "result33" : "string",
  "result34" : "string",
  "result35" : "string",
  "result36" : "string",
  "result37" : "string",
  "result38" : "string",
  "result39" : "string",
  "result4" : "string",
  "result40" : "string",
  "result41" : "string",
  "result42" : "string",
  "result43" : "string",
  "result44" : "string",
  "result45" : "string",
  "result46" : "string",
  "result47" : "string",
  "result48" : "string",
  "result49" : "string",
  "result5" : "string",
  "result50" : "string",
  "result51" : "string",
  "result52" : "string",
  "result53" : "string",
  "result54" : "string",
  "result55" : "string",
  "result56" : "string",
  "result57" : "string",
  "result58" : "string",
  "result59" : "string",
  "result6" : "string",
  "result60" : "string",
  "result61" : "string",
  "result62" : "string",
  "result63" : "string",
  "result64" : "string",
  "result65" : "string",
  "result66" : "string",
  "result67" : "string",
  "result68" : "string",
  "result69" : "string",
  "result7" : "string",
  "result70" : "string",
  "result71" : "string",
  "result72" : "string",
  "result73" : "string",
  "result74" : "string",
  "result75" : "string",
  "result76" : "string",
  "result77" : "string",
  "result78" : "string",
  "result79" : "string",
  "result8" : "string",
  "result80" : "string",
  "result81" : "string",
  "result82" : "string",
  "result83" : "string",
  "result84" : "string",
  "result85" : "string",
  "result86" : "string",
  "result87" : "string",
  "result88" : "string",
  "result89" : "string",
  "result9" : "string",
  "result90" : "string",
  "result91" : "string",
  "result92" : "string",
  "result93" : "string",
  "result94" : "string",
  "result95" : "string",
  "result96" : "string",
  "result97" : "string",
  "result98" : "string",
  "result99" : "string",
  "serviceid" : 0,
  "testresultid" : 0
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="updatetestresultusingpost"></a>

#### updateTestResult

```
POST /testResult/update
```

##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**testResult**  <br>*必填*|testResult|[TestResult](#testresult)|

##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|

##### 消耗

* `application/json`

##### 生成

* `*/*`

##### HTTP请求示例

###### 请求 path

```
/testResult/update
```

###### 请求 body

```
json :
{
  "deletestate" : 0,
  "result1" : "string",
  "result10" : "string",
  "result100" : "string",
  "result101" : "string",
  "result102" : "string",
  "result103" : "string",
  "result104" : "string",
  "result105" : "string",
  "result106" : "string",
  "result107" : "string",
  "result108" : "string",
  "result109" : "string",
  "result11" : "string",
  "result110" : "string",
  "result111" : "string",
  "result112" : "string",
  "result113" : "string",
  "result114" : "string",
  "result115" : "string",
  "result116" : "string",
  "result117" : "string",
  "result118" : "string",
  "result119" : "string",
  "result12" : "string",
  "result120" : "string",
  "result121" : "string",
  "result122" : "string",
  "result123" : "string",
  "result124" : "string",
  "result125" : "string",
  "result126" : "string",
  "result127" : "string",
  "result128" : "string",
  "result129" : "string",
  "result13" : "string",
  "result130" : "string",
  "result14" : "string",
  "result15" : "string",
  "result16" : "string",
  "result17" : "string",
  "result18" : "string",
  "result19" : "string",
  "result2" : "string",
  "result20" : "string",
  "result21" : "string",
  "result22" : "string",
  "result23" : "string",
  "result24" : "string",
  "result25" : "string",
  "result26" : "string",
  "result27" : "string",
  "result28" : "string",
  "result29" : "string",
  "result3" : "string",
  "result30" : "string",
  "result31" : "string",
  "result32" : "string",
  "result33" : "string",
  "result34" : "string",
  "result35" : "string",
  "result36" : "string",
  "result37" : "string",
  "result38" : "string",
  "result39" : "string",
  "result4" : "string",
  "result40" : "string",
  "result41" : "string",
  "result42" : "string",
  "result43" : "string",
  "result44" : "string",
  "result45" : "string",
  "result46" : "string",
  "result47" : "string",
  "result48" : "string",
  "result49" : "string",
  "result5" : "string",
  "result50" : "string",
  "result51" : "string",
  "result52" : "string",
  "result53" : "string",
  "result54" : "string",
  "result55" : "string",
  "result56" : "string",
  "result57" : "string",
  "result58" : "string",
  "result59" : "string",
  "result6" : "string",
  "result60" : "string",
  "result61" : "string",
  "result62" : "string",
  "result63" : "string",
  "result64" : "string",
  "result65" : "string",
  "result66" : "string",
  "result67" : "string",
  "result68" : "string",
  "result69" : "string",
  "result7" : "string",
  "result70" : "string",
  "result71" : "string",
  "result72" : "string",
  "result73" : "string",
  "result74" : "string",
  "result75" : "string",
  "result76" : "string",
  "result77" : "string",
  "result78" : "string",
  "result79" : "string",
  "result8" : "string",
  "result80" : "string",
  "result81" : "string",
  "result82" : "string",
  "result83" : "string",
  "result84" : "string",
  "result85" : "string",
  "result86" : "string",
  "result87" : "string",
  "result88" : "string",
  "result89" : "string",
  "result9" : "string",
  "result90" : "string",
  "result91" : "string",
  "result92" : "string",
  "result93" : "string",
  "result94" : "string",
  "result95" : "string",
  "result96" : "string",
  "result97" : "string",
  "result98" : "string",
  "result99" : "string",
  "serviceid" : 0,
  "testresultid" : 0
}
```

##### HTTP响应示例

###### 响应 200

```
json :
"object"
```

<a name="definitions"></a>

## 定义

<a name="modelandview"></a>

### ModelAndView

|名称|说明|类型|
|---|---|---|
|**empty**  <br>*可选*|**样例** : `true`|boolean|
|**model**  <br>*可选*|**样例** : `"object"`|object|
|**modelMap**  <br>*可选*|**样例** : `{<br>  "string" : "object"<br>}`|< string, object > map|
|**reference**  <br>*可选*|**样例** : `true`|boolean|
|**status**  <br>*可选*|**
样例** : `"string"`|enum (100 CONTINUE, 101 SWITCHING_PROTOCOLS, 102 PROCESSING, 103 CHECKPOINT, 200 OK, 201 CREATED, 202 ACCEPTED, 203 NON_AUTHORITATIVE_INFORMATION, 204 NO_CONTENT, 205 RESET_CONTENT, 206 PARTIAL_CONTENT, 207 MULTI_STATUS, 208 ALREADY_REPORTED, 226 IM_USED, 300 MULTIPLE_CHOICES, 301 MOVED_PERMANENTLY, 302 FOUND, 302 MOVED_TEMPORARILY, 303 SEE_OTHER, 304 NOT_MODIFIED, 305 USE_PROXY, 307 TEMPORARY_REDIRECT, 308 PERMANENT_REDIRECT, 400 BAD_REQUEST, 401 UNAUTHORIZED, 402 PAYMENT_REQUIRED, 403 FORBIDDEN, 404 NOT_FOUND, 405 METHOD_NOT_ALLOWED, 406 NOT_ACCEPTABLE, 407 PROXY_AUTHENTICATION_REQUIRED, 408 REQUEST_TIMEOUT, 409 CONFLICT, 410 GONE, 411 LENGTH_REQUIRED, 412 PRECONDITION_FAILED, 413 PAYLOAD_TOO_LARGE, 413 REQUEST_ENTITY_TOO_LARGE, 414 URI_TOO_LONG, 414 REQUEST_URI_TOO_LONG, 415 UNSUPPORTED_MEDIA_TYPE, 416 REQUESTED_RANGE_NOT_SATISFIABLE, 417 EXPECTATION_FAILED, 418 I_AM_A_TEAPOT, 419 INSUFFICIENT_SPACE_ON_RESOURCE, 420 METHOD_FAILURE, 421 DESTINATION_LOCKED, 422 UNPROCESSABLE_ENTITY, 423 LOCKED, 424 FAILED_DEPENDENCY, 425 TOO_EARLY, 426 UPGRADE_REQUIRED, 428 PRECONDITION_REQUIRED, 429 TOO_MANY_REQUESTS, 431 REQUEST_HEADER_FIELDS_TOO_LARGE, 451 UNAVAILABLE_FOR_LEGAL_REASONS, 500 INTERNAL_SERVER_ERROR, 501 NOT_IMPLEMENTED, 502 BAD_GATEWAY, 503 SERVICE_UNAVAILABLE, 504 GATEWAY_TIMEOUT, 505 HTTP_VERSION_NOT_SUPPORTED, 506 VARIANT_ALSO_NEGOTIATES, 507 INSUFFICIENT_STORAGE, 508 LOOP_DETECTED, 509 BANDWIDTH_LIMIT_EXCEEDED, 510 NOT_EXTENDED, 511 NETWORK_AUTHENTICATION_REQUIRED)|
|**view**  <br>*可选*|**样例** : `"[view](#view)"`|[View](#view)|
|**viewName**  <br>*可选*|**样例** : `"string"`|string|

<a name="saglevel"></a>

### SagLevel

|名称|说明|类型|
|---|---|---|
|**aresult**  <br>*可选*|**样例** : `"string"`|string|
|**deletestate**  <br>*可选*|**样例** : `0`|integer (int32)|
|**gresult**  <br>*可选*|**样例** : `"string"`|string|
|**level**  <br>*可选*|**样例** : `"string"`|string|
|**saglevelid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**serviceid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**sresult**  <br>*可选*|**样例** : `"string"`|string|

<a name="service"></a>

### Service

|名称|说明|类型|
|---|---|---|
|**deletestate**  <br>*可选*|**样例** : `0`|integer (int32)|
|**issue2resultid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**servicecompany**  <br>*可选*|**样例** : `"string"`|string|
|**serviceid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**servicelevel**  <br>*可选*|**样例** : `"string"`|string|
|**servicename**  <br>*可选*|**样例** : `"string"`|string|
|**servicetype**  <br>*可选*|**样例** : `"string"`|string|
|**state**  <br>*可选*|**样例** : `0`|integer (int32)|
|**testorganization**  <br>*可选*|**样例** : `"string"`|string|

<a name="servicedetail"></a>

### ServiceDetail

|名称|说明|类型|
|---|---|---|
|**businessscope**  <br>*可选*|**样例** : `"string"`|string|
|**companyname**  <br>*可选*|**样例** : `"string"`|string|
|**companytype**  <br>*可选*|**样例** : `"string"`|string|
|**deletestate**  <br>*可选*|**样例** : `0`|integer (int32)|
|**ip**  <br>*可选*|**样例** : `"string"`|string|
|**legalperson**  <br>*可选*|**样例** : `"string"`|string|
|**linkman**  <br>*可选*|**样例** : `"string"`|string|
|**linkmantel**  <br>*可选*|**样例** : `"string"`|string|
|**password**  <br>*可选*|**样例** : `"string"`|string|
|**port**  <br>*可选*|**样例** : `"string"`|string|
|**protocol**  <br>*可选*|**样例** : `"string"`|string|
|**regaddress**  <br>*可选*|**样例** : `"string"`|string|
|**regcapital**  <br>*可选*|**样例** : `"string"`|string|
|**regdate**  <br>*可选*|**样例** : `"string"`|string|
|**servicedetailid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**serviceid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**serviceintro**  <br>*可选*|**样例** : `"string"`|string|
|**servicelocation**  <br>*可选*|**样例** : `"string"`|string|
|**servicename**  <br>*可选*|**样例** : `"string"`|string|
|**serviceobject**  <br>*可选*|**样例** : `"string"`|string|
|**serviceterm**  <br>*可选*|**样例** : `"string"`|string|
|**servicetype**  <br>*可选*|**样例** : `"string"`|string|
|**serviceurl**  <br>*可选*|**样例** : `"string"`|string|
|**signupemail**  <br>*可选*|**样例** : `"string"`|string|
|**signuppass**  <br>*可选*|**样例** : `"string"`|string|
|**suic**  <br>*可选*|**样例** : `"string"`|string|
|**term**  <br>*可选*|**样例** : `"string"`|string|
|**username**  <br>*可选*|**样例** : `"string"`|string|

<a name="testresult"></a>

### TestResult

|名称|说明|类型|
|---|---|---|
|**deletestate**  <br>*可选*|**样例** : `0`|integer (int32)|
|**result1**  <br>*可选*|**样例** : `"string"`|string|
|**result10**  <br>*可选*|**样例** : `"string"`|string|
|**result100**  <br>*可选*|**样例** : `"string"`|string|
|**result101**  <br>*可选*|**样例** : `"string"`|string|
|**result102**  <br>*可选*|**样例** : `"string"`|string|
|**result103**  <br>*可选*|**样例** : `"string"`|string|
|**result104**  <br>*可选*|**样例** : `"string"`|string|
|**result105**  <br>*可选*|**样例** : `"string"`|string|
|**result106**  <br>*可选*|**样例** : `"string"`|string|
|**result107**  <br>*可选*|**样例** : `"string"`|string|
|**result108**  <br>*可选*|**样例** : `"string"`|string|
|**result109**  <br>*可选*|**样例** : `"string"`|string|
|**result11**  <br>*可选*|**样例** : `"string"`|string|
|**result110**  <br>*可选*|**样例** : `"string"`|string|
|**result111**  <br>*可选*|**样例** : `"string"`|string|
|**result112**  <br>*可选*|**样例** : `"string"`|string|
|**result113**  <br>*可选*|**样例** : `"string"`|string|
|**result114**  <br>*可选*|**样例** : `"string"`|string|
|**result115**  <br>*可选*|**样例** : `"string"`|string|
|**result116**  <br>*可选*|**样例** : `"string"`|string|
|**result117**  <br>*可选*|**样例** : `"string"`|string|
|**result118**  <br>*可选*|**样例** : `"string"`|string|
|**result119**  <br>*可选*|**样例** : `"string"`|string|
|**result12**  <br>*可选*|**样例** : `"string"`|string|
|**result120**  <br>*可选*|**样例** : `"string"`|string|
|**result121**  <br>*可选*|**样例** : `"string"`|string|
|**result122**  <br>*可选*|**样例** : `"string"`|string|
|**result123**  <br>*可选*|**样例** : `"string"`|string|
|**result124**  <br>*可选*|**样例** : `"string"`|string|
|**result125**  <br>*可选*|**样例** : `"string"`|string|
|**result126**  <br>*可选*|**样例** : `"string"`|string|
|**result127**  <br>*可选*|**样例** : `"string"`|string|
|**result128**  <br>*可选*|**样例** : `"string"`|string|
|**result129**  <br>*可选*|**样例** : `"string"`|string|
|**result13**  <br>*可选*|**样例** : `"string"`|string|
|**result130**  <br>*可选*|**样例** : `"string"`|string|
|**result14**  <br>*可选*|**样例** : `"string"`|string|
|**result15**  <br>*可选*|**样例** : `"string"`|string|
|**result16**  <br>*可选*|**样例** : `"string"`|string|
|**result17**  <br>*可选*|**样例** : `"string"`|string|
|**result18**  <br>*可选*|**样例** : `"string"`|string|
|**result19**  <br>*可选*|**样例** : `"string"`|string|
|**result2**  <br>*可选*|**样例** : `"string"`|string|
|**result20**  <br>*可选*|**样例** : `"string"`|string|
|**result21**  <br>*可选*|**样例** : `"string"`|string|
|**result22**  <br>*可选*|**样例** : `"string"`|string|
|**result23**  <br>*可选*|**样例** : `"string"`|string|
|**result24**  <br>*可选*|**样例** : `"string"`|string|
|**result25**  <br>*可选*|**样例** : `"string"`|string|
|**result26**  <br>*可选*|**样例** : `"string"`|string|
|**result27**  <br>*可选*|**样例** : `"string"`|string|
|**result28**  <br>*可选*|**样例** : `"string"`|string|
|**result29**  <br>*可选*|**样例** : `"string"`|string|
|**result3**  <br>*可选*|**样例** : `"string"`|string|
|**result30**  <br>*可选*|**样例** : `"string"`|string|
|**result31**  <br>*可选*|**样例** : `"string"`|string|
|**result32**  <br>*可选*|**样例** : `"string"`|string|
|**result33**  <br>*可选*|**样例** : `"string"`|string|
|**result34**  <br>*可选*|**样例** : `"string"`|string|
|**result35**  <br>*可选*|**样例** : `"string"`|string|
|**result36**  <br>*可选*|**样例** : `"string"`|string|
|**result37**  <br>*可选*|**样例** : `"string"`|string|
|**result38**  <br>*可选*|**样例** : `"string"`|string|
|**result39**  <br>*可选*|**样例** : `"string"`|string|
|**result4**  <br>*可选*|**样例** : `"string"`|string|
|**result40**  <br>*可选*|**样例** : `"string"`|string|
|**result41**  <br>*可选*|**样例** : `"string"`|string|
|**result42**  <br>*可选*|**样例** : `"string"`|string|
|**result43**  <br>*可选*|**样例** : `"string"`|string|
|**result44**  <br>*可选*|**样例** : `"string"`|string|
|**result45**  <br>*可选*|**样例** : `"string"`|string|
|**result46**  <br>*可选*|**样例** : `"string"`|string|
|**result47**  <br>*可选*|**样例** : `"string"`|string|
|**result48**  <br>*可选*|**样例** : `"string"`|string|
|**result49**  <br>*可选*|**样例** : `"string"`|string|
|**result5**  <br>*可选*|**样例** : `"string"`|string|
|**result50**  <br>*可选*|**样例** : `"string"`|string|
|**result51**  <br>*可选*|**样例** : `"string"`|string|
|**result52**  <br>*可选*|**样例** : `"string"`|string|
|**result53**  <br>*可选*|**样例** : `"string"`|string|
|**result54**  <br>*可选*|**样例** : `"string"`|string|
|**result55**  <br>*可选*|**样例** : `"string"`|string|
|**result56**  <br>*可选*|**样例** : `"string"`|string|
|**result57**  <br>*可选*|**样例** : `"string"`|string|
|**result58**  <br>*可选*|**样例** : `"string"`|string|
|**result59**  <br>*可选*|**样例** : `"string"`|string|
|**result6**  <br>*可选*|**样例** : `"string"`|string|
|**result60**  <br>*可选*|**样例** : `"string"`|string|
|**result61**  <br>*可选*|**样例** : `"string"`|string|
|**result62**  <br>*可选*|**样例** : `"string"`|string|
|**result63**  <br>*可选*|**样例** : `"string"`|string|
|**result64**  <br>*可选*|**样例** : `"string"`|string|
|**result65**  <br>*可选*|**样例** : `"string"`|string|
|**result66**  <br>*可选*|**样例** : `"string"`|string|
|**result67**  <br>*可选*|**样例** : `"string"`|string|
|**result68**  <br>*可选*|**样例** : `"string"`|string|
|**result69**  <br>*可选*|**样例** : `"string"`|string|
|**result7**  <br>*可选*|**样例** : `"string"`|string|
|**result70**  <br>*可选*|**样例** : `"string"`|string|
|**result71**  <br>*可选*|**样例** : `"string"`|string|
|**result72**  <br>*可选*|**样例** : `"string"`|string|
|**result73**  <br>*可选*|**样例** : `"string"`|string|
|**result74**  <br>*可选*|**样例** : `"string"`|string|
|**result75**  <br>*可选*|**样例** : `"string"`|string|
|**result76**  <br>*可选*|**样例** : `"string"`|string|
|**result77**  <br>*可选*|**样例** : `"string"`|string|
|**result78**  <br>*可选*|**样例** : `"string"`|string|
|**result79**  <br>*可选*|**样例** : `"string"`|string|
|**result8**  <br>*可选*|**样例** : `"string"`|string|
|**result80**  <br>*可选*|**样例** : `"string"`|string|
|**result81**  <br>*可选*|**样例** : `"string"`|string|
|**result82**  <br>*可选*|**样例** : `"string"`|string|
|**result83**  <br>*可选*|**样例** : `"string"`|string|
|**result84**  <br>*可选*|**样例** : `"string"`|string|
|**result85**  <br>*可选*|**样例** : `"string"`|string|
|**result86**  <br>*可选*|**样例** : `"string"`|string|
|**result87**  <br>*可选*|**样例** : `"string"`|string|
|**result88**  <br>*可选*|**样例** : `"string"`|string|
|**result89**  <br>*可选*|**样例** : `"string"`|string|
|**result9**  <br>*可选*|**样例** : `"string"`|string|
|**result90**  <br>*可选*|**样例** : `"string"`|string|
|**result91**  <br>*可选*|**样例** : `"string"`|string|
|**result92**  <br>*可选*|**样例** : `"string"`|string|
|**result93**  <br>*可选*|**样例** : `"string"`|string|
|**result94**  <br>*可选*|**样例** : `"string"`|string|
|**result95**  <br>*可选*|**样例** : `"string"`|string|
|**result96**  <br>*可选*|**样例** : `"string"`|string|
|**result97**  <br>*可选*|**样例** : `"string"`|string|
|**result98**  <br>*可选*|**样例** : `"string"`|string|
|**result99**  <br>*可选*|**样例** : `"string"`|string|
|**serviceid**  <br>*可选*|**样例** : `0`|integer (int32)|
|**testresultid**  <br>*可选*|**样例** : `0`|integer (int32)|

<a name="view"></a>

### View

|名称|说明|类型|
|---|---|---|
|**contentType**  <br>*可选*|**样例** : `"string"`|string|






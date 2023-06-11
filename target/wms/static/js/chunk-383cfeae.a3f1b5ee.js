(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-383cfeae"],{"0588":function(e,t,i){"use strict";i.r(t);var p=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("div",[i("el-button",{staticStyle:{"margin-top":"10px","margin-bottom":"10px","margin-left":"5px"},attrs:{type:"primary",plain:""},on:{click:function(t){return e.addSupplier("add")}}},[e._v("添加供应商")]),i("el-button",{attrs:{type:"danger",plain:""},on:{click:e.deleteList}},[e._v("批量删除")]),i("el-table",{staticStyle:{width:"100%"},attrs:{data:e.tableData,border:"","row-style":e.everyLevel},on:{"selection-change":e.handleSelectionChange}},[i("el-table-column",{attrs:{type:"selection",width:"55"}}),i("el-table-column",{attrs:{type:"index",label:"序号",width:"80",index:e.indexMethod}}),i("el-table-column",{attrs:{prop:"supplierName",label:"供应商名称",width:"180"}}),i("el-table-column",{attrs:{prop:"supplierLeader",label:"供应商联系人",width:"120"}}),i("el-table-column",{attrs:{prop:"supplierTel",label:"供应商联系电话",width:"120"}}),i("el-table-column",{attrs:{prop:"supplierEmail",label:"供应商邮箱",width:"120"}}),i("el-table-column",{attrs:{prop:"supplierAddress",label:"供应商地址",width:"120"}}),i("el-table-column",{attrs:{prop:"createTime",label:"创建时间",width:"180"}}),i("el-table-column",{attrs:{prop:"updateTime",label:"更新时间",width:"180"}}),i("el-table-column",{attrs:{formatter:e.formatIsDelete,label:"是否有效"}}),i("el-table-column",{attrs:{fixed:"right",label:"操作",width:"180"},scopedSlots:e._u([{key:"default",fn:function(t){return[i("el-button",{attrs:{type:"danger",plain:""},on:{click:function(i){return e.deleteSupplier(t.row)}}},[e._v("删除")]),i("el-button",{attrs:{type:"primary",plain:""},on:{click:function(i){return e.updateSupplier(t.row)}}},[e._v("编辑")])]}}])})],1),i("div",[i("el-pagination",{attrs:{"page-count":e.pageCount,"current-page":e.pageNo,background:"",layout:"prev, pager, next"},on:{"prev-click":e.pre,"next-click":e.next,"current-change":e.handleCurrentChange}})],1),i("div",[i("el-dialog",{attrs:{title:"添加供应商",visible:e.dialogVisible,width:"30%",center:!0,"before-close":e.handleClose},on:{"update:visible":function(t){e.dialogVisible=t}}},[i("el-form",{ref:"supplierForm",staticClass:"demo-ruleForm",attrs:{model:e.supplier,"label-width":"100px"}},[i("el-form-item",{attrs:{label:"供应商名称",prop:"supplierName"}},[i("el-input",{model:{value:e.supplier.supplierName,callback:function(t){e.$set(e.supplier,"supplierName",t)},expression:"supplier.supplierName"}})],1),i("el-form-item",{attrs:{label:"供应商邮箱",prop:"supplierEmail"}},[i("el-input",{model:{value:e.supplier.supplierEmail,callback:function(t){e.$set(e.supplier,"supplierEmail",t)},expression:"supplier.supplierEmail"}})],1),i("el-form-item",{attrs:{label:"供应商电话",prop:"supplierTel"}},[i("el-input",{model:{value:e.supplier.supplierTel,callback:function(t){e.$set(e.supplier,"supplierTel",t)},expression:"supplier.supplierTel"}})],1),i("el-form-item",{attrs:{label:"供应商联系人",prop:"supplierLeader"}},[i("el-input",{model:{value:e.supplier.supplierLeader,callback:function(t){e.$set(e.supplier,"supplierLeader",t)},expression:"supplier.supplierLeader"}})],1),i("el-form-item",{attrs:{label:"供应商地址",prop:"customerAddress"}},[i("el-input",{model:{value:e.supplier.supplierAddress,callback:function(t){e.$set(e.supplier,"supplierAddress",t)},expression:"supplier.supplierAddress"}})],1),i("el-form-item",{attrs:{label:"是否有效",prop:"isDelete"}},[i("el-radio-group",{model:{value:e.supplier.isDelete,callback:function(t){e.$set(e.supplier,"isDelete",t)},expression:"supplier.isDelete"}},[i("el-radio",{attrs:{label:"0"}},[e._v("无效")]),i("el-radio",{attrs:{label:"1"}},[e._v("有效")])],1)],1),i("el-form-item",{attrs:{label:"创建日期",prop:"createTime"}},[i("div",{staticClass:"block"},[i("el-date-picker",{attrs:{"value-format":"yyyy-MM-dd",type:"date",placeholder:"选择日期"},model:{value:e.supplier.createTime,callback:function(t){e.$set(e.supplier,"createTime",t)},expression:"supplier.createTime"}})],1)]),i("el-form-item",[i("el-button",{attrs:{type:"primary"},on:{click:function(t){return e.submitForm("supplierForm")}}},[e._v("提交")])],1)],1),i("span",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"})],1)],1)],1)},l=[],s=(i("d3b7"),i("25f0"),i("e9c4"),i("bc3a")),r=i.n(s),a={name:"SupplierList",data:function(){return{supplier:{supplierName:"",supplierEmail:"",supplierTel:"",supplierAddress:"",supplierId:"",supplierLeader:"",createTime:"",isDelete:"1"},supplierIdList:[],tableData:[],pageNo:1,pageSize:5,pageCount:0,dialogVisible:!1,methodName:""}},created:function(){this.getPage(this.pageNo,this.pageSize)},methods:{everyLevel:function(e){3===e.levelId&&console.log(1)},updateSupplier:function(e){this.methodName="update",this.dialogVisible=!0,this.supplier.supplierName=e.supplierName,this.supplier.supplierEmail=e.supplierEmail,this.supplier.supplierPhone=e.supplierPhone,this.supplier.supplierLeader=e.supplierLeader,this.supplier.supplierAddress=e.supplierAddress,this.supplier.supplierId=e.supplierId,this.supplier.createTime=e.createTime,this.supplier.isDelete=e.isDelete.toString()},submitForm:function(e){var t=this;this.$refs[e].validate((function(e){if(!e)return console.log("error submit!!"),!1;"add"===t.methodName?r.a.post("http://localhost:8080/supplierAdd",JSON.stringify(t.supplier),{headers:{"Content-Type":"application/json"}}).then((function(e){0===e.data.code?(t.getPage(t.pageNo,t.pageSize),t.$message({message:"添加成功",type:"success"})):-1===e.data.code&&t.$message({message:"添加失败",type:"error"})})):"update"===t.methodName&&r.a.post("http://localhost:8080/supplierUpdate",JSON.stringify(t.supplier),{headers:{"Content-Type":"application/json"}}).then((function(e){t.isUpdate=!1,0===e.data.code&&(t.getPage(t.pageNo,t.pageSize),t.$message({message:"更新成功",type:"success"}))})),t.dialogVisible=!1,t.supplier.supplierName="",t.supplier.supplierEmail="",t.supplier.supplierTel="",t.supplier.supplierEmail="",t.supplier.supplierLeader="",t.supplier.supplierId="",t.supplier.createTime="",t.supplier.isDelete="1"}))},addSupplier:function(){this.dialogVisible=!0,this.methodName="add"},handleClose:function(){this.dialogVisible=!1;var e=this;e.supplier.supplierName="",e.supplier.supplierEmail="",e.supplier.supplierTel="",e.supplier.supplierEmail="",e.supplier.supplierLeader="",e.supplier.supplierId="",e.supplier.createTime="",e.supplier.isDelete="1"},deleteSupplier:function(e){this.supplierIdList[0]=e,this.deleteList()},deleteList:function(){var e=this;0===this.supplierIdList.length?this.$message({message:"请选择用户信息",type:"error"}):this.$confirm("将删除供应商信息, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then((function(){for(var t=[],i=e,p=0;p<e.supplierIdList.length;p++)t.push(e.supplierIdList[p].supplierId);e.supplierIdList=[],r.a.post("http://localhost:8080/supplierDelete",JSON.stringify(t),{headers:{"Content-Type":"application/json"}}).then((function(e){i.getPage(i.pageNo,i.pageSize),0===e.data.code&&i.$message({message:"删除成功",type:"success"})}))})).catch((function(){e.supplierIdList=[],e.$message({type:"info",message:"已取消删除"})}))},handleSelectionChange:function(e){this.supplierIdList=e},formatIsDelete:function(e){return 0===e.isDelete?"无效":"有效"},indexMethod:function(e){return e+1},handleCurrentChange:function(e){this.pageNo=e,this.getPage(e,this.pageSize)},pre:function(){this.getPage(this.pageNo-1,this.pageSize),this.pageNo=this.pageNo-1},next:function(){this.getPage(this.pageNo+1,this.pageSize),this.pageNo=this.pageNo+1},getPage:function(e,t){var i=this;r.a.get("http://localhost:8080/supplierList",{params:{pageNo:e,pageSize:t}}).then((function(e){i.tableData=e.data.data.data,i.pageCount=e.data.data.pageCount}))}}},u=a,o=i("2877"),n=Object(o["a"])(u,p,l,!1,null,"56030ebc",null);t["default"]=n.exports},e9c4:function(e,t,i){var p=i("23e7"),l=i("d066"),s=i("d039"),r=l("JSON","stringify"),a=/[\uD800-\uDFFF]/g,u=/^[\uD800-\uDBFF]$/,o=/^[\uDC00-\uDFFF]$/,n=function(e,t,i){var p=i.charAt(t-1),l=i.charAt(t+1);return u.test(e)&&!o.test(l)||o.test(e)&&!u.test(p)?"\\u"+e.charCodeAt(0).toString(16):e},d=s((function(){return'"\\udf06\\ud834"'!==r("\udf06\ud834")||'"\\udead"'!==r("\udead")}));r&&p({target:"JSON",stat:!0,forced:d},{stringify:function(e,t,i){var p=r.apply(null,arguments);return"string"==typeof p?p.replace(a,n):p}})}}]);
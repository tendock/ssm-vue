(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0ddbb6"],{8349:function(e,t,a){"use strict";a.r(t);var r=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("el-form",{ref:"searchForm",staticClass:"demo-form-inline",staticStyle:{"margin-top":"20px","margin-left":"30px"},attrs:{inline:!0,model:e.search}},[a("el-form-item",{attrs:{label:"仓库名称"}},[a("el-select",{attrs:{filterable:"",placeholder:"请选择"},model:{value:e.search.repoName,callback:function(t){e.$set(e.search,"repoName",t)},expression:"search.repoName"}},e._l(e.repoList,(function(e,t){return a("el-option",{key:t,attrs:{label:e.repoName,value:e.repoName}})})),1)],1),a("el-form-item",{attrs:{label:"产品名称"}},[a("el-select",{attrs:{filterable:"",placeholder:"请选择"},model:{value:e.search.productName,callback:function(t){e.$set(e.search,"productName",t)},expression:"search.productName"}},e._l(e.productList,(function(e,t){return a("el-option",{key:t,attrs:{label:e.productName,value:e.productName}})})),1)],1),a("el-button",{attrs:{type:"primary",plain:""},on:{click:function(t){return e.searchStock("searchForm")}}},[e._v("查询")]),a("el-button",{attrs:{type:"info",plain:""},on:{click:e.reset}},[e._v("重置")])],1),a("el-table",{staticStyle:{width:"100%","margin-left":"20px"},attrs:{data:e.tableData,border:""}},[a("el-table-column",{attrs:{type:"index",label:"序号",width:"120",index:e.indexMethod}}),a("el-table-column",{attrs:{prop:"repository.repoName",label:"仓库名称",width:"180"}}),a("el-table-column",{attrs:{prop:"product.productName",label:"产品名称",width:"180"}}),a("el-table-column",{attrs:{prop:"productStock",label:"产品库存",width:"180"}}),a("el-table-column",{attrs:{prop:"createTime",label:"创建时间",width:"180"}}),a("el-table-column",{attrs:{prop:"updateTime",label:"更新时间",width:"180"}}),a("el-table-column",{attrs:{formatter:e.formatIsDelete,label:"是否有效"}})],1),a("div",[a("el-pagination",{staticStyle:{margin:"20px"},attrs:{"page-count":e.pageCount,"current-page":e.pageNo,background:"",layout:"prev, pager, next"},on:{"prev-click":e.pre,"next-click":e.next,"current-change":e.handleCurrentChange}})],1)],1)},o=[],i=(a("ac1f"),a("841c"),a("bc3a")),l=a.n(i),n={name:"ResList",data:function(){return{tableData:[],pageNo:1,pageSize:5,pageCount:0,repoList:[],productList:[],search:{productName:"",repoName:""}}},created:function(){this.getPage(this.pageNo,this.pageSize),this.getRepoList(),this.getProductList()},methods:{reset:function(){this.search.repoName="",this.search.productName=""},searchStock:function(){this.getPage(this.pageNo,this.pageSize),this.search.repoName="",this.search.productName=""},getProductList:function(){var e=this;l.a.get("http://localhost:8080/productAll",{}).then((function(t){e.productList=t.data.data}))},getRepoList:function(){var e=this;l.a.get("http://localhost:8080/repoAll",{}).then((function(t){e.repoList=t.data.data}))},getPage:function(e,t){var a=this;l.a.get("http://localhost:8080/resList",{params:{pageNo:e,pageSize:t,productName:this.search.productName,repoName:this.search.repoName}}).then((function(e){a.tableData=e.data.data.data,a.pageCount=e.data.data.pageCount}))},formatIsDelete:function(e){return 0===e.isDelete?"无效":"有效"},indexMethod:function(e){return e+1},handleCurrentChange:function(e){this.pageNo=e,this.getPage(e,this.pageSize)},pre:function(){this.getPage(this.pageNo-1,this.pageSize),this.pageNo=this.pageNo-1},next:function(){this.getPage(this.pageNo+1,this.pageSize),this.pageNo=this.pageNo+1}}},s=n,c=a("2877"),p=Object(c["a"])(s,r,o,!1,null,"3948c4b5",null);t["default"]=p.exports}}]);
(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0baeae"],{"38f9":function(t,e,a){"use strict";a.r(e);var n=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("el-button",{staticStyle:{"margin-left":"10px","margin-top":"10px","margin-bottom":"10px"},attrs:{type:"danger",plain:""},on:{click:function(e){return t.deleteList()}}},[t._v("删除所有")]),a("el-table",{staticStyle:{width:"100%"},attrs:{data:t.tableData,border:""}},[a("el-table-column",{attrs:{prop:"nickName",label:"用户名称",width:"180"}}),a("el-table-column",{attrs:{prop:"ipAddr",label:"请求地址",width:"180"}}),a("el-table-column",{attrs:{prop:"method",label:"请求方式",width:"180"}}),a("el-table-column",{attrs:{prop:"methodName",label:"请求方法",width:"180"}}),a("el-table-column",{attrs:{prop:"type",label:"日志类型",formatter:t.formatLog,width:"180"}}),a("el-table-column",{attrs:{prop:"createTime",label:"创建时间"}})],1),a("div",[a("el-pagination",{attrs:{"page-count":t.pageCount,"current-page":t.pageNo,background:"",layout:"prev, pager, next"},on:{"prev-click":t.pre,"next-click":t.next,"current-change":t.handleCurrentChange}})],1)],1)},o=[],i=a("bc3a"),l=a.n(i),p={name:"SysLogList",data:function(){return{tableData:[],pageNo:1,pageSize:12,pageCount:0}},created:function(){this.getPage(this.pageNo,this.pageSize)},methods:{deleteList:function(){var t=this;l.a.get("http://localhost:8080/sysLogDelete",{}).then((function(e){t.getPage(t.pageNo,t.pageSize)}))},formatLog:function(t){return 0===t.type?"系统日志":"登录日志"},handleCurrentChange:function(t){this.pageNo=t,this.getPage(t,this.pageSize)},pre:function(){this.getPage(this.pageNo-1,this.pageSize),this.pageNo=this.pageNo-1},next:function(){this.getPage(this.pageNo+1,this.pageSize),this.pageNo=this.pageNo+1},getPage:function(t,e){var a=this;l.a.get("http://localhost:8080/sysLogList",{params:{pageNo:t,pageSize:e}}).then((function(t){a.tableData=t.data.data.data,a.pageCount=t.data.data.pageCount}))}}},r=p,g=a("2877"),s=Object(g["a"])(r,n,o,!1,null,"33175a3d",null);e["default"]=s.exports}}]);
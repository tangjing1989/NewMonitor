<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <meta content="telephone=no" name="format-detection">
    <meta content="email=no" name="format-detection">
    <%@ include file="/WEB-INF/views/include/taglib.jsp"%>
</head>
<body>
<h1 class="page_title">表格</h1>
<h2>系统默认表格</h2>
<div class="codeView docs-example">
    <table>
        <thead>
        <tr>
            <th>表头</th>
            <th>表头</th>
            <th>表头</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        </tbody>
    </table>
</div><pre class="prettyprint linenums">
&lt;table&gt;
  ...
&lt;/table&gt;
</pre>
<h2>.table H-ui默认</h2>
<div class="codeView docs-example">
    <table class="table">
        <thead>
        <tr>
            <th>表头</th>
            <th>表头</th>
            <th>表头</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        </tbody>
    </table>
</div><pre class="prettyprint linenums">
&lt;table class=&quot;table&quot;&gt;
  ...
&lt;/table&gt;
</pre>
<h2>.table-border 带水平线</h2>
<div class="codeView docs-example">
    <table class="table table-border">
        <thead>
        <tr>
            <th>表头</th>
            <th>表头</th>
            <th>表头</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        </tbody>
    </table>
</div><pre class="prettyprint linenums">
&lt;table class=&quot;table table-border&quot;&gt;
  ...
&lt;/table&gt;
</pre>
<h2>.table-bg th带背景</h2>
<div class="codeView docs-example">
    <table class="table table-border table-bg">
        <thead>
        <tr>
            <th>表头</th>
            <th>表头</th>
            <th>表头</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        </tbody>
    </table>
</div><pre class="prettyprint linenums">
&lt;table class=&quot;table table-border table-bg&quot;&gt;
  ...
&lt;/table&gt;
</pre>
<h2>.table-bordered 带外边框</h2>
<div class="codeView docs-example">
    <table class="table table-border table-bordered">
        <thead>
        <tr>
            <th>表头</th>
            <th>表头</th>
            <th>表头</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        </tbody>
    </table>
</div><pre class="prettyprint linenums">
&lt;table class=&quot;table table-border table-bordered&quot;&gt;
  ...
&lt;/table&gt;</pre>
<h2>.radius 圆角</h2>
<div class="codeView docs-example">
    <table class="table table-border table-bordered radius">
        <thead>
        <tr>
            <th>表头</th>
            <th>表头</th>
            <th>表头</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        </tbody>
    </table>
</div><pre class="prettyprint linenums">
&lt;table class=&quot;table table-border table-bordered radius&quot;&gt;
  ...
&lt;/table&gt;</pre>
<h2>.table-striped 奇数行背景设为浅灰色</h2>
<div class="codeView docs-example">
    <table class="table table-border table-bordered table-striped">
        <thead>
        <tr>
            <th>表头</th>
            <th>表头</th>
            <th>表头</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        </tbody>
    </table>
</div><pre class="prettyprint linenums">
&lt;table class=&quot;table table-border table-bordered table-striped&quot;&gt;
  ...
&lt;/table&gt;</pre>
<h2>.table-hover 鼠标悬停样式</h2>
<div class="codeView docs-example">
    <table class="table table-border table-bordered table-hover">
        <thead>
        <tr>
            <th>表头</th>
            <th>表头</th>
            <th>表头</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        <tr>
            <th>类别</th>
            <td>表格内容</td>
            <td>表格内容</td>
        </tr>
        </tbody>
    </table>
</div><pre class="prettyprint linenums">&lt;table class=&quot;table table-border table-bordered table-hover&quot;&gt;
  ...
&lt;/table&gt;</pre>
<h2>定义颜色</h2>
<div class="codeView docs-example">
    <table class="table table-border table-bg table-bordered">
        <thead>
        <tr>
            <th width="20%">Class</th>
            <th>描述</th>
        </tr>
        </thead>
        <tbody>
        <tr class="active">
            <th>.active</th>
            <td>悬停在行</td>
        </tr>
        <tr class="success">
            <th>.success</th>
            <td>成功或积极</td>
        </tr>
        <tr class="warning">
            <th>.warning</th>
            <td>警告或出错</td>
        </tr>
        <tr class="danger">
            <th>.danger</th>
            <td>危险</td>
        </tr>
        </tbody>
    </table>
</div><pre class="prettyprint linenums">
&lt;table class=&quot;table table-border table-bg table-bordered&quot;&gt;
  &lt;thead&gt;
    &lt;tr&gt;&lt;th width=&quot;20%&quot;&gt;Class&lt;/th&gt;&lt;th&gt;描述&lt;/th&gt;&lt;/tr&gt;
  &lt;/thead&gt;
  &lt;tbody&gt;
    &lt;tr class=&quot;active&quot;&gt;&lt;th&gt;.active&lt;/th&gt;&lt;td&gt;悬停在行&lt;/td&gt;&lt;/tr&gt;
    &lt;tr class=&quot;success&quot;&gt;&lt;th&gt;.success&lt;/th&gt;&lt;td&gt;成功或积极&lt;/td&gt;&lt;/tr&gt;
    &lt;tr class=&quot;warning&quot;&gt;&lt;th&gt;.warning&lt;/th&gt;&lt;td&gt;警告或出错&lt;/td&gt;&lt;/tr&gt;
    &lt;tr class=&quot;danger&quot;&gt;&lt;th&gt;.danger&lt;/th&gt;&lt;td&gt;危险&lt;/td&gt;&lt;/tr&gt;
  &lt;/tbody&gt;
&lt;/table&gt;</pre>
<h2>对齐方式</h2>
<div class="codeView docs-example">
    <table class="table table-border table-bordered">
        <thead class="text-c">
        <tr>
            <th>对齐方式</th>
            <th>类名</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>居左</td>
            <td>默认</td>
        </tr>
        <tr class="text-c">
            <td>居中</td>
            <td>.text-c</td>
        </tr>
        <tr class="text-r">
            <td>居右</td>
            <td>.text-r</td>
        </tr>
        </tbody>
    </table>
</div><pre class="prettyprint linenums">&lt;table class=&quot;table table-border table-bordered&quot;&gt;
  &lt;thead class=&quot;text-c&quot;&gt;
    &lt;tr&gt;
      &lt;th&gt;对齐方式&lt;/th&gt;
      &lt;th&gt;类名&lt;/th&gt;
    &lt;/tr&gt;
  &lt;/thead&gt;
  &lt;tbody&gt;
    &lt;tr&gt;
      &lt;td&gt;居左&lt;/td&gt;
      &lt;td&gt;默认&lt;/td&gt;
    &lt;/tr&gt;
    &lt;tr class=&quot;text-c&quot;&gt;
      &lt;td&gt;居中&lt;/td&gt;
      &lt;td&gt;.text-c&lt;/td&gt;
    &lt;/tr&gt;
    &lt;tr class=&quot;text-r&quot;&gt;
      &lt;td&gt;居右&lt;/td&gt;
      &lt;td&gt;.text-r&lt;/td&gt;
    &lt;/tr&gt;
  &lt;/tbody&gt;
&lt;/table&gt;</pre>
<p>友情提示：可以给tr整行加，也可以单独给td 或者th 设置</p>
<h3>CSS代码</h3><pre class="prettyprint linenums">
/*默认table*/
table{width:100%;empty-cells:show;background-color:transparent;border-collapse:collapse;border-spacing:0}
table th{text-align:left; font-weight:400}
/*带水平线*/
.table th{font-weight:bold}
.table th,.table td{padding:8px;line-height:20px}
.table td{text-align:left}
.table tbody tr.success > td{background-color:#dff0d8}
.table tbody tr.error > td{background-color:#f2dede}
.table tbody tr.warning > td{background-color:#fcf8e3}
.table tbody tr.info > td{background-color:#d9edf7}
.table tbody + tbody{border-top:2px solid #ddd}
.table .table{background-color:#fff}

/*带横向分割线*/
.table-border{border-top:1px solid #ddd}
.table-border th,.table-border td{border-bottom:1px solid #ddd}

/*th带背景*/
.table-bg thead th{background-color:#F5FAFE}
/*带外边框*/
.table-bordered{border:1px solid #ddd;border-collapse:separate;*border-collapse:collapse;border-left:0}
.table-bordered th,.table-bordered td{border-left:1px solid #ddd}
.table-border.table-bordered{border-bottom:0}

/*奇数行背景设为浅灰色*/
.table-striped tbody > tr:nth-child(odd) > td,.table-striped tbody > tr:nth-child(odd) > th{background-color:#f9f9f9}
/*竖直方向padding缩减一半*/
.table-condensed th,.table-condensed td{padding:4px 5px}
/*鼠标悬停样式*/
.table-hover tbody tr:hover td,.table-hover tbody tr:hover th{background-color: #f5f5f5}
/*定义颜色*/
/*悬停在行*/
.table tbody tr.active,.table tbody tr.active>td,.table tbody tr.active>th,.table tbody tr .active{background-color:#F5F5F5!important}
/*成功或积极*/
.table tbody tr.success,.table tbody tr.success>td,.table tbody tr.success>th,.table tbody tr .success{background-color:#DFF0D8!important}

/*警告或出错*/
.table tbody tr.warning,.table tbody tr.warning>td,.table tbody tr.warning>th,.table tbody tr .warning{background-color:#FCF8E3!important}
/*危险*/
.table tbody tr.danger,.table tbody tr.danger>td,.table tbody tr.danger>th,.table tbody tr .danger{background-color:#F2DEDE!important}

/*表格文字对齐方式，默认是居左对齐*/
.table .text-c th,.table .text-c td{text-align:center}/*整行居中*/
.table .text-r th,.table .text-r td{text-align:right}/*整行居右*/
.table th.text-l,.table td.text-l{text-align:left!important}/*单独列居左*/
.table th.text-c,.table td.text-c{text-align:center!important}/*单独列居中*/
.table th.text-r,.table td.text-r{text-align:right!important}/*单独列居右*/</pre>

</body>
</html>
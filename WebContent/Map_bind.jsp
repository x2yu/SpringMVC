<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
 
<form action="addMapProduct">
<table>
<thead>
<tr>
<th>产品名称</th>
<th>产品价格</th>
<th>产品分类</th>
</tr>
</thead>
<tfoot>
<tr>
<td colspan="2"><input type="submit" value="Save" /></td>
</tr>
</tfoot>
<tbody>
<tr>
<td><input name="products['x'].name" value="aaa" /></td>
<td><input name="products['x'].price" value="111" /></td>
<td><input name="products['x'].category.cname" value="bbb" /></td>
</tr>
<tr>
<td><input name="products['y'].name" value="ccc" /></td>
<td><input name="products['y'].price" value="222" /></td>
<td><input name="products['y'].category.cname" value="bbb" /></td>
</tr>
<tr>
<td><input name="products['z'].name" value="eee" /></td>
<td><input name="products['z'].price" value="333" /></td>
<td><input name="products['z'].category.cname" value="bbb" /></td>
</tr>
</tbody>
</table>
</form>
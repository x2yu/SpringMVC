<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false"%>
 
<form action="addListProducts">
 
    产品名称 ：<input type="text" name="products[0].name" value=""><br />
    产品价格： <input type="text" name="products[0].price" value=""><br />
    产品分类： <input type="text" name="products[0].category.cname" value=""><br />
    
    产品名称 ：<input type="text" name="products[1].name" value=""><br />
    产品价格： <input type="text" name="products[1].price" value=""><br />
    产品分类： <input type="text" name="products[1].category.cname" value=""><br />
    
    产品名称 ：<input type="text" name="products[2].name" value=""><br />
    产品价格： <input type="text" name="products[2].price" value=""><br />
    产品分类： <input type="text" name="products[2].category.cname" value=""><br />
    
   产品名称 ：<input type="text" name="products[3].name" value=""><br />
    产品价格： <input type="text" name="products[3].price" value=""><br />
    产品分类： <input type="text" name="products[3].category.cname" value=""><br />
    
    <input type="submit" value="提交商品">
</form>
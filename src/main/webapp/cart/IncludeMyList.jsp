<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
	
	<script type="text/javascript">
		
	</script>

  <p>
   宠物的最爱
    <br/>
     为您推荐的宠物在这里
  </p>
  <ul>
  	

   <s:iterator value="productlist" var="product">
   		<li><a href="queryItemAction?product.productid=<s:property value="#product.productid"/>"/><s:property value="#product.name"/></a>&nbsp;&nbsp;(<s:property value="#product.productid"/>)</li>
   </s:iterator>
  </ul>

  <p>
   
     <!--  <a href="javascript:void(0)" class="Button">&lt;&lt;上一页</a>
  
    
        <a href="javascript:void(0)" class="Button">下一页 &gt;&gt;</a>
   -->
  </p>





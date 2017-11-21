<jsp:include page="headerContext.jsp"></jsp:include>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page import="com.*" %>
<%@ page import="java.sql.*" %>
    <div id="all">

        <div id="content">
            <div class="container">

                <div class="col-md-12">
                    <ul class="breadcrumb">
                        <li><a href="#">Home</a>
                        </li>
                        <li>Shopping cart</li>
                    </ul>
                </div>
 <style>
.hidden {
    display: none;
}
</style> 
                <div class="col-md-9" id="basket">

                    <div class="box">
<% 
            String username=(String)session.getAttribute("username");
            Class.forName("org.h2.Driver");
            Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/medioxy1","sa","");       
            
            String sql="select * from Details where username=?";
           	PreparedStatement ps=con.prepareStatement(sql);
           	ps.setString(1, username);
            ResultSet rs=ps.executeQuery();
%>                    
                      
                       
<form action="<%=request.getContextPath()%>/basket/${username}" method="post" onsubmit=" return validation()">
                            <h1>Shopping cart</h1>
                            <p class="text-muted">You currently have 3 item(s) in your cart.</p>
                            <div class="table-responsive">
                                <table class="table" id="mytable" name="table">
                                    <thead>
                                        <tr>
                                            <th>Product Id</th>
                                            <th>Product Name</th>
                                            <th>Image</th>
                                            <th>Quantity</th>
                                            <th>Unit price</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>
                                <c:forEach items="${detailList}" var="detail">
                                        
                                    <tbody>
                                    
                                    <% while(rs.next())
                                                
                                                
                                                { 
                                               
                                                %>
                                        
                                        <tr>
                                        
                                            <td><input type="hidden" class="form-control" name="proId" value="${detail.proId}"><%=rs.getInt("proId") %></td>
                                            <td><input type="hidden" class="form-control" name="proName" value="${detail.proName}"><%=rs.getString("proName") %></td>
                                                
                                            
                                            <td><img src="<%=request.getContextPath()%>/assets/img/<%=rs.getString("proId") %>.jpg" width="80px" height="80px"/></td>                              
                                            
                                            
                                            <td><input type="number" class="form-control" name="quantity" id="qty" min="1"></td>
                                                
                                            
                                            <td><input type="hidden" class="form-control" name="proPrice" value="${detail.proPrice}">Rs <%=rs.getInt("proPrice") %></td>
                                            
                                            
                                                
                                            
                                            <td>
                                               <a href="<c:url value="deleteDetails/${detail.id}"/>">Delete</a>
                                            </td>
                                        </tr>
                                        <%} %>
                                    </tbody>
                                    
                                 </c:forEach>   
                                    <!-- <tfoot>
                                        <tr>
                                            <th colspan="5">Total</th>
                                            <th colspan="2">$446.00</th>
                                        </tr>
                                    </tfoot> -->
                                </table>

                            </div>
                            <!-- /.table-responsive -->

                            <div class="box-footer">
                                <div class="pull-left">
                                    <a href="<%=request.getContextPath()%>/" class="btn btn-default"><i class="fa fa-chevron-left"></i> Continue shopping</a>
                                </div>
                                <div class="pull-right">
                                    <input type="reset" class="btn btn-default" value="Update Basket"><i class="fa fa-chevron-right"></i>
                                    
                                    <input type="submit" class="btn btn-primary" value="Proceed to checkout"><i class="fa fa-chevron-right"></i>
                                    
                                </div>
                            </div>

                        </form>

                    </div>
                    <!-- /.box -->


                    
<br>

                </div>
                <!-- /.col-md-9 -->

                <div class="col-md-3">
                    


                    <div class="box">
                        <div class="box-header">
                            <h4>Coupon code</h4>
                        </div>
                        <p class="text-muted">If you have a coupon code, please enter it in the box below.</p>
                        <form>
                            <div class="input-group">

                                <input type="text" class="form-control">

                                <span class="input-group-btn">

					<button class="btn btn-primary" type="button"><i class="fa fa-gift"></i></button>

				    </span>
                            </div>
                            <!-- /input-group -->
                        </form>
                    </div>

                </div>
                <!-- /.col-md-3 -->

            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->


</div>

<script>
 function validation() {
     var qty=document.getElementById('qty').value;
     
     if(qty < 0) {
         alert("Please enter quantity");
         return false;
     }
     else
    	 {
    	   return true;
    	 }
 }
</script>


<jsp:include page="footerContext.jsp"></jsp:include>
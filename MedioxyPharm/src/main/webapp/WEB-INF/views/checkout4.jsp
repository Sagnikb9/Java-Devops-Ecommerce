<jsp:include page="headerContext.jsp"></jsp:include>
<%@ page import="com.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.*" %>
<%@ page import="java.util.*" %>
<%@ page import="javax.servlet.*" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 <style>
.hidden {
    display: none;
}
</style> 
    <div id="all">

        <div id="content">
            <div class="container">

                <div class="col-md-12">
                    <ul class="breadcrumb">
                        <li><a href="#">Home</a>
                        </li>
                        <li>Checkout - Order review</li>
                    </ul>
                </div>

                <div class="col-md-9" id="checkout">

                    <div class="box">
 <form method="post" action="<%=request.getContextPath() %>/checkout4/${username}">                      
                            <h1>Checkout - Order review</h1>
                            <ul class="nav nav-pills nav-justified">
                                <li><a href="#"><i class="fa fa-map-marker"></i><br>Address</a>
                                </li>
                                <li><a href="#"><i class="fa fa-truck"></i><br>Delivery Method</a>
                                </li>
                                <li><a href="#"><i class="fa fa-money"></i><br>Payment Method</a>
                                </li>
                                <li class="active"><a href="#"><i class="fa fa-eye"></i><br>Order Review</a>
                                </li>
                            </ul>


                            <div class="content">
                                <div class="table-responsive">
                                    <table class="table">
        <% 
            
            Class.forName("org.h2.Driver");
            Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/medioxy1","sa","");       
            Statement statement = con.createStatement();
            ResultSet resultset = statement.executeQuery("select * from Basket order by id desc limit 1 ");
           	
            
         
        %>
                                        <thead>
                                            <tr>
                                                <th>Product ID</th>
                                                <th>Product Name</th>
                                                <th>Quantity</th>
                                                <th>Product price</th>
                                                
                                                <th>Total</th>
                                            </tr>
                                        </thead>
                                 
                                      <tbody>
                                            <tr>
                                                <!-- <td>
                                                    <a href="#">
                                                        <img src="img/detailsquare.jpg" alt="White Blouse Armani">
                                                    </a>
                                                </td> -->
                                                <% while(resultset.next())
                                                
                                                
                                                { 
                                               
                                                %>
                                                
                                                
                                                
                                                <td><input type="hidden" class="form-control" name="proId" id="quantity"value="<%=resultset.getString("proId") %>"><%=resultset.getString("proId") %>
                                                </td>
                                                <td><input type="hidden" class="form-control" name="proName" id="" value="<%=resultset.getString("proName") %>"><%=resultset.getString("proName") %>
                                                </td>
                                                <td><input type="hidden" class="form-control" name="quantity" id="quantity" value="<%=resultset.getString("quantity") %>"><%=resultset.getString("quantity") %></td>
                                                <td><input type="hidden" class="form-control" name="proPrice" id="" value="Rs: <%=resultset.getString("proPrice") %>">Rs: <%=resultset.getString("proPrice") %></td>
                                                
                                              
          <%
                   
                   String qtyStr = resultset.getString("quantity");
                   String priceStr = resultset.getString("proPrice");

                   String[] qtyArr = qtyStr.split(",");
                   String[] priceArr = priceStr.split(",");

                   String[] tempArr = new String[qtyArr.length];

                   String total1=null;
                   int sum=0;
                   for(int i = 0; i < qtyArr.length; i++){
                   	tempArr[i] = String.valueOf(Integer.parseInt(qtyArr[i]) * Integer.parseInt(priceArr[i]));
                   	sum+=Integer.parseInt(tempArr[i]);
                   	total1=String.valueOf(sum);
                   }
                   
                   
                   
                   
                   
                   %>  
                   
  <td><input type="hidden" class="form-control" name="total" id="" value="">Rs:<%=total1%></td>
  

    

                      
  <% } %>                                           
   
                                               
                                          
                                            </tr>
           
                                        </tbody>
                                        
                                        <tfoot>
                                            <!-- <tr>
                                                <th colspan="5">Total</th>
                                                <th>$446.00</th>
                                            </tr> -->
                                        </tfoot>
                                    </table>

                                </div>
                                <!-- /.table-responsive -->
                            </div>
                            <!-- /.content -->

                            <div class="box-footer">
                                <%-- <div class="pull-left">
                                    <a href="<c:url value="/basket/${username}"/>" class="btn btn-default"><i class="fa fa-chevron-left"></i>Back to Basket</a>
                                </div> --%>
                                <div class="pull-right">
                                    <input type="submit" class="btn btn-primary" value="Place an order"><i class="fa fa-chevron-right"></i>
                                    
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- /.box -->
</div>

                </div>
                <!-- /.col-md-9 -->

               
                <!-- /.col-md-3 -->

            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->


<jsp:include page="footerContext.jsp"></jsp:include>
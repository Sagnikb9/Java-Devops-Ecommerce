<jsp:include page="headerContext.jsp"></jsp:include>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.*"%>
    <div id="all">

        <div id="content">
            <div class="container">

                <div class="col-md-12">
                    <ul class="breadcrumb">
                        <li><a href="#">Home</a>
                        </li>
                        <li>Checkout - Delivery method</li>
                    </ul>
                </div>

                <div class="col-md-9" id="checkout">

                    <div class="box">
                        <form method="post" action="<%=request.getContextPath() %>/checkout2/${username}" onsubmit="return validate()">
                            <h1>Checkout - Delivery method</h1>
                            <ul class="nav nav-pills nav-justified">
                                <li><a href="#"><i class="fa fa-map-marker"></i><br>Address</a>
                                </li>
                                <li class="active"><a href="#"><i class="fa fa-truck"></i><br>Delivery Method</a>
                                </li>
                                <li class="disabled"><a href="#"><i class="fa fa-money"></i><br>Payment Method</a>
                                </li>
                                <li class="disabled"><a href="#"><i class="fa fa-eye"></i><br>Order Review</a>
                                </li>
                            </ul>

                            <div class="content">
                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="box shipping-method">

                                            <h4>Normal Delivery</h4>

                                            <p>Delivery as per company standard.</p>

                                            <div class="box-footer text-center">

                                                <input id="one" type="radio" name="delivery" value="Normal Delivery">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="box shipping-method">

                                            <h4>Fast Delivery</h4>

                                            <p>Fastest option possible.</p>

                                            <div class="box-footer text-center">
                                            
                                                <input id="two" type="radio" name="delivery" value="Fast Delivery">
                                            </div>
                                        </div>
                                    </div>

                                                                    </div>
                                <!-- /.row -->

                            </div>
                            <!-- /.content -->

                            <div class="box-footer">
                                <div class="pull-left">
                                    <a href="<c:url value="/basket/${username}"/>" class="btn btn-default"><i class="fa fa-chevron-left"></i>Back to Basket</a>
                                </div>
                                <div class="pull-right">
                                    <input type="submit" class="btn btn-primary" value="Continue to Payment Method"><i class="fa fa-chevron-right"></i>
                                    
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- /.box -->


                </div>
                <!-- /.col-md-9 -->

                
                <!-- /.col-md-3 -->

            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->
<br>
        <jsp:include page="footerContext.jsp"></jsp:include>
        
        <script>
        function validate()
        {
        var o = document.getElementById('one');
        var t = document.getElementById('two');

        if ( (o.checked == false ) && (t.checked == false ) )
        {
        alert ( "please check radio button" );
        
        return false;
        }
        } 
        
        </script>
<jsp:include page="headerContext.jsp"></jsp:include>

<%@page import="com.*" %>

<form action="<%=request.getContextPath()%>/details/${username}" method="POST" enctype="multipart/form-data">
    <div id="all">

        <div id="content">
            <div class="container">

                <div class="col-md-12">
                    <ul class="breadcrumb">
                        <li><a href="#"><span style="color:#114dff">Home</span></a>
                        </li>
                        <li><a href="#"><span style="color:#114dff">${product.proCatg}</span></a>
                        </li>
                        
                        <li>${product.proName}</li>
                    </ul>

                </div>

 <style>
.hidden {
    display: none;
}
</style>            

                <div class="col-md-12">

                    <div class="row" id="productMain">
                        <div class="col-sm-6">
                            <div id="">
                                <input type="file" src="<%=request.getContextPath()%>/assets/img/${product.proId}.jpg" name="file" class="hidden"><img src="<%=request.getContextPath()%>/assets/img/${product.proId}.jpg" alt="" class="img-responsive1">
                            </div>

                            
                            <!-- /.ribbon -->

                        </div>
 <style>
   .box1 {
  background: #fff;
  
  margin: 0 0 0 0;
  height: 400px;
  border: solid 1px #e6e6e6;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  padding: 20px;
  -webkit-box-shadow: 0 1px 5px rgba(0, 0, 0, 0.1);
  box-shadow: 0 1px 5px rgba(0, 0, 0, 0.1);
}
</style>                          
                        <div class="col-sm-6">
                            <div class="box1">
                                <h1 class="text-center"><span style="color:#30d4ff"><input type="hidden" value="${product.proName}" name="proName"/>${product.proName}</span></h1>
                                <p class="goToDescription"><a href="#details" class="scroll-to"><span style="color:#114dff">Scroll to product details</span></a>
                                </p>
                                <p class="price"><span style="color:#ff3048"><input type="hidden" value="${product.proPrice}" name="proPrice">Rs ${product.proPrice}</span></p>

                                <p class="text-center buttons">
                                   <input type="submit" class="btn btn-primary" value="Add to cart">
                                    <a href="<%=request.getContextPath()%>/basket" class="btn btn-default"><i class="fa fa-heart"></i> Add to wishlist</a>
                                </p>


                            </div>

                            <%-- <div class="row" id="thumbs">
                                <div class="col-xs-4">
                                    <a href="<%=request.getContextPath()%>/assets/img/${product.proId}.jpg" class="thumb">
                                        <img src="<%=request.getContextPath()%>/assets/img/${product.proId}.jpg" alt="" class="img-responsive">
                                    </a>
                                </div>
                                <div class="col-xs-4">
                                    <a href="<%=request.getContextPath()%>/assets/img/${product.proId}.jpg" class="thumb">
                                        <img src="<%=request.getContextPath()%>/assets/img/${product.proId}.jpg" alt="" class="img-responsive">
                                    </a>
                                </div>
                                <div class="col-xs-4">
                                    <a href="<%=request.getContextPath()%>/assets/img/${product.proId}.jpg" class="thumb">
                                        <img src="<%=request.getContextPath()%>/assets/img/${product.proId}.jpg" alt="" class="img-responsive">
                                    </a>
                                </div>
                            </div> --%>
                        </div>

                    </div>


<style>
.img-responsive1 {
    display: block;
    width: 100% \9;
    max-width: 100%;
    height: 400px;
}

</style>



                    <div class="box" id="details">
                        <p>
                            <h4><span style="color:#196487">Product Details</span></h4>
                            <h4>${product.proDesp}</h4>
                            
                            <h4><span style="color:#196487">Product Supplier</span></h4>
                            <h4>${product.proSupp}</h4>
                            
                            <h4><span style="color:#196487">Product Stock</span></h4>
                            <h4>${product.proStock}</h4>
                            
                            <h4><span style="color:#196487">Product Id</span></h4>
                            <h4><input type="hidden" value="${product.proId}" name="proId">${product.proId}</h4>
                            
                            <hr>
                            <div class="social">
                                <h4><span style="color:#196487">Show it to your friends</span></h4>
                                <p>
                                    <a href="#" class="external facebook" data-animate-hover="pulse"><i class="fa fa-facebook"></i></a>
                                    <a href="#" class="external gplus" data-animate-hover="pulse"><i class="fa fa-google-plus"></i></a>
                                    <a href="#" class="external twitter" data-animate-hover="pulse"><i class="fa fa-twitter"></i></a>
                                    <a href="#" class="email" data-animate-hover="pulse"><i class="fa fa-envelope"></i></a>
                                    
                                </p>
                            </div>
                    </div>

                    </div>

                </div>
                <!-- /.col-md-9 -->
            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->

</form>

<jsp:include page="footerContext.jsp"></jsp:include> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.*" %>
<jsp:include page="header.jsp"></jsp:include>




    <div id="all">

        <div id="content">

            <div class="container">
                <div class="col-md-12">
                    <div id="main-slider">
                        <div class="item">
                            <img src="img/img2.jpg" alt="" class="img-responsive">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="img/img1.jpg" alt="">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="img/img4.jpg" alt="">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="img/img3.jpg" alt="">
                        </div>
                    </div>
                    <!-- /#main-slider -->
                </div>
            </div>

            <!-- *** ADVANTAGES HOMEPAGE ***
 _________________________________________________________ -->
            <div id="advantages">

                <div class="container">
                    <div class="same-height-row">
                        <div class="col-sm-4">
                            <div class="box same-height clickable">
                                <div class="icon"><i class="fa fa-heart"></i>
                                </div>

                                <h3><a href="#">We love our customers</a></h3>
                                <p>We are known to provide best possible service ever</p>
                            </div>
                        </div>

                        <div class="col-sm-4">
                            <div class="box same-height clickable">
                                <div class="icon"><i class="fa fa-tags"></i>
                                </div>

                                <h3><a href="#">Best prices</a></h3>
                                <p>We provide products to our customers at best price.</p>
                            </div>
                        </div>

                        <div class="col-sm-4">
                            <div class="box same-height clickable">
                                <div class="icon"><i class="fa fa-thumbs-up"></i>
                                </div>

                                <h3><a href="#">100% satisfaction guaranteed</a></h3>
                                <p>Free returns on everything for 3 months.</p>
                            </div>
                        </div>
                    </div>
                    <!-- /.row -->

                </div>
                <!-- /.container -->

            </div>
            <!-- /#advantages -->

            <!-- *** ADVANTAGES END *** -->

            <!-- *** HOT PRODUCT SLIDESHOW ***
 _________________________________________________________ -->
 
 <br>
            <div id="hot">

                <div class="box">
                    <div class="container">
                        <div class="col-md-12">
                            <h2>Top Selling Products</h2>
                             
                        </div>
                    </div>
                </div>
                <br>

<style>
 .img-responsive1{
    display: block;
    width: 100% \9;
    max-width: 100%;
    height: 200px;
}



</style>

 
 
              
                  
                    <div class="product-slider">
                    <c:forEach items="${productList}" var="product">
                        <div class="item">
                            <div class="product">
                                <div class="flip-container">
                                    <div class="flipper">
                                        <div class="">
                                            <a href="<c:url value="details/${product.proId}"/>">
                                                <img src="assets/img/${product.proId}.jpg" alt="" class="img-responsive1">
                                            </a>
                                            <div class="text">
                                                <h3><a href="<c:url value="details/${product.proId}"/>"><span style="color:#30d4ff">${product.proName}</span></a></h3>
                                                <p class="price"><span style="color:#ff3048">Rs ${product.proPrice}</span></p>
                                            </div>
                                        </div>
                                        
                                    </div>
                                </div>                                    
                                
                                
                                <!-- /.text -->
                            </div>
                            <!-- /.product -->
                        </div>
                        </c:forEach>
                    </div>                   
                                     
                </div>
                <!-- /.container -->

            
            <!-- /#hot -->

            <!-- *** HOT END *** -->

            <!-- *** GET INSPIRED ***
 _________________________________________________________ -->
            <div class="container" data-animate="fadeInUpBig">
                <div class="col-md-12">
                    <div class="box slideshow">
                        <h3><span style:"color=blue">Our World Class Medicines</span></h3>
                        
                        <div id="get-inspired" class="owl-carousel owl-theme">
                            <div class="item">
                                <a href="#">
                                    <img src="img/med1.jpeg" alt="Get inspired" class="img-responsive">
                                </a>
                            </div>
                            <div class="item">
                                <a href="#">
                                    <img src="img/med4.jpeg" alt="Get inspired" class="img-responsive">
                                </a>
                            </div>
                            <div class="item">
                                <a href="#">
                                    <img src="img/med2.jpeg" alt="Get inspired" class="img-responsive">
                                </a>
                            </div>
                            <div class="item">
                                <a href="#">
                                    <img src="img/med3.jpeg" alt="Get inspired" class="img-responsive">
                                </a>
                            </div>
                            <div class="item">
                                <a href="#">
                                    <img src="img/med5.jpeg" alt="Get inspired" class="img-responsive">
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- *** GET INSPIRED END *** -->

            <!-- *** BLOG HOMEPAGE ***
 _________________________________________________________ -->

            <br>

            <div class="container">

                <div class="col-md-12" data-animate="fadeInUp">

                    <div id="blog-homepage" class="row">
                        <div class="col-sm-6">
                            <div class="post">
                                <h4><a href="post.html">Shop now</a></h4>
                                <p class="author-category">By <a href="#">John Slim</a> in <a href="">Fashion and style</a>
                                </p>
                                <hr>
                                <p class="intro">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean
                                    ultricies mi vitae est. Mauris placerat eleifend leo.</p>
                                <p class="read-more"><a href="post.html" class="btn btn-primary">Continue reading</a>
                                </p>
                            </div>
                        </div>

                        <div class="col-sm-6">
                            <div class="post">
                                <h4><a href="post.html">Best Medicine</a></h4>
                                <p class="author-category">By <a href="#">John Slim</a> in <a href="">About Minimal</a>
                                </p>
                                <hr>
                                <p class="intro">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean
                                    ultricies mi vitae est. Mauris placerat eleifend leo.</p>
                                <p class="read-more"><a href="post.html" class="btn btn-primary">Continue reading</a>
                                </p>
                            </div>

                        </div>

                    </div>
                    <!-- /#blog-homepage -->
                </div>
            </div>
            <!-- /.container -->

            <!-- *** BLOG HOMEPAGE END *** -->


        </div>
        <!-- /#content -->

<jsp:include page="footer.jsp"></jsp:include>
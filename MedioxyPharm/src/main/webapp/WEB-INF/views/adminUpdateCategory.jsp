<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix="c" %> --%>
<%@ page import = "com.*"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="icon" type="image/png" href="<%=request.getContextPath()%>/assets/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Admin Panel-MedioxyPharm</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


    <!-- Bootstrap core CSS     -->
    <link href="<%=request.getContextPath()%>/assets/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Animation library for notifications   -->
    <link href="<%=request.getContextPath()%>/assets/css/animate.min.css" rel="stylesheet"/>

    <!--  Light Bootstrap Table core CSS    -->
    <link href="<%=request.getContextPath()%>/assets/css/light-bootstrap-dashboard.css" rel="stylesheet"/>


    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="<%=request.getContextPath()%>/assets/css/demo.css" rel="stylesheet" />


    <!--     Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>
    <link href="<%=request.getContextPath()%>/assets/css/pe-icon-7-stroke.css" rel="stylesheet" />

</head>
<body>

<center>  
       <h2><span style="color:#a442f4">Update Category</span></h2>
</center>

<script type="text/javascript" src='<%=request.getContextPath()%>/tinymce/js/tinymce/jquery.tinymce.min.js'></script>
<script type="text/javascript" src='<%=request.getContextPath()%>/tinymce/js/tinymce/tinymce.js'></script>
<script type="text/javascript" src='<%=request.getContextPath()%>/tinymce/js/tinymce/tinymce.min.js'></script>
<script type="text/javascript" src='<%=request.getContextPath()%>/tinymce\src\plugins\autoresize\src\main\js\Plugin.js'></script>
  <script type="text/javascript">
  tinymce.init({
    selector: '#myTextarea2',
    theme: 'modern',
    //width: 600,
    //height: 200,
    plugins: "autoresize",
    
    plugins: [
      'advlist anchor autolink link image lists charmap print preview hr anchor pagebreak spellchecker',
      'searchreplace wordcount visualblocks visualchars code fullscreen fullpage colorpicker insertdatetime media nonbreaking',
      'save table contextmenu directionality emoticons template paste textcolor textpattern imagetools'
    ],
    content_css: 'css/content.css',
    toolbar: 'insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image | print preview media fullpage | forecolor backcolor emoticons'
  });
</script> 


        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                
                            </div>
                            <div class="content">
                                <form action="<%=request.getContextPath()%>/adminUpdateCategory/${category.catgId}" id="category" method="POST">
                                    <div class="">
                                        
                                        
                                        

                                    <div class="row">
                                        <div class="col-md-2">
                                            <div class="form-group">
                                                <label>Category ID</label>
                                                <div class="form-control" placeholder="" name="catgId" value="${category.catgId}">${category.catgId}</div>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <label>Category Name</label>
                                                <input type="text" class="form-control" placeholder="" name="catgName" value="${category.catgName}"/>
                                            </div>
                                        </div>
                                        <div class="col-md-7">
                                            <div class="form-group">
                                                <label>Category Description</label>
                                                <textarea id="myTextarea2" class="form-control" placeholder="" name="catgDesp">${category.catgDesp}</textarea>
                                            </div>
                                        </div>
                                    </div>

                                    
                                        </div>
                                    </div>

                                    

                                    <input type="submit" class="btn btn-info btn-fill pull-right" value="Update Category"/>
                                    <div class="clearfix"></div>
                                </form>
                            </div>
                        </div>
                    </div>
                    

                </div>
            </div>
        





    </div>
</div>


</body>

    <!--   Core JS Files   -->
    <script src="<%=request.getContextPath()%>/assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>

	<!--  Checkbox, Radio & Switch Plugins -->
	<script src="<%=request.getContextPath()%>/assets/js/bootstrap-checkbox-radio-switch.js"></script>

	<!--  Charts Plugin -->
	<script src="<%=request.getContextPath()%>/assets/js/chartist.min.js"></script>

    <!--  Notifications Plugin    -->
    <script src="<%=request.getContextPath()%>/assets/js/bootstrap-notify.js"></script>

    <!--  Google Maps Plugin    -->
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>

    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->
	<script src="<%=request.getContextPath()%>/assets/js/light-bootstrap-dashboard.js"></script>

	<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->
	<script src="<%=request.getContextPath()%>/assets/js/demo.js"></script>

	<script type="text/javascript">
	
	</script>

</html>

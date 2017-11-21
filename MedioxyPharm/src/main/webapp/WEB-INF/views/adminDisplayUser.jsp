<jsp:include page="adminHeader.jsp"></jsp:include>
<jsp:include page="adminSidebar.jsp"></jsp:include>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<center>  
       <h2><span style="color:#a442f4">Display User</span></h2>
</center>

<script type="text/javascript" src='tinymce/js/tinymce/jquery.tinymce.min.js'></script>
<script type="text/javascript" src='tinymce/js/tinymce/tinymce.js'></script>
<script type="text/javascript" src='tinymce/js/tinymce/tinymce.min.js'></script>
<script type="text/javascript" src='tinymce\src\plugins\autoresize\src\main\js\Plugin.js'></script>
  <script type="text/javascript">
  tinymce.init({
    selector: '#myTextarea',
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
                                <h4 class="title">User List</h4>
                                
                            </div>
                            
                            <div class="content table-responsive table-full-width">
                                <table class="table table-hover table-striped">
                                    <thead>
                                        <th>User ID</th>
                                    	<th>Usrname</th>                                    	
                                    	<th>Password</th>
                                    	<th>Enabled</th>
                                    	<th>Role</th>
                                    	<th>Action</th>
                                    </thead>
                                 <c:forEach items="${userList}" var="user">
                                  
                                    <tbody>
                                        <tr>
                                        	<td>${user.id}</td>
                                        	<td>${user.username}</td>
                                        	<td>${user.password}</td>
                                        	<td>${user.enabled}</td>
                                        	<td>${user.role}</td>
                                        	
                                            <td><a href="<c:url value="adminUpdateUser/${user.id}"/>">Update</a> ||
                                            <a href="<c:url value="deleteUser/${user.id}"/>">Delete</a></td>
                                        </tr>
                                 </c:forEach>       
                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>


                    


                </div>
            </div>
        </div>
       
       
       
       



        
        

<jsp:include page="adminFooter.jsp"></jsp:include>
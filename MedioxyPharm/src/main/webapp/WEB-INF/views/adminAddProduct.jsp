
<jsp:include page="adminHeader.jsp"></jsp:include>

<jsp:include page="adminSidebar.jsp"></jsp:include>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<center>  
       <h2><span style="color:#a442f4">Add Product</span></h2>
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

<style> 
select {
    width: 100%;
    padding: 12px 15px;
    border: none;
    heidht:5px;
    border-radius: 10px;
    background-color: #f1f1f1;
}
</style>

<center>
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                
                            </div>
                            <div class="content">
                                <form action="adminAddProduct" method="POST" commandName="Product" enctype="multipart/form-data">
                                    <div class="">
                                       
                                        

                                    <div class="row">
                                        <div class="col-md-2">
                                            <div class="form-group">
                                                <label>Product ID</label>
                                                <input type="text" class="form-control" placeholder="" name="proId"/>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <label>Product Name</label>
                                                <input type="text" class="form-control" placeholder="" name="proName"/>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <label>Category Name</label>
                                                <select name="proCatg">
                                                  <option value="">Select</option>
                                                  <c:forEach items="${categoryList}" var="category">
                                                   <option value="${category.catgName}">${category.catgName}</option>
                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <label>Supplier Name</label>
                                                <select name="proSupp">
                                                  <option value="">Select</option>
                                                  <c:forEach items="${supplierList}" var="supplier">
                                                   <option value="${supplier.suppName}">${supplier.suppName}</option>
                                                  </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="col-md-8">
                                            <div class="form-group">
                                                <label>Product Description</label>
                                                <textarea id="myTextarea" class="form-control" placeholder="" name="proDesp"></textarea>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <label>Product Stock</label>
                                                <input type="text" class="form-control" placeholder="" name="proStock"/>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <label>Product Price</label>
                                                <input type="text" class="form-control" placeholder="" name="proPrice"/>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <label>Product Image</label>
                                                <input type="file" class="form-control" placeholder="" name="file" />
                                            </div>
                                        </div>
                                    </div>

                                    
                                        </div>
                                    </div>

                                    

                                    <input type="submit" class="btn btn-info btn-fill pull-right" value="Add Product"/>
                                    <div class="clearfix"></div>
                                </form>
                            </div>
                        </div>
                    </div>
                    

                </div>
            </div>
        

</center>
        
<jsp:include page="adminFooter.jsp"></jsp:include>


<jsp:include page="adminHeader.jsp"></jsp:include>

<jsp:include page="adminSidebar.jsp"></jsp:include>

<center>  
       <h2><span style="color:#a442f4">Add Supplier</span></h2>
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

<center>
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                
                            </div>
                            <div class="content">
                                <form action="adminAddSupplier" method="POST">
                                    <div class="">
                                       
                                        

                                    <div class="row">
                                        <div class="col-md-2">
                                            <div class="form-group">
                                                <label>Supplier ID</label>
                                                <input type="text" class="form-control" placeholder="" name="suppId"/>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <label>Supplier Name</label>
                                                <input type="text" class="form-control" placeholder="" name="suppName"/>
                                            </div>
                                        </div>
                                        <div class="col-md-7">
                                            <div class="form-group">
                                                <label>Supplier Description</label>
                                                <textarea id="myTextarea" class="form-control" placeholder="" name="suppDesp"></textarea>
                                            </div>
                                        </div>
                                    </div>

                                    
                                        </div>
                                    </div>

                                    

                                    <input type="submit" class="btn btn-info btn-fill pull-right" value="Add Supplier"/>
                                    <div class="clearfix"></div>
                                </form>
                            </div>
                        </div>
                    </div>
                    

                </div>
            </div>
        

</center>
        
<jsp:include page="adminFooter.jsp"></jsp:include>

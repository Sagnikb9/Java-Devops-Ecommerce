<div class="wrapper">
    <div class="sidebar" data-color="purple" data-image="assets/img/sidebar-5.jpg">

    <!--

        Tip 1: you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple"
        Tip 2: you can also add an image using data-image tag

    -->

    	<div class="sidebar-wrapper">
            <div class="logo">
                <a href="http://www.creative-tim.com" class="simple-text">
                    Medioxy Pharm
                </a>
            </div>

            <ul class="nav">
                <li class="active">
                    <a href="adminDashboard">
                        <i class="pe-7s-graph"></i>
                        <p>Dashboard</p>
                    </a>
                </li>
                <li>
                    <a href="user.html">
                        <i class="pe-7s-user"></i>
                        <p>User Profile</p>
                    </a>
                </li>
                <li>
                    <a href="adminAddCategory">
                        <i class="pe-7s-note2"></i>
                        <p>Add Category</p>
                    </a>
                </li>
                <li>
                    <a href="adminDisplayCategory">
                        <i class="pe-7s-news-paper"></i>
                        <p>Display Category</p>
                    </a>
                </li>
                <li>
                    <a href="adminAddSupplier">
                        <i class="pe-7s-note2"></i>
                        <p>Add Supplier</p>
                    </a>
                </li>
                <li>
                    <a href="adminDisplaySupplier">
                        <i class="pe-7s-news-paper"></i>
                        <p>Display Supplier</p>
                    </a>
                </li>
                <li>
                    <a href="adminAddProduct">
                        <i class="pe-7s-note2"></i>
                        <p>Add Product</p>
                    </a>
                </li>
                <li>
                    <a href="adminDisplayProduct">
                        <i class="pe-7s-news-paper"></i>
                        <p>Display Product</p>
                    </a>
                </li>
                <li>
                    <a href="adminAddUser">
                        <i class="pe-7s-note2"></i>
                        <p>Add User</p>
                    </a>
                </li>
                <li>
                    <a href="adminDisplayUser">
                        <i class="pe-7s-news-paper"></i>
                        <p>Display User</p>
                    </a>
                </li>
            </ul>
    	</div>
    </div>
    
    <div class="main-panel">
        <nav class="navbar navbar-default navbar-fixed">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation-example-2">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Dashboard</a>
                </div>
                <div class="collapse navbar-collapse">
                    

                    <ul class="nav navbar-nav navbar-right">
                        
                        <li>
                              <a href="">
                                 <p>Welcome: ${sessionScope.username}</p>
                              </a>
                        </li>
                        
                        <li>
                            <a href="logout">
                                <p>Log out</p>
                            </a>
                        </li>
						<li class="separator hidden-lg hidden-md"></li>
                    </ul>
                </div>
            </div>
        </nav>